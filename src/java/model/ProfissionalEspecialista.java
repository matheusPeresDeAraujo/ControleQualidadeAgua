
package model;

public class ProfissionalEspecialista extends Funcionario{
    
    public String calculaIqa(){  //Indice de qualidade da agua
        
        int resultado = 0;
        
        if(resultado < 25){
            return "Muito Ruim";
        }else if(resultado < 50){
            return "Ruim";
        }else if(resultado < 70){
            return "Media";
        }else if(resultado < 90){
            return "Boa";
        }else{
            return "Excelente";
        }
        
    }
}
