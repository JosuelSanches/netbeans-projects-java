
package Heranca;

/**
 *
 * @author josuel Sanches
 */
import java.util.Scanner;
public class TesteHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Crianca crianca = new Crianca();
        System.out.print("Escreva o nome da crianca: ");
        crianca.setNome(sc.nextLine());
        System.out.print("Qual a altura de "+crianca.getNome()+"? ");
        crianca.setAltura(sc.nextFloat());
        System.out.print("Digite a idade de "+crianca.getNome()+": ");
        crianca.setIdade(sc.nextInt());
        sc.nextLine();
        
        System.out.println(crianca.getNome()+" tem "+crianca.getIdade()+" anos , cresceu, e agora tem "+crianca.crescer((float) 0.3)+" m de Altura.");
        crianca.brincar("Futebol");
        */
        Adulto adulto = new Adulto();
        System.out.print("Escreva o nome do adulto: ");
        adulto.setNome(sc.nextLine());
        System.out.print("Qual a altura de "+adulto.getNome()+"? ");
        adulto.setAltura(sc.nextFloat());
        System.out.print("Digite a idade de "+adulto.getNome()+": ");
        adulto.setIdade(sc.nextInt());
        sc.nextLine();
        System.out.print("Digite a reda de "+adulto.getNome()+": ");
        adulto.setRenda(sc.nextFloat());
        sc.nextLine();
        System.out.print(adulto.getNome()+" trabalha com que? ");
        adulto.setTrabalho(sc.nextLine());
        
        adulto.trabalhar();
    
    }   
    
}
