/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Muni.Controler;

import org.hibernate.SessionFactory;
import poo.muni.ui.AltaUsuario;

/**
 *
 * @author Capacitacion3
 */
public class GestorOficinaEmpleo {
     
    public GestorOficinaEmpleo(SessionFactory sessionFactory){
        
    }
    public void run(){
        new AltaUsuario().setVisible(true);
    }
}
