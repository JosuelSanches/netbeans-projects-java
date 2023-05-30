/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josuel Sanches
 */
public class ContaCorrente extends Conta {
    public void depositar(double valor){
        setSaldo(getSaldo()+valor);
    }
    
    @Override
    public void imprimirExtrato(){
        System.out.println("Saldo de sua conta corrente é: "+getSaldo());
    }
}
