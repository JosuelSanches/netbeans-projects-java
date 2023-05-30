/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1questao3;

/**
 *
 * @author josue
 * Em agências de bancos em Cametá, o cliente necessita enfrentar filas e esperar sua vez para ser atendido e sair.
 * Levando em consideração a POO, crie uma classe Cliente, contendo nome e rg, ambos encapsulados.
 * Crie também uma classe FilaDeBanco para gerenciar os clientes na fila. 
 * Essa classe deve conter os métodos inserir (passando um Cliente como argumento), remover e exibirFila().
 * O método exibirFila() deve mostrar o nome e rg de todos os clientes da fila. 
 * Crie uma classe Principal, contendo a main, e faça os testes de inserir e remover clientes. 
 * Após cada operação realizada, chame o método exibirFila() para mostrar como a fila está se comportando. 
 
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       FilaDeBanco fila = new FilaDeBanco();
       fila.inserir(new Cliente("João",124535446));
        fila.inserir(new Cliente(" Antonia",43457855));
        fila.inserir(new Cliente("Ricardo",988465384));
        
        fila.exibirFila();
        
        System.out.println("------------------------------");
        fila.remover();
        fila.exibirFila();
    }
    
}
