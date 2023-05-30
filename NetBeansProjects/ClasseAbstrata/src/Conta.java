/*
 Criação de uma classe abstrata
é uma classe que nao pode ser instanciada, ou seja, nao pode ser criado 
objetos a partir dela.
 */

///   @author josuel Sanches
 
abstract class Conta {
    private double saldo;
    
    public abstract void imprimirExtrato();
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
}
