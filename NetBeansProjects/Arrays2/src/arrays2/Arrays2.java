/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

/**
 *
 * @author josue
 */
public class Arrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] nomes = new String[3];
        nomes[0] = "Erren";
        nomes[1] = "Óbito";
        nomes[2] = "Annie";
        System.out.println("tamanho " + nomes.length);
        for (int i = 0; i < nomes.length; i++){
        System.out.println("nome " + i + ": " + nomes[i]);
        }
    }
    
}
