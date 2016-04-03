package fuzzysys;

/**
 * Created by michaelconnor on 2016-03-19.
 */
public class Main {

    public static void main(String[] args){
        GenreEngine engine = new GenreEngine();

        engine.getGenreList(
            4.0, // anxiety
            4.0, // atten detail
            4.0, // patience
            2.0, // reactionTime
            4.0, // persistence
            0.5, // excitement
            0.5, // competitiveness
            2.0, // planning
            0.5 // teamwork
        );
    }
}
