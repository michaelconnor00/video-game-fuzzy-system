package fuzzysys;

/**
 * Enum for standard trait values
 * Created by michaelconnor on 2016-03-20.
 */
public enum TraitValue {

    HIGH("God Like"),
    MEDIUM("Could Care Less"),
    LOW("Inept");

    private String displayName;

    TraitValue(String display){
        this.displayName = display;
    }

    private double getMembership(double x){
        switch (this.name()){
            case "HIGH":
                return Functions.BASE.highMembershipFunc(x);
            case "LOW":
                return Functions.BASE.lowMembershipFunc(x);
            case "MEDIUM":
                return Functions.BASE.mediumMembershipFunc(x);
        }
        return -1.0;
    }

    public String toString(){
        return this.displayName;
    }
}
