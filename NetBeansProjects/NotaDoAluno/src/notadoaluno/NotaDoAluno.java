/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notadoaluno;

import java.util.Scanner;

/**
 *
 * @author josue
 */
public class NotaDoAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o nome da turma: ");
        String turma = teclado.nextLine();
        System.out.println("Digite o nome do aluno: ");
        String aluno = teclado.nextLine();
        System.out.println("digite o numero do aluno: ");
        int numero = teclado.nextInt();
        System.out.println("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        
    }
    
}
