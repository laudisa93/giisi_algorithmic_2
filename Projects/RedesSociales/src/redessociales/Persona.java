/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package redessociales;

/**
 *
 * @author privado
 */
public class Persona {
    private String Nombre,apellidos,ciudad;

    public Persona(String Nombre, String apellidos, String ciudad) {
        this.Nombre = Nombre;
        this.apellidos = apellidos;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", apellidos=" + apellidos + ", ciudad=" + ciudad + '}';
    }
    
    
    
}
