package fuzzysys;

import java.util.ArrayList;

/**
 * Created by michaelconnor on 2016-03-19.
 */
public class Main {

    public static void main(String[] args){
        System.out.println("beginning of main");
        GenreEngine engine = new GenreEngine();

        ArrayList<Rank> list = engine.getGenreList(
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

        System.out.println("before array print");
        for (Rank rank : list){
            System.out.println(rank.toString());
        }
    }
}
