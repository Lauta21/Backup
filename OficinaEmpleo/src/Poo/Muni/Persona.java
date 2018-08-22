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
public abstract class Persona {
     private String nombre;
     private String apellido;
     private Integer DNI;
     private String cuil_Cuit;
     private String sexo;
     private String direccion;
     private String distrito;
     private int telPrincipal;
     private int telAlternativo;
     private Date fechadeNacimiento;
     private String email;
     private int edad;
     
     public void Personas(){
         
     }
    public Persona(String nombre, String apellido, Integer DNI, String cuil_Cuit, String sexo, String direccion, String distrito, int telPrincipal, int telAlternativo, Date fechadeNacimiento, String email, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.cuil_Cuit = cuil_Cuit;
        this.sexo = sexo;
        this.direccion = direccion;
        this.distrito = distrito;
        this.telPrincipal = telPrincipal;
        this.telAlternativo = telAlternativo;
        this.fechadeNacimiento = fechadeNacimiento;
        this.email = email;
        this.edad = edad;
    }
    public void agregarpersona(){        
    }
    public void modificarPersona(){        
    }
    public void eliminarPerosna(){         
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
    public Integer getDNI() {
        return DNI;
    }
    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }
    public String getCuil_Cuit() {
        return cuil_Cuit;
    }
    public void setCuil_Cuit(String cuil_Cuit) {
        this.cuil_Cuit = cuil_Cuit;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDistrito() {
        return distrito;
    }
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    public int getTelPrincipal() {
        return telPrincipal;
    }
    public void setTelPrincipal(int telPrincipal) {
        this.telPrincipal = telPrincipal;
    }
    public int getTelAlternativo() {
        return telAlternativo;
    }
    public void setTelAlternativo(int telAlternativo) {
        this.telAlternativo = telAlternativo;
    }
    public Date getFechadeNacimiento() {
        return fechadeNacimiento;
    }
    public void setFechadeNacimiento(Date fechadeNacimiento) {
        this.fechadeNacimiento = fechadeNacimiento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
     
}
