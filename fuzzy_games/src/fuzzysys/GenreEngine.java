package fuzzysys;

import GUI.MainController;
import net.sourceforge.jFuzzyLogic.FIS;
//import com.sun.tools.javac.util.ArrayUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        String[] files = new String[]{"rpg.fcl"};

        String file_sep = System.getProperty("file.separator");
        String dir = System.getProperty("user.dir") + file_sep + "fuzzy_games" +
                file_sep + "src" + file_sep + "fuzzysys" + file_sep + "fcl" + file_sep;

        this.rankedGenres = new ArrayList<>();

        for (String genre_fcl : files){
            System.out.println(dir + genre_fcl);
            FIS fis = FIS.load(dir + genre_fcl, true);

            if( fis == null ) { // Error while loading?
                System.err.println("Can't load file: '" + genre_fcl + "'");
                return null;
            }

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

            fis.getVariable("compatibility").chartDefuzzifier(true);

        }


        return rankedGenres;
    }

    private void addToList(Genre genre, Compatibility compatibility, double ranking){
        Rank newRanking = new Rank(genre, compatibility, ranking);
        // TODO iterate through all items in ranked Genres and insert the new Rank
        this.rankedGenres.add(newRanking);
    }

    private double arrayMin(double[] list){
        double minValue = -1.0;
        for (double value : list){
            if (minValue < 0.0){
                // First index of list
                minValue = value;
            } else {
                // If value is smaller, overwrite
                if (value < minValue) {
                    minValue = value;
                }
            }

        }
        return minValue;
    }

}
