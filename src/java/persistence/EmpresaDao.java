
package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Empresa;


public class EmpresaDao {
    private static EmpresaDao instance = new EmpresaDao();
    private EmpresaDao(){}
    public static EmpresaDao getInstance(){return instance;}
    
    
    public void save(Empresa empresa) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("INSERT INTO EMPRESA "
                    + "(NOME, IDENTIFICACAO, LOGRADOURO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, ESTADO, PAIS) "
                    + "VALUES (?,?,?,?,?,?,?,?,?)");
            parseAtributos(stmt, empresa);
            
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
            stmt = conn.prepareStatement("DELETE FROM EMPRESA WHERE CODIGO = ?");
            stmt.setInt(1, codigo);
            stmt.execute();
        
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, stmt);
        }
    }
    
    
    public static List<Empresa> obterEmpresas() throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        Statement st = null;
        List<Empresa> empresas = new ArrayList<>();
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM EMPRESA");
            
            while (rs.next()){
                empresas.add(instanciaEmpresa(rs));
            }
            
            return empresas;
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, st);
        }
    }
    
    
    public static Empresa obterEmpresa(int codigo) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        Empresa empresa = null;
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("SELECT * FROM EMPRESA WHERE CODIGO = ?");
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                empresa = instanciaEmpresa(rs);
            }
            
            return empresa;
        }catch(SQLException e){
            throw e;
        }finally{
            closeResources(conn, stmt);
        }
    }
    
    
    public void update(Empresa empresa) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            stmt = conn.prepareStatement("UPDATE EMPRESA SET NOME = ?, IDENTIFICACAO = ?, LOGRADOURO = ?, NUMERO = ?, COMPLEMENTO = ?, BAIRRO = ?, CIDADE = ?, ESTADO = ?, PAIS = ? WHERE CODIGO = ?");
            parseAtributos(stmt, empresa);
        
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
    
    
    private static void parseAtributos(PreparedStatement stmt, Empresa empresa) throws SQLException{
            stmt.setString(1, empresa.getNome());
            stmt.setString(2, empresa.getIdentificacao());
            stmt.setString(3, empresa.getLogradouro());
            stmt.setInt(4, empresa.getNumero());
            stmt.setString(5, empresa.getComplemento());
            stmt.setString(6, empresa.getBairro());
            stmt.setString(7, empresa.getCidade());
            stmt.setString(8, empresa.getEstado());
            stmt.setString(9, empresa.getPais());
        if(empresa.getCodigo() != 0){
            stmt.setInt(10, empresa.getCodigo());
        }
            stmt.execute();
    }
    
    
    private static Empresa instanciaEmpresa(ResultSet rs) throws SQLException{
        
        Empresa empresa = new Empresa();
        empresa.setCodigo(Integer.parseInt(rs.getString("CODIGO")));
        empresa.setNome(rs.getString("NOME"));
        empresa.setIdentificacao(rs.getString("IDENTIFICACAO"));
        empresa.setLogradouro(rs.getString("LOGRADOURO"));
        empresa.setNumero(rs.getInt("NUMERO"));
        empresa.setComplemento(rs.getString("COMPLEMENTO"));
        empresa.setBairro(rs.getString("BAIRRO"));
        empresa.setCidade(rs.getString("CIDADE"));
        empresa.setEstado(rs.getString("ESTADO"));
        empresa.setPais(rs.getString("PAIS"));
        
        return empresa;
    }
}
