package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Funcionario;

public class ApagarFuncionarioAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        if(Integer.parseInt(request.getParameter("textCodigo")) != 0){
            try {
                
                Funcionario.dropFuncionario(Integer.parseInt(request.getParameter("textCodigo")));
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(ApagarFuncionarioAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        BuscarFuncionarioAction buscarFuncionario = new BuscarFuncionarioAction();
        buscarFuncionario.execute(request, response);
        
    }
    
}
