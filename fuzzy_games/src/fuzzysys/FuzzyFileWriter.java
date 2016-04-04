package fuzzysys;

/**
 * Created by johnathan on 4/3/2016.
 */

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.rule.RuleBlock;
import net.sourceforge.jFuzzyLogic.rule.RuleTerm;
import net.sourceforge.jFuzzyLogic.rule.RuleExpression;
import net.sourceforge.jFuzzyLogic.ruleConnectionMethod.RuleConnectionMethodAndMin;
import net.sourceforge.jFuzzyLogic.rule.Rule;

import java.io.*;

public class FuzzyFileWriter {

    // rule order is (1)love,(2)like,(3)hate
    // atribue input order is (1)anxiety,(2)attention to detale, (3)patience, (4)reaction time, (5)persistance, (6)exitment, (7)competitiveness, (8)planning, (9)teamwork
    public static FIS writeFisFile(String path, String name,String[] lovelevels,String[] likelevels,String[] hatelevels) {



            try {
                BufferedWriter thing = new BufferedWriter(new FileWriter(path));
                addQickReferinceLines(thing,lovelevels,likelevels,hatelevels);
                thing.write("FUNCTION_BLOCK "+name);
                thing.newLine();
                addVariableInputBlockCode(thing);
                addVariableOutputCode(thing);
                addFuzzyRules(thing);
                addDefuzzyRules(thing);
                addRuleBlock(thing,lovelevels,likelevels,hatelevels);
                thing.write("END_FUNCTION_BLOCK");

                thing.close();

            } catch (IOException e) {
                System.err.println("could not make file");
            }
            FIS fileToWrite = FIS.load(path, true);
            return fileToWrite;
    }

    private static void addVariableInputBlockCode(BufferedWriter thing) throws IOException {

        thing.write("VAR_INPUT");
        thing.newLine();
        thing.write("   anxiety : REAL;");
        thing.newLine();
        thing.write("   attention_to_detail : REAL;");
        thing.newLine();
        thing.write("   patience : REAL;");
        thing.newLine();
        thing.write("   reaction_time : REAL;");
        thing.newLine();
        thing.write("   persistence : REAL;");
        thing.newLine();
        thing.write("   excitement : REAL;");
        thing.newLine();
        thing.write("   competitiveness : REAL;");
        thing.newLine();
        thing.write("planning : REAL;");
        thing.newLine();
        thing.write("   teamwork : REAL;");
        thing.newLine();
        thing.write("END_VAR");
        thing.newLine();

    }

    private static void addVariableOutputCode(BufferedWriter thing) throws IOException {

        thing.write("VAR_OUTPUT");
        thing.newLine();
        thing.write("   compatibility : REAL;");
        thing.newLine();
        thing.write("END_VAR");
        thing.newLine();


    }

    private static void addFuzzyRules(BufferedWriter thing) throws IOException {
        thing.write("FUZZIFY anxiety\n");
        thing.newLine();
        thing.write("    TERM low := (0, 1) (2, 0);");
        thing.newLine();
        thing.write("    TERM medium := (0, 0) (2, 1) (4, 0);");
        thing.newLine();
        thing.write("    TERM high := (2, 0) (4, 1);");
        thing.newLine();
        thing.write("END_FUZZIFY");
        thing.newLine();
        thing.write("FUZZIFY attention_to_detail");
        thing.newLine();
        thing.write("    TERM low := (0, 1) (2, 0);");
        thing.newLine();
        thing.write("    TERM medium := (0, 0) (2, 1) (4, 0);");
        thing.newLine();
        thing.write("    TERM high := (2, 0) (4, 1);");
        thing.newLine();
        thing.write("END_FUZZIFY");
        thing.newLine();
        thing.write("FUZZIFY patience");
        thing.newLine();
        thing.write("    TERM low := (0, 1) (2, 0);");
        thing.newLine();
        thing.write("    TERM medium := (0, 0) (2, 1) (4, 0);");
        thing.newLine();
        thing.write("    TERM high := (2, 0) (4, 1);");
        thing.newLine();
        thing.write("END_FUZZIFY");
        thing.newLine();
        thing.write("FUZZIFY reaction_time");
        thing.newLine();
        thing.write("    TERM low := (0, 1) (2, 0);");
        thing.newLine();
        thing.write("    TERM medium := (0, 0) (2, 1) (4, 0);");
        thing.newLine();
        thing.write("    TERM high := (2, 0) (4, 1);");
        thing.newLine();
        thing.write("END_FUZZIFY");
        thing.newLine();
        thing.write("FUZZIFY persistence");
        thing.newLine();
        thing.write("    TERM low := (0, 1) (2, 0);");
        thing.newLine();
        thing.write("    TERM medium := (0, 0) (2, 1) (4, 0);");
        thing.newLine();
        thing.write("    TERM high := (2, 0) (4, 1);");
        thing.newLine();
        thing.write("END_FUZZIFY");
        thing.newLine();
        thing.write("FUZZIFY competitiveness");
        thing.newLine();
        thing.write("    TERM low := (0, 1) (2, 0);");
        thing.newLine();
        thing.write("    TERM medium := (0, 0) (2, 1) (4, 0);");
        thing.newLine();
        thing.write("    TERM high := (2, 0) (4, 1);");
        thing.newLine();
        thing.write("END_FUZZIFY");
        thing.newLine();
        thing.write("FUZZIFY planning\n");
        thing.newLine();
        thing.write("    TERM low := (0, 1) (2, 0);");
        thing.newLine();
        thing.write("    TERM medium := (0, 0) (2, 1) (4, 0);");
        thing.newLine();
        thing.write("    TERM high := (2, 0) (4, 1);");
        thing.newLine();
        thing.write("END_FUZZIFY");
        thing.newLine();
        thing.write("FUZZIFY teamwork");
        thing.newLine();
        thing.write("    TERM low := (0, 1) (2, 0);");
        thing.newLine();
        thing.write("    TERM medium := (0, 0) (2, 1) (4, 0);");
        thing.newLine();
        thing.write("    TERM high := (2, 0) (4, 1);");
        thing.newLine();
        thing.write("END_FUZZIFY");
        thing.newLine();
        thing.write("FUZZIFY excitement");
        thing.newLine();
        thing.write("    TERM low := (0, 1) (2, 0);");
        thing.newLine();
        thing.write("    TERM medium := (0, 0) (2, 1) (4, 0);");
        thing.newLine();
        thing.write("    TERM high := (2, 0) (4, 1);");
        thing.write("END_FUZZIFY");
        thing.newLine();
    }
    private static void addDefuzzyRules(BufferedWriter thing) throws IOException{
        thing.write("DEFUZZIFY compatibility");
        thing.newLine();
        thing.write("   TERM hate := (0, 1) (2, 0);");
        thing.newLine();
        thing.write("TERM like := (0, 0) (2, 1) (4, 0);");
        thing.newLine();
        thing.write("TERM love := (2, 0) (4, 1);");
        thing.newLine();
        // Use 'Center Of Gravity' defuzzification method
        thing.write("METHOD : COG;");
        thing.newLine();
        // Default value is 0 (if no rule activates defuzzifier)
        thing.write("DEFAULT := 0;");
        thing.newLine();
        thing.write("END_DEFUZZIFY");
        thing.newLine();
    }
    private static void addRuleBlock(BufferedWriter thing,String[] Lovelevels,String[] likelevels,String[] Hatelevels)throws IOException{
        thing.write("RULEBLOCK No1");
        thing.newLine();
        thing.write("AND : MIN;");
        thing.newLine();
        thing.write("ACCU : MAX;");
        thing.newLine();
        addLoveRule(thing,Lovelevels);
        addLikeRule(thing,likelevels);
        addHateRule(thing,Hatelevels);
        thing.write("END_RULEBLOCK");
        thing.newLine();
    }
    // atribue input order is (1)anxiety,(2)attention to detale, (3)patience, (4)reaction time, (5)persistance, (6)exitment, (7)competitiveness, (8)planning, (9)teamwork
    private static void addLoveRule(BufferedWriter thing,String[] love)throws IOException{

        thing.write("RULE 1 : IF anxiety IS "+love[0]+ " AND attention_to_detail IS "+love[1]+" AND patience IS "+love[2]+" AND "+
        "reaction_time IS "+love[3]+" AND persistence IS "+love[4]+" AND excitement IS "+love[5]+" AND "+
        "competitiveness IS "+love[6]+" AND planning IS "+love[7]+" AND teamwork IS "+love[8]+
        " THEN compatibility IS love;");
        thing.newLine();
    }
    private static void addLikeRule(BufferedWriter thing,String[] love)throws IOException{

        thing.write("RULE 2 : IF anxiety IS "+love[0]+ " AND attention_to_detail IS "+love[1]+" AND patience IS "+love[2]+" AND "+
                "reaction_time IS "+love[3]+" AND persistence IS "+love[4]+" AND excitement IS "+love[5]+" AND "+
                "competitiveness IS "+love[6]+" AND planning IS "+love[7]+" AND teamwork IS "+love[8]+
                " THEN compatibility IS like;");
        thing.newLine();
    }
    private static void addHateRule(BufferedWriter thing,String[] love)throws IOException{

        thing.write("RULE 3 : IF anxiety IS "+love[0]+ " AND attention_to_detail IS "+love[1]+" AND patience IS "+love[2]+" AND "+
                "reaction_time IS "+love[3]+" AND persistence IS "+love[4]+" AND excitement IS "+love[5]+" AND "+
                "competitiveness IS "+love[6]+" AND planning IS "+love[7]+" AND teamwork IS "+love[8]+
                " THEN compatibility IS hate;");
        thing.newLine();
    }
    private static void addQickReferinceLines(BufferedWriter thing,String[] love,String[] like,String[] hate)throws IOException{
        thing.write("//love,");
        for(int i=0;i<love.length;i++){
            thing.write(love[i]+",");
        }
        thing.newLine();
        thing.write("//like,");
        for(int i=0;i<like.length;i++){
            thing.write(like[i]+",");
        }
        thing.newLine();
        thing.write("//hate,");
        for(int i=0;i<hate.length;i++){
            thing.write(hate[i]+",");
        }
        thing.newLine();
    }

    public static String[] getLoveList(String path){
        try{
            BufferedReader input = new BufferedReader(new FileReader(path));
            String line = input.readLine();
            String[] vales = line.split(",");
            while(!vales[0].equals("//love")){
                line = input.readLine();
                vales = line.split(",");
            }
            return vales;

        }catch(IOException e){
            System.err.println("could not read file on path "+path);
            return null;
        }

    }
    public static String[] getlikeList(String path){
        try{
            BufferedReader input = new BufferedReader(new FileReader(path));
            String line = input.readLine();
            String[] vales = line.split(",");
            while(!vales[0].equals("//like")){
                line = input.readLine();
                vales = line.split(",");
            }
            return vales;

        }catch(IOException e){
            System.err.println("could not read file on path "+path);
            return null;
        }

    }
    public static String[] gethateList(String path){
        try{
            BufferedReader input = new BufferedReader(new FileReader(path));
            String line = input.readLine();
            String[] vales = line.split(",");
            while(!vales[0].equals("//hate")){
                line = input.readLine();
                vales = line.split(",");
            }
            return vales;

        }catch(IOException e){
            System.err.println("could not read file on path "+path);
            return null;
        }

    }

}
