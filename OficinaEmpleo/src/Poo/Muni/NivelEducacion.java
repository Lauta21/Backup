/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Muni;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 *
 * @author Capacitacion3
 */
@Entity
@Table(name = "NivelEducacion")
public class NivelEducacion implements Serializable {
    @Id 
    @Column(name = "id_nivel_educacion")
   
    private String nombre;
    private String descripcion;
    private long id;

    public NivelEducacion() {
    }
    public NivelEducacion(String nombre, String descripcion,long id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    } 
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    
}
