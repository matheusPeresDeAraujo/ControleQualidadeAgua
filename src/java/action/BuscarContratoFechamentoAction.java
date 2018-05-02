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
import model.Contrato;
import model.ProfissionalEspecialista;

public class BuscarContratoFechamentoAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            
            
            Contrato contrato = new Contrato();
            List<Contrato> contratosFechamento = contrato.buscarContratoFechamento();
            
            request.setAttribute("contratos", contratosFechamento);
            RequestDispatcher view = 
                    request.getRequestDispatcher("ContratoFechamento.jsp");
            view.forward(request, response);
        } catch (ServletException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(BuscarContratoFechamentoAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(BuscarContratoFechamentoAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
