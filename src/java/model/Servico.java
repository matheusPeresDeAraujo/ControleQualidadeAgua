
package model;

import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import persistence.ServicoDao;

public class Servico {
    
    private int codigo = 0;
    private String nome;

    public Servico() {
    }

    public Servico(String descricao) {
        this.nome = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public static List<Servico> obterServicos() throws SQLException, ClassNotFoundException{
        return ServicoDao.obterServicos();
    }
    
    public static Servico obterServico(int codigo) throws SQLException, ClassNotFoundException{
        return ServicoDao.obterServico(codigo);
    }
    
    public void saveServico(HttpServletRequest request) throws SQLException, ClassNotFoundException{
        
        setParameter(request);
        ServicoDao.getInstance().save(this);
        
    }
    
    public void updateServico(HttpServletRequest request) throws SQLException, ClassNotFoundException{
            
        this.codigo = Integer.parseInt(request.getParameter("textCodigo"));
        setParameter(request);
        ServicoDao.getInstance().update(this);  
        
    }
    
    public static void dropServico(int codigo) throws SQLException, ClassNotFoundException{
        
        ServicoDao.getInstance().drop(codigo);
    
    }
    
    private void setParameter(HttpServletRequest request){
        
            this.nome = request.getParameter("textNome");
        
    }
}
