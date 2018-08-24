/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Muni.Controler;
 import Poo.Muni.Controler.GestorOficinaEmpleo;
import Poo.Muni.Usuario;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
 
/**
 *
 * @author Capacitacion3
 */
public class ProyectoMuni {
     private static SessionFactory factory; 


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
             factory = new AnnotationConfiguration().configure().addAnnotatedClass(Usuario.class).buildSessionFactory();               
        } catch (Throwable ex) {
             System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex);
        }
        new GestorOficinaEmpleo(factory).run();
    }
     
}
