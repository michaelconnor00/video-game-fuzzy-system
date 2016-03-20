import java.util.HashMap;

/**
 * Class to encapsulate values for a Trait
 * Created by michaelconnor on 2016-03-20.
 */
public class Trait {
    private HashMap<TraitValue, Integer> traitValueSet;

    /**
     * Constructor for Traits
     * @param traitValues: array of values to store, len==5, Indexes 0==lowest : 4==highest.
     */
    public Trait(int[] traitValues){
        this.traitValueSet = new HashMap<>();
        this.traitValueSet.put(TraitValue.INEPT, traitValues[0]);
        this.traitValueSet.put(TraitValue.LOW, traitValues[1]);
        this.traitValueSet.put(TraitValue.AVERAGE, traitValues[2]);
        this.traitValueSet.put(TraitValue.HIGH, traitValues[3]);
        this.traitValueSet.put(TraitValue.GODLIKE, traitValues[4]);
    }
}
