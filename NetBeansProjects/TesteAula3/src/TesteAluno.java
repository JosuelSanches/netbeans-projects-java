/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author josuel Sanches
 */
public class TesteAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno tAluno = new Aluno();
        tAluno.nome = "Josuel";
        tAluno.sobrenome = "Sanches";
        tAluno.curso = "SI";
        tAluno.numDisciplinaCursadas = 12;
        tAluno.orientador = "Tarcileno Martins";
        
        tAluno.matricular();
        tAluno.infoAluno();
        tAluno.estudar();
        tAluno.trancarCurso();
        tAluno.dormir();
    }
    
}
