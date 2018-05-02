
package model;

import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import persistence.ContratoDao;

public class Contrato {
    
    private int codigo = 0;
    private Cliente cliente;
    private Empresa empresa;
    private ContratoEstado contratoEstado;
    private String descricao;
    private Local local;
    
    public Contrato() {
    }

    public Contrato(Cliente cliente, Empresa empresa, String descricao) {
        this.cliente = cliente;
        this.empresa = empresa;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getContratoEstado() {
        return this.contratoEstado.getEstado(this);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contrato other = (Contrato) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    public int getContratoEstadoCodigo(){
        
       String estado = this.contratoEstado.getEstado(this);
       
       if(estado.equals("ABERTO")){
           return 1;
       }else if(estado.equals("EM COLETA")){
           return 2;
       }else if(estado.equals("COLETA FINALIZADA")){
           return 3;
       }else if(estado.equals("EM ANALISE")){
           return 4;
       }else if(estado.equals("ANALISE FINALIZADA")){
           return 5;
       }else{
           return 6;
       }
    }

    public void setContratoEstado(ContratoEstado contratoEstado) {
        this.contratoEstado = contratoEstado;
    }
    
    public void setContratoEstadoName(String name){
        if(name.equals("ABERTO")){
           this.contratoEstado = ContratoEstadoFactory.create("Aberto");
       }else if(name.equals("EM COLETA")){
           this.contratoEstado = ContratoEstadoFactory.create("EmColeta");
       }else if(name.equals("COLETA FINALIZADA")){
           this.contratoEstado = ContratoEstadoFactory.create("ColetaFinalizada");
       }else if(name.equals("EM ANALISE")){
           this.contratoEstado = ContratoEstadoFactory.create("EmAnalise");
       }else if(name.equals("ANALISE FINALIZADA")){
           this.contratoEstado = ContratoEstadoFactory.create("AnaliseFinalizada");
       }else{
           this.contratoEstado = ContratoEstadoFactory.create("Fechado");
       }
    }
    
    public void setContratoEstadoCodigo(int codigo){
        if(codigo == 1){
           this.contratoEstado = ContratoEstadoFactory.create("Aberto");
       }else if(codigo == 2){
           this.contratoEstado = ContratoEstadoFactory.create("EmColeta");
       }else if(codigo == 3){
           this.contratoEstado = ContratoEstadoFactory.create("ColetaFinalizada");
       }else if(codigo == 4){
           this.contratoEstado = ContratoEstadoFactory.create("EmAnalise");
       }else if(codigo == 5){
           this.contratoEstado = ContratoEstadoFactory.create("AnaliseFinalizada");
       }else{
           this.contratoEstado = ContratoEstadoFactory.create("Fechado");
       }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public static List<Contrato> obterContratos() throws Exception{
        return ContratoDao.obterContratos();
    }
    
    public static Contrato obterContrato(int codigo) throws SQLException, ClassNotFoundException{
        return ContratoDao.obterContrato(codigo);
    }
    
    public int saveContrato(HttpServletRequest request) throws SQLException, ClassNotFoundException{
        
        setParameter(request);
        return ContratoDao.getInstance().save(this);
        
    }
    
    public void updateContrato(Contrato contrato) throws SQLException, ClassNotFoundException{
        ContratoDao.getInstance().update(contrato);
    }
    
    public void updateContrato(HttpServletRequest request) throws SQLException, ClassNotFoundException{
            
        this.codigo = Integer.parseInt(request.getParameter("textCodigo"));
        setParameter(request);
        ContratoDao.getInstance().update(this);  
        
    }
    
    public static void dropContrato(int codigo) throws SQLException, ClassNotFoundException{
        
        ContratoDao.getInstance().drop(codigo);
    
    }
    
    private void setParameter(HttpServletRequest request) throws SQLException, ClassNotFoundException{
        
            this.cliente = Cliente.obterCliente(Integer.parseInt(request.getParameter("textCodigoCliente")));
            this.empresa= Empresa.obterEmpresa(Integer.parseInt(request.getParameter("textCodigoEmpresa")));
            this.setContratoEstadoName(request.getParameter("textContratoEstado"));
            this.descricao = request.getParameter("textDescricao");
        
    }
}
