/*
 3) Escreva um programa que leia pelo teclado e imprima as informacoes 
(nome, ano de ingresso, salario, endereco) de tres funcionarios criando uma classe chamada 
"Empregado". Criar os atributos privados e os getters e setters para cada um. 
Inicializar os valores do objeto por meio dos setters. Resolver questao com ArrayList de 
Empregados, classe Scanner e utilizar o laco for para percorrer o ArrayList. Criar classe para teste.
A saida deve ser parecida com a seguinte:
Nome         Ano de Ingresso      Salario          Endereco
Natalia       2010                 R$ 4.204,23      Rua Alfa
Tarcileno     2007                 R$ 5.563,00      Rua Beta
karina        2000                 RS 7.635,29      Rua Delta
 */

/**
 *
 * @author josuel Sanches
 */
import java.util.Scanner;
import java.util.ArrayList;
public class TesteEmpregado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Empregado> empregados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Empregado empregado1 = new Empregado();
        System.out.println("Escreva o nome do empregado 1: ");
        empregado1.setNome(sc.nextLine());
        System.out.println("Escreva o endereco do empregado1: ");
        empregado1.setEndereco(sc.nextLine());
        System.out.println("Escreva o ano de engreco do empregado 1: ");
        empregado1.setAnoDeIngresso(sc.nextInt());
        sc.nextLine();
        System.out.println("Digite o salario do empregado 1:");
        empregado1.setSalario(sc.nextInt());
        sc.nextLine();
        
        empregados.add(empregado1);
        
        Empregado empregado2 = new Empregado();
        System.out.println("Escreva o nome do empregado 2: ");
        empregado2.setNome(sc.nextLine());
        System.out.println("Escreva o endereco do empregado2: ");
        empregado2.setEndereco(sc.nextLine());
        System.out.println("Escreva o ano de engreco do empregado 2: ");
        empregado2.setAnoDeIngresso(sc.nextInt());
        sc.nextLine();
        System.out.println("Digite o salario do empregado 2: ");
        empregado2.setSalario(sc.nextInt());
        sc.nextLine();
        
        empregados.add(empregado2);
        Empregado empregado3 = new Empregado();
        System.out.println("Escreva o nome do empregado 3: ");
        empregado3.setNome(sc.nextLine());
        System.out.println("Escreva o endereco do empregado 3: ");
        empregado3.setEndereco(sc.nextLine());
        System.out.println("Escreva o ano de engreco do empregado 3: ");
        empregado3.setAnoDeIngresso(sc.nextInt());
        sc.nextLine();
        System.out.println("Digite o salario do empregado 3:");
        empregado3.setSalario(sc.nextInt());
        sc.nextLine();
        
        empregados.add(empregado3);
        System.out.println("..............................................................................");
        System.out.println("Nome \t\t Endereco \t\t Ano de ingresso \t\t Salario");
        System.out.println("\t");
        
        for (int i = 0; i < empregados.size(); i++){
            System.out.println(empregados.get(i).getNome()+"\t\t"+empregados.get(i).getEndereco()+"\t\t"+empregados.get(i).getAnoDeIngresso()+"\t\t"+empregados.get(i).getSalario());
            
        }
        System.out.println("\t");
        System.out.println("..............................................................................");
    }
    
}
