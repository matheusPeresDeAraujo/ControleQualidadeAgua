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
import model.Amostra;

public class BuscarContratoAnaliseAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            
            Amostra amostra = new Amostra();
            List<Amostra> amostrasColetaFinalizada = amostra.buscarAmostrasAnalise();
            
            request.setAttribute("amostras", amostrasColetaFinalizada);
            RequestDispatcher view = 
                    request.getRequestDispatcher("ContratoAnalise.jsp");
            view.forward(request, response);
        } catch (ServletException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(BuscarContratoAnaliseAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(BuscarContratoAnaliseAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
