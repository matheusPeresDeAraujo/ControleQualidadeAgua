
package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Amostra;
import model.Contrato;
import model.Funcionario;
import model.Local;

public class AmostraDao {
    
    
    private static AmostraDao instance = new AmostraDao();
    private AmostraDao(){}
    public static AmostraDao getInstance(){return instance;}
    
    
    public void save(Amostra amostra) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("INSERT INTO AMOSTRA "
                    + "(COD_CONTRATO, COD_LOCAL, COD_PROFISSIONAL_COLETOR) "
                    + "VALUES (?,?,?)");
            parseAtributos(stmt, amostra);
            
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
            stmt = conn.prepareStatement("DELETE FROM AMOSTRA WHERE CODIGO = ?");
            stmt.setInt(1, codigo);
            stmt.execute();
        
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, stmt);
        }
    }
    
    
    public static List<Amostra> obterAmostras() throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        Statement st = null;
        List<Amostra>  amostras = new ArrayList<>();
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM AMOSTRA");
            
            while (rs.next()){
                amostras.add(instanciaAmostra(rs));
            }
            
            return amostras;
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, st);
        }
    }
    
    
    public static Amostra obterAmostra(int codigo) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        Amostra amostra = null;
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("SELECT * FROM AMOSTRA WHERE CODIGO = ?");
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                amostra = instanciaAmostra(rs);
            }
            
            return amostra;
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, stmt);
        }
    }
    
    
    public void update(Amostra amostra) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("UPDATE AMOSTRA SET COD_CONTRATO = ?, COD_LOCAL = ?, COD_PROFISSIONAL_COLETOR = ? WHERE CODIGO = ?");
            parseAtributos(stmt, amostra);
        
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
    
    
    private static void parseAtributos(PreparedStatement stmt, Amostra amostra) throws SQLException{
            stmt.setInt(1, amostra.getContrato().getCodigo());
            stmt.setInt(2, amostra.getLocal().getCodigo());
            stmt.setInt(3, amostra.getProfissionalColeta().getCodigo());
        if(amostra.getCodigo() != 0){
            stmt.setInt(4, amostra.getCodigo());
        }
            stmt.execute();
    }
    
    
    private static Amostra instanciaAmostra(ResultSet rs) throws SQLException, ClassNotFoundException{
        
        Amostra amostra = new Amostra();
        amostra.setCodigo(Integer.parseInt(rs.getString("CODIGO")));
        amostra.setContrato(Contrato.obterContrato(Integer.parseInt(rs.getString("COD_CONTRATO"))));
        amostra.setLocal(Local.obterLocal(Integer.parseInt(rs.getString("COD_LOCAL"))));
        amostra.setProfissionalColeta(Funcionario.obterFuncionario(Integer.parseInt(rs.getString("COD_PROFISSIONAL_COLETOR"))));
        
        return amostra;
    }
}
