package fuzzysys;

/**
 * Created by michaelconnor on 2016-04-02.
 */
public enum Functions {
    BASE;

    public double highMembershipFunc(double x){
        if (x <= 2.0){
            return 0.0;
        }

        return (x - 2.0) / 2.0;
    }

    public double lowMembershipFunc(double x){
        if (x >= 2.0){
            return 0.0;
        }

        return (2.0 - x) / 2.0;
    }

    public double mediumMembershipFunc(double x){
        if (x <= 2.0){
            return x / 2.0;
        }

        return (4.0 - x) / 2.0;
    }
}
