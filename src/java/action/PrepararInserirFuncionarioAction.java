package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Empresa;

public class PrepararInserirFuncionarioAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            
            List<Empresa> empresas = Empresa.obterEmpresas();
            request.setAttribute("empresas", empresas);
            
            RequestDispatcher view = request.getRequestDispatcher("FuncionarioCreate.jsp");
            view.forward(request, response);
            
        } catch (ServletException | IOException ex) {} catch (SQLException ex) {
            Logger.getLogger(PrepararInserirFuncionarioAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrepararInserirFuncionarioAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
