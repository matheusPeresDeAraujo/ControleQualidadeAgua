package model;

import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import persistence.ClienteDao;

public class Cliente{
        
    private int codigo = 0;
    private String nome;
    private String identificacao;
    private String telefone;
    private String celular;
    private String email;
    

    public Cliente() {
    }

    public Cliente(String nome, String identificacao, String telefone, String celular, String email) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public static List<Cliente> obterClientes() throws SQLException, ClassNotFoundException{
        return ClienteDao.obterClientes();
    }
    
    public static Cliente obterCliente(int codigo) throws SQLException, ClassNotFoundException{
        return ClienteDao.obterCliente(codigo);
    }
    
    public void saveCliente(HttpServletRequest request) throws SQLException, ClassNotFoundException{
        
        setParameter(request);
        ClienteDao.getInstance().save(this);
        
    }
    
    public void updateCliente(HttpServletRequest request) throws SQLException, ClassNotFoundException{
            
        this.codigo = Integer.parseInt(request.getParameter("textCodigo"));
        setParameter(request);
        ClienteDao.getInstance().update(this);  
        
    }
    
    public static void dropCliente(int codigo) throws SQLException, ClassNotFoundException{
        
        ClienteDao.getInstance().drop(codigo);
    
    }
    
    private void setParameter(HttpServletRequest request){
        
            this.nome = request.getParameter("textNome");
            this.identificacao = request.getParameter("textIdentificacao");
            this.telefone = request.getParameter("textTelefone");
            this.celular = request.getParameter("textCelular");
            this.email = request.getParameter("textEmail");
        
    }
}
