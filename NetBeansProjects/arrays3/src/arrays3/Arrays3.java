/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays3;

/**
 *
 * @author josue
 */
public class Arrays3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //As três formas de se declarar um arrays
        int[] numeros = new int[5];
        int[] numeros2 = {1, 2, 3, 4, 5}; //tamanho é igual a 5, no entanto o index vai até 4.
        int[] numeros3 = new int[] {1, 2, 3, 4, 5};
        /*for(int i = 0; i < numeros3.length; i++){
                System.out.println(numeros3[i]);
                }*/
        //segunda forma de fazer um for(sem variavel de incremento)
        for(int aux : numeros2){// A variavel auxiliar precisa ser do mesmo tipo do array
            System.out.println(aux);
        }
    }
}