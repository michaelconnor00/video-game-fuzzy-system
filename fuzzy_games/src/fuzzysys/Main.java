package fuzzysys;

/**
 * Created by michaelconnor on 2016-03-19.
 */
public class Main {

    public static void main(String[] args){

        TraitValue anxity, atenchen,patence,reactionTime,persistance,exitment,competativeness,planning,teamwork;
        TraitValue[][] table = new TraitValue[19683][9];
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
                                            if(i1==0){
                                                table[count][0]=TraitValue.INEPT;
                                            }else if(i1==1){
                                                table[count][0]=TraitValue.HIGH;
                                            }else if(i1==2){
                                                table[count][0]=TraitValue.GODLIKE;
                                            }
                                            if(i2==0){
                                                table[count][1]=TraitValue.INEPT;
                                            }else if(i2==1){
                                                table[count][1]=TraitValue.HIGH;
                                            }else if(i2==2){
                                                table[count][1]=TraitValue.GODLIKE;
                                            }
                                            if(i3==0){
                                                table[count][2]=TraitValue.INEPT;
                                            }else if(i3==1){
                                                table[count][2]=TraitValue.HIGH;
                                            }else if(i3==2){
                                                table[count][2]=TraitValue.GODLIKE;
                                            }
                                            if(i4==0){
                                                table[count][3]=TraitValue.INEPT;
                                            }else if(i4==1){
                                                table[count][3]=TraitValue.HIGH;
                                            }else if(i4==2){
                                                table[count][3]=TraitValue.GODLIKE;
                                            }
                                            if(i5==0){
                                                table[count][4]=TraitValue.INEPT;
                                            }else if(i5==1){
                                                table[count][4]=TraitValue.HIGH;
                                            }else if(i5==2){
                                                table[count][4]=TraitValue.GODLIKE;
                                            }
                                            if(i6==0){
                                                table[count][5]=TraitValue.INEPT;
                                            }else if(i6==1){
                                                table[count][5]=TraitValue.HIGH;
                                            }else if(i6==2){
                                                table[count][5]=TraitValue.GODLIKE;
                                            }
                                            if(i7==0){
                                                table[count][6]=TraitValue.INEPT;
                                            }else if(i7==1){
                                                table[count][6]=TraitValue.HIGH;
                                            }else if(i7==2){
                                                table[count][6]=TraitValue.GODLIKE;
                                            }
                                            if(i8==0){
                                                table[count][7]=TraitValue.INEPT;
                                            }else if(i8==1){
                                                table[count][7]=TraitValue.HIGH;
                                            }else if(i8==2){
                                                table[count][7]=TraitValue.GODLIKE;
                                            }
                                            if(i9==0){
                                                table[count][8]=TraitValue.INEPT;
                                            }else if(i9==1){
                                                table[count][8]=TraitValue.HIGH;
                                            }else if(i9==2){
                                                table[count][8]=TraitValue.GODLIKE;
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
    }
}
