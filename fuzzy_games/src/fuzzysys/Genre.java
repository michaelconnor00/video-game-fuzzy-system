package fuzzysys;

import java.util.HashMap;

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

    private HashMap<BehaviouralTraits, Double> traitSet;
    private Rule[] rules;

    public HashMap getInitTraitSet(){
        return this.traitSet;
    }

    private void initRPGSet(){
        this.traitSet = new HashMap<>();
        this.rules = new Rule[3];
        //peramiters for love it rule
        this.rules[0].setAnxietyValue(TraitValue.HIGH);this.rules[0].setAttentionToDetailValue(TraitValue.HIGH);this.rules[0].setPatienceValue(TraitValue.HIGH);
        this.rules[0].setReactionTimeValue(TraitValue.MEDIUM);this.rules[0].setPersistenceValue(TraitValue.HIGH);this.rules[0].setExcitementValue(TraitValue.LOW);
        this.rules[0].setCompetitiveValue(TraitValue.LOW);this.rules[0].setPlanningValue(TraitValue.MEDIUM);this.rules[0].setTeamworkValue(TraitValue.LOW);
        //peramiters for OK level
        this.rules[1].setAnxietyValue(TraitValue.MEDIUM);this.rules[1].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[1].setPatienceValue(TraitValue.MEDIUM);
        this.rules[1].setReactionTimeValue(TraitValue.MEDIUM);this.rules[1].setPersistenceValue(TraitValue.MEDIUM);this.rules[1].setExcitementValue(TraitValue.MEDIUM);
        this.rules[1].setCompetitiveValue(TraitValue.MEDIUM);this.rules[1].setPlanningValue(TraitValue.MEDIUM);this.rules[1].setTeamworkValue(TraitValue.MEDIUM);
        //peramiters for hate rule
        this.rules[2].setAnxietyValue(TraitValue.MEDIUM);this.rules[2].setAttentionToDetailValue(TraitValue.LOW);this.rules[2].setPatienceValue(TraitValue.MEDIUM);
        this.rules[2].setReactionTimeValue(TraitValue.MEDIUM);this.rules[2].setPersistenceValue(TraitValue.LOW);this.rules[2].setExcitementValue(TraitValue.MEDIUM);
        this.rules[2].setCompetitiveValue(TraitValue.HIGH);this.rules[2].setPlanningValue(TraitValue.LOW);this.rules[2].setTeamworkValue(TraitValue.HIGH);
    }

    private void initSimulationSet(){
        this.traitSet = new HashMap<>();
        this.rules = new Rule[3];
        //peramiters for love it rule
        this.rules[0].setAnxietyValue(TraitValue.HIGH);this.rules[0].setAttentionToDetailValue(TraitValue.HIGH);this.rules[0].setPatienceValue(TraitValue.HIGH);
        this.rules[0].setReactionTimeValue(TraitValue.LOW);this.rules[0].setPersistenceValue(TraitValue.HIGH);this.rules[0].setExcitementValue(TraitValue.LOW);
        this.rules[0].setCompetitiveValue(TraitValue.LOW);this.rules[0].setPlanningValue(TraitValue.MEDIUM);this.rules[0].setTeamworkValue(TraitValue.LOW);
        //peramiters for OK level
        this.rules[1].setAnxietyValue(TraitValue.MEDIUM);this.rules[1].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[1].setPatienceValue(TraitValue.MEDIUM);
        this.rules[1].setReactionTimeValue(TraitValue.MEDIUM);this.rules[1].setPersistenceValue(TraitValue.MEDIUM);this.rules[1].setExcitementValue(TraitValue.LOW);
        this.rules[1].setCompetitiveValue(TraitValue.LOW);this.rules[1].setPlanningValue(TraitValue.MEDIUM);this.rules[1].setTeamworkValue(TraitValue.LOW);
        //peramiters for hate rule
        this.rules[2].setAnxietyValue(TraitValue.MEDIUM);this.rules[2].setAttentionToDetailValue(TraitValue.LOW);this.rules[2].setPatienceValue(TraitValue.LOW);
        this.rules[2].setReactionTimeValue(TraitValue.MEDIUM);this.rules[2].setPersistenceValue(TraitValue.LOW);this.rules[2].setExcitementValue(TraitValue.HIGH);
        this.rules[2].setCompetitiveValue(TraitValue.HIGH);this.rules[2].setPlanningValue(TraitValue.MEDIUM);this.rules[2].setTeamworkValue(TraitValue.HIGH);
    }

    private void initShooterSet(){
        this.traitSet = new HashMap<>();
        this.rules = new Rule[3];
        //peramiters for love it rule
        this.rules[0].setAnxietyValue(TraitValue.LOW);this.rules[0].setAttentionToDetailValue(TraitValue.LOW);this.rules[0].setPatienceValue(TraitValue.MEDIUM);
        this.rules[0].setReactionTimeValue(TraitValue.HIGH);this.rules[0].setPersistenceValue(TraitValue.MEDIUM);this.rules[0].setExcitementValue(TraitValue.HIGH);
        this.rules[0].setCompetitiveValue(TraitValue.HIGH);this.rules[0].setPlanningValue(TraitValue.MEDIUM);this.rules[0].setTeamworkValue(TraitValue.HIGH);
        //peramiters for OK level
        this.rules[1].setAnxietyValue(TraitValue.MEDIUM);this.rules[1].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[1].setPatienceValue(TraitValue.MEDIUM);
        this.rules[1].setReactionTimeValue(TraitValue.MEDIUM);this.rules[1].setPersistenceValue(TraitValue.MEDIUM);this.rules[1].setExcitementValue(TraitValue.MEDIUM);
        this.rules[1].setCompetitiveValue(TraitValue.MEDIUM);this.rules[1].setPlanningValue(TraitValue.MEDIUM);this.rules[1].setTeamworkValue(TraitValue.MEDIUM);
        //peramiters for hate rule
        this.rules[2].setAnxietyValue(TraitValue.HIGH);this.rules[2].setAttentionToDetailValue(TraitValue.HIGH);this.rules[2].setPatienceValue(TraitValue.MEDIUM);
        this.rules[2].setReactionTimeValue(TraitValue.LOW);this.rules[2].setPersistenceValue(TraitValue.MEDIUM);this.rules[2].setExcitementValue(TraitValue.LOW);
        this.rules[2].setCompetitiveValue(TraitValue.LOW);this.rules[2].setPlanningValue(TraitValue.MEDIUM);this.rules[2].setTeamworkValue(TraitValue.LOW);
    }

    private void initRTSSet(){
        this.traitSet = new HashMap<>();
        this.rules = new Rule[3];
        //peramiters for love it rule
        this.rules[0].setAnxietyValue(TraitValue.HIGH);this.rules[0].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[0].setPatienceValue(TraitValue.MEDIUM);
        this.rules[0].setReactionTimeValue(TraitValue.HIGH);this.rules[0].setPersistenceValue(TraitValue.MEDIUM);this.rules[0].setExcitementValue(TraitValue.MEDIUM);
        this.rules[0].setCompetitiveValue(TraitValue.HIGH);this.rules[0].setPlanningValue(TraitValue.HIGH);this.rules[0].setTeamworkValue(TraitValue.MEDIUM);
        //peramiters for OK level
        this.rules[1].setAnxietyValue(TraitValue.MEDIUM);this.rules[1].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[1].setPatienceValue(TraitValue.MEDIUM);
        this.rules[1].setReactionTimeValue(TraitValue.MEDIUM);this.rules[1].setPersistenceValue(TraitValue.MEDIUM);this.rules[1].setExcitementValue(TraitValue.MEDIUM);
        this.rules[1].setCompetitiveValue(TraitValue.MEDIUM);this.rules[1].setPlanningValue(TraitValue.MEDIUM);this.rules[1].setTeamworkValue(TraitValue.MEDIUM);
        //peramiters for hate rule
        this.rules[2].setAnxietyValue(TraitValue.LOW);this.rules[2].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[2].setPatienceValue(TraitValue.MEDIUM);
        this.rules[2].setReactionTimeValue(TraitValue.LOW);this.rules[2].setPersistenceValue(TraitValue.LOW);this.rules[2].setExcitementValue(TraitValue.MEDIUM);
        this.rules[2].setCompetitiveValue(TraitValue.LOW);this.rules[2].setPlanningValue(TraitValue.LOW);this.rules[2].setTeamworkValue(TraitValue.MEDIUM);

    }

    private void initTBSSet(){
        this.traitSet = new HashMap<>();
        this.rules = new Rule[3];
        //peramiters for love it rule
        this.rules[0].setAnxietyValue(TraitValue.HIGH);this.rules[0].setAttentionToDetailValue(TraitValue.HIGH);this.rules[0].setPatienceValue(TraitValue.HIGH);
        this.rules[0].setReactionTimeValue(TraitValue.MEDIUM);this.rules[0].setPersistenceValue(TraitValue.HIGH);this.rules[0].setExcitementValue(TraitValue.LOW);
        this.rules[0].setCompetitiveValue(TraitValue.LOW);this.rules[0].setPlanningValue(TraitValue.HIGH);this.rules[0].setTeamworkValue(TraitValue.MEDIUM);
        //peramiters for OK level
        this.rules[1].setAnxietyValue(TraitValue.MEDIUM);this.rules[1].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[1].setPatienceValue(TraitValue.MEDIUM);
        this.rules[1].setReactionTimeValue(TraitValue.MEDIUM);this.rules[1].setPersistenceValue(TraitValue.MEDIUM);this.rules[1].setExcitementValue(TraitValue.MEDIUM);
        this.rules[1].setCompetitiveValue(TraitValue.MEDIUM);this.rules[1].setPlanningValue(TraitValue.LOW);this.rules[1].setTeamworkValue(TraitValue.MEDIUM);
        //peramiters for hate rule
        this.rules[2].setAnxietyValue(TraitValue.LOW);this.rules[2].setAttentionToDetailValue(TraitValue.LOW);this.rules[2].setPatienceValue(TraitValue.LOW);
        this.rules[2].setReactionTimeValue(TraitValue.MEDIUM);this.rules[2].setPersistenceValue(TraitValue.LOW);this.rules[2].setExcitementValue(TraitValue.HIGH);
        this.rules[2].setCompetitiveValue(TraitValue.HIGH);this.rules[2].setPlanningValue(TraitValue.LOW);this.rules[2].setTeamworkValue(TraitValue.MEDIUM);

    }

    private void initSportSet(){
        this.traitSet = new HashMap<>();
        this.rules = new Rule[3];
        //peramiters for love it rule
        this.rules[0].setAnxietyValue(TraitValue.HIGH);this.rules[0].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[0].setPatienceValue(TraitValue.LOW);
        this.rules[0].setReactionTimeValue(TraitValue.HIGH);this.rules[0].setPersistenceValue(TraitValue.LOW);this.rules[0].setExcitementValue(TraitValue.HIGH);
        this.rules[0].setCompetitiveValue(TraitValue.LOW);this.rules[0].setPlanningValue(TraitValue.HIGH);this.rules[0].setTeamworkValue(TraitValue.LOW);
        //peramiters for OK level
        this.rules[1].setAnxietyValue(TraitValue.MEDIUM);this.rules[1].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[1].setPatienceValue(TraitValue.MEDIUM);
        this.rules[1].setReactionTimeValue(TraitValue.MEDIUM);this.rules[1].setPersistenceValue(TraitValue.MEDIUM);this.rules[1].setExcitementValue(TraitValue.MEDIUM);
        this.rules[1].setCompetitiveValue(TraitValue.HIGH);this.rules[1].setPlanningValue(TraitValue.MEDIUM);this.rules[1].setTeamworkValue(TraitValue.MEDIUM);
        //peramiters for hate rule
        this.rules[2].setAnxietyValue(TraitValue.LOW);this.rules[2].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[2].setPatienceValue(TraitValue.MEDIUM);
        this.rules[2].setReactionTimeValue(TraitValue.LOW);this.rules[2].setPersistenceValue(TraitValue.MEDIUM);this.rules[2].setExcitementValue(TraitValue.LOW);
        this.rules[2].setCompetitiveValue(TraitValue.LOW);this.rules[2].setPlanningValue(TraitValue.HIGH);this.rules[2].setTeamworkValue(TraitValue.HIGH);

    }

    private void initFightingSet(){
        this.traitSet = new HashMap<>();
        this.rules = new Rule[3];
        //peramiters for love it rule
        this.rules[0].setAnxietyValue(TraitValue.LOW);this.rules[0].setAttentionToDetailValue(TraitValue.LOW);this.rules[0].setPatienceValue(TraitValue.LOW);
        this.rules[0].setReactionTimeValue(TraitValue.HIGH);this.rules[0].setPersistenceValue(TraitValue.MEDIUM);this.rules[0].setExcitementValue(TraitValue.HIGH);
        this.rules[0].setCompetitiveValue(TraitValue.HIGH);this.rules[0].setPlanningValue(TraitValue.LOW);this.rules[0].setTeamworkValue(TraitValue.MEDIUM);
        //peramiters for OK level
        this.rules[1].setAnxietyValue(TraitValue.MEDIUM);this.rules[1].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[1].setPatienceValue(TraitValue.MEDIUM);
        this.rules[1].setReactionTimeValue(TraitValue.HIGH);this.rules[1].setPersistenceValue(TraitValue.MEDIUM);this.rules[1].setExcitementValue(TraitValue.HIGH);
        this.rules[1].setCompetitiveValue(TraitValue.HIGH);this.rules[1].setPlanningValue(TraitValue.LOW);this.rules[1].setTeamworkValue(TraitValue.MEDIUM);
        //peramiters for hate rule
        this.rules[2].setAnxietyValue(TraitValue.HIGH);this.rules[2].setAttentionToDetailValue(TraitValue.MEDIUM);this.rules[2].setPatienceValue(TraitValue.HIGH);
        this.rules[2].setReactionTimeValue(TraitValue.LOW);this.rules[2].setPersistenceValue(TraitValue.LOW);this.rules[2].setExcitementValue(TraitValue.LOW);
        this.rules[2].setCompetitiveValue(TraitValue.LOW);this.rules[2].setPlanningValue(TraitValue.HIGH);this.rules[2].setTeamworkValue(TraitValue.MEDIUM);

    }
    // TODO add more functions
}
