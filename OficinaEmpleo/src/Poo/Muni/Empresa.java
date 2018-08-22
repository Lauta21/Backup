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
    private TipoActividad tipoActividad;
    private String razonSocial;
    private String representanteLegal;
    private String sede;
    private int cantidadTrabajadores;
    private Date fechaContacto;
    private String tipoContacto;

    public Empresa() {
        super(null, null, null, null, null, null, null, 0, 0, null, null, 0);
    }

    public Empresa(TipoActividad tipoActividad, String razonSocial, String representanteLegal, String sede, int cantidadTrabajadores, Date fechaContacto, String tipoContacto, String nombre, String apellido, Integer DNI, String cuil_Cuit, String sexo, String direccion, String distrito, int telPrincipal, int telAlternativo, Date fechadeNacimiento, String email, int edad) {
        super(nombre, apellido, DNI, cuil_Cuit, sexo, direccion, distrito, telPrincipal, telAlternativo, fechadeNacimiento, email, edad);
        this.tipoActividad = tipoActividad;
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
    public TipoActividad getTipoActividad() {
        return tipoActividad;
    }
    public void setTipoActividad(TipoActividad tipoActividad) {
        this.tipoActividad = tipoActividad;
    }
    public String getRazonSocial() {
        return razonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getRepresentanteLegal() {
        return representanteLegal;
    }
    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }
    public String getSede() {
        return sede;
    }
    public void setSede(String sede) {
        this.sede = sede;
    }
    public int getCantidadTrabajadores() {
        return cantidadTrabajadores;
    }
    public void setCantidadTrabajadores(int cantidadTrabajadores) {
        this.cantidadTrabajadores = cantidadTrabajadores;
    }
    public Date getFechaContacto() {
        return fechaContacto;
    }
    public void setFechaContacto(Date fechaContacto) {
        this.fechaContacto = fechaContacto;
    }
    public String getTipoContacto() {
        return tipoContacto;
    }
    public void setTipoContacto(String tipoContacto) {
        this.tipoContacto = tipoContacto;
    }   
}
    

