/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 * crie uma classe Cliente, 
 * contendo nome e rg, ambos encapsulados.
 * 
 * @author josuel Sanches
 */
public class Cliente {
    private String nome;
    private int rg;
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
