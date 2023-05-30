
package aulajbdc;

/**
 *
 * @author josuel Sanches
 */
public class Produto {
    private int id, preco;
    private String nome, descrição, fornecedor;

    public Produto() {
    }

    public Produto(int id, int preco, String nome, String descrição, String fornecedor) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
        this.descrição = descrição;
        this.fornecedor = fornecedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", preco=" + preco + ", nome=" + nome + ", descri\u00e7\u00e3o=" + descrição + ", fornecedor=" + fornecedor + '}';
    }
    
    
    
}
