/*
 Aqui esta sendo abordado o assunto de heranca e polimorfismo.
 */

/**
 *
 * @author josuel Sanches
 */
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    public void cancelarMatricula(){
        System.out.println("A matricula de " +this.getNome()+ " foi cancelada!");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void fazerAniversario() {
        System.out.println(this.getNome()+ " esta fazendo aniversario!");
    }

    @Override
    public void entrarDeFerias() {
        System.out.println(this.getNome()+ " está saindo de ferias para o Pacuí!");
    }
    
    
    
    
    
}
