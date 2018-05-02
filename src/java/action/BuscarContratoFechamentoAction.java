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

public class BuscarContratoFechamentoAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            
            List<Contrato> contratos = Contrato.obterContratos();
            List<Contrato> contratosFechamento = new ArrayList<>();
            
            for(Contrato contrato : contratos){
                if(contrato.getContratoEstado().equals("ANALISE FINALIZADA")){
                    contratosFechamento.add(contrato);
                }else{
                    //Contrato nao precisa ser observado pelo Profissional de Coleta
                }  
            }
            
            request.setAttribute("contratos", contratosFechamento);
            RequestDispatcher view = 
                    request.getRequestDispatcher("ContratoFechamento.jsp");
            view.forward(request, response);
        } catch (ServletException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(BuscarContratoFechamentoAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(BuscarContratoFechamentoAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
