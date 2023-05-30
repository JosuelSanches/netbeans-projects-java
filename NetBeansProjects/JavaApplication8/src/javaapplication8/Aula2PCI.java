/*
 1- Faça um programa que leia a idade de uma pessoa expressa em anos,
meses e dias e mostre-a expressa em dias.
Obs: Leve em consideracao o 365 dias e o mes com 30.
(ex: 3 anos, 2 meses e 15 dias = 1170 dias) 
Utilizar a classe JOptionPane para reeber os valores de entrada.
 */
package javaapplication8;

/**
 *
 * @author josuel Sanches
 */
import javax.swing.JOptionPane;
public class Aula2PCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int idadeAno;
        int idadeMes;
        int idadeDias;*/
        
        //System.out.println("Digite quantos anos voce tem: ");
        int idadeAno = Integer.parseInt(JOptionPane.showInputDialog("Digite o quantos anos completos vc tem: "));
        int idadeMes = Integer.parseInt(JOptionPane.showInputDialog("Alem dos anos completos, quantos meses completos: "));
        int idadeDias = Integer.parseInt(JOptionPane.showInputDialog("Alem dos anos e meses, quantos dias completos: "));
        //System.out.println(idadeAno);
        JOptionPane.showMessageDialog(null,"A quantidade total de dias que vc tem é : "+ ((idadeAno *365)+(idadeMes *30)+ (idadeDias)));
    }
    
}
