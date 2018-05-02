
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Contrato;
import model.ContratoEstadoColetaFinalizada;

public class GravarContratoColetaFinalizarAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        if(     request.getParameter("textCodigoContrato").equals("")){
            
            request.setAttribute("resposta", "Alteração recusada");
            
        } else{
            try {
                
                Contrato contrato = Contrato.obterContrato(Integer.parseInt(request.getParameter("textCodigoContrato")));
                contrato.setContratoEstado(new ContratoEstadoColetaFinalizada());
                contrato.updateContrato(contrato);
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(GravarContratoColetaFinalizarAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        BuscarContratoColetaAction buscarContratoColeta = new BuscarContratoColetaAction();
        buscarContratoColeta.execute(request, response);
        
    } 
}
