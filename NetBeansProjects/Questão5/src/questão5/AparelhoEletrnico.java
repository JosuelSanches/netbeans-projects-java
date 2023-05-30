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
public class AparelhoEletrnico {
    
    private boolean ligado = false;

    
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public void ligar(){
        System.out.println("Aparelho Ligado!");
    }
    
    public void desligar(){
        System.out.println("Aparelho Desligado!");
    }
    
}
