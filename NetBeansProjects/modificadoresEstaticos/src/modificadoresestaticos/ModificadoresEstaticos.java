/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadoresestaticos;

/**
 *
 * @author josuel Sanches
 */
public class ModificadoresEstaticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro.setVelocidadeLimite(220);
        Carro car1 = new Carro("mercedes", 280);
        Carro car2 = new Carro("bmw", 260);
        Carro car3 = new Carro("audi", 230);
        car1.imprime();
        car2.imprime();
        car3.imprime();
        System.out.println("##############################");
        Carro.velocidadeLimite = 220;
        car1.imprime();
        car2.imprime();
        car3.imprime();
    }
    
}
