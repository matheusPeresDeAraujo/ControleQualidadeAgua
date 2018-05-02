
package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Contrato;
import model.Empresa;
import model.Local;

public class ContratoDao {
    
    private static ContratoDao instance = new ContratoDao();
    private ContratoDao(){}
    public static ContratoDao getInstance(){return instance;}
    
    public int save(Contrato contrato) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        Statement st = null;
        
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("INSERT INTO CONTRATO (COD_CLIENTE, COD_EMPRESA, COD_CONTRATO_ESTADO, COD_LOCAL, DESCRICAO) VALUES (?, ?, ?, ?, ?)");
            parseAtributos(stmt, contrato);
            
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT MAX(CODIGO) AS MAX FROM CONTRATO");
            rs.next();
            String codigo = rs.getString("MAX");
            return Integer.parseInt(codigo);
            
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, stmt);
        }
    }
      
    
    public boolean drop(int codigo) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        Boolean retorno = true;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("DELETE FROM CONTRATO_SERVICO WHERE COD_CONTRATO = ?");
            stmt.setInt(1, codigo);
            stmt.execute();
            stmt = conn.prepareStatement("DELETE FROM CONTRATO WHERE CODIGO = ?");
            stmt.setInt(1, codigo);
            stmt.execute();
        
        }catch(SQLException e){
            retorno = false;
            throw e;
        }finally{
            closeResources(conn, stmt);
            
        }
        return retorno;
    }
    
    
    public static List<Contrato> obterContratos() throws Exception{
        Connection conn = null;
        Statement st = null;
        List<Contrato> contratos = new ArrayList<>();
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM CONTRATO");
            
            while(rs.next()){
                contratos.add(instanciaContrato(rs));
            }
            
            return contratos;
        } catch (Exception e) {
            throw e;
        }finally{
            closeResources(conn, st);
        }
    } 
    
    
    public static Contrato obterContrato(int codigo) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        Contrato contrato = null;
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("SELECT * FROM CONTRATO WHERE CODIGO = ?");
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                contrato = instanciaContrato(rs);
            }
            
            return contrato;
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, stmt);
        }
    }
    
    
    public boolean update(Contrato contrato) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        Boolean retorno = true;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("UPDATE CONTRATO SET COD_CLIENTE = ?, COD_EMPRESA = ?, COD_CONTRATO_ESTADO = ?, COD_LOCAL = ?, DESCRICAO = ? WHERE CODIGO = ?");
            parseAtributos(stmt, contrato);
        
        }catch(SQLException e){
            retorno = false;
            throw e;
        }finally{
            closeResources(conn, stmt);
        }
        return retorno;
    }
     
    
    public static void closeResources (Connection conn, Statement st) throws SQLException{
        try{
            if(st!=null) st.close();
            if(conn!=null) conn.close();
        }catch(SQLException e){
            throw e;
        }
    }
    
    
    private static void parseAtributos(PreparedStatement stmt , Contrato contrato) throws SQLException{
        stmt.setInt(1, contrato.getCliente().getCodigo());
        stmt.setInt(2, contrato.getEmpresa().getCodigo());
        stmt.setInt(3, contrato.getContratoEstadoCodigo());
        stmt.setInt(4, contrato.getLocal().getCodigo());
        stmt.setString(5, contrato.getDescricao());
        if(contrato.getCodigo() != 0){
            stmt.setInt(6, contrato.getCodigo());
        }
        stmt.execute();
    }
    
    
    private static Contrato instanciaContrato(ResultSet rs) throws SQLException, ClassNotFoundException, ClassNotFoundException{
        
        Contrato contrato = new Contrato();
        contrato.setCodigo(Integer.parseInt(rs.getString("CODIGO")));
        contrato.setCliente(Cliente.obterCliente(Integer.parseInt(rs.getString("COD_CLIENTE"))));
        contrato.setEmpresa(Empresa.obterEmpresa(Integer.parseInt(rs.getString("COD_EMPRESA"))));
        contrato.setContratoEstadoCodigo(Integer.parseInt(rs.getString("COD_CONTRATO_ESTADO")));
        contrato.setLocal(Local.obterLocal(Integer.parseInt(rs.getString("COD_LOCAL"))));
        contrato.setDescricao(rs.getString("DESCRICAO"));
        
        return contrato;
    }
    
}
