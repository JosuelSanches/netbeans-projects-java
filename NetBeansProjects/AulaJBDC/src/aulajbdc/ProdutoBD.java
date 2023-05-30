package aulajbdc;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class ProdutoBD{
    public static void main(String args[]){
        Produto p = new Produto();
        p.setNome("computador");
        p.setDescrição("Computador gamer");
        p.setFornecedor("Dell");
        p.setPreco(5000);
        
        inserirProduto(p);
    }
    public static void inserirProduto(Produto p) {
        String sql = "INSERT INTO produto (nome, descrição, fornecedor, preco) VALUES ('" + p.getNome() + "', '" + p.getDescrição() + "', '" + p.getFornecedor() + "', '" + p.getPreco() + "')";
        
        Connection connection = ConnectionFactory.getConnection();
        
        try {
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate(sql);
            
            if(result != 0) {
                System.out.println("Produto cadastrado com sucesso!");
            }
            
            statement.close();
            connection.close();
            
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar produto: " + e);
        }
    }
}

