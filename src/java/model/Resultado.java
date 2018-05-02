
package model;

import java.sql.SQLException;
import persistence.ResultadoDao;

public class Resultado {
    
    private int codigo;
    private String nome;

    public Resultado() {
    }

    public Resultado(String descricao) {
        this.nome = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public static Resultado obterResultado(int codigo) throws SQLException, ClassNotFoundException{
        return ResultadoDao.obterResultado(codigo);
    }
}
