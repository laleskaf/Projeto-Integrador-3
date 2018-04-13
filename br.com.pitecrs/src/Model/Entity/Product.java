
package Model.Entity;

/**
 *
 * @author rafael.eraquino
 */
public class Product {
    
    private int id;
    private String nome;
    private String fabricante;
    private int modelo;
    private int lote;
    private int unidade;
    private String cor;
    private int quantidade;
    private double preco;

    public Product() {
    
    }

    public Product(int id, String nome, String fabricante, int modelo, int lote, int unidade, String cor, int quantidade, double preco) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.lote = lote;
        this.unidade = unidade;
        this.cor = cor;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
}
