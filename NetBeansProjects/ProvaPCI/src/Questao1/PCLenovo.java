
package Questao1;

/**
 *
 * @author josuel Sanches
 */
public class PCLenovo implements OperacoesComputador {

    @Override
    public void ligar() {
        System.out.println("O PC Lenovo está ligando...");
    }

    @Override
    public void computar() {
        System.out.println("O PC Lenovo está computando...");
    }

    @Override
    public void desligar() {
        System.out.println("O PC Lenovo esta desligando...");
    }
    
}
