
package model;

public class ResultadoAnalise {
    
    private Double iqa;
    private Double fosfatos;
    private Double turbidez;

    public ResultadoAnalise() {
    }

    public ResultadoAnalise(Double iqa, Double fosfatos, Double turbidez) {
        this.iqa = iqa;
        this.fosfatos = fosfatos;
        this.turbidez = turbidez;
    }

    public Double getIqa() {
        return iqa;
    }

    public void setIqa(Double iqa) {
        this.iqa = iqa;
    }

    public Double getFosfatos() {
        return fosfatos;
    }

    public void setFosfatos(Double fosfatos) {
        this.fosfatos = fosfatos;
    }

    public Double getTurbidez() {
        return turbidez;
    }

    public void setTurbidez(Double turbidez) {
        this.turbidez = turbidez;
    }
    
    
    
}
