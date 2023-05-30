/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão5;

/**
 *
 * @author josuel Sanches
 */
public class Questão5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tv tv = new Tv();
        Notebook notebook = new Notebook();
        Smartphone smartphone = new Smartphone();

        tv.ligar();
        notebook.desligar();
        smartphone.ligar();

        System.out.println("Estado da tv: " + televisao.isLigado());
        System.out.println("Estado do Notebook: " + notebook.isLigado());
        System.out.println("Estado do Smartphone: " + smartphone.isLigado());
    }
    }
    
}
