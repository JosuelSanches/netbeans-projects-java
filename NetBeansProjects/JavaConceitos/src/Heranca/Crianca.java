/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

/**
 *
 * @author josuel Sanches
 */
public class Crianca extends Pessoa{
    private String Brinquedos, responsavel;

    public String getBrinquedos() {
        return Brinquedos;
    }

    public void setBrinquedos(String Brinquedos) {
        this.Brinquedos = Brinquedos;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    
    public void brincar(String brincadeira){
        System.out.println(""+this.getNome()+" está brincancando de "+brincadeira);
    }
    
    public float crescer(float tamanho){
       this.setAltura(tamanho+this.getAltura());
       return this.getAltura();
    }
}
