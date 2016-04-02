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
        this.traitSet.put(BehaviouralTraits.ANXIETY, 4.0);
        this.traitSet.put(BehaviouralTraits.ATTENTIONTODETAIL, 4.5);
        this.traitSet.put(BehaviouralTraits.PATIENCE, 4.0);
        this.traitSet.put(BehaviouralTraits.REACTIONTIME, 1.0);
        this.traitSet.put(BehaviouralTraits.PERSISTANCE, 4.0);
        this.traitSet.put(BehaviouralTraits.EXCITEMENT, 2.0);
        this.traitSet.put(BehaviouralTraits.COMPETITIVENESS, 1.0);
        this.traitSet.put(BehaviouralTraits.PLANNING, 3.5);
        this.traitSet.put(BehaviouralTraits.TEAMWORK, 1.0);
    }

    private void initSimulationSet(){
        this.traitSet = new HashMap<>();
        this.rules = new Rule[3];
        this.traitSet.put(BehaviouralTraits.ANXIETY, 5.0);
        this.traitSet.put(BehaviouralTraits.ATTENTIONTODETAIL, 4.0);
        this.traitSet.put(BehaviouralTraits.PATIENCE, 4.5);
        this.traitSet.put(BehaviouralTraits.REACTIONTIME, 1.5);
        this.traitSet.put(BehaviouralTraits.PERSISTANCE, 4.0);
        this.traitSet.put(BehaviouralTraits.EXCITEMENT, 1.0);
        this.traitSet.put(BehaviouralTraits.COMPETITIVENESS, 1.0);
        this.traitSet.put(BehaviouralTraits.PLANNING, 3.5);
        this.traitSet.put(BehaviouralTraits.TEAMWORK, 1.0);
    }

    private void initShooterSet(){
        this.traitSet = new HashMap<>();
        this.rules = new Rule[3];
        this.traitSet.put(BehaviouralTraits.ANXIETY, 1.5);
        this.traitSet.put(BehaviouralTraits.ATTENTIONTODETAIL, 2.0);
        this.traitSet.put(BehaviouralTraits.PATIENCE, 1.0);
        this.traitSet.put(BehaviouralTraits.REACTIONTIME, 5.0);
        this.traitSet.put(BehaviouralTraits.PERSISTANCE, 3.0);
        this.traitSet.put(BehaviouralTraits.EXCITEMENT, 5.0);
        this.traitSet.put(BehaviouralTraits.COMPETITIVENESS, 5.0);
        this.traitSet.put(BehaviouralTraits.PLANNING, 2.5);
        this.traitSet.put(BehaviouralTraits.TEAMWORK, 5.0);
    }

    private void initRTSSet(){
        this.traitSet = new HashMap<>();
        this.rules = new Rule[3];
        this.traitSet.put(BehaviouralTraits.ANXIETY, 4.0);
        this.traitSet.put(BehaviouralTraits.ATTENTIONTODETAIL, 3.0);
        this.traitSet.put(BehaviouralTraits.PATIENCE, 3.5);
        this.traitSet.put(BehaviouralTraits.REACTIONTIME, 4.0);
        this.traitSet.put(BehaviouralTraits.PERSISTANCE, 3.5);
        this.traitSet.put(BehaviouralTraits.EXCITEMENT, 3.0);
        this.traitSet.put(BehaviouralTraits.COMPETITIVENESS, 4.0);
        this.traitSet.put(BehaviouralTraits.PLANNING, 5.0);
        this.traitSet.put(BehaviouralTraits.TEAMWORK, 3.0);
    }

    private void initTBSSet(){
        this.traitSet = new HashMap<>();
        this.rules = new Rule[3];
        this.traitSet.put(BehaviouralTraits.ANXIETY, 5.0);
        this.traitSet.put(BehaviouralTraits.ATTENTIONTODETAIL, 5.0);
        this.traitSet.put(BehaviouralTraits.PATIENCE, 5.0);
        this.traitSet.put(BehaviouralTraits.REACTIONTIME, 1.0);
        this.traitSet.put(BehaviouralTraits.PERSISTANCE, 5.0);
        this.traitSet.put(BehaviouralTraits.EXCITEMENT, 2.0);
        this.traitSet.put(BehaviouralTraits.COMPETITIVENESS, 2.5);
        this.traitSet.put(BehaviouralTraits.PLANNING, 5.0);
        this.traitSet.put(BehaviouralTraits.TEAMWORK, 2.0);
    }

    private void initSportSet(){
        this.traitSet = new HashMap<>();
        this.rules = new Rule[3];
        this.traitSet.put(BehaviouralTraits.ANXIETY, 4.5);
        this.traitSet.put(BehaviouralTraits.ATTENTIONTODETAIL, 4.0);
        this.traitSet.put(BehaviouralTraits.PATIENCE, 2.0);
        this.traitSet.put(BehaviouralTraits.REACTIONTIME, 4.0);
        this.traitSet.put(BehaviouralTraits.PERSISTANCE, 2.0);
        this.traitSet.put(BehaviouralTraits.EXCITEMENT, 4.5);
        this.traitSet.put(BehaviouralTraits.COMPETITIVENESS, 5.0);
        this.traitSet.put(BehaviouralTraits.PLANNING, 2.0);
        this.traitSet.put(BehaviouralTraits.TEAMWORK, 2.0);
    }

    private void initFightingSet(){
        this.traitSet = new HashMap<>();
        this.rules = new Rule[3];
        this.traitSet.put(BehaviouralTraits.ANXIETY, 1.0);
        this.traitSet.put(BehaviouralTraits.ATTENTIONTODETAIL, 2.0);
        this.traitSet.put(BehaviouralTraits.PATIENCE, 1.0);
        this.traitSet.put(BehaviouralTraits.REACTIONTIME, 5.0);
        this.traitSet.put(BehaviouralTraits.PERSISTANCE, 3.0);
        this.traitSet.put(BehaviouralTraits.EXCITEMENT, 5.0);
        this.traitSet.put(BehaviouralTraits.COMPETITIVENESS, 5.0);
        this.traitSet.put(BehaviouralTraits.PLANNING, 1.0);
        this.traitSet.put(BehaviouralTraits.TEAMWORK, 1.0);
    }
    // TODO add more functions
}
