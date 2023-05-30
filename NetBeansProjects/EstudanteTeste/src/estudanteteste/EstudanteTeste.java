/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudanteteste;

/**
 *
 * @author josuel Sanches
 */
public class EstudanteTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudante estudante = new Estudante();
        estudante.setNome("Helio Vinicius Correa de Barros");
        estudante.setIdade(19);
        estudante.setNotas(new double[]{9, 9.7, 8.9});
        estudante.print();
        estudante.tirarMedia();
        System.out.println("Aprovado?" + estudante.isAprovado());
        
        
    }
    
}
