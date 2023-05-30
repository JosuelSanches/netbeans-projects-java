
import java.util.ArrayList;

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
import java.util.Scanner;
public class TesteCompra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Tela1 t1 = new Tela1();
        t1.setVisible(true);
        
        Scanner sc = new Scanner(System.in);
        ArrayList <Produtos> produtos = new ArrayList<>();
        int qntProd;
        System.out.println("Quantos produtos vc quer?");
        qntProd = sc.nextInt();
        sc.nextLine();
        
        for(int i =0; i < qntProd; i++){
            Produtos p = new Produtos();
            System.out.println("Qual o nome do "+(i+1)+"º produto? ");
            p.setNome(sc.nextLine());
            System.out.println("Qual o valor do "+(i+1)+"º produto? ");
            p.setValor(sc.nextFloat());
            sc.nextLine();
           produtos.add(p);
        }
        ////
        for(Produtos produto : produtos){
            System.out.println("Nome: "+produto.getNome());
            
        }
        ////
        
        /*System.out.println("Nome do Cliente: "+ cliente.getNome());
        System.out.println("Saldo: "+cliente.getSaldo());
     
        cliente.comprar(produtos);
        float totalPreco = 0;
        for(int i = 0; i < produtos.size(); i++){
            totalPreco += produtos.get(i).getValor();
        }
        cliente.pagar(totalPreco);
        */
    }
    
}
