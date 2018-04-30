
package model;

import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import persistence.LocalDao;

public class Local {
    
    private int codigo = 0;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    public Local() {
    }

    public Local(String logradouro, int numero, String complemento, String bairro, String cidade, String estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
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
    
    public int saveLocal(HttpServletRequest request) throws SQLException, ClassNotFoundException{
        setParameter(request);
        return LocalDao.getInstance().save(this);
    }
    
    public static Local obterLocal(Integer codigo) throws SQLException, ClassNotFoundException{
        return LocalDao.obterLocal(codigo);
    }
    
    public static void dropLocal(Integer codigo) throws SQLException, SQLException, ClassNotFoundException{
        LocalDao.getInstance().drop(codigo);
    }

    private void setParameter(HttpServletRequest request){
        
            this.logradouro = request.getParameter("textLogradouro");
            this.numero = Integer.parseInt(request.getParameter("textNumero"));
            this.complemento = request.getParameter("textComplemento");
            this.bairro = request.getParameter("textBairro");
            this.cidade = request.getParameter("textCidade");
            this.estado = request.getParameter("textEstado");
        
    }
    
}
