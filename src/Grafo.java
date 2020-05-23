

public class Grafo {

    public String floyd (long[][] adyacencia){
        int cantVer = adyacencia.length;
        long mtrzPesos[][] = adyacencia;
        String ways[][] = new String[cantVer][cantVer];
        String auxWays [][] = new String[cantVer][cantVer];
        String waysR = "";
        String chain = "";
        String shortWay = "";
        int i;
        int j;
        int k;
        float temp1;
        float temp2;
        float temp3;
        float temp4;
        float temp5;

        for (i = 0; i < cantVer; i++){
            for (j=0;j < cantVer;j++){
                ways[i][j] = "";
                auxWays[i][j] = "";
            }
        }

        for (k=0;k<cantVer;k++){
            for (i=0;i<cantVer;i++){
                for (j=0;j<cantVer;j++){
                    temp1 = mtrzPesos[i][j];
                    temp2 = mtrzPesos[i][k];
                    temp3 = mtrzPesos[k][j];
                    temp4 = temp2 + temp3;

                    temp5 = Math.min(temp1,temp4);
                    if(temp1 != temp4){
                        if (temp5 == temp4){
                            waysR ="";
                            auxWays[i][j] = k+"";
                            ways [i][j] = caminosR(i,k,auxWays,waysR)+(k+1);
                        }
                    }
                    mtrzPesos[i][j] = (long)temp5;
                }
            }
        }
        for (i=0;i<cantVer;i++){
            
        }
    }

}
