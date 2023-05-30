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
public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;
    
    public void print(){
        System.out.println("Nome " + this.nome);
        System.out.println("idade " + this.idade);
        if (this.notas != null){
            for (double nota : this.notas){
                System.out.println(nota + "");
            }
        }
    }
    public void tirarMedia(){
        if (this.notas == null){
            System.out.println("Esse aluno não possui notas.");
            return;
        }
        double media = 0;
        for (double nota : this.notas){
            media += nota;
        }
        media = media / this.notas.length;
        if (media > 6){
            this.aprovado = true;
            System.out.println("\n A média é: " + media + " Situação: Aprovado");
        } else{
            this.aprovado = false;
            System.out.println("\n A média é: " + media + " Situação: Reprovado");
        }
    }
    // getters and setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setNotas(double[] notas){
        this.notas = notas;
    }
   
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public double[] getNotas(){
    return this.notas;
}
    public boolean isAprovado(){
        return this.aprovado;
    }
    
    
}
