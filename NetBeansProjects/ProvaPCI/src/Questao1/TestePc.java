
package Questao1;

/**
 *
 * @author josuel Sanches
 */
public class TestePc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PCDell inspiron = new PCDell();
        System.out.println("..................................................");
        inspiron.ligar();
        inspiron.computar();
        inspiron.desligar();
        System.out.println("..................................................");
        PCLenovo yoga = new PCLenovo();
        System.out.println("....................................................");
        yoga.ligar();
        yoga.computar();
        yoga.desligar();
        
    }
    
}
