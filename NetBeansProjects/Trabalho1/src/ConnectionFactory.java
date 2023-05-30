
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;



/**
 *
 * @author josuel Sanches
 */
public class ConnectionFactory {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/imoveis_bd?useTimezone=true&serverTimezone=America/Sao_Paulo";
        String user = "root";
        String pass = "";
        
        try {
            return DriverManager.getConnection(url, user, pass);
        } catch(SQLException e) {
            System.out.println("Erro de SQL Exception: " + e);
        }
        
        return null;
    }
}
    

