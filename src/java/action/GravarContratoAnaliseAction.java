
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Amostra;
import model.Analise;
import model.Contrato;
import model.ContratoEstadoAnaliseFinalizada;
import model.ContratoEstadoEmAnalise;
import model.Funcionario;
import model.ProfissionalAnalise;
import model.Resultado;
import model.Servico;

public class GravarContratoAnaliseAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        if(     request.getParameter("textCodigoAmostra").equals("")){
            
            request.setAttribute("resposta", "Alteração recusada");
            
        } else{
            try {
                
                String[] servicos = request.getParameterValues("textServicos"); // Resulta em todos os servicos exitententes ordenados de 0 ate limite
                
                for(int i = 0; i < Servico.obterServicos().size(); i++){
                    
                    if(!servicos[i].equals("")){
                        
                        int value = Integer.parseInt(servicos[i]);
                        
                        Analise analise = new Analise();
                        analise.setAmostra(Amostra.obterAmostra(Integer.parseInt(request.getParameter("textCodigoAmostra"))));
                        analise.setServico(Servico.obterServico(i+1));
                        ProfissionalAnalise pAnalise = ProfissionalAnalise.obterFuncionario(Integer.parseInt(request.getParameter("textCodigoFuncionario")));
                        analise.setProfissionalAnalise(pAnalise);
                        analise.setValor(value);
                        analise.setResultado(Resultado.obterResultado(pAnalise.analiseAmostra(Servico.obterServico(i+1), value)));
                        
                        analise.saveAnalise();
                    }
                }
                
                
                Contrato contrato = (Amostra.obterAmostra(Integer.parseInt(request.getParameter("textCodigoAmostra"))).getContrato());
                contrato.setContratoEstado(new ContratoEstadoEmAnalise());
                contrato.updateContrato(contrato);
                
                List<Amostra> amostras = Amostra.obterAmostras();
                List<Analise> analises = Analise.obterAnalises();
                List<Integer> amostrasContrato = new ArrayList<>();
                List<Integer> analisesCodAmostra = new ArrayList<>();
                for(Amostra amostra : amostras){
                    if(amostra.getContrato().getCodigo() == contrato.getCodigo()){
                        amostrasContrato.add(amostra.getCodigo());
                    }
                }
                for(Analise analise : analises){
                    analisesCodAmostra.add(analise.getAmostra().getCodigo());
                }
                
                if(analisesCodAmostra.containsAll(amostrasContrato)){
                    contrato.setContratoEstado(new ContratoEstadoAnaliseFinalizada());
                    contrato.updateContrato(contrato);
                }
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(GravarContratoAnaliseAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        BuscarContratoAnaliseAction buscarContratoAnalise = new BuscarContratoAnaliseAction();
        buscarContratoAnalise.execute(request, response);
        
    } 
}
