/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Muni.Dao;

import Poo.Muni.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class UsuarioDao {
    private final SessionFactory sessionFactory;
    
    public UsuarioDao(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    public void GuardarUsuario(Usuario usuario){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        
        try {
            tx = session.beginTransaction();
            session.save(usuario);
            tx.commit();
            
        } catch (HibernateException e) {
            if(tx!=null) tx.rollback();
            e.printStackTrace();
        }
        finally{
            session.close();
        }
    }
    
    public boolean isUsuarioExitente(String nombreUsuario){
        try {
            String url = "";
            Connection conn = DriverManager.getConnection(url, "root", "root");
            Statement stmt = conn.createStatement();
            ResultSet rs;
            
            rs = stmt.executeQuery("SELECT nombreUsuario FROM usuario WHERE nombreUsuario = '"+nombreUsuario+"'");
            while (rs.next()) {
             String lastName = rs.getString("nombreUsuario");
             if(lastName.equals(nombreUsuario)){
                 return false;
                }
            }
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return true;
    }
}
