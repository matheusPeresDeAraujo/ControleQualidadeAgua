
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Contrato;

public class AlterarContratoAction implements Action{

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
                contrato.updateContrato(request);
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(AlterarContratoAction.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        BuscarContratoAction buscarContrato = new BuscarContratoAction();
        buscarContrato.execute(request, response);
        
    }  
}