
package Model.Entity;

/**
 *
 * @author rafael.eraquino
 */
public class TypeEmployee {
    
    private int id;
    private String tipo;
    private int nivel;
    
    public TypeEmployee(){
        
    }
    
    public TypeEmployee(int id, String tipo, int nivel){
        this.id = id;
        this.tipo = tipo;
        this.nivel = nivel;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public int getNivel(){
        return nivel;
    }
    
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
}
