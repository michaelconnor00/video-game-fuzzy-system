package fuzzysys;

import net.sourceforge.jFuzzyLogic.FIS;

import java.util.ArrayList;

/**
 * Class that contains the Inference logic
 * Created by michaelconnor on 2016-03-20.
 */
public class GenreEngine {

    private ArrayList<Rank> rankedGenres;

    public GenreEngine(){
    }

    public ArrayList<Rank> getGenreList(
            double anxiety, double attentionToDetail, double patience, double reactionTime,
            double persistance, double excitement, double competitiveness,
            double planning, double teamwork
    ){

        this.rankedGenres = new ArrayList<>();

        for (Genre genre_fcl : Genre.values()){
            System.out.println(genre_fcl.getFileName());
            FIS fis = FIS.load(genre_fcl.getFileName(), true);

            if( fis == null ) { // Error while loading?
                System.err.println("Can't load file: '" + genre_fcl.getFileName() + "'");
                return null;
            }

            // Set the input values for the fuzzy system.
            fis.setVariable("anxiety", anxiety);
            fis.setVariable("attention_to_detail", attentionToDetail);
            fis.setVariable("patience", patience);
            fis.setVariable("reaction_time", reactionTime);
            fis.setVariable("persistence", persistance);
            fis.setVariable("excitement", excitement);
            fis.setVariable("competitiveness", competitiveness);
            fis.setVariable("planning", planning);
            fis.setVariable("teamwork", teamwork);

            fis.evaluate();

            double outputValue = fis.getVariable("compatibility").getLatestDefuzzifiedValue();
            addToList(genre_fcl, outputValue);
            System.out.println("Output Value: " + outputValue);
        }

        return this.rankedGenres;
    }

    private void addToList(Genre genre, double compatibilityValue){
        Rank newRanking = new Rank(genre, compatibilityValue);
        // TODO iterate through all items in ranked Genres and insert the new Rank
        if (this.rankedGenres.isEmpty()){
            this.rankedGenres.add(newRanking);
        } else {
            int sizeList = this.rankedGenres.size();
            for (int i = 0; i < sizeList; i++) {
                if (compatibilityValue > this.rankedGenres.get(i).getCompatibility()) {
                    this.rankedGenres.add(i, newRanking);
                    return;
                }else if (this.rankedGenres.size()-1 == i){
                    this.rankedGenres.add(newRanking);
                    return;
                }
            }
        }
    }

}
