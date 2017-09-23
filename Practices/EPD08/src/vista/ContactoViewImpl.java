
package vista;

import controlador.ContactoController;
import modelo.ContactoModel;


public class ContactoViewImpl implements ContactoView{

    ContactoModel model;
    ContactoController controller;

    public ContactoModel getModel() {
        return model;
    }

    public void setModel(ContactoModel modelo) {
        this.model= model;
    }

    public ContactoController getController() {
        return controller;
    }

    public void setController(ContactoController controller) {
        this.controller= controller;
    }

    public void dataModelChanged() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void display() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
