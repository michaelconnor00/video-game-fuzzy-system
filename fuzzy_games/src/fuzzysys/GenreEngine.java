package fuzzysys;

/**
 * Class that contains the Inference logic
 * Created by michaelconnor on 2016-03-20.
 */
public class GenreEngine {

    public GenreEngine(){
        // initialize HashMap <Genre, RuleBase>
    }

    // TODO add fuzzification function
    // TODO add defuzzification method
    // TODO read each rule base and find output 

    public Genre getGenre(int[] userTraitValues){
        for (Genre gen : Genre.values()){
            // TODO get top rated genres?????
        }
        return Genre.ROLEPLAYING;
    }



}
