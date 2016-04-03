package fuzzysys;

/**
 * Created by michaelconnor on 2016-04-02.
 */
public enum Compatibility {
    LOVE,
    LIKE,
    HATE;

    private double getMembership(double x){
        switch (this.name()){
            case "LOVE":
                return Functions.BASE.highMembershipFunc(x);
            case "HATE":
                return Functions.BASE.lowMembershipFunc(x);
            case "LIKE":
                return Functions.BASE.mediumMembershipFunc(x);
        }
        return -1.0;
    }
}
