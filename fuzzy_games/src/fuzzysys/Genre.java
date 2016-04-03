package fuzzysys;

/**
 * Enum to represent the different game genres.
 * Created by michaelconnor on 2016-03-20.
 */
public enum Genre {
    ROLEPLAYING("RPG"),
    SHOOTER("FPS"),
    STRATEGYRTS("RTS"),
    STRATEGYTURNBASED("TBS"),
    SIMULATION("SIM"),
    SPORTS("SPT"),
    FIGHTING("FIG");

    Genre(String name){
        switch(name) {
            case "RPG":
                initRPGSet();
                break;
            case "FPS":
                initShooterSet();
                break;
            case "RTS":
                initRTSSet();
                break;
            case "TBS":
                initTBSSet();
                break;
            case "SIM":
                initSimulationSet();
                break;
            case "SPT":
                initSportSet();
                break;
            case "FIG":
                initFightingSet();
                break;
            default:
                break;
        }

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
        this.rules[0].setAnxietyValue(TraitValue.HIGH);this.rules[0].setAttentionToDetailValue(TraitValue.HIGH);this.rules[0].setPatienceValue(TraitValue.HIGH);
        this.rules[0].setReactionTimeValue(TraitValue.LOW);this.rules[0].setPersistenceValue(TraitValue.HIGH);this.rules[0].setExcitementValue(TraitValue.LOW);
        this.rules[0].setCompetitiveValue(TraitValue.LOW);this.rules[0].setPlanningValue(TraitValue.MEDIUM);this.rules[0].setTeamworkValue(TraitValue.LOW);
        this.rules[0].setCompatibilitySet(Compatibility.LOVE);
        //parameters for OK level
        this.rules[1] = new Rule();
        this.rules[1].setAnxietyValue(TraitValue.MEDIUM);this.rules[1].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[1].setPatienceValue(TraitValue.MEDIUM);
        this.rules[1].setReactionTimeValue(TraitValue.MEDIUM);this.rules[1].setPersistenceValue(TraitValue.MEDIUM);this.rules[1].setExcitementValue(TraitValue.LOW);
        this.rules[1].setCompetitiveValue(TraitValue.LOW);this.rules[1].setPlanningValue(TraitValue.MEDIUM);this.rules[1].setTeamworkValue(TraitValue.LOW);
        this.rules[1].setCompatibilitySet(Compatibility.LIKE);
        //parameters for hate rule
        this.rules[2] = new Rule();
        this.rules[2].setAnxietyValue(TraitValue.MEDIUM);this.rules[2].setAttentionToDetailValue(TraitValue.LOW);this.rules[2].setPatienceValue(TraitValue.LOW);
        this.rules[2].setReactionTimeValue(TraitValue.MEDIUM);this.rules[2].setPersistenceValue(TraitValue.LOW);this.rules[2].setExcitementValue(TraitValue.HIGH);
        this.rules[2].setCompetitiveValue(TraitValue.HIGH);this.rules[2].setPlanningValue(TraitValue.MEDIUM);this.rules[2].setTeamworkValue(TraitValue.HIGH);
        this.rules[2].setCompatibilitySet(Compatibility.HATE);
    }

    private void initShooterSet(){
        this.rules = new Rule[3];
        //parameters for love it rule
        this.rules[0] = new Rule();
        this.rules[0].setAnxietyValue(TraitValue.LOW);this.rules[0].setAttentionToDetailValue(TraitValue.LOW);this.rules[0].setPatienceValue(TraitValue.MEDIUM);
        this.rules[0].setReactionTimeValue(TraitValue.HIGH);this.rules[0].setPersistenceValue(TraitValue.MEDIUM);this.rules[0].setExcitementValue(TraitValue.HIGH);
        this.rules[0].setCompetitiveValue(TraitValue.HIGH);this.rules[0].setPlanningValue(TraitValue.MEDIUM);this.rules[0].setTeamworkValue(TraitValue.HIGH);
        this.rules[0].setCompatibilitySet(Compatibility.LOVE);
        //parameters for OK level
        this.rules[1] = new Rule();
        this.rules[1].setAnxietyValue(TraitValue.MEDIUM);this.rules[1].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[1].setPatienceValue(TraitValue.MEDIUM);
        this.rules[1].setReactionTimeValue(TraitValue.MEDIUM);this.rules[1].setPersistenceValue(TraitValue.MEDIUM);this.rules[1].setExcitementValue(TraitValue.MEDIUM);
        this.rules[1].setCompetitiveValue(TraitValue.MEDIUM);this.rules[1].setPlanningValue(TraitValue.MEDIUM);this.rules[1].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[1].setCompatibilitySet(Compatibility.LIKE);
        //parameters for hate rule
        this.rules[2] = new Rule();
        this.rules[2].setAnxietyValue(TraitValue.HIGH);this.rules[2].setAttentionToDetailValue(TraitValue.HIGH);this.rules[2].setPatienceValue(TraitValue.MEDIUM);
        this.rules[2].setReactionTimeValue(TraitValue.LOW);this.rules[2].setPersistenceValue(TraitValue.MEDIUM);this.rules[2].setExcitementValue(TraitValue.LOW);
        this.rules[2].setCompetitiveValue(TraitValue.LOW);this.rules[2].setPlanningValue(TraitValue.MEDIUM);this.rules[2].setTeamworkValue(TraitValue.LOW);
        this.rules[2].setCompatibilitySet(Compatibility.HATE);
    }

    private void initRTSSet(){
        this.rules = new Rule[3];
        //parameters for love it rule
        this.rules[0] = new Rule();
        this.rules[0].setAnxietyValue(TraitValue.HIGH);this.rules[0].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[0].setPatienceValue(TraitValue.MEDIUM);
        this.rules[0].setReactionTimeValue(TraitValue.HIGH);this.rules[0].setPersistenceValue(TraitValue.MEDIUM);this.rules[0].setExcitementValue(TraitValue.MEDIUM);
        this.rules[0].setCompetitiveValue(TraitValue.HIGH);this.rules[0].setPlanningValue(TraitValue.HIGH);this.rules[0].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[0].setCompatibilitySet(Compatibility.LOVE);
        //parameters for OK level
        this.rules[1] = new Rule();
        this.rules[1].setAnxietyValue(TraitValue.MEDIUM);this.rules[1].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[1].setPatienceValue(TraitValue.MEDIUM);
        this.rules[1].setReactionTimeValue(TraitValue.MEDIUM);this.rules[1].setPersistenceValue(TraitValue.MEDIUM);this.rules[1].setExcitementValue(TraitValue.MEDIUM);
        this.rules[1].setCompetitiveValue(TraitValue.MEDIUM);this.rules[1].setPlanningValue(TraitValue.MEDIUM);this.rules[1].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[1].setCompatibilitySet(Compatibility.LIKE);
        //parameters for hate rule
        this.rules[2] = new Rule();
        this.rules[2].setAnxietyValue(TraitValue.LOW);this.rules[2].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[2].setPatienceValue(TraitValue.MEDIUM);
        this.rules[2].setReactionTimeValue(TraitValue.LOW);this.rules[2].setPersistenceValue(TraitValue.LOW);this.rules[2].setExcitementValue(TraitValue.MEDIUM);
        this.rules[2].setCompetitiveValue(TraitValue.LOW);this.rules[2].setPlanningValue(TraitValue.LOW);this.rules[2].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[2].setCompatibilitySet(Compatibility.HATE);

    }

    private void initTBSSet(){
        this.rules = new Rule[3];
        //parameters for love it rule
        this.rules[0] = new Rule();
        this.rules[0].setAnxietyValue(TraitValue.HIGH);this.rules[0].setAttentionToDetailValue(TraitValue.HIGH);this.rules[0].setPatienceValue(TraitValue.HIGH);
        this.rules[0].setReactionTimeValue(TraitValue.MEDIUM);this.rules[0].setPersistenceValue(TraitValue.HIGH);this.rules[0].setExcitementValue(TraitValue.LOW);
        this.rules[0].setCompetitiveValue(TraitValue.LOW);this.rules[0].setPlanningValue(TraitValue.HIGH);this.rules[0].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[0].setCompatibilitySet(Compatibility.LOVE);
        //parameters for OK level
        this.rules[1] = new Rule();
        this.rules[1].setAnxietyValue(TraitValue.MEDIUM);this.rules[1].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[1].setPatienceValue(TraitValue.MEDIUM);
        this.rules[1].setReactionTimeValue(TraitValue.MEDIUM);this.rules[1].setPersistenceValue(TraitValue.MEDIUM);this.rules[1].setExcitementValue(TraitValue.MEDIUM);
        this.rules[1].setCompetitiveValue(TraitValue.MEDIUM);this.rules[1].setPlanningValue(TraitValue.LOW);this.rules[1].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[1].setCompatibilitySet(Compatibility.LIKE);
        //parameters for hate rule
        this.rules[2] = new Rule();
        this.rules[2].setAnxietyValue(TraitValue.LOW);this.rules[2].setAttentionToDetailValue(TraitValue.LOW);this.rules[2].setPatienceValue(TraitValue.LOW);
        this.rules[2].setReactionTimeValue(TraitValue.MEDIUM);this.rules[2].setPersistenceValue(TraitValue.LOW);this.rules[2].setExcitementValue(TraitValue.HIGH);
        this.rules[2].setCompetitiveValue(TraitValue.HIGH);this.rules[2].setPlanningValue(TraitValue.LOW);this.rules[2].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[2].setCompatibilitySet(Compatibility.HATE);

    }

    private void initSportSet(){
        this.rules = new Rule[3];
        //parameters for love it rule
        this.rules[0] = new Rule();
        this.rules[0].setAnxietyValue(TraitValue.HIGH);this.rules[0].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[0].setPatienceValue(TraitValue.LOW);
        this.rules[0].setReactionTimeValue(TraitValue.HIGH);this.rules[0].setPersistenceValue(TraitValue.LOW);this.rules[0].setExcitementValue(TraitValue.HIGH);
        this.rules[0].setCompetitiveValue(TraitValue.LOW);this.rules[0].setPlanningValue(TraitValue.HIGH);this.rules[0].setTeamworkValue(TraitValue.LOW);
        this.rules[0].setCompatibilitySet(Compatibility.LOVE);
        //parameters for OK level
        this.rules[1] = new Rule();
        this.rules[1].setAnxietyValue(TraitValue.MEDIUM);this.rules[1].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[1].setPatienceValue(TraitValue.MEDIUM);
        this.rules[1].setReactionTimeValue(TraitValue.MEDIUM);this.rules[1].setPersistenceValue(TraitValue.MEDIUM);this.rules[1].setExcitementValue(TraitValue.MEDIUM);
        this.rules[1].setCompetitiveValue(TraitValue.HIGH);this.rules[1].setPlanningValue(TraitValue.MEDIUM);this.rules[1].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[1].setCompatibilitySet(Compatibility.LIKE);
        //parameters for hate rule
        this.rules[2] = new Rule();
        this.rules[2].setAnxietyValue(TraitValue.LOW);this.rules[2].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[2].setPatienceValue(TraitValue.MEDIUM);
        this.rules[2].setReactionTimeValue(TraitValue.LOW);this.rules[2].setPersistenceValue(TraitValue.MEDIUM);this.rules[2].setExcitementValue(TraitValue.LOW);
        this.rules[2].setCompetitiveValue(TraitValue.LOW);this.rules[2].setPlanningValue(TraitValue.HIGH);this.rules[2].setTeamworkValue(TraitValue.HIGH);
        this.rules[2].setCompatibilitySet(Compatibility.HATE);

    }

    private void initFightingSet(){
        this.rules = new Rule[3];
        //parameters for love it rule
        this.rules[0] = new Rule();
        this.rules[0].setAnxietyValue(TraitValue.LOW);this.rules[0].setAttentionToDetailValue(TraitValue.LOW);this.rules[0].setPatienceValue(TraitValue.LOW);
        this.rules[0].setReactionTimeValue(TraitValue.HIGH);this.rules[0].setPersistenceValue(TraitValue.MEDIUM);this.rules[0].setExcitementValue(TraitValue.HIGH);
        this.rules[0].setCompetitiveValue(TraitValue.HIGH);this.rules[0].setPlanningValue(TraitValue.LOW);this.rules[0].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[0].setCompatibilitySet(Compatibility.LOVE);
        //parameters for OK level
        this.rules[1] = new Rule();
        this.rules[1].setAnxietyValue(TraitValue.MEDIUM);this.rules[1].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[1].setPatienceValue(TraitValue.MEDIUM);
        this.rules[1].setReactionTimeValue(TraitValue.HIGH);this.rules[1].setPersistenceValue(TraitValue.MEDIUM);this.rules[1].setExcitementValue(TraitValue.HIGH);
        this.rules[1].setCompetitiveValue(TraitValue.HIGH);this.rules[1].setPlanningValue(TraitValue.LOW);this.rules[1].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[1].setCompatibilitySet(Compatibility.LIKE);
        //parameters for hate rule
        this.rules[2] = new Rule();
        this.rules[2].setAnxietyValue(TraitValue.HIGH);this.rules[2].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[2].setPatienceValue(TraitValue.HIGH);
        this.rules[2].setReactionTimeValue(TraitValue.LOW);this.rules[2].setPersistenceValue(TraitValue.LOW);this.rules[2].setExcitementValue(TraitValue.LOW);
        this.rules[2].setCompetitiveValue(TraitValue.LOW);this.rules[2].setPlanningValue(TraitValue.HIGH);this.rules[2].setTeamworkValue(TraitValue.MEDIUM);
        this.rules[2].setCompatibilitySet(Compatibility.HATE);

    }
}
