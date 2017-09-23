package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Contacto;
import modelo.ContactoImpl;
import modelo.ContactoModel;
import vista.ContactoView;

public class ContactoControllerImpl implements ContactoController {

    ContactoModel model;
    List<ContactoView> views;

    public ContactoControllerImpl() {
        views = new ArrayList<ContactoView>();
    }


    public ContactoModel getModel() {
        return model;
    }

    public void setModel(ContactoModel model) {
        this.model = model;
    }

    public void addView(ContactoView view) {
        this.views.add(view);
        view.setController(this);
    }

    public void removeView(ContactoView view) {
        this.views.remove(view);
    }

    public void nuevoContactoGesture(String nombre, String tlf, String email) {
        Contacto contacto = new ContactoImpl(nombre, tlf, email);
        this.model.nuevoContacto(contacto);
    }

    public void actualizaContactoGesture(String nombre, String tlf, String email) {
        Contacto contacto = new ContactoImpl(nombre, tlf, email);
        this.model.actualizarContacto(contacto);
    }

    public void borraContactoGesture(String nombre) {
        Contacto contacto = new ContactoImpl(nombre);
        this.model.eliminarContacto(contacto);
    }

    public void fireDataModelChanged() {
        for(ContactoView v: this.views){
            v.dataModelChanged();
        }
    }

    public void setUp(ContactoModel model, List<ContactoView> views) {
        this.setModel(model);
        this.addViews(views);
        this.model.setController(this);
    }

    private void addViews(List<ContactoView> views){
        for(ContactoView v: this.views){
            this.addView(v);
        }

    }
    public void start() {
        for(ContactoView v: this.views){
            v.display();
        }
    }
}
