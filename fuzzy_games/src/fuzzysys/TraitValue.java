package fuzzysys;

/**
 * Enum for standard trait values
 * Created by michaelconnor on 2016-03-20.
 */
public enum TraitValue {

    FAR("big difernce"),//great differince between user value and arch type
    NEAR("small diferince"),//small differince between user value and arch type
    PERFECT("perfict match");//no differince between user value and arch type


    private String displayName;

    TraitValue(String display){
        this.displayName = display;
    }

    public String toString(){
        return this.displayName;
    }




}
