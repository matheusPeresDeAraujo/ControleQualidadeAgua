
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Amostra;
import model.Contrato;
import model.ContratoEstadoEmColeta;

public class GravarContratoColetaAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        if(     request.getParameter("textCodigoContrato").equals("")){
            
            request.setAttribute("resposta", "Alteração recusada");
            
        } else{
            try {
                
                Amostra amostra = new Amostra();
                amostra.saveAmostra(request);
                
                Contrato contrato = Contrato.obterContrato(Integer.parseInt(request.getParameter("textCodigoContrato")));
                contrato.setContratoEstado(new ContratoEstadoEmColeta());
                contrato.updateContrato(contrato);
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(GravarContratoColetaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        BuscarContratoColetaAction buscarContratoColeta = new BuscarContratoColetaAction();
        buscarContratoColeta.execute(request, response);
        
    } 
}
