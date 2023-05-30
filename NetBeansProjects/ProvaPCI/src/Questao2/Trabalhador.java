
package Questao2;

/**
 *
 * @author josuel Sanches
 */
public class Trabalhador {
    private String nome;
    private int anoDeNascimento;
    private float salarioBruto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    
    public int idade(){
        return(2022 - this.anoDeNascimento);
    }
    
    public int tempAponsentar(){
        return(65 -(2022 - this.anoDeNascimento));
    }
    public float salarioLiquido(){
        return (float)(this.salarioBruto-(this.salarioBruto*0.14));
    }
    
}
