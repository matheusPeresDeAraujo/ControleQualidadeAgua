
package model;

import java.sql.SQLException;
import persistence.FuncionarioDao;

public class ProfissionalAnalise extends Funcionario{
    
    
    public static ProfissionalAnalise obterFuncionario(int codigo) throws SQLException, ClassNotFoundException{
        return FuncionarioDao.obterFuncionarioAnalise(codigo);
    }
    
    
    public Integer analiseAmostra(double codigoServico, double valor){
        
        
        if(codigoServico == 1){
            return analisaPh(valor);
        }else if(codigoServico == 2){
            return analisaCondutividade(valor);
        }else if(codigoServico == 3){
            return analisaOxigenioDissolvido(valor);
        }else if(codigoServico == 4){
            return analisaReducaoPermanganato(valor);
        }else if(codigoServico == 5){
            return analisaColiformesTotais(valor);
        }else if(codigoServico == 6){
            return analisaNitrogenioAmoniacal(valor);
        }else if(codigoServico == 7){
            return analisaCloretos(valor);
        }else if(codigoServico == 8){
            return analisaDetergentes(valor);
        }else if(codigoServico == 9){
            return analisaDurezaAlcalinidade(valor);
        }else if(codigoServico == 10){
            return analisaSolidosDissolvidos(valor);
        }else if(codigoServico == 11){
            return analisaPraguicidas(valor);
        }else if(codigoServico == 12){
            return analisaGraxasAzeites(valor);
        }else if(codigoServico == 13){
            return analisaSulfatos(valor);
        }else if(codigoServico == 14){
            return analisaNitratos(valor);
        }else if(codigoServico == 15){
            return analisaCianetos(valor);
        }else if(codigoServico == 16){
            return analisaCoLivre(valor);
        }else if(codigoServico == 17){
            return analisaMagnesio(valor);
        }else if(codigoServico == 18){
            return analisaFosfatos(valor);
        }else if(codigoServico == 19){
            return analisaNitritos(valor);
        }else if(codigoServico == 20){
            return analisaDbo(valor);
        }else if(codigoServico == 21){
            return analisaCor(valor);
        }else if(codigoServico == 22){
            return analisaTurbidez(valor);
        }else if(codigoServico == 23){
            return analisaSodio(valor);
        }else{
            return analisaCalcio(valor);
        }
    }
    
    public Integer analisaPh(double valor){
        
        if(valor == 1){
            return 1;
        }else if(valor == 2){
            return 2;
        }else if(valor == 3){
            return 3;
        }else if(valor == 4){
            return 4;
        }else if(valor == 5){
            return 5;
        }else if(valor == 6){
            return 6;
        }else if(valor == 7){
            return 7;
        }else if(valor == 8){
            return 8;
        }else if(valor == 9){
            return 9;
        }else if(valor == 10){
            return 10;
        }else{
            return 11;
        }
    }
    
    public Integer analisaCondutividade(double valor){
        if(valor > 16000){
            return 1;
        }else if(valor > 12000){
            return 2;
        }else if(valor > 8000){
            return 3;
        }else if(valor > 5000){
            return 4;
        }else if(valor > 3000){
            return 5;
        }else if(valor > 2500){
            return 6;
        }else if(valor > 2000){
            return 7;
        }else if(valor > 1500){
            return 8;
        }else if(valor > 1250){
            return 9;
        }else if(valor >= 750){
            return 10;
        }else{
            return 11;
        }
    }
    
    public Integer analisaOxigenioDissolvido(double valor){
    
        if(valor < 1){
            return 1;
        }else if(valor < 2){
            return 2;
        }else if(valor < 3){
            return 3;
        }else if(valor < 3.5){
            return 4;
        }else if(valor < 4){
            return 5;
        }else if(valor < 5){
            return 6;
        }else if(valor < 6){
            return 7;
        }else if(valor < 6.5){
            return 8;
        }else if(valor < 7){
            return 9;
        }else if(valor < 7.5){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    public Integer analisaReducaoPermanganato(double valor){
    
        if(valor > 15){
            return 1;
        }else if(valor > 12){
            return 2;
        }else if(valor > 10){
            return 3;
        }else if(valor > 8){
            return 4;
        }else if(valor > 6){
            return 5;
        }else if(valor > 5){
            return 6;
        }else if(valor > 4){
            return 7;
        }else if(valor > 3){
            return 8;
        }else if(valor > 2){
            return 9;
        }else if(valor > 0.5){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    public Integer analisaColiformesTotais(double valor){
    
        if(valor > 14000){
            return 1;
        }else if(valor > 10000){
            return 2;
        }else if(valor > 7000){
            return 3;
        }else if(valor > 5000){
            return 4;
        }else if(valor > 4000){
            return 5;
        }else if(valor > 3000){
            return 6;
        }else if(valor > 2000){
            return 7;
        }else if(valor > 1500){
            return 8;
        }else if(valor > 1000){
            return 9;
        }else if(valor > 50){
            return 10;
        }else{
            return 11;
        } 
    }
    
    public Integer analisaNitrogenioAmoniacal(double valor){
    
        if(valor > 1.25){
            return 1;
        }else if(valor > 1){
            return 2;
        }else if(valor > 0.75){
            return 3;
        }else if(valor > 0.5){
            return 4;
        }else if(valor > 0.4){
            return 5;
        }else if(valor > 0.3){
            return 6;
        }else if(valor > 0.2){
            return 7;
        }else if(valor > 0.1){
            return 8;
        }else if(valor > 0.05){
            return 9;
        }else if(valor > 0){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    public Integer analisaCloretos(double valor){
    
        if(valor > 1500){
            return 1;
        }else if(valor > 1000){
            return 2;
        }else if(valor > 700){
            return 3;
        }else if(valor > 500){
            return 4;
        }else if(valor > 300){
            return 5;
        }else if(valor > 200){
            return 6;
        }else if(valor > 150){
            return 7;
        }else if(valor > 100){
            return 8;
        }else if(valor > 50){
            return 9;
        }else if(valor > 0){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    public Integer analisaDetergentes(double valor){
    
        if(valor > 3){
            return 1;
        }else if(valor > 2){
            return 2;
        }else if(valor > 1.5){
            return 3;
        }else if(valor > 1){
            return 4;
        }else if(valor > 0.75){
            return 5;
        }else if(valor > 0.50){
            return 6;
        }else if(valor > 0.25){
            return 7;
        }else if(valor > 0.10){
            return 8;
        }else if(valor > 0.06){
            return 9;
        }else if(valor > 0){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    public Integer analisaDurezaAlcalinidade(double valor){
    
        if(valor > 1500){
            return 1;
        }else if(valor > 1000){
            return 2;
        }else if(valor > 800){
            return 3;
        }else if(valor > 600){
            return 4;
        }else if(valor > 500){
            return 5;
        }else if(valor > 400){
            return 6;
        }else if(valor > 300){
            return 7;
        }else if(valor > 200){
            return 8;
        }else if(valor > 100){
            return 9;
        }else if(valor > 25){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    public Integer analisaSolidosDissolvidos(double valor){
    
        if(valor > 20000){
            return 1;
        }else if(valor > 10000){
            return 2;
        }else if(valor > 5000){
            return 3;
        }else if(valor > 3000){
            return 4;
        }else if(valor > 2000){
            return 5;
        }else if(valor > 1500){
            return 6;
        }else if(valor > 1000){
            return 7;
        }else if(valor > 750){
            return 8;
        }else if(valor > 500){
            return 9;
        }else if(valor > 100){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    public Integer analisaPraguicidas(double valor){
    
        if(valor > 2){
            return 1;
        }else if(valor > 1){
            return 2;
        }else if(valor > 0.4){
            return 3;
        }else if(valor > 0.2){
            return 4;
        }else if(valor > 0.1){
            return 5;
        }else if(valor > 0.05){
            return 6;
        }else if(valor > 0.025){
            return 7;
        }else if(valor > 0.01){
            return 8;
        }else if(valor > 0.005){
            return 9;
        }else if(valor > 0){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    public Integer analisaGraxasAzeites(double valor){
    
        if(valor > 3){
            return 1;
        }else if(valor > 2){
            return 2;
        }else if(valor > 1){
            return 3;
        }else if(valor > 0.6){
            return 4;
        }else if(valor > 0.3){
            return 5;
        }else if(valor > 0.15){
            return 6;
        }else if(valor > 0.08){
            return 7;
        }else if(valor > 0.04){
            return 8;
        }else if(valor > 0.02){
            return 9;
        }else if(valor > 0){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    public Integer analisaSulfatos(double valor){
    
        if(valor > 1500){
            return 1;
        }else if(valor > 1000){
            return 2;
        }else if(valor > 600){
            return 3;
        }else if(valor > 400){
            return 4;
        }else if(valor > 250){
            return 5;
        }else if(valor > 150){
            return 6;
        }else if(valor > 100){
            return 7;
        }else if(valor > 75){
            return 8;
        }else if(valor > 50){
            return 9;
        }else if(valor > 0){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    public Integer analisaNitratos(double valor){
    
        if(valor > 100){
            return 1;
        }else if(valor > 50){
            return 2;
        }else if(valor > 20){
            return 3;
        }else if(valor > 15){
            return 4;
        }else if(valor > 10){
            return 5;
        }else if(valor > 8){
            return 6;
        }else if(valor > 6){
            return 7;
        }else if(valor > 4){
            return 8;
        }else if(valor > 2){
            return 9;
        }else if(valor > 0){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    public Integer analisaCianetos(double valor){
    
        if(valor > 1){
            return 1;
        }else if(valor > 0.6){
            return 2;
        }else if(valor > 0.5){
            return 3;
        }else if(valor > 0.4){
            return 4;
        }else if(valor > 0.3){
            return 5;
        }else if(valor > 0.2){
            return 6;
        }else if(valor > 0.1){
            return 7;
        }else if(valor > 0.05){
            return 8;
        }else if(valor > 0.02){
            return 9;
        }else if(valor > 0){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    public Integer analisaCoLivre(double valor){
    
        if(valor > 60){
            return 1;
        }else if(valor > 50){
            return 2;
        }else if(valor > 40){
            return 3;
        }else if(valor > 30){
            return 4;
        }else if(valor > 20){
            return 5;
        }else if(valor > 10){
            return 6;
        }else if(valor > 9){
            return 7;
        }else if(valor > 8){
            return 8;
        }else if(valor > 7){
            return 9;
        }else if(valor > 3){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    public Integer analisaMagnesio(double valor){
    
        if(valor > 500){
            return 1;
        }else if(valor > 300){
            return 2;
        }else if(valor > 250){
            return 3;
        }else if(valor > 200){
            return 4;
        }else if(valor > 150){
            return 5;
        }else if(valor > 100){
            return 6;
        }else if(valor > 75){
            return 7;
        }else if(valor > 50){
            return 8;
        }else if(valor > 25){
            return 9;
        }else if(valor > 10){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    public Integer analisaFosfatos(double valor){
    
        if(valor > 500){
            return 1;
        }else if(valor > 300){
            return 2;
        }else if(valor > 200){
            return 3;
        }else if(valor > 100){
            return 4;
        }else if(valor > 50){
            return 5;
        }else if(valor > 30){
            return 6;
        }else if(valor > 20){
            return 7;
        }else if(valor > 10){
            return 8;
        }else if(valor > 5){
            return 9;
        }else if(valor > 0){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    public Integer analisaNitritos(double valor){
    
        if(valor > 1){
            return 1;
        }else if(valor > 0.5){
            return 2;
        }else if(valor > 0.25){
            return 3;
        }else if(valor > 0.20){
            return 4;
        }else if(valor > 0.15){
            return 5;
        }else if(valor > 0.10){
            return 6;
        }else if(valor > 0.05){
            return 7;
        }else if(valor > 0.025){
            return 8;
        }else if(valor > 0.010){
            return 9;
        }else if(valor > 0){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    public Integer analisaDbo(double valor){
    
        if(valor > 15){
            return 1;
        }else if(valor > 12){
            return 2;
        }else if(valor > 10){
            return 3;
        }else if(valor > 8){
            return 4;
        }else if(valor > 6){
            return 56;
        }else if(valor > 5){
            return 6;
        }else if(valor > 4){
            return 7;
        }else if(valor > 2){
            return 8;
        }else if(valor > 1){
            return 9;
        }else if(valor > 0.5){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    public Integer analisaCor(double valor){
    
        if(valor > 250){
            return 1;
        }else if(valor > 100){
            return 2;
        }else if(valor > 60){
            return 3;
        }else if(valor > 40){
            return 4;
        }else if(valor > 30){
            return 5;
        }else if(valor > 20){
            return 6;
        }else if(valor > 15){
            return 7;
        }else if(valor > 10){
            return 8;
        }else if(valor > 5){
            return 9;
        }else if(valor > 3){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    public Integer analisaTurbidez(double valor){
    
        if(valor > 400){
            return 1;
        }else if(valor > 250){
            return 2;
        }else if(valor > 180){
            return 3;
        }else if(valor > 100){
            return 4;
        }else if(valor > 50){
            return 5;
        }else if(valor > 20){
            return 6;
        }else if(valor > 15){
            return 7;
        }else if(valor > 10){
            return 8;
        }else if(valor > 5){
            return 9;
        }else if(valor > 3){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    public Integer analisaSodio(double valor){
    
        if(valor > 500){
            return 1;
        }else if(valor > 300){
            return 2;
        }else if(valor > 250){
            return 3;
        }else if(valor > 200){
            return 4;
        }else if(valor > 150){
            return 5;
        }else if(valor > 100){
            return 6;
        }else if(valor > 75){
            return 7;
        }else if(valor > 50){
            return 8;
        }else if(valor > 25){
            return 9;
        }else if(valor > 10){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    public Integer analisaCalcio(double valor){
    
        if(valor > 1000){
            return 1;
        }else if(valor > 600){
            return 2;
        }else if(valor > 500){
            return 3;
        }else if(valor > 400){
            return 4;
        }else if(valor > 300){
            return 5;
        }else if(valor > 200){
            return 6;
        }else if(valor > 150){
            return 7;
        }else if(valor > 100){
            return 8;
        }else if(valor > 50){
            return 9;
        }else if(valor > 10){
            return 10;
        }else{
            return 11;
        }
        
    }
    
    
    
    
}
