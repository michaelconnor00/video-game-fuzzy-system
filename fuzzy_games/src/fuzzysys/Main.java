package fuzzysys;

import java.util.ArrayList;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.rule.Rule;
/**
 * This class is used to run samples during development without the GUI.
 * Please ignore this class.
 * Created by michaelconnor on 2016-03-19.
 */
public class Main {

    public static void main(String[] args){
        System.out.println("beginning of main");
        GenreEngine engine = new GenreEngine();

//        // OK RPG
//        ArrayList<Rank> list = engine.getGenreList(
//                2.0, // anxiety
//                2.0, // atten detail
//                2.0, // patience
//                2.0, // reactionTime
//                2.0, // persistence
//                2.0, // excitement
//                2.0, // competitiveness
//                2.0, // planning
//                2.0 // teamwork
//        );

        // HATE RPG
        ArrayList<Rank> list = engine.getGenreList(
            2.0, // anxiety
            0.1, // atten detail
            2.0, // patience
            2.0, // reactionTime
            0.1, // persistence
            3.9, // excitement
            3.9, // competitiveness
            0.1, // planning
            3.9 // teamwork
        );

//        // LOVE RPG - half switched
//        ArrayList<Rank> list = engine.getGenreList(
//                0.1, // anxiety
//                3.9, // atten detail
//                3.9, // patience
//                2.0, // reactionTime
//                3.9, // persistence
//                3.9, // excitement
//                0.1, // competitiveness
//                2.0, // planning
//                3.9 // teamwork
//        );

        System.out.println("before array print");
        for (Rank rank : list){
            System.out.println(rank.toString());
        }
//        String[] love = {"high","high","low","high","low","high","low","high","high"};
//        String[] like = {"medium","medium","medium","medium","medium","medium","medium","medium","medium"};
//        String[] hate = {"low","low","high","low","high","low","high","low","low"};
//        FIS file =FuzzyFileWriter.writeFisFile("test.fcl","test",love,like,hate);
//        file.setVariable("anxiety",3.9);
//        System.out.println(file.getFunctionBlock("test").getFuzzyRuleBlock("No1").getRules());
//        for( Rule r : file.getFunctionBlock("test").getFuzzyRuleBlock("No1").getRules() ){
//            System.out.println(r);
//        }
//        String[] love1,like1,hate1;
//        love1 = FuzzyFileWriter.getLoveList("test.fcl");
//        like1 = FuzzyFileWriter.getlikeList("test.fcl");
//        hate1=FuzzyFileWriter.gethateList("test.fcl");
//        for(int i=0;i<10;i++){
//            System.out.print(love1[i]+",");
//        }
//        System.out.println();
//        for(int i=0;i<10;i++){
//            System.out.print(like1[i]+",");
//        }
//        System.out.println();
//        for(int i=0;i<10;i++){
//            System.out.print(hate1[i]+",");
//        }
//        System.out.println();
//        System.out.println(file.getVariable("anxiety"));
    }
}
