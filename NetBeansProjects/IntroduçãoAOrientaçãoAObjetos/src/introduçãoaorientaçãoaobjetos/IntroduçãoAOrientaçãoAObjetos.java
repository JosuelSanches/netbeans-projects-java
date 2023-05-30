/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduçãoaorientaçãoaobjetos;

/**
 *
 * @author josue
 */
public class IntroduçãoAOrientaçãoAObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Estudante joao = new Estudante();
         joao.nome = "joao felipe de oliveira pereira";
         joao.matricula = "1212";
         joao.idade = 19;
         System.out.println(joao.nome);
         System.out.println(joao.matricula);
         System.out.println(joao.idade);
    }
    
}
