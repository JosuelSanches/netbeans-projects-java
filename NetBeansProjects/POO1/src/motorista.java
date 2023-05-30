
/**
 *
 * @author josuel Sanches
 */
//import java.util.Scanner;
import javax.swing.JOptionPane;
public class motorista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner sc = new Scanner(System.in);
        /*System.out.println("Digite um numero qualquer");
        int num = sc.nextInt();*/
        Carro meuCarro = new Carro();
        meuCarro.marca = "Lamborghini";
        meuCarro.modelo = "Aventador";
        meuCarro.cor = "Azul";
        meuCarro.velocidadeMax = 400;
        //System.out.println("A velocidade do meu carro é: "+meuCarro.acelerar());
        JOptionPane.showMessageDialog(null,"O meu carro é um "+ meuCarro.modelo + " " + meuCarro.cor + " da " + meuCarro.marca + ".");
        JOptionPane.showMessageDialog(null, "Vamos acelerar.");
        JOptionPane.showMessageDialog(null, "A velocidade do meu "+meuCarro.modelo+" é "+meuCarro.acelerar());
        //System.out.println("O meu carro é um "+ meuCarro.modelo + " " + meuCarro.cor + " da " + meuCarro.marca + ".");
        //System.out.println("Vamos acelerar. ");
        //System.out.println("A velocidade do meu "+meuCarro.modelo+" é "+meuCarro.acelerar());
        
    }
    
}
