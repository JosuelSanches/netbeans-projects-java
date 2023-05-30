/**
 *
 * @author josuel Sanches
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Carro {
    String marca, modelo, cor;
    int velocidade, velocidadeMax;
    Scanner sc = new Scanner(System.in);
    float acelerar(){
        //System.out.println("Digite a velocidade: ");
        //velocidade = sc.nextFloat();
        velocidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a velocidade: "));
        if(velocidade > velocidadeMax){
            JOptionPane.showMessageDialog(null, "O "+ modelo + " não consegue acelerar acima de seu limite.");
            return velocidadeMax;
        }else{
            return velocidade;
        }
    }
}
