/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Muni.Dao;

import Poo.Muni.Postulante;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Capacitacion3
 */
public class PostulanteDao {
    private final SessionFactory sessionFactory;
    private final Connection connection;

    public PostulanteDao(SessionFactory sessionFactory, Connection connection) {
        this.sessionFactory = sessionFactory;
        this.connection = connection;
    }
    
    public void GuardarPostulante(Postulante postulante){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        
        try {
            tx = session.beginTransaction();
            session.save(postulante);
            tx.commit();
            
        } catch (HibernateException e) {
            if(tx!=null) tx.rollback();
            e.printStackTrace();
        }
        finally{
            session.close();
        }
    }
    
    public ResultSet GetNivelEducacion(){
      
       ResultSet rs;
       try{
           Statement stmt = connection.createStatement();           
            rs = stmt.executeQuery("SELECT * FROM NivelEducacion");
            connection.close();
            return rs;
       }catch(Exception e){
           System.err.println("Got an exceptiob");
           System.err.println(e.getMessage());
       }
        return null;
    }

    
}
