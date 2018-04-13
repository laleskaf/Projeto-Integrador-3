/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

/**
 *
 * @author rafael.eraquino
 */
public class Employee {
    
    private int id;
    private String nome;
    private String rg;
    private String cpf;
    private String sexo;
    private int tipoFuncionario;
    private int endereco;
    private String telefone;
    
    public Employee(){
        
    }
    
    public Employee(int id, String nome, String rg, String cpf, String sexo, int tipoFuncionario, int endereco, String telefone){
       this.id = id;
       this.nome = nome;
       this.rg = rg;
       this.cpf = cpf;
       this.sexo = sexo;
       this.tipoFuncionario = tipoFuncionario;
       this.endereco = endereco;
       this.telefone = telefone;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(int tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public int getEndereco() {
        return endereco;
    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
}
