/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.GerenciadorDeUsuarios;
import Model.Usuario;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author mathe
 */
public class LoginController {
    public static boolean autenticarUsuario(String userName, String userEmail,String senha){
        Usuario u = new Usuario(userName, userEmail, senha);
        List<Usuario> usuarios = GerenciadorDeUsuarios.getInstance().getUsuarios();
        
            for(Usuario usuario : usuarios){
                if((u.getNome().equals(usuario.getNome()) || u.getEmail().equals(usuario.getEmail())) && (u.getSenha().equals(usuario.getSenha()))){
                    return true;
                }
            }
        return false;
    }
    
    public static boolean cadastrarUsuario(){
        
        return false;
    }
    
    public static String readFromJTextField(JTextField field){
        return field.getText();
    }
}
