
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GravarContratoColetaAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        if(     request.getParameter("textCodigo").equals("")){
            
            request.setAttribute("resposta", "Alteração recusada");
            
        } else{
            try {
                
                // Fazer ligacao do funcionario com contrat e local em uma nova tabela amostra.
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(GravarContratoColetaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        BuscarContratoColetaAction buscarContratoColeta = new BuscarContratoColetaAction();
        buscarContratoColeta.execute(request, response);
        
    } 
}
