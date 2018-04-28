
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Empresa;


public class GravarEmpresaAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        if(     request.getParameter("textNome").equals("")             || 
                request.getParameter("textIdentificacao").equals("")    || 
                request.getParameter("textNumero").equals("null")       || 
                request.getParameter("textComplemento").equals("null")  || 
                request.getParameter("textBairro").equals("null")       || 
                request.getParameter("textCidade").equals("null")       || 
                request.getParameter("textEstado").equals("null")       || 
                request.getParameter("textPais").equals("null")){
            
                request.setAttribute("resposta", "Alteração recusada");
                
        } else{
            try {
                
                Empresa empresa = new Empresa();
                empresa.saveEmpresa(request);
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(GravarEmpresaAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        BuscarEmpresaAction buscarEmpresa = new BuscarEmpresaAction();
        buscarEmpresa.execute(request, response);
        
    } 
}
