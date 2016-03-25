package fuzzysys;

import java.util.HashMap;

/**
 * Enum to represent the different game genres.
 * Created by michaelconnor on 2016-03-20.
 */
public enum Genre {
    ROLEPLAYING("RPG"),
    SHOOTER("SHT"),
    STRATEGYRTS("RTS"),
    STRATEGYTURNBASED("STB"),
    SIMULATION("SIM"),
    SPORTS("SPT"),
    FIGHTING("FIT");

    Genre(String name){
        // TODO Add remaining functions
        switch(name) {
            case "RPG":
                initRPGSet();
                break;
            case "SHT":
                break;
            case "RTS":
                break;
            case "STB":
                break;
            case "SIM":
                initSimulationSet();
                break;
            case "SPT":
                break;
            case "FIT":
                break;
            default:
                break;
        }

    }

    private HashMap<BehaviouralTraits, Double> traitSet;

    public HashMap getInitTraitSet(){
        return this.traitSet;
    }

    private void initRPGSet(){
        this.traitSet = new HashMap<>();
        this.traitSet.put(BehaviouralTraits.ANXIETY, 0.0);  // TODO Like this
        this.traitSet.put(BehaviouralTraits.ATTENTIONTODETAIL, new Trait(new int[] {1, 2, 3, 4, 5}));
        this.traitSet.put(BehaviouralTraits.PATIENCE, new Trait(new int[] {1, 2, 3, 4, 5}));
        this.traitSet.put(BehaviouralTraits.REACTIONTIME, new Trait(new int[] {1, 2, 3, 4, 5}));
        this.traitSet.put(BehaviouralTraits.PERSISTANCE, new Trait(new int[] {1, 2, 3, 4, 5}));
        this.traitSet.put(BehaviouralTraits.EXCITEMENT, new Trait(new int[] {1, 2, 3, 4, 5}));
        this.traitSet.put(BehaviouralTraits.COMPETITIVENESS, new Trait(new int[] {1, 2, 3, 4, 5}));
        this.traitSet.put(BehaviouralTraits.PLANNING, new Trait(new int[] {1, 2, 3, 4, 5}));
        this.traitSet.put(BehaviouralTraits.TEAMWORK, new Trait(new int[] {1, 2, 3, 4, 5}));
    }

    private void initSimulationSet(){
        this.traitSet = new HashMap<>();
        this.traitSet.put(BehaviouralTraits.ANXIETY, new Trait(new int[] {1, 1, 3, 4, 5}));
        this.traitSet.put(BehaviouralTraits.ATTENTIONTODETAIL, new Trait(new int[] {1, 2, 3, 4, 5}));
        this.traitSet.put(BehaviouralTraits.PATIENCE, new Trait(new int[] {1, 2, 3, 4, 5}));
        this.traitSet.put(BehaviouralTraits.REACTIONTIME, new Trait(new int[] {1, 2, 3, 4, 5}));
        this.traitSet.put(BehaviouralTraits.PERSISTANCE, new Trait(new int[] {1, 2, 3, 4, 5}));
        this.traitSet.put(BehaviouralTraits.EXCITEMENT, new Trait(new int[] {1, 2, 3, 4, 5}));
        this.traitSet.put(BehaviouralTraits.COMPETITIVENESS, new Trait(new int[] {1, 2, 3, 4, 5}));
        this.traitSet.put(BehaviouralTraits.PLANNING, new Trait(new int[] {1, 2, 3, 4, 5}));
        this.traitSet.put(BehaviouralTraits.TEAMWORK, new Trait(new int[] {1, 2, 3, 4, 5}));
    }

    // TODO add more functions
}
