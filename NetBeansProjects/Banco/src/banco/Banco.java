/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *Em agências de bancos em Cametá, o cliente necessita
 * enfrentar filas e esperar sua vez para ser atendido e sair. 
 * Levando em consideração a POO, crie uma classe Cliente, 
 * contendo nome e rg, ambos encapsulados.
 * Crie também uma classe FilaDeBanco para gerenciar os clientes na fila.
 * Essa classe deve conter os métodos inserir (passando um Cliente como argumento),
 * remover e exibirFila().
 * O método exibirFila() deve mostrar o nome e rg de todos os clientes da fila. 
 * Crie uma classe Principal, contendo a main, 
 * e faça os testes de inserir e remover clientes.
 * Após cada operação realizada, 
 * chame o método exibirFila() para mostrar como a fila está se comportando. 
 * @author josuel Sanches
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente = new Cliente();
        cliente.setNome("joao");
        cliente.setRg(168894);
       FilaDeBanco fila = new FilaDeBanco();
       fila.setNome("joao");
       fila.setRg(168894);
       fila.inserir("joao", 17237);
       fila.remover("joao", 34534);
       fila.exibirFila();
       
    }
    
}
