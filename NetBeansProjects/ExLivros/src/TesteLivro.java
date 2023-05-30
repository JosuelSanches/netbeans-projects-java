/*
Crie uma classe livro, com os atributos privados nome,autor, anoPublic, genero 
e seus metodos getters e setters. Crie a classe teste que inicializa tres objetos
pelo teclado e os imprima em seguida. Usar ArrayList de Livros.
 */

/**
 *
 * @author josuel Sanches
 */
import java.util.Scanner;
import java.util.ArrayList;
public class TesteLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Livro> livros = new ArrayList<>();
        
        Livro l1 = new Livro();
        
        System.out.print("Digite o nome do 1º livro: ");
        l1.setNome(sc.nextLine());
        
        System.out.print("Digite o nome do autor: ");
        l1.setAutor(sc.nextLine());
        
        System.out.print("Digite o genero do livro: ");
        l1.setGenero(sc.nextLine());
        
        System.out.print("Digite o ano de publicacao: ");
        l1.setAnoPublic(sc.nextInt());
        sc.nextLine();
       
        
        livros.add(l1);
        
        Livro l2 = new Livro();
        
        System.out.print("Digite o nome do 2º livro: ");
        l2.setNome(sc.nextLine());
        System.out.print("Digite o nome do autor: ");
        l2.setAutor(sc.nextLine());
        System.out.print("Digite o genero do livro: ");
        l2.setGenero(sc.nextLine());
        System.out.print("Digite o ano da publicacao: ");
        l2.setAnoPublic(sc.nextInt());
        sc.nextLine();
        
        livros.add(l2);
        
        Livro l3 = new Livro();
        
        System.out.print("Digite o nome do 3º livro: ");
        l3.setNome(sc.nextLine());
        System.out.print("Digite o nome do autor: ");
        l3.setAutor(sc.nextLine());
        System.out.print("Digite o genero do livro: ");
        l3.setGenero(sc.nextLine());
        System.out.print("Digite o ano da publicacao: ");
        l3.setAnoPublic(sc.nextInt());
        sc.nextLine();
        
        
        livros.add(l3);
        
        for(int i = 0; i < livros.size(); i++){
            System.out.println("Nome do" +(i+1)+"º livro: "+livros.get(i).getNome());
            System.out.println("Autor: "+livros.get(i).getAutor());
            System.out.println("Ano de publicacao: "+livros.get(i).getAnoPublic());
            System.out.println("Genero: "+livros.get(i).getGenero());
        }
    }
    
}
