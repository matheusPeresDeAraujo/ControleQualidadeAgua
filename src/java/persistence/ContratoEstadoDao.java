
package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContratoEstadoDao {
    
    
    private static ContratoEstadoDao instance = new ContratoEstadoDao();
    private ContratoEstadoDao(){}
    public static ContratoEstadoDao getInstance(){return instance;}
    
    public static List<String> obterContratoEstados() throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        Statement st = null;
        List<String> contratoEstado = new ArrayList<>();
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT DESCRICAO FROM CONTRATO_ESTADO");
            
            while(rs.next()){
                contratoEstado.add(rs.getString("DESCRICAO"));
            }
            return contratoEstado;
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, st);
        }
    }
    
    
    public static void closeResources (Connection conn, Statement st) throws SQLException{
        try{
            if(st!=null) st.close();
            if(conn!=null) conn.close();
        }catch(SQLException e){
            throw e;
        }
    }
    
}
