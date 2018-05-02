
package model;


public class ContratoEstadoAberto implements ContratoEstado{

    @Override
    public String aberto(Contrato contrato) {
        return "Alteração recusada";
    }

    @Override
    public String emColeta(Contrato contrato) {
        return "Alteração aceita";
    }

    @Override
    public String coletaFinalizada(Contrato contrato) {
        return "Alteração recusada";
    }

    @Override
    public String emAnalise(Contrato contrato) {
        return "Alteração recusada";
    }

    @Override
    public String analiseFinalizada(Contrato contrato) {
        return "Alteração recusada";
    }

    @Override
    public String fechado(Contrato contrato) {
        return "Alteração recusada";
    }

    @Override
    public String getEstado(Contrato contrato) {
        return "ABERTO";
    }
}
