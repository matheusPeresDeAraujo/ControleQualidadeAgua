
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Contrato;
import model.ContratoServico;
import model.Servico;

public class GravarContratoAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        if(     request.getParameter("textCodigoCliente").equals("")           || 
                request.getParameter("textCodigoEmpresa").equals("")             || 
                request.getParameter("textContratoEstado").equals("")    || 
                request.getParameter("textDescricao").equals("null")){
            
            request.setAttribute("resposta", "Alteração recusada");
            
        } else{
            try {
                
                Contrato contrato = new Contrato();
                int codigoContrato = contrato.saveContrato(request);
                
                
                String[] servicos = request.getParameterValues("textServicos");
                
                for(String servico : servicos){
                    ContratoServico contratoServico = new ContratoServico();
                    contratoServico.setContrato(Contrato.obterContrato(codigoContrato));
                    contratoServico.setServico(Servico.obterServico(Integer.parseInt(servico)));
                    ContratoServico.saveContratoServico(contratoServico);
                }
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(GravarContratoAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        BuscarContratoAction buscarContrato = new BuscarContratoAction();
        buscarContrato.execute(request, response);
        
    } 
}
