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
                return highMembershipFunc(x);
            case "LOW":
                return lowMembershipFunc(x);
            case "MEDIUM":
                return mediumMembershipFunc(x);
        }
        return -1.0;
    }

    private double highMembershipFunc(double x){
        if (x <= 2.0){
            return 0.0;
        }

        return (x - 2.0) / 2.0;
    }

    private double lowMembershipFunc(double x){
        if (x >= 2.0){
            return 0.0;
        }

        return (2.0 - x) / 2.0;
    }

    private double mediumMembershipFunc(double x){
        if (x <= 2.0){
            return x / 2.0;
        }

        return (4.0 - x) / 2.0;
    }

    public String toString(){
        return this.displayName;
    }
}
