
package model;

import java.sql.SQLException;
import java.util.List;
import persistence.FuncionarioDao;

public class ProfissionalEspecialista extends Funcionario{
    
    
    public static ProfissionalEspecialista obterFuncionario(int codigo) throws SQLException, ClassNotFoundException{
        return FuncionarioDao.obterFuncionarioEspecialista(codigo);
    }
    
    public String calculaIqa(List<Analise> analises){  //Indice de qualidade da agua
        
        double resultado = 0;
        for(Analise analise : analises){
            resultado += (analise.getResultado().getCodigo() - 1) * 0.1;
        }
        resultado = resultado / analises.size();
        
        if(resultado < 0.25){
            return "Muito Ruim";
        }else if(resultado < 0.50){
            return "Ruim";
        }else if(resultado < 0.70){
            return "Media";
        }else if(resultado < 0.90){
            return "Boa";
        }else{
            return "Excelente";
        }
        
    }
}
