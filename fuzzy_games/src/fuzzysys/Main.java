package fuzzysys;

import java.util.ArrayList;
import net.sourceforge.jFuzzyLogic.FIS;
/**
 * Created by michaelconnor on 2016-03-19.
 */
public class Main {

    public static void main(String[] args){
        System.out.println("beginning of main");
        GenreEngine engine = new GenreEngine();

        ArrayList<Rank> list = engine.getGenreList(
            2.0, // anxiety
            0.1, // atten detail
            3.0, // patience
            3.9, // reactionTime
            3.0, // persistence
            3.9, // excitement
            3.9, // competitiveness
            3.1, // planning
            3.9 // teamwork
        );

        System.out.println("before array print");
        for (Rank rank : list){
            System.out.println(rank.toString());
        }
        FIS file =FuzzyFileWriter.writeFisFile("test.fcl","test");
        file.setVariable("anxiety",3.9);
        System.out.println(file.getVariable("anxiety"));
    }
}
