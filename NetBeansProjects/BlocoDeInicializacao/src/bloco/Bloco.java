/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloco;

/**
 *
 * @author josuel Sanches
 */
public class Bloco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente jose = new Cliente();
        System.out.println("Exibindo quantidades de parcelas possiveis: ");
        for(int parcela : jose.getParcelas()){
            System.out.println(parcela + "");
        }
    }
    
}
