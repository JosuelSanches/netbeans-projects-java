/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicaocomposta;

import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Condicaocomposta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o ano que voçê nasceu: ");
        int nas = t.nextInt();
        int i = 2020 - nas;
        System.out.println("Sua idade é " + i);
        if (i >= 18){
            System.out.println("Maior de idade");  
        } else{
            System.out.println("Menor de idade");
        }
        
    }
    
}
