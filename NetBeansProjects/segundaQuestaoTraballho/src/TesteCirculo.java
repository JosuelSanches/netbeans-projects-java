/*
 2) Crie uma classe Circulo com os atributos privados raio(double)
e cor(String) inicializados no construtor padrao com os valores 1.0
e "azul" respectivamente. Criar dois construtores - um construtor padrao
sem argumento e um construtor que recebe um argumento double para o raio.
Criar tres metodos publicos getRaio(), setCor() e getArea() que deve retornar
o raio do circulo, a cor e a area, respectivamente. Para calcular a area, utilizar
a constante do java Math.PI. Crie tambem um metodo para imprimir as informacoes do 
circulo. Crie um metodo para teste.
 */

/**
 *
 * @author josuel Sanches
 */
import java.util.Scanner;
public class TesteCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Circulo circulo1 = new Circulo();
        circulo1.setArea();
        circulo1.Imprimir();
        Circulo circulo2 = new Circulo();
        System.out.println("Digite o raio do circulo");
        circulo2.setRaio(sc.nextDouble());
        circulo2.setArea();
        System.out.println("O raio é: " +circulo2.getRaio());
        circulo2.Imprimir();
    }
    
}
