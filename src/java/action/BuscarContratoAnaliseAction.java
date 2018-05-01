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

public class BuscarContratoAnaliseAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            
            List<Contrato> contratos = Contrato.obterContratos();
            List<Contrato> contratosAnalise = new ArrayList<>();
            
            for(Contrato contrato : contratos){
                if(contrato.getContratoEstado().equals("COLETA FINALIZADA")){
                    contratosAnalise.add(contrato);
                }else if(contrato.getContratoEstado().equals("EM ANALISE")){
                    contratosAnalise.add(contrato);
                }else{
                    //Contrato nao precisa ser observado pelo Profissional de Analise
                }  
            }
            
            request.setAttribute("contratos", contratosAnalise);
            RequestDispatcher view = 
                    request.getRequestDispatcher("ContratoAnalise.jsp");
            view.forward(request, response);
        } catch (ServletException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(BuscarContratoAnaliseAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(BuscarContratoAnaliseAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
