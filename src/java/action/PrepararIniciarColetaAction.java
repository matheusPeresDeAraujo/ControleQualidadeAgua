
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
import model.Local;
import model.ProfissionalColeta;

public class PrepararIniciarColetaAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            
            List<Funcionario> funcionarios = Funcionario.obterFuncionarios();
            List<ProfissionalColeta> funcionariosColeta = new ArrayList<>();
            
            for(Funcionario funcionario : funcionarios){
                if(funcionario.getCargo() == 2){
                     ProfissionalColeta pColeta = new ProfissionalColeta();
                     pColeta.setCodigo(funcionario.getCodigo());
                     pColeta.setNome(funcionario.getNome());
                     
                     funcionariosColeta.add(pColeta);
                }else{
                   //opc 1 = analise, nada a realizar
                }
            }
            request.setAttribute("funcionarios", funcionariosColeta);
            Contrato contrato = Contrato.obterContrato(Integer.parseInt(request.getParameter("codigo")));
            request.setAttribute("contrato", contrato);
            request.setAttribute("local", contrato.getLocal());
            
            RequestDispatcher view = request.getRequestDispatcher("ContratoColetaIniciar.jsp");
            view.forward(request, response);
            
        } catch (ServletException | IOException ex) {} catch (SQLException ex) {
            Logger.getLogger(PrepararIniciarColetaAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrepararIniciarColetaAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
