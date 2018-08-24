/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Muni;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Capacitacion3
 */
@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue
    @Column(name = "id_usuario")
    private String id_usuario;
    @Column(name = "nombreUsusario")
    private String nombreUsuario;
    @Column(name = "contraseña")
    private String contraseña;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "fecha")
    private Date fechaActual;
    @Column(name = "email")
    private String mail;

    public Usuario() {
    }

    public Usuario(String nombre,String apellido,String contraseña,String nombreUsuario,String mail) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaActual = new Date();
        this.mail = mail;
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
        return fechaActual;
    }
    public void setFecha(Date fechaActual) {
        this.fechaActual = fechaActual;
    }
    public String getId_usuario(){
        return id_usuario;
    }
    public void setId_usuario(String id_usuario){
        this.id_usuario = id_usuario;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    
}
