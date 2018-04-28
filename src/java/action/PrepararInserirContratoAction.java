
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
import model.Cliente;
import model.Empresa;
import persistence.ContratoEstadoDao;

public class PrepararInserirContratoAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            
            List<Cliente> clientes = Cliente.obterClientes();
            List<Empresa> empresas = Empresa.obterEmpresas();
            List<String> contratoEstados = ContratoEstadoDao.obterContratoEstados();
            request.setAttribute("contratoEstados", contratoEstados);
            request.setAttribute("empresas", empresas);
            request.setAttribute("clientes", clientes);
            
            RequestDispatcher view = request.getRequestDispatcher("ContratoCreate.jsp");
            view.forward(request, response);
            
        } catch (ServletException | IOException ex) {} catch (SQLException ex) {
            Logger.getLogger(PrepararInserirContratoAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrepararInserirContratoAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
