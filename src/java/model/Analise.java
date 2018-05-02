
package model;

import java.sql.SQLException;
import java.util.List;
import persistence.AnaliseDao;

public class Analise {
     
    private int codigo = 0;
    private Amostra amostra;
    private Servico servico;
    private Funcionario profissionalAnalise;
    private double valor;
    private Resultado resultado;

    public Analise() {
    }

    public Analise(Amostra amostra, Servico servico, Funcionario profissionalAnalise, double valor, Resultado resultado) {
        this.amostra = amostra;
        this.servico = servico;
        this.profissionalAnalise = profissionalAnalise;
        this.valor = valor;
        this.resultado = resultado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Amostra getAmostra() {
        return amostra;
    }

    public void setAmostra(Amostra amostra) {
        this.amostra = amostra;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Funcionario getProfissionalAnalise() {
        return profissionalAnalise;
    }

    public void setProfissionalAnalise(Funcionario profissionalAnalise) {
        this.profissionalAnalise = profissionalAnalise;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }  
    
    
    public static List<Analise> obterAnalises() throws SQLException, ClassNotFoundException{
        return AnaliseDao.obterAnalises();
    }
    
    public static Analise obterAnalise(int codigo) throws SQLException, ClassNotFoundException{
        return AnaliseDao.obterAnalise(codigo);
    }
    
    public void saveAnalise() throws SQLException, ClassNotFoundException{
        
        AnaliseDao.getInstance().save(this);
        
    }
}
