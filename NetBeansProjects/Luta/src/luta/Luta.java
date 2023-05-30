/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luta;

/**
 *Crie uma classe Lutador com os atributos encapsulados nome e life. 
 * Crie um método construtor que receberá o nome do lutador por parâmetro.
 * Toda vez que a classe Lutador for instanciada, 
 * o life deve ser inicializado com 100 (todo lutador iniciará com a vida 100%).
 * A classe Lutador deverá implementar a interface Acoes que contém 
 * os métodos darChute(Lutador) e darSoco(Lutador), 
 * os métodos recebem por parâmetro um Lutador adversário. 
 * Crie a lógica para reduzir o life de cada lutador ao receber uma ação de outro lutador.
 * A ação de dar chute deve reduzir 20 do life do adversário, enquanto a dar soco reduz 10.
 * Crie a classe Luta com o método main para testar o combate. 
 * Na main, crie dois objetos Lutador, um com o nome “Guku” o outro com “Vegeta”. 
 * Nesta mesma classe crie um método estático imprimirLifes
 * (Lutador, Lutador) para mostrar os lifes dos dois lutadores,
 * o método deve receber por parâmetro os dois lutadores
 * 
 * @author josuel Sanches
 */
public class Luta {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Lutador goku = new Lutador("Goku");
        Lutador vegeta = new Lutador("Vegeta");
        
        goku.darChute(vegeta);
        imprimirLife(goku, vegeta);
        
        vegeta.darSoco(goku);
        imprimirLife(goku, vegeta);
    }
    
    public static void imprimirLife(Lutador l1, Lutador l2){
        System.out.println(l1.getNome());
        System.out.println(l1.getLife());
        System.out.println(l2.getNome());
        System.out.println(l2.getLife());
        
    }
    
}
