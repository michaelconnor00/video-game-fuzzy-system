package fuzzysys;

/**
 * Enum to represent the different game genres.
 * Created by michaelconnor on 2016-03-20.
 */
public enum Genre {
    ROLEPLAYING("rpg.fcl"),
    SHOOTER("fps.fcl"),
    STRATEGYRTS("rts.fcl"),
    STRATEGYTURNBASED("tbs.fcl"),
    SIMULATION("sim.fcl"),
    SPORTS("sport.fcl"),
    FIGHTING("fight.fcl");

    public String getFile_name() {
        return file_name;
    }

    private String file_name;

    Genre(String name){

        String file_sep = System.getProperty("file.separator");
        String dir = System.getProperty("user.dir") + file_sep + "fuzzy_games" +
            file_sep + "src" + file_sep + "fuzzysys" + file_sep + "fcl" + file_sep;

        this.file_name = dir + name;
    }

    public String getFileName(){
        return this.file_name;
    }

}