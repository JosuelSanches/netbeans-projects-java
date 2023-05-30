/**
 *
 * @author josuel Sanches
 */
public class ContaPoupanca extends Conta {
    
    public void depositar(float valor){
        setSaldo(getSaldo()+valor);
    }
    
    @Override
    public void imprimirExtrato(){
        System.out.println("Seu saldo na conta poupanca é: "+getSaldo());
    }
            
}
