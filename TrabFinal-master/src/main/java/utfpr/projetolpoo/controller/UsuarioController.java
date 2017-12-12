/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.controller;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import utfpr.projetolpoo.model.dao.GenericDAO;
import utfpr.projetolpoo.model.vo.Usuario;


/**
 *
 * @author User
 */
public class UsuarioController extends GenericDAO<Usuario>{

    private GenericDAO<Usuario> genericDao;
    
    public UsuarioController() {
        this.genericDao = new GenericDAO<>();
    }
    
    private boolean gravar(Usuario u){
        return this.genericDao.insert(u);
    }
    
    public boolean remover(Usuario u){
        return this.genericDao.remove(u);
    }
    
    public boolean altenticar(Usuario u){
   
        for(Usuario user : genericDao.listAll(Usuario.class)){
            if(user.getUser().equals(u.getUser()) &&
                    user.getSenha().equals(u.getSenha()))
                return true;
    }
        return false;
    }
    
    
    
    public boolean newUser(JTextField user, JTextField senha, JTextField senha2 ){
        for(Usuario u : genericDao.listAll(Usuario.class)){
            if(u.getUser().equals(user.getText())){
                JOptionPane.showMessageDialog(null, "Usuario ja existente, tente novamente!");
                return false;
            
            }  
    }    
    if(senha.getText().equals(senha2.getText()))
        return this.gravar(new Usuario(user.getText(), senha.getText()));
    JOptionPane.showMessageDialog(null, "Senhas diferentes");
        
    
        return false;
}
    
}