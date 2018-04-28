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

public class PrepararEditarFuncionarioAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
           int codigo = Integer.parseInt(request.getParameter("codigo"));
           
            List<Empresa> empresas = Empresa.obterEmpresas();
            request.setAttribute("empresas", empresas);
            
            Funcionario funcionario;
            funcionario = Funcionario.obterFuncionario(codigo);
            
            request.setAttribute("funcionario", funcionario);
            RequestDispatcher view = request.getRequestDispatcher("FuncionarioUpdate.jsp");
            view.forward(request, response);
        } catch (ServletException ex) {
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
            Logger.getLogger(PrepararEditarFuncionarioAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
