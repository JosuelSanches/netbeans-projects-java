/*
Aqui esta sendo abordado o assunto de heranca e polimorfismo.
 */

/**
 *
 * @author josuel Sanches
 */
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void receberAumento(){
        System.out.println("O "+this.getNome()+" está recebendo o aumento!");
    }
    
    @Override
    public void fazerAniversario() {
        System.out.println(this.getNome() +" esta fazendo aniversario!");
    }

    @Override
    public void entrarDeFerias() {
        
        System.out.println(this.getNome() +" está saindo de ferias para Orlando!");
    }
    
    
}
