
package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.ContratoServico;

public class ContratoServicoDao {
    
    private static ContratoServicoDao instance = new ContratoServicoDao();
    private ContratoServicoDao(){}
    public static ContratoServicoDao getInstance(){return instance;}
    
    public void save(ContratoServico contratoServico) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("INSERT INTO CONTRATO_SERVICO (COD_CONTRATO, COD_SERVICO) VALUES (?, ?)");
            parseAtributos(stmt, contratoServico);
            
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
            stmt = conn.prepareStatement("DELETE FROM CONTRATO_SERVICO WHERE COD_CONTRATO = ?");
            stmt.setInt(1, codigo);
            stmt.execute();
        
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, stmt);
        }
    }
     
    
    public static List<Integer> obterContratoServicos(Integer codigo) throws Exception{
        Connection conn = null;
        PreparedStatement stmt = null;
        List<Integer> servicos = new ArrayList<>();
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("SELECT COD_SERVICO FROM CONTRATO_SERVICO WHERE COD_CONTRATO = ?");
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                servicos.add(Integer.parseInt(rs.getString("COD_SERVICO")));
            }
            
            return servicos;
        } catch (Exception e) {
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
    
    
    private static void parseAtributos(PreparedStatement stmt , ContratoServico contratoServico) throws SQLException{
        stmt.setInt(1, contratoServico.getContrato().getCodigo());
        stmt.setInt(2, contratoServico.getServico().getCodigo());
        if(contratoServico.getCodigo() != 0){
            stmt.setInt(3, contratoServico.getCodigo());
        }
        stmt.execute();
    }
}
