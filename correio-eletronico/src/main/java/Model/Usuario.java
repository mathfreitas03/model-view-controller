/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class Usuario {
    private List<Email> listaDeEmails;
    private String nome;
    private String email;
    private String senha;
    
    public Usuario(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.listaDeEmails = new ArrayList<>();
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
}
