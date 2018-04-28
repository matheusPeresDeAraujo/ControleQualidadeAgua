
package model;

public class ContratoEstadoFactory {
    public static ContratoEstado create(String estado){
        ContratoEstado contratoEstadoObject =  null;
        String nomeClasse = "model.ContratoEstado"+estado;
        Class classe = null;
        Object objeto = null;
        try{
            classe = Class.forName(nomeClasse);
            objeto = classe.newInstance();
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            return null;
        }
        if(!(objeto instanceof ContratoEstado)) return null;
        contratoEstadoObject = (ContratoEstado) objeto;
        return contratoEstadoObject;
    }
}
