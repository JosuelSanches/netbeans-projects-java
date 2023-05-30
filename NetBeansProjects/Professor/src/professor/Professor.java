/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professor;

/**
 *
 * @author josue
 */
public class Professor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crie os seguintes atributos para esta classe
        nome, materia, matricula, idade
        Crie uma classe de teste para peencher e imprimir 
        os dados desse profesor
        */
        // TODO code application logic here
        ProfessorPessoal vinicius = new ProfessorPessoal();
        vinicius.nome = "Helio Vinicius Correa de Barros";
        vinicius.materia = "Ciencias naturais";
        vinicius.matricula = 1243;
        vinicius.idade = 19;
        ProfessorPessoal josuel = new ProfessorPessoal();
        josuel.nome = "Josuel de Souza Sanches";
        josuel.materia = "Sistemas de informação";
        josuel.matricula = 1244;
        josuel.idade = 22;
        ProfessorPessoal hugo = new ProfessorPessoal();
        hugo.nome = "Hugo François Sanches Correa";
        hugo.materia = " cultura japonesa";
        hugo.matricula = 1245;
        hugo.idade = 16;
                
        //vinicius.imprime(vinicius);
        vinicius.imprime();
        //josuel.imprime(josuel);
        josuel.imprime();
        //hugo.imprime(hugo);
        hugo.imprime();
        
        
    }
    
}
