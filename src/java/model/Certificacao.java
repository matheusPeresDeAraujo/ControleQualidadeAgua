
package model;

public class Certificacao {
    
    private int codigo;
    private String certificacao;

    public Certificacao() {
    }

    public Certificacao(int codigo, String certificacao) {
        this.codigo = codigo;
        this.certificacao = certificacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCertificacao() {
        return certificacao;
    }

    public void setCertificacao(String certificacao) {
        this.certificacao = certificacao;
    }
    
    
}
