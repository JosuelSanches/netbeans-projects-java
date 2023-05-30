
package aula04;

/**
 *
 * @author josuel Sanches
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta("nic", 0.6f, "verde");
        
        c1.status();
        
        System.out.println("Tenho uma caneta "+ c1.getModelo() + " de ponta " + c1.getPonta());
    }
    
}
