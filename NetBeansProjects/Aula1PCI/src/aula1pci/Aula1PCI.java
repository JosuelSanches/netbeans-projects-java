
package aula1pci;

import java.util.Scanner;

/**
 *
 * @author josuel Sanches
 */
public class Aula1PCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome;
        int idade;
        double  altura; 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        
        System.out.print("Digite sua altura: ");
        altura = sc.nextDouble();
        
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Altura: " + altura);
        System.out.println("Meu nome é " + nome +" Tenho " + idade + " anos de idade e " + altura + " de altura.");
        while(altura < 1.90){
            if (altura <=1.70){
                System.out.println("Você tem "+ altura +", é um hobit!");
            }else if(altura <= 1.90){
                System.out.println("Você tem," + altura +", estatura media!");
            }
            
            altura += 0.10;
            System.out.println("Crescendo !!");
        }if (altura > 1.90){
            System.out.println("Você cresceu, tem "+ altura +", agora é alto!");
        } 
    
    }
    
}
