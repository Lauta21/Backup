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
@Table(name = "Persona")
public abstract class Persona {
    @Id
    @GeneratedValue
    @Column(name = "id_persona")
    private String id_persona;
    @Column(name = "Nombre")
     private String nombre;
    @Column(name = "Apellido")
     private String apellido;
    @Column(name = "DNI")
     private String DNI;
    @Column(name = "Cuil_Cuit")
     private String cuil_Cuit;
    @Column(name = "Sexo")
     private String sexo;
    @Column(name = "Direccion")
     private String direccion;
    @Column(name = "Distrito")
     private String distrito;
    @Column(name = "TelPrincipal")
     private String telPrincipal;
    @Column(name = "TelAlternativo")
     private String telAlternativo;
    @Column(name = "FechaNacimiento")
      Date fechadeNacimiento;
    @Column(name = "Email")
     private String email;
    @Column(name = "Edad")
     private String edad;

    public Persona() {
    }
    
    
    public Persona(String nombre, String apellido, String DNI, String cuil_Cuit, String sexo, String direccion, String distrito, String telPrincipal, String telAlternativo, Date fechadeNacimiento, String email, String edad) {
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
    
    public String getId_persona() {
        return id_persona;
    }
    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
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
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
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
    public String getTelPrincipal() {
        return telPrincipal;
    }
    public void setTelPrincipal(String telPrincipal) {
        this.telPrincipal = telPrincipal;
    }
    public String getTelAlternativo() {
        return telAlternativo;
    }
    public void setTelAlternativo(String telAlternativo) {
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
    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }     
}
