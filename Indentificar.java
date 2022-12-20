/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maonaroda;



/**
 *
 * @author Aluno_Manha
 */
public class Indentificar {
    
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private int idade;
    private String cnh;
    private String categoria;
    private String carro;
    private int dias;

    /**
     * @return the nome
     */
    
    
    
    
    public String menor() {
        String texto = "";
        
       
        
            texto = "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nEmail: " + getEmail() + "\nTelefone: " + getTelefone()
                    + "\nIdade: " + getIdade() + "\nCNH" + getCnh() + "\nCategoria: " + getCategoria();
        
        
        return texto;
    
    }
    
    public String maior() {
        String texto = "";
        
        if("".equals(getCnh()) && "b".equals(categoria)){
        
            texto = "Você não pode alugar um carro porque não possui uma CNH";
            
        } else if ("".equals(getCnh()) && "a".equals(categoria)) {
        
            texto = "Você não pode alugar uma moto porque não possui uma CNH";
            
        }
        
        else {
        
            texto = "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nEmail: " + getEmail() + "\nTelefone: " + getTelefone()
                    + "\nIdade: " + getIdade() + "\nCNH" + getCnh() + "\nCategoria: " + getCategoria() + "\nDias com veículo: " + getDias();
        }
        
        return texto;
    
    }
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }


    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the cnh
     */
    public String getCnh() {
        return cnh;
    }

    /**
     * @param cnh the cnh to set
     */
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    /**
     * @return the carro
     */
    public String getCarro() {
        return carro;
    }

    /**
     * @param carro the carro to set
     */
    public void setCarro(String carro) {
        this.carro = carro;
    }

    /**
     * @return the dias
     */
    public int getDias() {
        return dias;
    }

    /**
     * @param dias the dias to set
     */
    public void setDias(int dias) {
        this.dias = dias;
    }

    /**
     * @return the cnh
     */
    
}
