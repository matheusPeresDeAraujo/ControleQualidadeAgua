
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
import model.Amostra;
import model.ContratoServico;
import model.Funcionario;
import model.ProfissionalAnalise;
import model.Servico;
import persistence.ServicoDao;
public class PrepararIniciarAnaliseAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            
            List<Funcionario> funcionarios = Funcionario.obterFuncionarios();
            List<ProfissionalAnalise> funcionariosAnalise = new ArrayList<>();
            
            for(Funcionario funcionario : funcionarios){
                if(funcionario.getCargo() == 1){
                     ProfissionalAnalise pAnalise = new ProfissionalAnalise();
                     pAnalise.setCodigo(funcionario.getCodigo());
                     pAnalise.setNome(funcionario.getNome());
                     
                     funcionariosAnalise.add(pAnalise);
                }else{
                   //opc 2 = analise, nada a realizar
                }
            }
            request.setAttribute("funcionarios", funcionariosAnalise);
            
            Amostra amostra = Amostra.obterAmostra(Integer.parseInt(request.getParameter("codigo")));
            request.setAttribute("amostra", amostra);
            
            List<Integer> servicosContratados = ContratoServico.obterContratoServicos(amostra.getContrato().getCodigo());
            request.setAttribute("servicosContratados", servicosContratados);
            
            List<Servico> servicos = ServicoDao.obterServicos();
            request.setAttribute("servicos", servicos);
            
            
            RequestDispatcher view = request.getRequestDispatcher("ContratoAnaliseIniciar.jsp");
            view.forward(request, response);
            
        } catch (ServletException | IOException ex) {} catch (SQLException ex) {
            Logger.getLogger(PrepararIniciarAnaliseAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrepararIniciarAnaliseAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(PrepararIniciarAnaliseAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
