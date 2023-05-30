/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carroteste;

/**
 *
 * @author josue
 */
public class CarroTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro carro = new Carro();
        carro.modelo = "lamborguine aventador";
        carro.placa = "QGJ0978";
        carro.velocidadeMaxima = 300;
        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);
    }
    
}
