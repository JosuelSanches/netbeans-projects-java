/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blocodeinicializacaocliente;

/**
 *
 * @author josuel Sanches
 */
public class ClienteA {
    // 1 - Alocado espaça na memoria para o objeto que sera criado
    // 2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos 
    // 3 - Bloco de inicialização é executado 
    // 4 - O construtor é executado
    private static int[] parcelas;
    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização!");
        for(int i = 1; i <= 100; i++){
            parcelas[i - 1] = i;
        }
    }
    public ClienteA(){
        
    }

    public static int[] getParcelas() {
        return parcelas;
    }

    public static void setParcelas(int[] parcelas) {
        parcelas = parcelas;
    }
    
}
