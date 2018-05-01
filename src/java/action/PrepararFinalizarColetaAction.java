
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
import model.Contrato;

public class PrepararFinalizarColetaAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            
            Contrato contrato = Contrato.obterContrato(Integer.parseInt(request.getParameter("codigo")));
            request.setAttribute("contrato", contrato);
            
            List<Amostra> amostras = Amostra.obterAmostras();
            List<Amostra> amostrasContrato = new ArrayList<>();
            for(Amostra amostra : amostras){
                if(amostra.getContrato().getCodigo() == contrato.getCodigo()){
                    amostrasContrato.add(amostra);
                }else{
                    //Amostra nào pertence ao contrato
                }
            }
            request.setAttribute("amostras", amostrasContrato);
            
            RequestDispatcher view = request.getRequestDispatcher("ContratoColetaFinalizar.jsp");
            view.forward(request, response);
            
        } catch (ServletException | IOException ex) {} catch (SQLException ex) {
            Logger.getLogger(PrepararFinalizarColetaAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrepararFinalizarColetaAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
