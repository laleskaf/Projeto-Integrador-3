
package Model.Entity;

/**
 *
 * @author rafael.eraquino
 */
public class Unity {
    private int id;
    private String nome;
    private int endereco;
    
    public Unity(){
        
    }
    
    public Unity(int id, String nome, int endereco){
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String nome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getEndereco(){
        return endereco;
    }
    
    public void setEndereco(int endereco){
        this.endereco = endereco;
    }
}
