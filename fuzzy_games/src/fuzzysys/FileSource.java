package fuzzysys;

/**
 * Created by johnathan on 4/3/2016.
 */




import java.io.*;

public class FileSource {
    String path;
    private BufferedReader input;
    private BufferedWriter output;

    public FileSource (){
        path="test.txt";

    }
    public FileSource (String file){
        path=file;
    }

    // getrs and seters


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    //opener and closer metheds for io



    void openForRead(){
        try{
            input=new BufferedReader(new FileReader(path));
        }catch(FileNotFoundException e){
            System.err.println("input file not found");
        }
    }
    void closeRead(){
        try{
            input.close();
        }catch(IOException e){
            System.err.println("input file could not be closed");
        }
    }
    void openForWrite(){
        try{
            output=new BufferedWriter(new FileWriter(path));
        }catch(IOException e){
            System.err.println("could not write output");
        }
    }
    void closeWrite(){
        try{
            output.close();
        }catch(IOException e){
            System.err.println("could not close output");
        }
    }

    // write to file and read to file


    public void writeGeneraRules(Genre[] source){
        openForWrite();
        for(int ii=0;ii<7;ii++) {
            Rule[]  rule = source[ii].getRules();
            Rule current;
            try {
                output.write(source[ii].toString() + "");
                output.newLine();
                for (int i = 0; i < 3; i++) {
                    current = rule[i];
                    switch (i) {
                        case 0:
                            output.write("LOVE,");
                            break;
                        case 1:
                            output.write("OK,");
                            break;
                        case 2:
                            output.write("HATE,");
                            break;
                    }
                    output.write(current.getAnxietyLevel() + ",");
                    output.write(current.getAttentionToDetailLevel() + ",");
                    output.write(current.getPatienceLevel() + ",");
                    output.write(current.getReactionTimeLevel() + ",");
                    output.write(current.getPersistenceLevel() + ",");
                    output.write(current.getExcitementLevel() + ",");
                    output.write(current.getCompetitiveLevel() + ",");
                    output.write(current.getPlanningLevel() + ",");
                    output.write(current.getTeamworkLevel() + "");
                    output.newLine();
                }
            } catch (IOException e) {
                System.err.println("could not print to file");
            }
        }
        closeWrite();
    }
    public Genre[] readRule(){
        Genre[] anser = new Genre[7];
        String in;
        openForRead();
        try{
            //loop through all genres in file
            for(int i=0;i<7;i++) {
                in = input.readLine();
                switch (in) {
                    case "FIGHTING":
                        anser[i]=Genre.FIGHTING;
                        break;
                    case "ROLEPLAYING":
                        anser[i]=Genre.ROLEPLAYING;
                        break;
                    case "SHOOTER":
                        anser[i]=Genre.SHOOTER;
                        break;
                    case "SIMULATION":
                        anser[i]=Genre.SIMULATION;
                        break;
                    case "SPORTS":
                        anser[i]=Genre.SPORTS;
                        break;
                    case "STRATEGYRTS":
                        anser[i]=Genre.STRATEGYRTS;
                        break;
                    case "STRATEGYTURNBASED":
                        anser[i]=Genre.STRATEGYTURNBASED;
                        break;
                }
                //loop for all 3 rules
                for(int ii=0;ii<3;ii++) {
                    in = input.readLine();
                    String[] line = in.split(",");
                    String type = line[0];
                    int rule=-1;
                    switch (type) {
                        case "LOVE":
                            rule=0;
                            break;
                        case "OK":
                            rule=1;
                            break;
                        case "HATE":
                            rule=2;
                            break;
                    }
                        anser[i].getRules()[rule].setAnxietyValue(getTrait(line[1]));
                    anser[i].getRules()[rule].setAttentionToDetailValue(getTrait(line[2]));
                    anser[i].getRules()[rule].setPatienceValue(getTrait(line[3]));
                    anser[i].getRules()[rule].setReactionTimeValue(getTrait(line[4]));
                    anser[i].getRules()[rule].setPersistenceValue(getTrait(line[5]));
                    anser[i].getRules()[rule].setExcitementValue(getTrait(line[6]));
                    anser[i].getRules()[rule].setCompetitiveValue(getTrait(line[7]));
                    anser[i].getRules()[rule].setPlanningValue(getTrait(line[8]));
                    anser[i].getRules()[rule].setTeamworkValue(getTrait(line[9]));
                }

            }
        }catch(IOException e){
            System.err.println("could not read file");
        }


        return anser;
    }
    private TraitValue getTrait(String in){
        TraitValue anser;
        switch (in){
            case "high":
                anser = TraitValue.HIGH;
                break;
            case "ok":
                anser=TraitValue.MEDIUM;
                break;
            case "low":
                anser=TraitValue.LOW;
                break;
            default:anser=null;
        }
        return anser;
    }



}
