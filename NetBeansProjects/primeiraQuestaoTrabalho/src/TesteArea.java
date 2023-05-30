/*
1) Escreva um programa para imprimir a area de um retangulo
criando uma classe chamada Area com dois metodos. O primeiro
chamado setDim() recebe o comprimento e largura do retangulo
como parametro e o segundo metodo chamado getArea() retorna
a area do retangulo. O comprimento e a largura do retangulo 
sao inseridos atraves do teclado e por meio de uma classe teste.
 */

/**
 *
 * @author josuel Sanches
 */
import java.util.Scanner;
public class TesteArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Area area = new Area();
        
        System.out.println("Digite o comprimento e a largura do retangulo: ");
        area.setDim(sc.nextInt(), sc.nextInt());
        System.out.println("A area do retangulo é: " +area.getArea()+" m².");
    }
    
}
