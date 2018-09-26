/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Muni.Controler;
import Poo.Muni.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

 
/**
 *
 * @author Capacitacion3
 */
public class ProyectoMuni {
     private static SessionFactory factory; 
      private static Connection connection;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
             factory = new AnnotationConfiguration().configure().addAnnotatedClass(Usuario.class).buildSessionFactory();     
              getConnection();
        } catch (Exception ex) {
             System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex);
        }
        new GestorOficinaEmpleo(factory,connection).run();
       
        
      
    }
    
    public static Connection getConnection() throws Exception{
        if(connection == null){
            String url = "jdbc:mysql://localhost:3306/oficinaempleo?zeroDateTimeBehavior=convertToNull"; 
            connection = DriverManager.getConnection(url,"root","root");
        }
        return connection;
            
    }
     
}
