/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão5;

/**
 *
 * @author josuel Sanches
 */
public class Smartphone extends AparelhoEletronico{
    
    @Override
    public void ligar(){
        System.out.println("Smartphone Ligado!"); 
        setLigado(true);
    }
    
    @Override
    public void desligar(){
        System.out.println("Smartphone Desligado!"); 
        setLigado(false);
    }
}
