/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Muni;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * 
 * @author Capacitacion3
 */
@Entity
@Table(name = "Postulante")
@PrimaryKeyJoinColumn(name = "id_persona", referencedColumnName = "id_perosna")
public class Postulante extends Persona{
    @GeneratedValue
    @Column(name = "id_postulante")
    private long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_nivel_educacion")
    private NivelEducacion nivelEducacion;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_perfil")
    private Perfil perfil;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_programa")
    private Programa programa;
    @Column(name = "movilidad")
    private String movilidad;
    @Column(name = "dispHoraria")
    private String dispHoraria;
    @Column(name = "docAdicional")
    private String docAdicional;

    public Postulante() {
       
    }
    
    public Postulante(NivelEducacion nivelEducacion, Perfil perfil, Programa programa, String movilidad, String dispHoraria, String docAdicional, String nombre, String apellido, String DNI, String cuil_Cuit, String sexo, String direccion, String distrito, String telPrincipal, String telAlternativo, Date fechadeNacimiento, String email, String edad) {
        super(nombre, apellido, DNI, cuil_Cuit, sexo, direccion, distrito, telPrincipal, telAlternativo, fechadeNacimiento, email, edad);
        this.nivelEducacion = nivelEducacion;
        this.perfil = perfil;
        this.programa = programa;
        this.movilidad = movilidad;
        this.dispHoraria = dispHoraria;
        this.docAdicional = docAdicional;
    }
    
    
   
    public long getId_postulante() {
        return id;
    }
    public void setId_postulante(long id) {
        this.id = id;
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
