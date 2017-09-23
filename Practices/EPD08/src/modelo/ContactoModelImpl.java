package modelo;

import controlador.ContactoController;
import java.util.List;
import modelo.persistencia.ContactoDAO;

public class ContactoModelImpl implements ContactoModel {

    private ContactoController controller;

    public ContactoController getController() {
        return controller;
    }

    public void setController(ContactoController controller) {
        this.controller = controller;
    }

    public void nuevoContacto(Contacto contacto) {
        ContactoDAO dao = obtenerImplementacionContactoDAO();
        dao.create(contacto);
        this.controller.fireDataModelChanged();
    }

    public void eliminarContacto(Contacto contacto) {
        ContactoDAO dao = obtenerImplementacionContactoDAO();
        dao.delete(contacto);
        this.controller.fireDataModelChanged();
    }

    public void actualizarContacto(Contacto contacto) {
        ContactoDAO dao = obtenerImplementacionContactoDAO();
        dao.update(contacto);
        this.controller.fireDataModelChanged();
    }

    public List<Contacto> obtenerContactos() {
        ContactoDAO dao = obtenerImplementacionContactoDAO();
        return dao.list();
    }

    public Contacto obtenerContacto(String nombre) {
        ContactoDAO dao = obtenerImplementacionContactoDAO();
        return dao.read(nombre);
    }

    private ContactoDAO obtenerImplementacionContactoDAO() {
        return new ContactoDAOJDBC();
    }
}
