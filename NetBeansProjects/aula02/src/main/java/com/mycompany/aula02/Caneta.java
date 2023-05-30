/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02;

/**
 *
 * @author josuel Sanches
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status() {
        System.out.print("Uma caneta "+ this.cor);
        System.out.print(" Modelo: " + this.modelo);
        System.out.print(" A ponta desta caneta é: " + this.ponta);
        System.out.println(" Está tampada? " + this.tampada);
        System.out.println(" Valor da carga " + this.carga);
    }
    private void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! Não posso rabiscar com a tampa.");
        }else {
            System.out.println("Estou rabiscando");
        }
        
    }
    public void tampar(){
        this.tampada = true;
        
    }
    public void destampar(){
        this.tampada = false;
        
    }
}
