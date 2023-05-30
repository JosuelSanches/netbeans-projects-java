/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargadeconstrutores;

/**
 *
 * @author josuel Sanches
 */
public class SobrecargaDeConstrutores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno estudante = new Aluno("12323", "Josuel de Souza Sanches", new double[] {9, 8, 9.8}, "19/02/2020");
        estudante.imprime();
    }
    
}
