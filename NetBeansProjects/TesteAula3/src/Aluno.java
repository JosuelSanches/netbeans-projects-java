
import javax.swing.JOptionPane;
/**
 *
 * @author josuel Sanches
 */
public class Aluno {
    String nome, sobrenome, curso, orientador;
    int numDisciplinaCursadas;
    void matricular(){
        JOptionPane.showMessageDialog(null,"Efetuando matricula de "+nome+" "+sobrenome+"!");
    }
    void trancarCurso(){
        JOptionPane.showMessageDialog(null,"Trancando curso de "+nome+" "+sobrenome+"!");
    }
    void dormir(){
        JOptionPane.showMessageDialog(null,"O "+nome+" "+sobrenome+" está dormindo zzzzz");
    }
    void estudar(){
        JOptionPane.showMessageDialog(null,"O "+nome+" "+sobrenome+" está estudando.");
    }
    void infoAluno(){
        JOptionPane.showMessageDialog(null,nome+" "+sobrenome+" cursa "+numDisciplinaCursadas+" disciplinas no curso de "+curso+" é orientado por "+orientador );
    }
}
