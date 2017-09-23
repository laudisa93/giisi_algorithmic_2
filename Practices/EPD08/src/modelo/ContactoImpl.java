package modelo;

public class ContactoImpl implements Contacto {

    private String nombre;
    private String tlf;
    private String email;

    public ContactoImpl(String nombre, String tlf, String email) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.email = email;
    }

    public ContactoImpl(String nombre) {
        this(nombre,null,null);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contacto: " + nombre + "\nTeléfono: " + tlf + "\nEmail: " + email;
    }


}
