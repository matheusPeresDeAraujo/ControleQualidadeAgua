
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Contrato;

public class ApagarContratoAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        if(Integer.parseInt(request.getParameter("textCodigo")) != 0){
            try {
                
                Contrato.dropContrato(Integer.parseInt(request.getParameter("textCodigo")));
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(ApagarContratoAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        BuscarContratoAction buscarContrato = new BuscarContratoAction();
        buscarContrato.execute(request, response);
        
    }
    
}