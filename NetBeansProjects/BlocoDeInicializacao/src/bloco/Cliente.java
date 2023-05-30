/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloco;

/**
 *
 * @author josuel Sanches
 */
public class Cliente {
    /*Ordem de inicialização
    * 1º - Alocação de um espaço na memoria para um objeto que será criado
    * 2º - Cada atributo de classe é criado e inicializado com seus valores defaltou valores explicitos 
    * 3º - Bloco de inicialização é executado
    * 4º - O construtos é executado
    */
    private int[] parcelas;
    //Bloco de inicialização... 
    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for(int i = 1; i <= 100; i++){
            parcelas[i - 1] = i;
        }
    }

    public Cliente(){
        /*System.out.println("Dentro do cunstrutor");
      for(int parcela : this.parcelas){
            System.out.println(parcela + "");  
    }*/
        
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
    
}
