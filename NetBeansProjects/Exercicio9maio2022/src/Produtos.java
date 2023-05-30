/*
 Crie uma classe clamada Cliente com os atributos 
nome, idade, saldo e cpf, encapsulados.Crie uma classe Produtos 
com os atributos nome e valor, encapsulados. Crie uma interface AcoesCliente
com os métodos comprar (Que recebe uma lista de produtos por argumento)
e Pagar(que recebe o valor da compra por argumento). A interface deve ser
implementada pela classe Cliente.Crie uma classe Teste para implementar
a lista de produtos a serem comprados pelo Cliente. As informacoes devem
ser lidas pelo teclado.
OBS: Verificar se o saldo é suficiente para a compra.
 */

/**
 *
 * @author josuel Sanches
 */
public class Produtos {
    private String nome;
    private float valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
