/*
 3) Escreva um programa que leia pelo teclado e imprima as informacoes 
(nome, ano de ingresso, salario, endereco) de tres funcionarios criando uma classe chamada 
"Empregado". Criar os atributos privados e os getters e setters para cada um. 
Inicializar os valores do objeto por meio dos setters. Resolver questao com ArrayList de 
Empregados, classe Scanner e utilizar o laco for para percorrer o ArrayList. Criar classe para teste.
A saida deve ser parecida com a seguinte:
Nome         Ano de Ingresso      Salario          Endereco
Natalia       2010                 R$ 4.204,23      Rua Alfa
Tarcileno     2007                 R$ 5.563,00      Rua Beta
karina        2000                 RS 7.635,29      Rua Delta
 */

/**
 *
 * @author josuel Sanches
 */
public class Empregado {
    private String nome, endereco;
    private int salario, anoDeIngresso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getAnoDeIngresso() {
        return anoDeIngresso;
    }

    public void setAnoDeIngresso(int anoDeIngresso) {
        this.anoDeIngresso = anoDeIngresso;
    }
    
    
}
