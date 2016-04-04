package fuzzysys;

/**
 * Enum to represent the different game genres.
 * Created by michaelconnor on 2016-03-20.
 */
public enum Genre {
    ROLEPLAYING("rpg.fcl"),
    SHOOTER("fps.fcl"),
    STRATEGYRTS("rts.fcl"),
    STRATEGYTURNBASED("tbs.fcl"),
    SIMULATION("sim.fcl"),
    SPORTS("sport.fcl"),
    FIGHTING("fight.fcl");

    private String file_name;

    Genre(String name){

        String file_sep = System.getProperty("file.separator");
        String dir = System.getProperty("user.dir") + file_sep + "fuzzy_games" +
            file_sep + "src" + file_sep + "fuzzysys" + file_sep + "fcl" + file_sep;

        this.file_name = dir + name;

//        switch(name) {
//            case "rpg":
//                initRPGSet();
//                break;
//            case "fps":
//                initShooterSet();
//                break;
//            case "rts":
//                initRTSSet();
//                break;
//            case "tbs":
//                initTBSSet();
//                break;
//            case "sim":
//                initSimulationSet();
//                break;
//            case "sport":
//                initSportSet();
//                break;
//            case "fight":
//                initFightingSet();
//                break;
//            default:
//                break;
//        }
    }

    public String getFileName(){
        return this.file_name;
    }

    private Rule[] rules;

    public Rule[] getRules() {
        return this.rules;
    }


    //// TODO review Compatibility for each array of rules. not sure if they are correct.


    private void initRPGSet(){
        this.rules = new Rule[3];
        //parameters for love it rule
        this.rules[0] = new Rule();
        this.rules[0].setAnxietyValue(TraitValue.HIGH);
        this.rules[0].setAttentionToDetailValue(TraitValue.HIGH);
        this.rules[0].setPatienceValue(TraitValue.HIGH);
        this.rules[0].setReactionTimeValue(TraitValue.MEDIUM);
        this.rules[0].setPersistenceValue(TraitValue.HIGH);
        this.rules[0].setExcitementValue(TraitValue.LOW);
        this.rules[0].setCompetitiveValue(TraitValue.LOW);
        this.rules[0].setPlanningValue(TraitValue.MEDIUM);
        this.rules[0].setTeamworkValue(TraitValue.LOW);

        this.rules[0].setCompatibilitySet(Compatibility.LOVE);
        //parameters for OK level
        this.rules[1] = new Rule();
        this.rules[1].setAnxietyValue(TraitValue.MEDIUM);
        this.rules[1].setAttentionToDetailValue(TraitValue.MEDIUM);
        this.rules[1].setPatienceValue(TraitValue.MEDIUM);
        this.rules[1].setReactionTimeValue(TraitValue.MEDIUM);
        this.rules[1].setPersistenceValue(TraitValue.MEDIUM);
        this.rules[1].setExcitementValue(TraitValue.MEDIUM);
        this.rules[1].setCompetitiveValue(TraitValue.MEDIUM);
        this.rules[1].setPlanningValue(TraitValue.MEDIUM);
        this.rules[1].setTeamworkValue(TraitValue.MEDIUM);

        this.rules[1].setCompatibilitySet(Compatibility.LIKE);
        //parameters for hate rule
        this.rules[2] = new Rule();
        this.rules[2].setAnxietyValue(TraitValue.MEDIUM);
        this.rules[2].setAttentionToDetailValue(TraitValue.LOW);
        this.rules[2].setPatienceValue(TraitValue.MEDIUM);
        this.rules[2].setReactionTimeValue(TraitValue.MEDIUM);
        this.rules[2].setPersistenceValue(TraitValue.LOW);
        this.rules[2].setExcitementValue(TraitValue.MEDIUM);
        this.rules[2].setCompetitiveValue(TraitValue.HIGH);
        this.rules[2].setPlanningValue(TraitValue.LOW);
        this.rules[2].setTeamworkValue(TraitValue.HIGH);

        this.rules[2].setCompatibilitySet(Compatibility.HATE);
    }

    private void initSimulationSet(){
        this.rules = new Rule[3];
        //parameters for love it rule
        this.rules[0] = new Rule();
        this.rules[0].setAnxietyValue(TraitValue.HIGH);
        this.rules[0].setAttentionToDetailValue(TraitValue.HIGH);
        this.rules[0].setPatienceValue(TraitValue.HIGH);
        this.rules[0].setReactionTimeValue(TraitValue.LOW);
        this.rules[0].setPersistenceValue(TraitValue.HIGH);
        this.rules[0].setExcitementValue(TraitValue.LOW);
        this.rules[0].setCompetitiveValue(TraitValue.LOW);
        this.rules[0].setPlanningValue(TraitValue.MEDIUM);
        this.rules[0].setTeamworkValue(TraitValue.LOW);
        this.rules[0].setCompatibilitySet(Compatibility.LOVE);
        //parameters for OK level
        this.rules[1] = new Rule();
        this.rules[1].setAnxietyValue(TraitValue.MEDIUM);
        this.rules[1].setAttentionToDetailValue(TraitValue.MEDIUM);
        this.rules[1].setPatienceValue(TraitValue.MEDIUM);
        this.rules[1].setReactionTimeValue(TraitValue.MEDIUM);
        this.rules[1].setPersistenceValue(TraitValue.MEDIUM);
        this.rules[1].setExcitementValue(TraitValue.LOW);
        this.rules[1].setCompetitiveValue(TraitValue.LOW);
        this.rules[1].setPlanningValue(TraitValue.MEDIUM);
        this.rules[1].setTeamworkValue(TraitValue.LOW);
        this.rules[1].setCompatibilitySet(Compatibility.LIKE);
        //parameters for hate rule
        this.rules[2] = new Rule();
        this.rules[2].setAnxietyValue(TraitValue.MEDIUM);
        this.rules[2].setAttentionToDetailValue(TraitValue.LOW);
        this.rules[2].setPatienceValue(TraitValue.LOW);
        this.rules[2].setReactionTimeValue(TraitValue.MEDIUM);
        this.rules[2].setPersistenceValue(TraitValue.LOW);
        this.rules[2].setExcitementValue(TraitValue.HIGH);
        this.rules[2].setCompetitiveValue(TraitValue.HIGH);
        this.rules[2].setPlanningValue(TraitValue.MEDIUM);
        this.rules[2].setTeamworkValue(TraitValue.HIGH);
        this.rules[2].setCompatibilitySet(Compatibility.HATE);
    }

    private void initShooterSet() {
        this.rules = new Rule[3];
        //parameters for love it rule
        this.rules[0] = new Rule();
        this.rules[0].setAnxietyValue(TraitValue.LOW);
        this.rules[0].setAttentionToDetailValue(TraitValue.LOW);
        this.rules[0].setPatienceValue(TraitValue.MEDIUM);
        this.rules[0].setReactionTimeValue(TraitValue.HIGH);
        this.rules[0].setPersistenceValue(TraitValue.MEDIUM);
        this.rules[0].setExcitementValue(TraitValue.HIGH);
        this.rules[0].setCompetitiveValue(TraitValue.HIGH);
        this.rules[0].setPlanningValue(TraitValue.MEDIUM);
        this.rules[0].setTeamworkValue(TraitValue.HIGH);
        this.rules[0].setCompatibilitySet(Compatibility.LOVE);
        //parameters for OK level
        this.rules[1] = new Rule();
        this.rules[1].setAnxietyValue(TraitValue.MEDIUM);
        this.rules[1].setAttentionToDetailValue(TraitValue.MEDIUM);
        this.rules[1].setPatienceValue(TraitValue.MEDIUM);
        this.rules[1].setReactionTimeValue(TraitValue.MEDIUM);
        this.rules[1].setPersistenceValue(TraitValue.MEDIUM);
        this.rules[1].setExcitementValue(TraitValue.MEDIUM);
        this.rules[1].setCompetitiveValue(TraitValue.MEDIUM);
        this.rules[1].setPlanningValue(TraitValue.MEDIUM);
        this.rules[1].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[1].setCompatibilitySet(Compatibility.LIKE);
        //parameters for hate rule
        this.rules[2] = new Rule();
        this.rules[2].setAnxietyValue(TraitValue.HIGH);
        this.rules[2].setAttentionToDetailValue(TraitValue.HIGH);
        this.rules[2].setPatienceValue(TraitValue.MEDIUM);
        this.rules[2].setReactionTimeValue(TraitValue.LOW);
        this.rules[2].setPersistenceValue(TraitValue.MEDIUM);
        this.rules[2].setExcitementValue(TraitValue.LOW);
        this.rules[2].setCompetitiveValue(TraitValue.LOW);
        this.rules[2].setPlanningValue(TraitValue.MEDIUM);
        this.rules[2].setTeamworkValue(TraitValue.LOW);
        this.rules[2].setCompatibilitySet(Compatibility.HATE);
    }

    private void initRTSSet(){
        this.rules = new Rule[3];
        //parameters for love it rule
        this.rules[0] = new Rule();
        this.rules[0].setAnxietyValue(TraitValue.HIGH);
        this.rules[0].setAttentionToDetailValue(TraitValue.MEDIUM);
        this.rules[0].setPatienceValue(TraitValue.MEDIUM);
        this.rules[0].setReactionTimeValue(TraitValue.HIGH);
        this.rules[0].setPersistenceValue(TraitValue.MEDIUM);
        this.rules[0].setExcitementValue(TraitValue.MEDIUM);
        this.rules[0].setCompetitiveValue(TraitValue.HIGH);
        this.rules[0].setPlanningValue(TraitValue.HIGH);
        this.rules[0].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[0].setCompatibilitySet(Compatibility.LOVE);
        //parameters for OK level
        this.rules[1] = new Rule();
        this.rules[1].setAnxietyValue(TraitValue.MEDIUM);
        this.rules[1].setAttentionToDetailValue(TraitValue.MEDIUM);
        this.rules[1].setPatienceValue(TraitValue.MEDIUM);
        this.rules[1].setReactionTimeValue(TraitValue.MEDIUM);
        this.rules[1].setPersistenceValue(TraitValue.MEDIUM);
        this.rules[1].setExcitementValue(TraitValue.MEDIUM);
        this.rules[1].setCompetitiveValue(TraitValue.MEDIUM);
        this.rules[1].setPlanningValue(TraitValue.MEDIUM);
        this.rules[1].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[1].setCompatibilitySet(Compatibility.LIKE);
        //parameters for hate rule
        this.rules[2] = new Rule();
        this.rules[2].setAnxietyValue(TraitValue.LOW);
        this.rules[2].setAttentionToDetailValue(TraitValue.MEDIUM);
        this.rules[2].setPatienceValue(TraitValue.MEDIUM);
        this.rules[2].setReactionTimeValue(TraitValue.LOW);
        this.rules[2].setPersistenceValue(TraitValue.LOW);
        this.rules[2].setExcitementValue(TraitValue.MEDIUM);
        this.rules[2].setCompetitiveValue(TraitValue.LOW);
        this.rules[2].setPlanningValue(TraitValue.LOW);
        this.rules[2].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[2].setCompatibilitySet(Compatibility.HATE);

    }

    private void initTBSSet() {
        this.rules = new Rule[3];
        //parameters for love it rule
        this.rules[0] = new Rule();
        this.rules[0].setAnxietyValue(TraitValue.HIGH);
        this.rules[0].setAttentionToDetailValue(TraitValue.HIGH);
        this.rules[0].setPatienceValue(TraitValue.HIGH);
        this.rules[0].setReactionTimeValue(TraitValue.MEDIUM);
        this.rules[0].setPersistenceValue(TraitValue.HIGH);
        this.rules[0].setExcitementValue(TraitValue.LOW);
        this.rules[0].setCompetitiveValue(TraitValue.LOW);
        this.rules[0].setPlanningValue(TraitValue.HIGH);
        this.rules[0].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[0].setCompatibilitySet(Compatibility.LOVE);
        //parameters for OK level
        this.rules[1] = new Rule();
        this.rules[1].setAnxietyValue(TraitValue.MEDIUM);
        this.rules[1].setAttentionToDetailValue(TraitValue.MEDIUM);
        this.rules[1].setPatienceValue(TraitValue.MEDIUM);
        this.rules[1].setReactionTimeValue(TraitValue.MEDIUM);
        this.rules[1].setPersistenceValue(TraitValue.MEDIUM);
        this.rules[1].setExcitementValue(TraitValue.MEDIUM);
        this.rules[1].setCompetitiveValue(TraitValue.MEDIUM);
        this.rules[1].setPlanningValue(TraitValue.LOW);
        this.rules[1].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[1].setCompatibilitySet(Compatibility.LIKE);
        //parameters for hate rule
        this.rules[2] = new Rule();
        this.rules[2].setAnxietyValue(TraitValue.LOW);
        this.rules[2].setAttentionToDetailValue(TraitValue.LOW);
        this.rules[2].setPatienceValue(TraitValue.LOW);
        this.rules[2].setReactionTimeValue(TraitValue.MEDIUM);
        this.rules[2].setPersistenceValue(TraitValue.LOW);
        this.rules[2].setExcitementValue(TraitValue.HIGH);
        this.rules[2].setCompetitiveValue(TraitValue.HIGH);
        this.rules[2].setPlanningValue(TraitValue.LOW);
        this.rules[2].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[2].setCompatibilitySet(Compatibility.HATE);

    }

    private void initSportSet(){
        this.rules = new Rule[3];
        //parameters for love it rule
        this.rules[0] = new Rule();
        this.rules[0].setAnxietyValue(TraitValue.HIGH);
        this.rules[0].setAttentionToDetailValue(TraitValue.MEDIUM);
        this.rules[0].setPatienceValue(TraitValue.LOW);
        this.rules[0].setReactionTimeValue(TraitValue.HIGH);
        this.rules[0].setPersistenceValue(TraitValue.LOW);
        this.rules[0].setExcitementValue(TraitValue.HIGH);
        this.rules[0].setCompetitiveValue(TraitValue.LOW);
        this.rules[0].setPlanningValue(TraitValue.HIGH);
        this.rules[0].setTeamworkValue(TraitValue.LOW);
        this.rules[0].setCompatibilitySet(Compatibility.LOVE);
        //parameters for OK level
        this.rules[1] = new Rule();
        this.rules[1].setAnxietyValue(TraitValue.MEDIUM);
        this.rules[1].setAttentionToDetailValue(TraitValue.MEDIUM);
        this.rules[1].setPatienceValue(TraitValue.MEDIUM);
        this.rules[1].setReactionTimeValue(TraitValue.MEDIUM);
        this.rules[1].setPersistenceValue(TraitValue.MEDIUM);
        this.rules[1].setExcitementValue(TraitValue.MEDIUM);
        this.rules[1].setCompetitiveValue(TraitValue.HIGH);
        this.rules[1].setPlanningValue(TraitValue.MEDIUM);
        this.rules[1].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[1].setCompatibilitySet(Compatibility.LIKE);
        //parameters for hate rule
        this.rules[2] = new Rule();
        this.rules[2].setAnxietyValue(TraitValue.LOW);
        this.rules[2].setAttentionToDetailValue(TraitValue.MEDIUM);
        this.rules[2].setPatienceValue(TraitValue.MEDIUM);
        this.rules[2].setReactionTimeValue(TraitValue.LOW);
        this.rules[2].setPersistenceValue(TraitValue.MEDIUM);
        this.rules[2].setExcitementValue(TraitValue.LOW);
        this.rules[2].setCompetitiveValue(TraitValue.LOW);
        this.rules[2].setPlanningValue(TraitValue.HIGH);
        this.rules[2].setTeamworkValue(TraitValue.HIGH);
        this.rules[2].setCompatibilitySet(Compatibility.HATE);

    }

    private void initFightingSet(){
        this.rules = new Rule[3];
        //parameters for love it rule
        this.rules[0] = new Rule();
        this.rules[0].setAnxietyValue(TraitValue.LOW);
        this.rules[0].setAttentionToDetailValue(TraitValue.LOW);
        this.rules[0].setPatienceValue(TraitValue.LOW);
        this.rules[0].setReactionTimeValue(TraitValue.HIGH);
        this.rules[0].setPersistenceValue(TraitValue.MEDIUM);
        this.rules[0].setExcitementValue(TraitValue.HIGH);
        this.rules[0].setCompetitiveValue(TraitValue.HIGH);
        this.rules[0].setPlanningValue(TraitValue.LOW);
        this.rules[0].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[0].setCompatibilitySet(Compatibility.LOVE);
        //parameters for OK level
        this.rules[1] = new Rule();
        this.rules[1].setAnxietyValue(TraitValue.MEDIUM);
        this.rules[1].setAttentionToDetailValue(TraitValue.MEDIUM);
        this.rules[1].setPatienceValue(TraitValue.MEDIUM);
        this.rules[1].setReactionTimeValue(TraitValue.HIGH);
        this.rules[1].setPersistenceValue(TraitValue.MEDIUM);
        this.rules[1].setExcitementValue(TraitValue.HIGH);
        this.rules[1].setCompetitiveValue(TraitValue.HIGH);
        this.rules[1].setPlanningValue(TraitValue.LOW);
        this.rules[1].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[1].setCompatibilitySet(Compatibility.LIKE);
        //parameters for hate rule
        this.rules[2] = new Rule();
        this.rules[2].setAnxietyValue(TraitValue.HIGH);
        this.rules[2].setAttentionToDetailValue(TraitValue.MEDIUM);
        this.rules[2].setPatienceValue(TraitValue.HIGH);
        this.rules[2].setReactionTimeValue(TraitValue.LOW);
        this.rules[2].setPersistenceValue(TraitValue.LOW);
        this.rules[2].setExcitementValue(TraitValue.LOW);
        this.rules[2].setCompetitiveValue(TraitValue.LOW);
        this.rules[2].setPlanningValue(TraitValue.HIGH);
        this.rules[2].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[2].setCompatibilitySet(Compatibility.HATE);

    }

    public void printRules() {
        System.out.println(this.toString() + "");
        for (int i = 0; i < 3; i++) {
            Rule current = this.rules[i];
            switch (i) {
                case 0:
                    System.out.print("LOVE,");
                    break;
                case 1:
                    System.out.print("OK,");
                    break;
                case 2:
                    System.out.print("HATE,");
                    break;
            }
            System.out.print(current.getAnxietyLevel() + ",");
            System.out.print(current.getAttentionToDetailLevel() + ",");
            System.out.print(current.getPatienceLevel() + ",");
            System.out.print(current.getReactionTimeLevel() + ",");
            System.out.print(current.getPersistenceLevel() + ",");
            System.out.print(current.getExcitementLevel() + ",");
            System.out.print(current.getCompetitiveLevel() + ",");
            System.out.print(current.getPlanningLevel() + ",");
            System.out.println(current.getTeamworkLevel() + "");

        }
    }
}