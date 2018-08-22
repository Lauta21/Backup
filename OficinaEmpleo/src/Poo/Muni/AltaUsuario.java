/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni;

/**
 *
 * @author Capacitacion5
 */
public class AltaUsuario {
    
    private String Nombre;
    private String Apellido;
    private String NombreUsuario;
    private char[] Contraseña;
    private char[] CofirmarContraseña;
    private String Email;

    public AltaUsuario() {
    }

    public AltaUsuario(String Nombre, String Apellido, String NombreUsuario, char[] Contraseña, char[] CofirmarContraseña, String Email) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.NombreUsuario = NombreUsuario;
        this.Contraseña = Contraseña;
        this.CofirmarContraseña = CofirmarContraseña;
        this.Email = Email;
    }

    
    

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    public String getNombreUsuario() {
        return NombreUsuario;
    }
    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }
    public char[] getContraseña() {
        return Contraseña;
    }
    public void setContraseña(char[] contraseña){
        this.Contraseña = contraseña;
    }
    public char[] getCofirmarContraseña() {
        return CofirmarContraseña;
    }
    public void setCofirmarContraseña(char[] CofirmarContraseña) {
        this.CofirmarContraseña = CofirmarContraseña;   
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }   
}
