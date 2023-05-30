/*
Crie uma classe para representar uma pessoa, com os atributos privados de nome,
ano de nascimento e altura. Na mesma classe, crie os metodos gets e sets, um metodo para
imprimir todos os dados de uma pessoa e o metodo para calcular a idade da pessoa
crie uma classe teste.
 */

/**
 *
 * @author josuel Sanches
 */
public class Pessoa {
    private String nome;
    private int dataNasc;
    private float altura;

    public Pessoa(String nome, int dataNasc, float altura) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.altura = altura;
    }
    void imprimir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("idade: "+ (2022-this.dataNasc));
        System.out.println("altura: "+ altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(int dataNasc) {
        this.dataNasc = dataNasc;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
