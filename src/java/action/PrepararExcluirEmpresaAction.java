
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

public class PrepararExcluirEmpresaAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        Empresa empresa = null;
        try {
            empresa = Empresa.obterEmpresa(codigo);
            request.setAttribute("empresa", empresa);
            RequestDispatcher view = request.getRequestDispatcher("EmpresaDelete.jsp");
            view.forward(request, response);
        } catch (ServletException | IOException | ClassNotFoundException ex) {
        } catch (SQLException ex) {
            Logger.getLogger(PrepararExcluirEmpresaAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}