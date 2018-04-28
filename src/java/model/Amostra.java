
package model;


public class Amostra {
    
    private int codigo;
    private int codigoPedido;
    private int codigoProfissionalColeta;
    private int codigoProfissionalAnalise;
    private Double iqa;
    private Double fosfatos;
    private Double turbidez;

    public Amostra() {
    }

    public Amostra(int codigoPedido, int codigoProfissionalColeta, Double iqa, Double fosfatos, Double turbidez) {
        this.codigoPedido = codigoPedido;
        this.codigoProfissionalColeta = codigoProfissionalColeta;
        this.iqa = iqa;
        this.fosfatos = fosfatos;
        this.turbidez = turbidez;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public int getCodigoProfissionalColeta() {
        return codigoProfissionalColeta;
    }

    public void setCodigoProfissionalColeta(int codigoProfissionalColeta) {
        this.codigoProfissionalColeta = codigoProfissionalColeta;
    }

    public int getCodigoProfissionalAnalise() {
        return codigoProfissionalAnalise;
    }

    public void setCodigoProfissionalAnalise(int codigoProfissionalAnalise) {
        this.codigoProfissionalAnalise = codigoProfissionalAnalise;
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
