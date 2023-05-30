/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author josuel Sanches
 */
public class ConnectionDB {

    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/imovel_bd2?useTimezone=true&serverTimezone=America/Sao_Paulo";
            String user = "root";
            String password = "";

            System.out.println("Conexao feita com sucesso!");
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
