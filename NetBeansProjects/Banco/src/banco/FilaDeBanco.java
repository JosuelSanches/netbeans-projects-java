/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *Crie também uma classe FilaDeBanco para gerenciar os clientes na fila.
 * Essa classe deve conter os métodos inserir (passando um Cliente como argumento),
 * remover e exibirFila().
 * O método exibirFila() deve mostrar o nome e rg de todos os clientes da fila. 
 * 
 * @author josuel Sanches
 */
public class FilaDeBanco extends Cliente  {
    public int nFila = 0;
    public void inserir(String nome, int rg){
        nFila++;
        System.out.println(nFila);
    }
    public void remover(String nome, int rg){
        nFila--;
        System.out.println(nFila);
        
    }
    public void exibirFila(){
        
        
    }
    
}
