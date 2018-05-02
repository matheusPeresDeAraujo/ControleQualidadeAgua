
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
import model.Servico;
import persistence.ServicoDao;

public class CarregarCalculadoraAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
    
        try {
            
            List<Servico> servicos = ServicoDao.obterServicos();
            request.setAttribute("servicos", servicos);
            
            RequestDispatcher view = request.getRequestDispatcher("Calculadora.jsp");
            view.forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(CarregarCalculadoraAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarregarCalculadoraAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarregarCalculadoraAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
