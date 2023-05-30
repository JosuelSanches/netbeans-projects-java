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
public class ProfessorPessoal {
   public String nome;
    public String materia;
    public int matricula;
    public int idade;
    /*public void imprime(ProfessorPessoal prof){
        System.out.println("-------------------------------");
        System.out.println("Nome: " + prof.nome);
        System.out.println("Materia: " + prof.materia);
        System.out.println("Matricula: " + prof.matricula);
        System.out.println("Idade: "+ prof.idade);
    
}*/
    public void imprime(){
        System.out.println("-------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Materia: " + this.materia);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Idade: "+ this.idade);
        
    }
    
}
