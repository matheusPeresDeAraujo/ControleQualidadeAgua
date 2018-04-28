
package model;

public interface ContratoEstado {
    public String aberto(Contrato contrato);
    public String emColeta(Contrato contrato);
    public String coletaFinalizada(Contrato contrato);
    public String emAnalise(Contrato contrato);
    public String analiseFinalizada(Contrato contrato);
    public String fechado(Contrato contrato);
    public String getEstado(Contrato contrato);
}
