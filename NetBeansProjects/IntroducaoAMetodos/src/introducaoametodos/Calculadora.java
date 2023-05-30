/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducaoametodos;

/**
 *
 * @author josue
 */
public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(5 + 5);
    }
    public void subtraiDoisNumeros(){
        System.out.println(5 - 5);
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
        
    }
    public double divideDoisNumeros(double num1, double num2){
        if (num2 != 0){
        return  num1/num2;
    }
        System.out.println("Não é possivel dividir por 0. ");
        return 0;
    }
    public void imprimeDoisNumerosDivididos(double num1, double num2){
        if (num2 != 0){
            System.out.println("o resultado da divisão é: " + num1/num2);
            return;
        }
            System.out.println("não é possivel dividir por zero. ");
        
    }
    public void mudandoDoisNumeros(int num1, int num2){
        num1 = 40;
        num2 = 35;
        System.out.println("Dentro do mudando dois numeros:");
        System.out.println("num1: " + num1);
        System.out.println("num2:" + num2);
        
        
    }
    public void somandoArrays(int [] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    
}
