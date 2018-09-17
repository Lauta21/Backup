/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Muni.Dao;

import java.sql.Connection;
import org.hibernate.SessionFactory;

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


    
}
