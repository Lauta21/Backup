/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Muni.Controler;

import Poo.Muni.Dao.PostulanteDao;
import java.sql.Connection;
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
    
}
