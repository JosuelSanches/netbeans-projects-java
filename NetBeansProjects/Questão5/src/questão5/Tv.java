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
public class Tv extends AparelhoEletronico{
    
    @Override
    public void ligar(){
        System.out.println("Ligando Tv!");
        setLigado(true);
    }
    
    @Override
    public void desligar(){
        System.out.println("desligando Tv!"); 
        setLigado(false);
    }
}
