/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays5;

/**
 *
 * @author josue
 */
public class Arrays5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] numero = new int[2][2];
        numero[0][0] = 28;
        numero[0][1] = 30;
        numero[1][0] = 40;
        numero[1][1] = 50;
        /*for (int i = 0; i < numero.length; i++){
            for(int j = 0; j < numero[i].length; j++){
                System.out.println(numero[i][j]);
            }
            
        }*/
        for (int[] ref : numero){
            for(int numeros : ref){
                System.out.println(numeros  );
            }
        }
    }
    
}
