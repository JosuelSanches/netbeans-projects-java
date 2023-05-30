

// @author josuel Sanches
 
public class TesteCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora c = new Calculadora();
        System.out.println("Potencia float inteiros: " + c.potencia(2.5f, 2));
        System.out.println("somar inteiros: " + c.somar(15, 35));
        System.out.println("somar doubles: " +c.somar(15.5f, 35.5f));
    }
    
}
