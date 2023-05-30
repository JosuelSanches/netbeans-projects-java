/**
 *
 * @author josuel Sanches
 */
public class TesteConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(150);
        cc.imprimirExtrato();
        
        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(200);
        cp.imprimirExtrato();
    }
    
}
