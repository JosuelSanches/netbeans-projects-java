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
public class Aluno {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataDaMatricula;
    public Aluno(String matricula, String nome, double[] notas){
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
        
    }
     public Aluno(String matricula, String nome, double[] notas, String dataDaMatricula){
         this(matricula, nome, notas);
        /*this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;*/
        this.dataDaMatricula = dataDaMatricula;
        
    }
    public Aluno(){
        System.out.println("teste sobrecarga de construtor");
        
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for (double nota : notas){
            System.out.println(nota + "");
        } 
        System.out.println(this.dataDaMatricula);
}

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    
    
}
