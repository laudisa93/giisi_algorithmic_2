
package vista;

import controlador.ContactoController;
import modelo.ContactoModel;


public interface ContactoView {

    ContactoModel getModel();
    void setModel(ContactoModel modelo);

    ContactoController getController();
    void setController(ContactoController controller);

    void dataModelChanged();
    void display();
}
