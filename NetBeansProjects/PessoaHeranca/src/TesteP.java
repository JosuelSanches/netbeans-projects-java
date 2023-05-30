
/**
 *
 * @author josuel Sanches
 */
public class TesteP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        
        aluno.setNome("Alexandra");
        aluno.setIdade(21);
        aluno.setCurso("Ciencias naturais");
        aluno.setMatricula(201912);
        aluno.setSexo("Femea");
        
        System.out.print("A "+aluno.getNome()+", "+aluno.getSexo());
        System.out.print(", tem "+aluno.getIdade()+" anos, cursando "+aluno.getCurso());
        System.out.println(", com o numero de matricula: "+aluno.getMatricula()+".");
        
        aluno.cancelarMatricula();
        aluno.fazerAniversario();
        aluno.entrarDeFerias();
        System.out.println("------------------------------------------------\n");
        
        Professor professor = new Professor();
        
        professor.setNome("Eliezer");
        professor.setIdade(26);
        professor.setEspecialidade("programacao");
        professor.setSalario(8000);
        professor.setSexo("Macho");
        
        System.out.print("O "+professor.getNome()+", "+professor.getSexo());
        System.out.print(", tem "+professor.getIdade()+" anos, especialista em "+professor.getEspecialidade());
        System.out.println(", com o salario de: "+professor.getSalario()+".");
        professor.receberAumento();
        professor.fazerAniversario();
        professor.entrarDeFerias();
        System.out.println("-------------------------------------------------\n");
        
        Funcionario funcionario = new Funcionario();
        
        funcionario.setNome("Tarcileno");
        funcionario.setSetor("Laboratorio de Programação Extrema");
        funcionario.setIdade(23);
        funcionario.setSexo("Macho");
        
        System.out.print("O "+funcionario.getNome()+", "+funcionario.getSexo());
        System.out.println(", tem "+funcionario.getIdade()+" anos, do setor "+funcionario.getSetor()+".");
        
        funcionario.mudarTrabalho();
        funcionario.fazerAniversario();
        funcionario.entrarDeFerias();
        System.out.println("----------------------------------------------------\n");
        
    }
    
}
