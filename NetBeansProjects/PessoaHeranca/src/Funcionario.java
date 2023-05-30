/*
 Aqui esta sendo abordado o assunto de heranca e polimorfismo.
 */

/**
 *
 * @author josuel Sanches
 */
public class Funcionario extends Pessoa{
    private String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public void mudarTrabalho(){
        System.out.println("O " +this.getNome()+ " está mudando de trabalho.");
    }
    
    @Override
    public void fazerAniversario() {
        System.out.println(this.getNome() +" esta fazendo aniversario!");
    }

    @Override
    public void entrarDeFerias() {
        System.out.println(this.getNome()+" está indo para as ferias em Balneario Camboriú");
    }
    
}
