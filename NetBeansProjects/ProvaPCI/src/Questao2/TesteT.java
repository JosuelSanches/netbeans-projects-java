
package Questao2;

/**
 *
 * @author josuel Sanches
 */
import java.util.Scanner;
public class TesteT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trabalhador t1 = new Trabalhador();
        System.out.print("Digite o nome do trabalhador: ");
        t1.setNome(sc.nextLine());
        System.out.print("Digite o ano de nascimento de "+t1.getNome()+": ");
        t1.setAnoDeNascimento(sc.nextInt());
        sc.nextLine();
        System.out.print("Digite o salario bruto de "+t1.getNome()+": ");
        t1.setSalarioBruto(sc.nextFloat());
        
        System.out.println("A idade de "+t1.getNome()+" nascido em "+t1.getAnoDeNascimento()+" é: "+t1.idade()+" anos.");
        System.out.println("Faltam "+t1.tempAponsentar()+" anos para se aposentar.");
        System.out.println("O salario bruto de "+t1.getNome()+" é "+t1.getSalarioBruto()+" e seu salario liquido é: "+t1.salarioLiquido());
        
    }
    
}
