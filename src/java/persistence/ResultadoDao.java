
package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Resultado;
public class ResultadoDao {
    
    
    private static ResultadoDao instance = new ResultadoDao();
    private ResultadoDao(){}
    public static ResultadoDao getInstance(){return instance;}
    
    
    public static Resultado obterResultado(int codigo) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        Resultado resultado = null;
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("SELECT * FROM TERMO_RESULTADO_QUALITATIVO WHERE CODIGO = ?");
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                resultado = instanciaResultado(rs);
            }
            
            return resultado;
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, stmt);
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
    
    
    private static Resultado instanciaResultado(ResultSet rs) throws SQLException{
        
        Resultado resultado = new Resultado();
        resultado.setCodigo(Integer.parseInt(rs.getString("CODIGO")));
        resultado.setNome(rs.getString("NOME"));
        
        return resultado;
    }
}
