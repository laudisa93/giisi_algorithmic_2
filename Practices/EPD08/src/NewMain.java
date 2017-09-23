
import controlador.ContactoController;
import controlador.ContactoControllerImpl;
import java.util.ArrayList;
import java.util.List;
import modelo.ContactoModel;
import modelo.ContactoModelImpl;
import vista.ContactoView;
import vista.ContactoViewImpl;


public class NewMain {

    
    public static void main(String[] args) {
        ContactoModel model = new ContactoModelImpl();

        ContactoView vista1 = new ContactoViewImpl();
        ContactoView vista2 = new ContactoViewImpl();
        List<ContactoView> views = new ArrayList<ContactoView>();
        views.add(vista1);
        views.add(vista2);

        ContactoController controller = new ContactoControllerImpl();

        controller.setUp(model, views);
        controller.start();
    }

}
