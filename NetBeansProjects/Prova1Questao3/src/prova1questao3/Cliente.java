/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1questao3;

/**
 *
 * @author josuel Sanches
 */
public class Cliente {
    private String nome;
    private int rg;
    public Cliente(String nome, int rg){
        this.nome = nome;
        this.rg = rg;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setRg(int rg){
        this.rg = rg;
    }
    public String getNome(){
        return this.nome;
    }
    public int getRg(){
        return this.rg;
    }
    
    
}
