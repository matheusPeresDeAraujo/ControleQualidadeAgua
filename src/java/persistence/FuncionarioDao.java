
package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Empresa;
import model.Funcionario;


public class FuncionarioDao {
    private static FuncionarioDao instance = new FuncionarioDao();
    private FuncionarioDao(){}
    public static FuncionarioDao getInstance(){return instance;}
    
    
    public void save(Funcionario funcionario) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("INSERT INTO FUNCIONARIO "
                    + "(NOME, IDENTIFICACAO, COD_EMPRESA, CARGO) "
                    + "VALUES (?, ?, ?, ?)");
            parseAtributos(stmt, funcionario);
            
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
            stmt = conn.prepareStatement("DELETE FROM FUNCIONARIO WHERE CODIGO = ?");
            stmt.setInt(1, codigo);
            stmt.execute();
        
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, stmt);
        }
    }
    
    
    public static List<Funcionario> obterFuncionarios() throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        Statement st = null;
        List<Funcionario> funcionarios = new ArrayList<>();
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM FUNCIONARIO");
            
            while (rs.next()){
                funcionarios.add(instanciaFuncionario(rs));
            }
            
            return funcionarios;
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, st);
        }
    }
    
    
    public static Funcionario obterFuncionario(int codigo) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        Funcionario cliente = null;
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("SELECT * FROM FUNCIONARIO WHERE CODIGO = ?");
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                cliente = instanciaFuncionario(rs);
            }
            
            return cliente;
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, stmt);
        }
    }
    
    
    public void update(Funcionario funcionario) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("UPDATE FUNCIONARIO SET NOME = ?, IDENTIFICACAO = ?, COD_EMPRESA = ?, CARGO = ? WHERE CODIGO = ?");
            parseAtributos(stmt, funcionario);
        
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
    
    
    private static void parseAtributos(PreparedStatement stmt, Funcionario funcionario) throws SQLException{
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getIdentificacao());
            stmt.setInt(3, funcionario.getEmpresa().getCodigo());
            stmt.setInt(4, funcionario.getCargo());
        if(funcionario.getCodigo() != 0){
            stmt.setInt(5, funcionario.getCodigo());
        }
            stmt.execute();
    }
    
    
    private static Funcionario instanciaFuncionario(ResultSet rs) throws SQLException, ClassNotFoundException{
        
        Funcionario funcionario = new Funcionario();
        funcionario.setCodigo(Integer.parseInt(rs.getString("CODIGO")));
        funcionario.setNome(rs.getString("NOME"));
        funcionario.setIdentificacao(rs.getString("IDENTIFICACAO"));
        funcionario.setEmpresa(Empresa.obterEmpresa(Integer.parseInt(rs.getString("COD_EMPRESA"))));
        funcionario.setCargo(Integer.parseInt(rs.getString("CARGO")));
        
        return funcionario;
    }
}
