
package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Amostra;
import model.Analise;
import model.Contrato;
import model.Funcionario;
import model.Local;
import model.Resultado;
import model.Servico;

public class AnaliseDao {
    
    
    private static AnaliseDao instance = new AnaliseDao();
    private AnaliseDao(){}
    public static AnaliseDao getInstance(){return instance;}
    
    
    public void save(Analise analise) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("INSERT INTO ANALISE "
                    + "(COD_AMOSTRA, COD_SERVICO, COD_PROFISSIONAL_ANALISTA, VALOR, COD_RESULTADO) "
                    + "VALUES (?,?,?,?,?)");
            parseAtributos(stmt, analise);
            
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
            stmt = conn.prepareStatement("DELETE FROM ANALISE WHERE CODIGO = ?");
            stmt.setInt(1, codigo);
            stmt.execute();
        
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, stmt);
        }
    }
    
    
    public static List<Analise> obterAnalises() throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        Statement st = null;
        List<Analise>  analises = new ArrayList<>();
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM ANALISE");
            
            while (rs.next()){
                analises.add(instanciaAnalise(rs));
            }
            
            return analises;
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, st);
        }
    }
    
    
    public static Analise obterAnalise(int codigo) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        Analise analise = null;
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("SELECT * FROM ANALISE WHERE CODIGO = ?");
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                analise = instanciaAnalise(rs);
            }
            
            return analise;
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, stmt);
        }
    }
    
    
    public void update(Analise analise) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("UPDATE ANALISE SET COD_AMOSTRA = ?, COD_SERVICO = ?, COD_PROFISSIONAL_ANALISTA = ?, VALOR = ?, COD_RESULTADO = ? WHERE CODIGO = ?");
            parseAtributos(stmt, analise);
        
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
    
    
    private static void parseAtributos(PreparedStatement stmt, Analise analise) throws SQLException{
            stmt.setInt(1, analise.getAmostra().getCodigo());
            stmt.setInt(2, analise.getServico().getCodigo());
            stmt.setInt(3, analise.getProfissionalAnalise().getCodigo());
            stmt.setInt(4, analise.getValor());
            stmt.setInt(5, analise.getResultado().getCodigo());
        if(analise.getCodigo() != 0){
            stmt.setInt(6, analise.getCodigo());
        }
            stmt.execute();
    }
    
    
    private static Analise instanciaAnalise(ResultSet rs) throws SQLException, ClassNotFoundException{
        
        Analise analise = new Analise();
        analise.setCodigo(Integer.parseInt(rs.getString("CODIGO")));
        analise.setAmostra(Amostra.obterAmostra(Integer.parseInt(rs.getString("COD_AMOSTRA"))));
        analise.setServico(Servico.obterServico(Integer.parseInt(rs.getString("COD_SERVICO"))));
        analise.setProfissionalAnalise(Funcionario.obterFuncionario(Integer.parseInt(rs.getString("COD_PROFISSIONAL_ANALISTA"))));
        analise.setValor(Integer.parseInt(rs.getString("VALOR")));
        analise.setResultado(Resultado.obterResultado(Integer.parseInt(rs.getString("COD_RESULTADO"))));
        
        return analise;
    }
    
}
