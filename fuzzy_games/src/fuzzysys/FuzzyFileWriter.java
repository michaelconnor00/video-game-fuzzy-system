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

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FuzzyFileWriter {


    public static FIS writeFisFile(String path, String name) {

        FIS fileToWrite = FIS.load(path, true);
        if (fileToWrite == null) {
            try {
                BufferedWriter thing = new BufferedWriter(new FileWriter(path));
                thing.write("FUNCTION_BLOCK game_genre");
                thing.newLine();
                addVareableInputBlockCode(thing);
                addVarableOutputCode(thing);
                addFuzyyRules(thing);
                addDefuzzyRules(thing);
                addRuleBlock(thing);
                thing.write("END_FUNCTION_BLOCK");

                thing.close();
                fileToWrite = FIS.load(path, false);
                if (fileToWrite == null) {
                    System.err.println("could not make file");
                }
            } catch (IOException e) {
                System.err.println("could not make file");
            }
        }
        return fileToWrite;
    }

    private static void addVareableInputBlockCode(BufferedWriter thing) throws IOException {

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

    private static void addVarableOutputCode(BufferedWriter thing) throws IOException {

        thing.write("VAR_OUTPUT");
        thing.newLine();
        thing.write("   compatibility : REAL;");
        thing.newLine();
        thing.write("END_VAR");
        thing.newLine();


    }

    private static void addFuzyyRules(BufferedWriter thing) throws IOException {
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
    private static void addRuleBlock(BufferedWriter thing)throws IOException{
        thing.write("RULEBLOCK No1");
        thing.newLine();
        thing.write("AND : MIN;");
        thing.newLine();
        thing.write("ACCU : MAX;");
        thing.newLine();
        thing.write("END_RULEBLOCK");
        thing.newLine();
    }

    public static void addRule(FIS file){

        RuleBlock rules =file.getFunctionBlock("test").getFuzzyRuleBlock("No1");
        Rule testRule = new Rule();
        RuleTerm term1 = new RuleTerm(file.getVariable("anxiety"), "medium", false);
        RuleTerm term2 = new RuleTerm(file.getVariable("attention_to_detail"), "medium", false);
        RuleTerm term3 = new RuleTerm(file.getVariable("patience"), "medium", false);
        RuleTerm term4 = new RuleTerm(file.getVariable("reaction_time"), "medium", false);
        RuleTerm term5= new RuleTerm(file.getVariable("persistence"), "medium", false);
        RuleTerm term6 = new RuleTerm(file.getVariable("excitement"), "medium", false);
        RuleTerm term7 = new RuleTerm(file.getVariable("competitiveness"), "medium", false);
        RuleTerm term8 = new RuleTerm(file.getVariable("planning"), "medium", false);
        RuleTerm term9 = new RuleTerm(file.getVariable("teamwork"), "medium", false);

        RuleExpression antecedentAnd = new RuleExpression(term1, term2,term3,term4,term5,term6,term7,term8,term9, new RuleConnectionMethodAndMin());



    }
}
