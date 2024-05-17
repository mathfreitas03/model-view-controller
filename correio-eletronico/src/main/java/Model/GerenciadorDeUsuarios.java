/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mathe
 */
public class GerenciadorDeUsuarios {
    private static GerenciadorDeUsuarios instance;
    private List<Usuario> usuarios;
    
    private GerenciadorDeUsuarios() {
        usuarios = new ArrayList<>();
    }
    
    public static GerenciadorDeUsuarios getInstance() {
        if (instance == null) {
            instance = new GerenciadorDeUsuarios();
        }
        return instance;
    }
    
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public  List<Usuario> getUsuarios() {
        return new ArrayList<>(usuarios); // Retorna uma cópia da lista para evitar modificações externas
    }
}
