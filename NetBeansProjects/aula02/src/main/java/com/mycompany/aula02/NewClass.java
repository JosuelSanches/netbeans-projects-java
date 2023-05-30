/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02;

/**
 *
 * @author josuel Sanches
 */
public class NewClass {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.cor = "verde";
        //c1.ponta = 0.7f;
        c1.modelo = "bick";
        //c1.tampada = true;
        c1.carga = 9;
        c1.status();
       // c1.rabiscar();
        c1.destampar();
        c1.status();
        //c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.cor = "preta";
        //c2.ponta = 0.5f;
        c2.carga = 5;
        c2.modelo = "Compactor";
        //c2.tampada = false;
        c2.status();
        //c2.rabiscar();
    }
    
    static void main2(){
        System.out.println("teste");
    }
    
}
