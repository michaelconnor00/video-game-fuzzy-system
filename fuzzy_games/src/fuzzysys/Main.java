package fuzzysys;

/**
 * Created by michaelconnor on 2016-03-19.
 */
public class Main {

    public static void main(String[] args){
        GenreEngine engine = new GenreEngine();

        engine.getGenreList(
            4.0, // anxiety
            4.0, // atten detail
            4.0, // patience
            2.0, // reactionTime
            4.0, // persistence
            0.5, // excitement
            0.5, // competitiveness
            2.0, // planning
            0.5 // teamwork
        );
        //TraitValue anxity, atenchen,patence,reactionTime,persistance,exitment,competativeness,planning,teamwork;


        FileSource output = new FileSource();
        Genre[] thing = {Genre.SHOOTER,Genre.SIMULATION,Genre.ROLEPLAYING,Genre.SPORTS,Genre.STRATEGYRTS,Genre.FIGHTING,Genre.STRATEGYTURNBASED};
        //output.writeGeneraRules(thing);
        Genre[] thing2 = output.readRule();
        for(int i=0;i<7;i++){
            thing2[i].printRules();
        }
        //output.writeGeneraRules(thing);









        //TraitValue[][] table = new TraitValue[19683][9];
        /*
        int count=0;
        for(int i1=0;i1<3; i1++){
            for(int i2=0;i2<3;i2++){
                for(int i3=0;i3<3;i3++){
                    for(int i4=0;i4<3; i4++){
                        for(int i5=0;i5<3;i5++){
                            for(int i6=0;i6<3;i6++){
                                for(int i7=0;i7<3; i7++){
                                    for(int i8=0;i8<3;i8++){
                                        for(int i9=0;i9<3;i9++){
                                            //index i1 maps to ANXIETY
                                            switch (i1) {
                                                case 0:
                                                    table[count][0] = TraitValue.INEPT;
                                                    break;
                                                case 1:
                                                    table[count][0] = TraitValue.HIGH;
                                                    break;
                                                case 2:
                                                    table[count][0] = TraitValue.GODLIKE;
                                                    break;
                                            }
                                            //index i2 maps to ATTENTIONTODETAIL
                                            switch (i2) {
                                                case 0:
                                                    table[count][1] = TraitValue.INEPT;
                                                    break;
                                                case 1:
                                                    table[count][1] = TraitValue.HIGH;
                                                    break;
                                                case 2:
                                                    table[count][1] = TraitValue.GODLIKE;
                                                    break;
                                            }
                                            //index i3 maps to PATIENCE
                                            switch (i3) {
                                                case 0:
                                                    table[count][2] = TraitValue.INEPT;
                                                    break;
                                                case 1:
                                                    table[count][2] = TraitValue.HIGH;
                                                    break;
                                                case 2:
                                                    table[count][2] = TraitValue.GODLIKE;
                                                    break;
                                            }
                                            //index i4 maps to REACTIONTIME
                                            switch (i4) {
                                                case 0:
                                                    table[count][3] = TraitValue.INEPT;
                                                    break;
                                                case 1:
                                                    table[count][3] = TraitValue.HIGH;
                                                    break;
                                                case 2:
                                                    table[count][3] = TraitValue.GODLIKE;
                                                    break;
                                            }
                                            // index i5 maps to PERSISTANCE
                                            switch (i5) {
                                                case 0:
                                                    table[count][4] = TraitValue.INEPT;
                                                    break;
                                                case 1:
                                                    table[count][4] = TraitValue.HIGH;
                                                    break;
                                                case 2:
                                                    table[count][4] = TraitValue.GODLIKE;
                                                    break;
                                            }
                                            //index i6 maps to EXCITEMENT
                                            switch (i6) {
                                                case 0:
                                                    table[count][5] = TraitValue.INEPT;
                                                    break;
                                                case 1:
                                                    table[count][5] = TraitValue.HIGH;
                                                    break;
                                                case 2:
                                                    table[count][5] = TraitValue.GODLIKE;
                                                    break;
                                            }
                                            // index i7 maps to COMPETITIVENESS
                                            switch (i7) {
                                                case 0:
                                                    table[count][6] = TraitValue.INEPT;
                                                    break;
                                                case 1:
                                                    table[count][6] = TraitValue.HIGH;
                                                    break;
                                                case 2:
                                                    table[count][6] = TraitValue.GODLIKE;
                                                    break;
                                            }
                                            // index i8 maps to PLANNING
                                            switch (i8) {
                                                case 0:
                                                    table[count][7] = TraitValue.INEPT;
                                                    break;
                                                case 1:
                                                    table[count][7] = TraitValue.HIGH;
                                                    break;
                                                case 2:
                                                    table[count][7] = TraitValue.GODLIKE;
                                                    break;
                                            }
                                            // index i9 maps to TEAMWORK
                                            switch (i9) {
                                                case 0:
                                                    table[count][8] = TraitValue.INEPT;
                                                    break;
                                                case 1:
                                                    table[count][8] = TraitValue.HIGH;
                                                    break;
                                                case 2:
                                                    table[count][8] = TraitValue.GODLIKE;
                                                    break;
                                            }
                                            System.out.println(count);
                                            count++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

       for(int x=0;x<19683;x++){
            System.out.println(table[x][0]+"|"+table[x][1]+"|"+table[x][2]+"|"+table[x][3]+"|"+table[x][4]+"|"+table[x][5]+"|"+table[x][6]+"|"+table[x][7]+"|"+table[x][8]+"|");
        }
        */
    }
}
