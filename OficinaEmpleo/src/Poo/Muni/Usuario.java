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
public class Usuario {
    private String nombreUsuario;
    private String contraseña;
    private String nombre;
    private String apellido;
    private Date fecha;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String contraseña, String nombre, String apellido, Date fecha) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
    }
    
    public void IniciarSesion(){    
    }
    public void Registrarse(){
    }
    public void CerrarSesion(){
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }   
}
