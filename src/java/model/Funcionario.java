
package model;

import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import persistence.FuncionarioDao;

public class Funcionario {
    
    private int codigo;
    private Empresa empresa;
    private String nome;
    private String identificacao;
    private int cargo; //0 - ANALISE; 1 - COLETA

    public Funcionario() {
    }

    public Funcionario(int codigo, Empresa empresa, String nome, String identificacao, int cargo) {
        this.codigo = codigo;
        this.empresa = empresa;
        this.nome = nome;
        this.identificacao = identificacao;
        this.cargo = cargo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }
    
    public static List<Funcionario> obterFuncionarios() throws SQLException, ClassNotFoundException{
        return FuncionarioDao.obterFuncionarios();
    }
    
    public static Funcionario obterFuncionario(int codigo) throws SQLException, ClassNotFoundException{
        return FuncionarioDao.obterFuncionario(codigo);
    }
    
    public void saveFuncionario(HttpServletRequest request) throws SQLException, ClassNotFoundException{
        
        setParameter(request);
        FuncionarioDao.getInstance().save(this);
        
    }
    
    public void updateFuncionario(HttpServletRequest request) throws SQLException, ClassNotFoundException{
            
        this.codigo = Integer.parseInt(request.getParameter("textCodigo"));
        setParameter(request);
        FuncionarioDao.getInstance().update(this);  
        
    }
    
    public static void dropFuncionario(int codigo) throws SQLException, ClassNotFoundException{
        
        FuncionarioDao.getInstance().drop(codigo);
    
    }
    
    private void setParameter(HttpServletRequest request) throws SQLException, ClassNotFoundException{
        
            this.nome = request.getParameter("textNome");
            this.identificacao = request.getParameter("textIdentificacao");
            this.empresa = Empresa.obterEmpresa(Integer.parseInt(request.getParameter("textEmpresa")));
            this.cargo = Integer.parseInt(request.getParameter("textCargo"));
        
    }
}
