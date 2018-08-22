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
public class Postulante extends Personas{
    private NivelEducacion nivelEducacion;
    private Perfil perfil;
    private Programa programa;
    private String movilidad;
    private String dispHoraria;
    private String docAdicional;

    public Postulante() {
        super(null, null, null, null, null, null, null, 0, 0, null, null, 0);
    }
    public Postulante(NivelEducacion nivelEducacion, Perfil perfil, Programa programa, String movilidad, String dispHoraria, String docAdicional, String nombre, String apellido, Integer DNI, String cuil_Cuit, String sexo, String direccion, String distrito, int telPrincipal, int telAlternativo, Date fechadeNacimiento, String email, int edad) {
        super(nombre, apellido, DNI, cuil_Cuit, sexo, direccion, distrito, telPrincipal, telAlternativo, fechadeNacimiento, email, edad);
        this.nivelEducacion = nivelEducacion;
        this.perfil = perfil;
        this.programa = programa;
        this.movilidad = movilidad;
        this.dispHoraria = dispHoraria;
        this.docAdicional = docAdicional;
    }
    public Postulante(String nombre, String apellido, Integer DNI, String cuil_Cuit, String sexo, String direccion, String distrito, int telPrincipal, int telAlternativo, Date fechadeNacimiento, String email, int edad) {
        super(nombre, apellido, DNI, cuil_Cuit, sexo, direccion, distrito, telPrincipal, telAlternativo, fechadeNacimiento, email, edad);
    }
    public NivelEducacion getNivelEducacion() {
        return nivelEducacion;
    }
    public void setNivelEducacion(NivelEducacion nivelEducacion) {
        this.nivelEducacion = nivelEducacion;
    }
    public Perfil getPerfil() {
        return perfil;
    }
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    public Programa getPrograma() {
        return programa;
    }
    public void setPrograma(Programa programa) {
        this.programa = programa;
    }
    public String getMovilidad() {
        return movilidad;
    }
    public void setMovilidad(String movilidad) {
        this.movilidad = movilidad;
    }
    public String getDispHoraria() {
        return dispHoraria;
    }
    public void setDispHoraria(String dispHoraria) {
        this.dispHoraria = dispHoraria;
    }
    public String getDocAdicional() {
        return docAdicional;
    }
    public void setDocAdicional(String docAdicional) {
        this.docAdicional = docAdicional;
    }  
}
