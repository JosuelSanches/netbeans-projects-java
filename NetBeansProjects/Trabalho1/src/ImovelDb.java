
 import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author josuel Sanches
 */
public class ImovelDb {       
    private Connection connectiondb = null;
    
    public ImovelDb() {

        connectiondb = ConnectionFactory.getConnection();
    }
    public void insere(Imovel imovel){
        
        String sql = "INSERT INTO imoveis ( tipo, area, cor, quant_comodos, endereco, valor, vendido ) VALUES (?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement state = connectiondb.prepareStatement(sql);
            state.setString(1, imovel.getTipo());
            state.setInt(2, imovel.getArea());
            state.setString(3, imovel.getCor());
            state.setInt(4, imovel.getQuant_comodos());
            state.setString(5, imovel.getEndereco());
            state.setDouble(6, imovel.getValor());
            state.setBoolean(7, imovel.isVendido());

            state.execute();
          
            
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
        
        
    }
    
}
