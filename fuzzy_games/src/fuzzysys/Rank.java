package fuzzysys;

/**
 * Created by michaelconnor on 2016-04-02.
 */
public class Rank{

    private Genre genre;
    private double compatibility;

    public Rank(Genre genre, double compatibility){
        this.genre = genre;
        this.compatibility = compatibility;
    }

    public double getCompatibility(){
        return this.compatibility;
    }

    @Override
    public String toString() {
        return this.genre + " : " + this.compatibility;
    }
}
