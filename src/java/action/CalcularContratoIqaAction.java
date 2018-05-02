
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
import model.Contrato;
import model.ProfissionalEspecialista;

public class CalcularContratoIqaAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            
            ProfissionalEspecialista pEspecialista = ProfissionalEspecialista.obterFuncionario(Integer.parseInt(request.getParameter("textCodigoFuncionario")));
            Contrato contrato = Contrato.obterContrato(Integer.parseInt(request.getParameter("textCodigoContrato")));
            
            List<Analise> analises = Analise.obterAnalises();
            List<Analise> analisesContrato = new ArrayList();
            
            for(Analise analise : analises){
                if(analise.getAmostra().getContrato().getCodigo() == contrato.getCodigo()){
                    analisesContrato.add(analise);
                }
            }
            
            String resultado = pEspecialista.calculaIqa(analisesContrato);
            request.setAttribute("resultado", resultado);
            
            RequestDispatcher view = request.getRequestDispatcher("ResultadoIqa.jsp");
            view.forward(request, response);
            
        } catch (ServletException | IOException ex) {} catch (SQLException ex) {
            Logger.getLogger(CalcularContratoIqaAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CalcularContratoIqaAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
