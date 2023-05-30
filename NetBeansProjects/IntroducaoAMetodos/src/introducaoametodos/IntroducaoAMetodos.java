/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducaoametodos;

/**
 *
 * @author josuel
 */
public class IntroducaoAMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calculon = new Calculadora();
        calculon.somaDoisNumeros();
        calculon.subtraiDoisNumeros();
        calculon.multiplicaDoisNumeros(5,5);
        double result = calculon.divideDoisNumeros(40, 5);
        System.out.println("o resultado da divisão é: " + result);
        calculon.imprimeDoisNumerosDivididos(2, 0);
        int num1 = 10;
        int num2 = 70;
        calculon.mudandoDoisNumeros(num1, num2);
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("continuando a execução...");
        int[] numeros = {1, 2, 3, 4, 5};
        calculon.somandoArrays(numeros);
        calculon.somaVarArgs(1, 2, 3, 4, 5);
    }
}
