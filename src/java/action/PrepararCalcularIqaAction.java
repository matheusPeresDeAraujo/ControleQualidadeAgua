
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Contrato;
import model.Funcionario;
import model.ProfissionalEspecialista;

public class PrepararCalcularIqaAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            
            List<Funcionario> funcionarios = Funcionario.obterFuncionarios();
            List<ProfissionalEspecialista> funcionariosEspecialista = new ArrayList<>();
            
            for(Funcionario funcionario : funcionarios){
                if(funcionario.getCargo() == 3){
                     ProfissionalEspecialista pEspecialista = new ProfissionalEspecialista();
                     pEspecialista.setCodigo(funcionario.getCodigo());
                     pEspecialista.setNome(funcionario.getNome());
                     
                     funcionariosEspecialista.add(pEspecialista);
                }else{
                   //opc 1 = analise, nada a realizar
                }
            }
            request.setAttribute("funcionarios", funcionariosEspecialista);
            Contrato contrato = Contrato.obterContrato(Integer.parseInt(request.getParameter("codigo")));
            request.setAttribute("contrato", contrato);
            
            RequestDispatcher view = request.getRequestDispatcher("ContratoCalculaIqa.jsp");
            view.forward(request, response);
            
        } catch (ServletException | IOException ex) {} catch (SQLException ex) {
            Logger.getLogger(PrepararCalcularIqaAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrepararCalcularIqaAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
