
package model;

import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import persistence.EmpresaDao;

public class Empresa {
    
    private int codigo;
    private String nome;
    private String identificacao;
    
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    public Empresa() {
    }

    public Empresa(String nome, String identificacao, String logradouro, int numero, String complemento, String bairro, String cidade, String estado, String pais) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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
    
    public static List<Empresa> obterEmpresas() throws SQLException, ClassNotFoundException{
        return EmpresaDao.obterEmpresas();
    }
    
    public static Empresa obterEmpresa(int codigo) throws SQLException, ClassNotFoundException{
        return EmpresaDao.obterEmpresa(codigo);
    }
    
    public void saveEmpresa(HttpServletRequest request) throws SQLException, ClassNotFoundException{
        
        setParameter(request);
        EmpresaDao.getInstance().save(this);
        
    }
    
    public void updateEmpresa(HttpServletRequest request) throws SQLException, ClassNotFoundException{
            
        this.codigo = Integer.parseInt(request.getParameter("textCodigo"));
        setParameter(request);
        EmpresaDao.getInstance().update(this);  
        
    }
    
    public static void dropEmpresa(int codigo) throws SQLException, ClassNotFoundException{
        
        EmpresaDao.getInstance().drop(codigo);
    
    }
    
    private void setParameter(HttpServletRequest request){
        
            this.nome = request.getParameter("textNome");
            this.identificacao = request.getParameter("textIdentificacao");
            this.logradouro = request.getParameter("textIdentificacao");
            this.numero = Integer.parseInt(request.getParameter("textNumero"));
            this.complemento = request.getParameter("textComplemento");
            this.bairro = request.getParameter("textBairro");
            this.cidade = request.getParameter("textCidade");
            this.estado = request.getParameter("textEstado");
            this.pais = request.getParameter("textPais");
        
    }
    
}
