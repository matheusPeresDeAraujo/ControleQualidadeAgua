package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Funcionario;

public class AlterarFuncionarioAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        if(     request.getParameter("textCodigo").equals("")           || 
                request.getParameter("textNome").equals("")             || 
                request.getParameter("textIdentificacao").equals("")    || 
                request.getParameter("textEmpresa").equals("null")){
            
            request.setAttribute("resposta", "Alteração recusada");
            
        } else{
            
            try {
                
                Funcionario funcionario = new Funcionario();
                funcionario.updateFuncionario(request);
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(AlterarFuncionarioAction.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        BuscarFuncionarioAction buscarFuncionario = new BuscarFuncionarioAction();
        buscarFuncionario.execute(request, response);
        
    }  
}
