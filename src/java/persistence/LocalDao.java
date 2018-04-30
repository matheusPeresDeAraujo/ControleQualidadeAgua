
package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Local;

public class LocalDao {
    
    
    private static LocalDao instance = new LocalDao();
    private LocalDao(){}
    public static LocalDao getInstance(){return instance;}
    
    public int save(Local local) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        Statement st = null;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("INSERT INTO LOCAL (LOGRADOURO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, ESTADO) VALUES (?, ?, ?, ? ,? ,?)");
            parseAtributos(stmt, local);
            
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT MAX(CODIGO) AS MAX FROM LOCAL");
            rs.next();
            String codigo = rs.getString("MAX");
            return Integer.parseInt(codigo);
            
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, stmt);
        }
    }
      
    
    public void drop(int codigo) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("DELETE FROM LOCAL WHERE CODIGO = ?");
            stmt.setInt(1, codigo);
            stmt.execute();
        
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, stmt);
        }
    }
     
    
    public static Local obterLocal(int codigo) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        Local local = null;
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("SELECT * FROM LOCAL WHERE CODIGO = ?");
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                local = instanciaLocal(rs);
            }
            
            return local;
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
    
    
    private static void parseAtributos(PreparedStatement stmt , Local local) throws SQLException{
        stmt.setString(1, local.getLogradouro());
        stmt.setInt(2, local.getNumero());
        stmt.setString(3, local.getComplemento());
        stmt.setString(4, local.getBairro());
        stmt.setString(5, local.getCidade());
        stmt.setString(6, local.getEstado());
        if(local.getCodigo() != 0){
            stmt.setInt(7, local.getCodigo());
        }
        stmt.execute();
    }
    
    
    private static Local instanciaLocal(ResultSet rs) throws SQLException{
        
        Local local = new Local();
        local.setCodigo(Integer.parseInt(rs.getString("CODIGO")));
        local.setLogradouro(rs.getString("LOGRADOURO"));
        local.setNumero(Integer.parseInt(rs.getString("NUMERO")));
        local.setComplemento(rs.getString("COMPLEMENTO"));
        local.setBairro(rs.getString("BAIRRO"));
        local.setCidade(rs.getString("CIDADE"));
        local.setEstado(rs.getString("ESTADO"));
        
        return local;
    }
}
