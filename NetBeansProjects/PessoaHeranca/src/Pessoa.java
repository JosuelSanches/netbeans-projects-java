/*
 Aqui esta sendo abordado o assunto de heranca e polimorfismo.
 */

/**
 *
 * @author josuel Sanches
 */
public class Pessoa {
    private String nome, sexo;
    private int idade;
    public void fazerAniversario(){
        System.out.println("É seu, parabens, aniversario!!!");  
    }
    public void entrarDeFerias(){
        System.out.println("Voce esta fazendo aniversario!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
