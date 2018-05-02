
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
import model.Analise;
import model.ProfissionalAnalise;
import model.ProfissionalEspecialista;
import model.Resultado;
import model.Servico;

public class CalcularCalculadoraAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        
        try {
            String[] servicos = request.getParameterValues("textServicos"); // Resulta em todos os servicos exitententes ordenados de 0 ate limite
            
            ProfissionalAnalise pAnalise = new ProfissionalAnalise();
            ProfissionalEspecialista pEspecialista = new ProfissionalEspecialista();
            List<Analise> analises = new ArrayList();
            
            for(int i = 0; i < Servico.obterServicos().size(); i++){
                
                double value = Double.parseDouble(servicos[i]);
                
                Analise analise = new Analise();
                analise.setServico(Servico.obterServico(i+1));
                analise.setValor(value);
                analise.setResultado(Resultado.obterResultado(pAnalise.analiseAmostra(i+1, value)));
                
                analises.add(analise);
            }
            
            String resultado = pEspecialista.calculaIqa(analises);
            request.setAttribute("resultado", resultado);
            
            
            RequestDispatcher view = request.getRequestDispatcher("ResultadoIqa.jsp");
            view.forward(request, response);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CalcularCalculadoraAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CalcularCalculadoraAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ServletException ex) {
            Logger.getLogger(CalcularCalculadoraAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
}
