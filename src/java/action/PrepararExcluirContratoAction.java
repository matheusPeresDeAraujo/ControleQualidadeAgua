
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
import model.Contrato;

public class PrepararExcluirContratoAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        Contrato contrato = null;
        try {
            contrato = Contrato.obterContrato(codigo);
            request.setAttribute("contrato", contrato);
            RequestDispatcher view = request.getRequestDispatcher("ContratoDelete.jsp");
            view.forward(request, response);
        } catch (ServletException | IOException | ClassNotFoundException ex) {
        } catch (SQLException ex) {
            Logger.getLogger(PrepararExcluirContratoAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}