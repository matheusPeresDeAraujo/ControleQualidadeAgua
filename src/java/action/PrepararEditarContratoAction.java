
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
import model.Contrato;
import model.ContratoServico;
import model.Empresa;
import model.Servico;
import persistence.ServicoDao;

public class PrepararEditarContratoAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
           int codigo = Integer.parseInt(request.getParameter("codigo"));
            Contrato contrato;
            contrato = Contrato.obterContrato(codigo);
            request.setAttribute("contrato", contrato);
            List<Integer> contratoServicos = ContratoServico.obterContratoServicos(codigo);
            request.setAttribute("contratoServicos", contratoServicos);
            List<Servico> servicos = ServicoDao.obterServicos();
            request.setAttribute("servicos", servicos);
            List<Cliente> clientes = Cliente.obterClientes();
            List<Empresa> empresas = Empresa.obterEmpresas();
            request.setAttribute("empresas", empresas);
            request.setAttribute("clientes", clientes);
            
            RequestDispatcher view = request.getRequestDispatcher("ContratoUpdate.jsp");
            view.forward(request, response);
        } catch (ServletException ex) {
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
            Logger.getLogger(PrepararEditarContratoAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(PrepararEditarContratoAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
