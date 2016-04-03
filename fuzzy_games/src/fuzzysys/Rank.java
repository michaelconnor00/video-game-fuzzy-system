package fuzzysys;

/**
 * Created by michaelconnor on 2016-04-02.
 */
public class Rank {

    private Genre genre;
    private Compatibility compatibility;
    private double ranking;

    public Rank(Genre genre, Compatibility compatibility, double ranking){
        this.genre = genre;
        this.compatibility = compatibility;
        this.ranking = ranking;
    }
}
