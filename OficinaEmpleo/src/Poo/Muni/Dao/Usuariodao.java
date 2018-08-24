/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Muni.Dao;

import org.hibernate.SessionFactory;

/**
 *
 * @author Capacitacion3
 */
public class UsuarioDao {
    private final SessionFactory sessionFactory;
    
    public UsuarioDao(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
}
