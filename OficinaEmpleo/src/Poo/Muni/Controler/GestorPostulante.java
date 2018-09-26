/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Muni.Controler;

import Poo.Muni.Dao.PostulanteDao;
import Poo.Muni.NivelEducacion;
import Poo.Muni.Perfil;
import Poo.Muni.Postulante;
import Poo.Muni.Programa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import org.hibernate.SessionFactory;

/**
 *
 * @author Capacitacion3
 */
public class GestorPostulante {
    private final PostulanteDao postulanteDao;

    public GestorPostulante(SessionFactory sessionFactory,Connection connection) {
        
       this.postulanteDao = new PostulanteDao(sessionFactory, connection);
    }
      public void GuardarPostulante(NivelEducacion nivelEducacion,Perfil perfil, Programa programa,String nombre,String apellido,String dni,String cuil_Cuit,String sexo,String direccion,String distrito,String telPrincipal,String telAlternativo,Date fechadeNacimiento,String email,String edad){
        Postulante postulante = new Postulante(nivelEducacion, perfil, programa, edad, distrito, direccion, nombre, apellido, dni, cuil_Cuit, sexo, direccion, distrito, telPrincipal, telAlternativo, fechadeNacimiento, email, edad);
        postulanteDao.GuardarPostulante(postulante);
    }
    
    public ArrayList<NivelEducacion> GetNivelEducacion(){
        NivelEducacion nivelEducacion;       
        ArrayList<NivelEducacion> nivelEducacionList = new ArrayList<NivelEducacion>();
        try{
           ResultSet rs = null;
           rs = postulanteDao.GetNivelEducacion();
        while (rs.next()) {            
         String nombre = rs.getString("nombre");
         String descripcion = rs.getString("descripcion");
         String id = rs.getString("id_nivel_educacion");
         long idInt = Long.parseLong(id);
         nivelEducacion = new NivelEducacion(nombre, descripcion, idInt);
         nivelEducacion.setNombre(nombre);
         nivelEducacion.setDescripcion(descripcion);
         nivelEducacion.setId(idInt);
         nivelEducacionList.add(nivelEducacion);
         return nivelEducacionList;
        }
        }catch(Exception e){
          if(e != null){
          }      
        }
        return nivelEducacionList;
    }       
}   

