package fuzzysys;

import java.util.HashMap;

/**
 * Class to encapsulate a set of traits for a Genre
 * Created by michaelconnor on 2016-03-20.
 */
public class TraitSet {
    private HashMap<BehaviouralTraits, Trait> traitSet;

    public TraitSet(){
        this.traitSet = new HashMap<>();
    }

    public void addTrait(BehaviouralTraits bTrait, int[] traitValues){
        this.traitSet.put(bTrait, new Trait(traitValues));
    }

    public void updateTrait(BehaviouralTraits bTrait, TraitValue tValue){
        // TODO implement
    }
}
