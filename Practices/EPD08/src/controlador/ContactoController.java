
package controlador;

import java.util.List;
import modelo.ContactoModel;
import vista.ContactoView;


public interface ContactoController {

    void setUp(ContactoModel model, List<ContactoView> views);
    void start();

    ContactoModel getModel();
    void setModel(ContactoModel model);

    void addView(ContactoView view);
    void removeView(ContactoView view);

    void nuevoContactoGesture(String nombre,String tlf,String email);
    void actualizaContactoGesture(String nombre, String tlf, String email);
    void borraContactoGesture(String nombre);
   
    void fireDataModelChanged();
}
