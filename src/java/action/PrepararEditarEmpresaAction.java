
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Empresa;

public class PrepararEditarEmpresaAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
           int codigo = Integer.parseInt(request.getParameter("codigo"));
            Empresa empresa;
            empresa = Empresa.obterEmpresa(codigo);
            
            request.setAttribute("empresa", empresa);
            RequestDispatcher view = request.getRequestDispatcher("EmpresaUpdate.jsp");
            view.forward(request, response);
        } catch (ServletException ex) {
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
            Logger.getLogger(PrepararEditarEmpresaAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}