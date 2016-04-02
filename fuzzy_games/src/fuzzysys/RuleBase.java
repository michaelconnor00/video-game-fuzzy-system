package fuzzysys;

/**
 * Created by michaelconnor on 2016-03-23.
 */
public class RuleBase {


    private Rule[][] ruleTable;

    public RuleBase() {

        ruleTable = new Rule[19683][9];
        initRuleBase();
    }

    public Rule[][] getRuleTable() {
        return ruleTable;
    }

    public void setRuleTable(Rule[][] ruleTable) {
        this.ruleTable = ruleTable;
    }
    public Rule getRuleIndex(int a,int b){
        Rule anser=ruleTable[a][b];
        return anser;
    }

    private void initRuleBase(){
        int count = 0;
        for (int i1 = 0; i1 < 3; i1++) {
            for (int i2 = 0; i2 < 3; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    for (int i4 = 0; i4 < 3; i4++) {
                        for (int i5 = 0; i5 < 3; i5++) {
                            for (int i6 = 0; i6 < 3; i6++) {
                                for (int i7 = 0; i7 < 3; i7++) {
                                    for (int i8 = 0; i8 < 3; i8++) {
                                        for (int i9 = 0; i9 < 3; i9++) {
                                            //index i1 maps to ANXIETY for index [][0]
                                            switch (i1) {
                                                case 0:
                                                    ruleTable[count][0].setAnxietyValue(TraitValue.FAR);
                                                    break;
                                                case 1:
                                                    ruleTable[count][0].setAnxietyValue(TraitValue.NEAR);
                                                    break;
                                                case 2:
                                                    ruleTable[count][0].setAnxietyValue(TraitValue.PERFECT);
                                                    break;
                                            }
                                            //index i2 maps to ATTENTIONTODETAIL for index [][1]
                                            switch (i2) {
                                                case 0:
                                                    ruleTable[count][1].setAttentionToDetailValue(TraitValue.FAR);
                                                    break;
                                                case 1:
                                                    ruleTable[count][1].setAttentionToDetailValue(TraitValue.NEAR);
                                                    break;
                                                case 2:
                                                    ruleTable[count][1].setAttentionToDetailValue(TraitValue.PERFECT);
                                                    break;
                                            }
                                            //index i3 maps to PATIENCE for index [][2]
                                            switch (i3) {
                                                case 0:
                                                    ruleTable[count][2].setPatienceValue(TraitValue.FAR);
                                                    break;
                                                case 1:
                                                    ruleTable[count][2].setPatienceValue(TraitValue.NEAR);
                                                    break;
                                                case 2:
                                                    ruleTable[count][2].setPatienceValue(TraitValue.PERFECT);
                                                    break;
                                            }
                                            //index i4 maps to REACTIONTIME for index [][3]
                                            switch (i4) {
                                                case 0:
                                                    ruleTable[count][3].setReactionTimeValue(TraitValue.FAR);
                                                    break;
                                                case 1:
                                                    ruleTable[count][3].setReactionTimeValue(TraitValue.NEAR);
                                                    break;
                                                case 2:
                                                    ruleTable[count][3].setReactionTimeValue(TraitValue.PERFECT);
                                                    break;
                                            }
                                            // index i5 maps to PERSISTANCE for index [][4]
                                            switch (i5) {
                                                case 0:
                                                    ruleTable[count][4].setPersistenceValue(TraitValue.FAR);
                                                    break;
                                                case 1:
                                                    ruleTable[count][4].setPersistenceValue(TraitValue.NEAR);
                                                    break;
                                                case 2:
                                                    ruleTable[count][4].setPersistenceValue(TraitValue.PERFECT);
                                                    break;
                                            }
                                            //index i6 maps to EXCITEMENT for index [][5]
                                            switch (i6) {
                                                case 0:
                                                    ruleTable[count][5].setExcitementValue(TraitValue.FAR);
                                                    break;
                                                case 1:
                                                    ruleTable[count][5].setExcitementValue(TraitValue.NEAR);
                                                    break;
                                                case 2:
                                                    ruleTable[count][5].setExcitementValue(TraitValue.PERFECT);
                                                    break;
                                            }
                                            // index i7 maps to COMPETITIVENESS for index [][6]
                                            switch (i7) {
                                                case 0:
                                                    ruleTable[count][6].setCompetitiveValue(TraitValue.FAR);
                                                    break;
                                                case 1:
                                                    ruleTable[count][6].setCompetitiveValue(TraitValue.NEAR);
                                                    break;
                                                case 2:
                                                    ruleTable[count][6].setCompetitiveValue(TraitValue.PERFECT);
                                                    break;
                                            }
                                            // index i8 maps to PLANNING for index [][7]
                                            switch (i8) {
                                                case 0:
                                                    ruleTable[count][7].setPlanningValue(TraitValue.FAR);
                                                    break;
                                                case 1:
                                                    ruleTable[count][7].setPlanningValue(TraitValue.NEAR);
                                                    break;
                                                case 2:
                                                    ruleTable[count][7].setPlanningValue(TraitValue.PERFECT);
                                                    break;
                                            }
                                            // index i9 maps to TEAMWORK for index [][8]
                                            switch (i9) {
                                                case 0:
                                                    ruleTable[count][8].setTeamworkValue(TraitValue.FAR);
                                                    break;
                                                case 1:
                                                    ruleTable[count][8].setTeamworkValue(TraitValue.NEAR);
                                                    break;
                                                case 2:
                                                    ruleTable[count][8].setTeamworkValue(TraitValue.PERFECT);
                                                    break;
                                            }
                                            //System.out.println(count);
                                            count++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
