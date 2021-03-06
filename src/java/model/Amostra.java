
package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import persistence.AmostraDao;


public class Amostra {
    
    private int codigo;
    private Contrato contrato;
    private Local local;
    private Funcionario profissionalColeta;
    
    public Amostra() {
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Funcionario getProfissionalColeta() {
        return profissionalColeta;
    }

    public void setProfissionalColeta(Funcionario profissionalColeta) {
        this.profissionalColeta = profissionalColeta;
    }
    
    
    public static List<Amostra> obterAmostras() throws SQLException, ClassNotFoundException{
        return AmostraDao.obterAmostras();
    }
    
    public static Amostra obterAmostra(int codigo) throws SQLException, ClassNotFoundException{
        return AmostraDao.obterAmostra(codigo);
    }
    
    public void saveAmostra(HttpServletRequest request) throws SQLException, ClassNotFoundException{
        
        setParameter(request);
        AmostraDao.getInstance().save(this);
        
    }
    
    public void updateAmostra(HttpServletRequest request) throws SQLException, ClassNotFoundException{
            
        this.codigo = Integer.parseInt(request.getParameter("textCodigo"));
        setParameter(request);
        AmostraDao.getInstance().update(this);  
        
    }
    
    public static void dropAmostra(int codigo) throws SQLException, ClassNotFoundException{
        
        AmostraDao.getInstance().drop(codigo);
    
    }
    
    private void setParameter(HttpServletRequest request) throws SQLException, ClassNotFoundException{
        
        this.contrato = (Contrato.obterContrato(Integer.parseInt(request.getParameter("textCodigoContrato"))));
        this.local = this.contrato.getLocal();
        this.profissionalColeta = (Funcionario.obterFuncionario(Integer.parseInt(request.getParameter("textCodigoFuncionario"))));
        
    }
    
    public List<Amostra> buscarAmostrasAnalise() throws SQLException, ClassNotFoundException, Exception{
        
        List<Contrato> contratos = Contrato.obterContratos();
        List<Contrato> contratosAnalise = new ArrayList<>();

        for(Contrato contrato : contratos){
            if(contrato.getContratoEstado().equals("COLETA FINALIZADA")){
                contratosAnalise.add(contrato);
            }else if(contrato.getContratoEstado().equals("EM ANALISE")){
                contratosAnalise.add(contrato);
            }else{
                //Contrato nao precisa ser observado pelo Profissional de Analise
            }  
        }

        List<Amostra> amostras = Amostra.obterAmostras();
        List<Amostra> amostrasColetaFinalizada = new ArrayList<>();

        for(Amostra amostra : amostras){
            if(contratosAnalise.contains(amostra.getContrato())){
                amostrasColetaFinalizada.add(amostra);
            }else{
                //Amostra pertence a um grupo que ainda náo esta fecado. Coleta em andamento
            }
        }

        return amostrasColetaFinalizada;
    }
}
