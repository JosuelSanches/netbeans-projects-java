
package Questao1;

/**
 *
 * @author josuel Sanches
 */
public class PCDell implements OperacoesComputador {

    @Override
    public void ligar() {
        System.out.println("O PC Dell está ligando...");
    }

    @Override
    public void computar() {
        System.out.println("O PC Dell está computando...");
    }

    @Override
    public void desligar() {
        System.out.println("O PC Dell está desligando...");
    }
    
}
