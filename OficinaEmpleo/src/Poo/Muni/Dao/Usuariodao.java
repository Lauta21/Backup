/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Muni.Dao;

import Poo.Muni.Usuario;
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
    
    public void GuardarUsusario(Usuario usuario){
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
        
    }
}
