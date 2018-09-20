/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Muni.Controler;

import Poo.Muni.Dao.PostulanteDao;
import Poo.Muni.Dao.UsuarioDao;
import Poo.Muni.NivelEducacion;
import Poo.Muni.Perfil;
import Poo.Muni.Postulante;
import Poo.Muni.Programa;
import Poo.Muni.Usuario;
import Poo.Muni.ui.LoginUsuario;
import java.sql.Connection;
import java.util.Date;
import org.hibernate.SessionFactory;

/**
 *
 * @author Capacitacion3
 */
public class GestorOficinaEmpleo {
     
    private final UsuarioDao usuarioDao;
    private final PostulanteDao postulanteDao;
    public GestorOficinaEmpleo(SessionFactory sessionFactory,Connection connection){
        this.usuarioDao = new UsuarioDao(sessionFactory,connection);
        this.postulanteDao = new PostulanteDao(sessionFactory, connection);
    } 
      
        
    
    public void run(){
        new LoginUsuario(this).setVisible(true);

    }
    
    public void GuardarUsuario(String nombre,String apellido,String contraseña,String nombreUsuario,String mail){
        Usuario usuario = new Usuario(nombre,apellido,contraseña,nombreUsuario,mail);
        usuarioDao.GuardarUsuario(usuario);    
    }
    
    public void GuardarPostulante(NivelEducacion nivelEducacion,Perfil perfil, Programa programa,String nombre,String apellido,String dni,String cuil_Cuit,String sexo,String direccion,String distrito,String telPrincipal,String telAlternativo,Date fechadeNacimiento,String email,String edad){
        Postulante postulante = new Postulante(nivelEducacion, perfil, programa, edad, distrito, direccion, nombre, apellido, dni, cuil_Cuit, sexo, direccion, distrito, telPrincipal, telAlternativo, fechadeNacimiento, email, edad);
        postulanteDao.GuardarPostulante(postulante);
    }
    
    public boolean isUsuarioExistente(String nombreUsuario){
        return usuarioDao.isUsuarioExitente(nombreUsuario);
    }
    
    public boolean Login(String nombreUsuario,String contraseña){
        return usuarioDao.Login(nombreUsuario, contraseña);
    }

}
