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
import java.util.ArrayList;
import java.util.Scanner;
public class Cliente implements AcoesCliente {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private float saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public void comprar(ArrayList <Produtos> produtos){
        for (int i = 0; i < produtos.size(); i++){
            System.out.println("Nome:"+produtos.get(i).getNome()+ ". Valor: R$"+ produtos.get(i).getValor());
        }
        
    }
    @Override
    public void pagar(float valor){
        if (valor < getSaldo()){
            setSaldo(getSaldo()-valor);
            System.out.println("Venda realizada com sucesso!");
            System.out.println("Seu  saldo agora é: R$"+getSaldo());
        }else{
            System.out.println("Seu saldo é insuficiente para essa operação.");
            System.out.println("valor da compra: R$"+ valor);
            System.out.println("Saldo atual: R$"+getSaldo());
        }
      
    }
    
}
