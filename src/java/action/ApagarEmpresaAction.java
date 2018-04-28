
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Empresa;

public class ApagarEmpresaAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        if(Integer.parseInt(request.getParameter("textCodigo")) != 0){
            try {
                
                Empresa.dropEmpresa(Integer.parseInt(request.getParameter("textCodigo")));
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(ApagarEmpresaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        BuscarEmpresaAction buscarEmpresa = new BuscarEmpresaAction();
        buscarEmpresa.execute(request, response);
        
    }
    
}