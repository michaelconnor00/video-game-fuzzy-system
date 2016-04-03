package fuzzysys;

import GUI.MainController;
//import com.sun.tools.javac.util.ArrayUtils;

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
        this.rankedGenres = new ArrayList<>();

        for (Genre gen : Genre.values()){
            // Iterate through rules for the genre.
            Rule[] ruleSet = gen.getRules();
            for (Rule rule : ruleSet){
                double[] traitValues = new double[9];
                traitValues[0] = rule.getAnxietyValue(anxiety);
                traitValues[1] = rule.getAttentionToDetailValue(attentionToDetail);
                traitValues[2] = rule.getPatienceValue(patience);
                traitValues[3] = rule.getReactionTimeValue(reactionTime);
                traitValues[4] = rule.getPersistenceValue(persistance);
                traitValues[5] = rule.getExcitementValue(excitement);
                traitValues[6] = rule.getCompetitiveValue(competitiveness);
                traitValues[7] = rule.getPlanningValue(planning);
                traitValues[8] = rule.getTeamworkValue(teamwork);
                double minValue = arrayMin(traitValues);
//                // TODO modify the output function of rule
//                Compatibility ruleCompatibility = rule.getCompatibilityFunction(); // FIXME
//                // TODO Defuzzify
//                addToList(gen, summedCompatibility, ranking);
            }
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
