/*
Crie uma classe livro, com os atributos privados nome,autor, anoPublic, genero 
e seus metodos getters e setters. Crie a classe teste que inicializa tres objetos
pelo teclado e os imprima em seguida. Usar ArrayList de Livros.
 */

/**
 *
 * @author josuel Sanches
 */
public class Livro {
    private String nome, autor, genero;
    private int anoPublic;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoPublic() {
        return anoPublic;
    }

    public void setAnoPublic(int anoPublic) {
        this.anoPublic = anoPublic;
    }
    
}
