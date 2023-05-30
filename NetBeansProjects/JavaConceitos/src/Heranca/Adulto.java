
package Heranca;

/**
 *
 * @author josuel Sanches
 */
public class Adulto extends Pessoa {
    private String trabalho;
    private float renda;

    public String getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }
    public void trabalhar(){
        System.out.println("O "+this.getNome()+" tem "+this.getIdade()+" anos e "+this.getAltura()+"m de altura, trabalha como " +trabalho+ " ganhando R$ "+renda);
    }
    
}
