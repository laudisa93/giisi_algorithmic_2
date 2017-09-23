
package modelo;

import controlador.ContactoController;
import java.util.List;

public interface ContactoModel {
    ContactoController getController();
    void setController(ContactoController controller);

    void nuevoContacto(Contacto contacto);
    void eliminarContacto(Contacto contacto);
    void actualizarContacto(Contacto contacto);

    List<Contacto> obtenerContactos();
    Contacto obtenerContacto(String nombre);
}
