/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Muni.Controler;

import Poo.Muni.Dao.UsuarioDao;
import Poo.Muni.Usuario;
import Poo.Muni.ui.LoginUsuario;
import java.sql.Connection;
import org.hibernate.SessionFactory;
import poo.muni.ui.AltaUsuario;

/**
 *
 * @author Capacitacion3
 */
public class GestorOficinaEmpleo {
     
    private final UsuarioDao usuarioDao;
    public GestorOficinaEmpleo(SessionFactory sessionFactory,Connection connection){
        this.usuarioDao = new UsuarioDao(sessionFactory,connection);
      
       
        
    }
    public void run(){
        new AltaUsuario(this).setVisible(true);
        new LoginUsuario().setVisible(true);

    }
    
    public void GuardarUsuario(String nombre,String apellido,String contraseña,String nombreUsuario,String mail){
        Usuario usuario = new Usuario(nombre,apellido,contraseña,nombreUsuario,mail);
        usuarioDao.GuardarUsuario(usuario);
        
    }
    
    public boolean isUsuarioExistente(String nombreUsuario){
        return usuarioDao.isUsuarioExitente(nombreUsuario);
    }
    
  
}
