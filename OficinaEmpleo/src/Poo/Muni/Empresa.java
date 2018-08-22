/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Muni;

import java.util.Date;

/**
 *
 * @author Capacitacion3
 */
public class Empresa extends Personas{
    public TipoActividad TipoActividad;
    public String razonSocial;
    public String representanteLegal;
    public String sede;
    public int cantidadTrabajadores;
    public Date fechaContacto;
    public String tipoContacto;

    public Empresa() {
        super(null, null, null, null, null, null, null, 0, 0, null, null, 0);
    }

    public Empresa(String razonSocial, String representanteLegal, String sede, int cantidadTrabajadores, Date fechaContacto, String tipoContacto, String nombre, String apellido, Integer DNI, String cuil_Cuit, String sexo, String direccion, String distrito, int telPrincipal, int telAlternativo, Date fechadeNacimiento, String email, int edad) {
        super(nombre, apellido, DNI, cuil_Cuit, sexo, direccion, distrito, telPrincipal, telAlternativo, fechadeNacimiento, email, edad);
        this.razonSocial = razonSocial;
        this.representanteLegal = representanteLegal;
        this.sede = sede;
        this.cantidadTrabajadores = cantidadTrabajadores;
        this.fechaContacto = fechaContacto;
        this.tipoContacto = tipoContacto;
    }
     
    

    public Empresa(String nombre, String apellido, Integer DNI, String cuil_Cuit, String sexo, String direccion, String distrito, int telPrincipal, int telAlternativo, Date fechadeNacimiento, String email, int edad) {
        super(nombre, apellido, DNI, cuil_Cuit, sexo, direccion, distrito, telPrincipal, telAlternativo, fechadeNacimiento, email, edad);
    }
    
   
}
    

