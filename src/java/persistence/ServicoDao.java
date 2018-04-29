package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Servico;

public class ServicoDao {
    
    
    private static ServicoDao instance = new ServicoDao();
    private ServicoDao(){}
    public static ServicoDao getInstance(){return instance;}
    
    
    public void save(Servico servico) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("INSERT INTO SERVICO "
                    + "(NOME) "
                    + "VALUES (?)");
            parseAtributos(stmt, servico);
            
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
            stmt = conn.prepareStatement("DELETE FROM SERVICO WHERE CODIGO = ?");
            stmt.setInt(1, codigo);
            stmt.execute();
        
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, stmt);
        }
    }
    
    
    public static List<Servico> obterServicos() throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        Statement st = null;
        List<Servico> servicos = new ArrayList<>();
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM SERVICO");
            
            while (rs.next()){
                servicos.add(instanciaServico(rs));
            }
            
            return servicos;
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, st);
        }
    }
    
    
    public static Servico obterServico(int codigo) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        Servico servico = null;
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("SELECT * FROM SERVICO WHERE CODIGO = ?");
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                servico = instanciaServico(rs);
            }
            
            return servico;
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, stmt);
        }
    }
    
    
    public void update(Servico servico) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("UPDATE SERVICO SET NOME = ? WHERE CODIGO = ?");
            parseAtributos(stmt, servico);
        
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
    
    
    private static void parseAtributos(PreparedStatement stmt, Servico servico) throws SQLException{
            stmt.setString(1, servico.getNome());
        if(servico.getCodigo() != 0){
            stmt.setInt(2, servico.getCodigo());
        }
            stmt.execute();
    }
    
    
    private static Servico instanciaServico(ResultSet rs) throws SQLException{
        
        Servico servico = new Servico();
        servico.setCodigo(Integer.parseInt(rs.getString("CODIGO")));
        servico.setNome(rs.getString("NOME"));
        
        return servico;
    }
}
