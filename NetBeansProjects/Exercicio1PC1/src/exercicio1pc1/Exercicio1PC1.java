/**
 * Crie um algoritimo que leia o nome e o salario de uma pessoa e
 * faca um reajuste de 15% no salario. O mesmo deve imprimir o nome,
 * salario atual e o novo salario da pessoa.
 */
package exercicio1pc1;

import java.util.Scanner;

/**
 *
 * @author josuel Sanches
 */
public class Exercicio1PC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome;
        Float salario;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite o seu salario atual: ");
        salario = sc.nextFloat();

        System.out.println(nome + ", 0 seu salario atual e " + salario + " e com o reajuste será " + (salario + (salario * 0.15)) + ".");

    }

}
