/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demolambda;

/**
 *
 * @author Datasoft
 */
public class Persona {
    private String nombre;    
    private String apellido;    
    private String telefono;    
    private String domicilio;    
    private int edad;    
    private String celular;    
    private String profesion;

    public Persona() {
    }
   
    public Persona(String nombre, String apellido, String telefono, String domicilio, int edad, String celular, String profesion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.edad = edad;
        this.celular = celular;
        this.profesion = profesion;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profecion) {
        this.profesion = profecion;
    }
}
