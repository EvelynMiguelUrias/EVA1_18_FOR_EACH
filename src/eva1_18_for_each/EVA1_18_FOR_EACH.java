/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_for_each;

/**
 *
 * @author Evelyn
 */
public class EVA1_18_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int [] aiDatos = new int[10];
        //ARREGLO CON 10 ELEMENTOS, LLENARLO CON VALORES
        //foreach SOLO USAR CUANDO QUEREMOS SABER LOS DATOS SOLAMENTE 
        int aiDatos[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int iVal : aiDatos) {
            System.out.println("Valor = " + iVal);
        }
        String asCadenas[] = {"RUBEN", "ALONSO", "HERNANDEZ", "CHAVEZ", "!!!!!"};
        for (String aCade : asCadenas) {
            System.out.println("Cadena = " + aCade);
        }
        //ARREGLO DE ENTEROS DE DOS DIMENSIONES  
        int aiMatriz[][] = new int[3][3];
        aiMatriz[0][0]=10;
        aiMatriz[0][1]=20;
        aiMatriz[0][2]=30;
        aiMatriz[1][0]=40;
        aiMatriz[1][1]=50;
        aiMatriz[1][2]=60;
        aiMatriz[2][0]=70;
        aiMatriz[2][1]=80;
        aiMatriz[2][2]=90;
        for (int[] is : aiMatriz) {//LEE SOLO LA PRIMERA MATRIZ 
            for (int i : is) {//LEE LA SEGUNDA MATRIZ 
                System.out.println("Valor = " + i);
            }
        }
        int aiTres[][][] = new int[2][2][2];
         aiTres[0][0][0]=1;
         aiTres[0][0][1]=2;
         aiTres[0][1][0]=3;
         aiTres[0][1][1]=4;
         aiTres[1][0][0]=5;
         aiTres[1][0][1]=6;
         aiTres[1][1][0]=7;
         aiTres[1][1][1]=8;
        for (int[][] aiTre : aiTres) {
            for (int[] is : aiTre) {
                for (int i : is) {
                    System.out.println("Valor = " + i);
                }
            }            
        }
    }
}
