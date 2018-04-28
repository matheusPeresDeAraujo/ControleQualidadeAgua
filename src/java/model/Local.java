
package model;

public class Local {
    
    private int codigo;
    private int codigoCliente;
    private String tipoLocal;
    private Endereco endereco;

    public Local() {
    }

    public Local(int codigoCliente, String tipoLocal, Endereco endereco) {
        this.codigoCliente = codigoCliente;
        this.tipoLocal = tipoLocal;
        this.endereco = endereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getTipoLocal() {
        return tipoLocal;
    }

    public void setTipoLocal(String tipoLocal) {
        this.tipoLocal = tipoLocal;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
