/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author josuel Sanches
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario funcionario = new Funcionario("Helio Vinicius Correa de Barros", "9838928", 15000, "88783");
        /*funcionario.setNome("Helio Vinicius Correa de Barros");
        funcionario.setCpf ("041 045 099 77");
        funcionario.setSalario(4500.00);*/
        funcionario.imprime();
        
        
        
    }
    
}
