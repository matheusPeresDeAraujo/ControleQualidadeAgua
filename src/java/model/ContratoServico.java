
package model;

import java.sql.SQLException;
import java.util.List;
import persistence.ContratoServicoDao;

public class ContratoServico {
    
    private int codigo = 0;
    private Contrato contrato;
    private Servico servico;

    public ContratoServico() {
    }

    public ContratoServico(Contrato contrato, Servico servico) {
        this.contrato = contrato;
        this.servico = servico;
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

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
    
    public static void saveContratoServico(ContratoServico contratoServico) throws SQLException, ClassNotFoundException{
        ContratoServicoDao.getInstance().save(contratoServico);
    }
    
    public static List<Integer> obterContratoServicos(Integer codigo) throws Exception, Exception{
        return ContratoServicoDao.obterContratoServicos(codigo);
    }
    
    public static void dropContratoServicos(Integer codigoContrato) throws SQLException, ClassNotFoundException{
        ContratoServicoDao.getInstance().drop(codigoContrato);
    }
    
}
