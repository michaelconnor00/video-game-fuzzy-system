package fuzzysys;

/**
 * Enum for standard trait values
 * Created by michaelconnor on 2016-03-20.
 */
public enum TraitValue {
    INEPT("Inept..."), // Lowest
    LOW("Embarrassing"),
    AVERAGE("I can get by"),
    HIGH("Bring it on"),
    GODLIKE("God Like!"); // Highest

    private String displayName;

    TraitValue(String display){
        this.displayName = display;
    }

    public String toString(){
        return this.displayName;
    }




}
