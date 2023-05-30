/*
 2- Ler 5 numeros inteiros, imprimir o maior e menor 
 utilizar laco de repeticao
utilizar estrutura condicional
 */
package aula2.pkg2pci;

// @author josuel Sanches
 
import javax.swing.JOptionPane;

public class Aula22PCI {

    
    public static void main(String[] args) {
        int num;
        int menor = 0;
        int maior = 0;
        int i = 1;
        while (i < 6){
            num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o "+ i +"º valor: "));
                if (i == 1){
                    maior = num;
                    menor = num;
                }
                 if(maior < num){
                    maior = num;
                }if( menor > num){
                    menor = num;
                }
            i+=1;
        }
        JOptionPane.showMessageDialog(null, "O maior numero digitado foi: "+ maior + ", e o numero menor foi "+ menor);
        
    }
    
}
