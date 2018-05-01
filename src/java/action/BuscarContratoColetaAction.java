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

public class BuscarContratoColetaAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            
            List<Contrato> contratos = Contrato.obterContratos();
            List<Contrato> contratosColeta = new ArrayList<>();
            
            for(Contrato contrato : contratos){
                if(contrato.getContratoEstado().equals("ABERTO")){
                    contratosColeta.add(contrato);
                }else if(contrato.getContratoEstado().equals("EM COLETA")){
                    contratosColeta.add(contrato);
                }else{
                    //Contrato nao precisa ser observado pelo Profissional de Coleta
                }  
            }
            
            request.setAttribute("contratos", contratosColeta);
            RequestDispatcher view = 
                    request.getRequestDispatcher("ContratoColeta.jsp");
            view.forward(request, response);
        } catch (ServletException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(BuscarContratoColetaAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(BuscarContratoColetaAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
