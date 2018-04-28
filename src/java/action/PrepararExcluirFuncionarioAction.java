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
import model.Funcionario;

public class PrepararExcluirFuncionarioAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        Funcionario funcionario = null;
        try {
            funcionario = Funcionario.obterFuncionario(codigo);
            request.setAttribute("funcionario", funcionario);
            
            List<Empresa> empresas = Empresa.obterEmpresas();
            request.setAttribute("empresas", empresas);
            
            RequestDispatcher view = request.getRequestDispatcher("FuncionarioDelete.jsp");
            view.forward(request, response);
        } catch (ServletException | IOException | ClassNotFoundException ex) {
        } catch (SQLException ex) {
            Logger.getLogger(PrepararExcluirFuncionarioAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
