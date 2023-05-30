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
public class BlocoDeInicializacaoClienteTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClienteA c = new ClienteA();
        ClienteA c1 = new ClienteA();
        ClienteA c2 = new ClienteA();
        System.out.println("Exibindo quantidade de parcelas possiveis");
        for (int parcela : c.getParcelas()){
            System.out.println(parcela +"");
        }
    }
    
}
