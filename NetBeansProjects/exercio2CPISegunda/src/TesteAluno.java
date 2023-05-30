
/**
 *Crie uma classe aluno com os atributos nome, materia e array
    de notas com 4 posicoes refentes a materia (todos com modificadores private).
    Crie os gets e sets para os atributos da classe e um metodo para imprimir as informacoes
    do aluno juntamente as notas. Crie um classe de teste para inicializar os 
    atributos e chamar os metodos.
 * @author josuel Sanches
 */
import java.util.Scanner;
public class TesteAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        float[] notas = new float[4];
        
        System.out.print("Digite o nome do aluno: ");
        aluno1.setNome(sc.nextLine());
        System.out.print("Digite a materia: ");
        aluno1.setMateria(sc.nextLine());
        for(int i = 0; i<4; i++){
            System.out.print("Digite a "+(i+1)+"º nota: ");
            notas[i] = sc.nextFloat();
        }
        aluno1.setNotas(notas);
        aluno1.dadosAluno();
    }
    
}
