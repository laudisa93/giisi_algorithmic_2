
package modelo.persistencia;

import java.util.List;
import modelo.Contacto;

public interface ContactoDAO {
    Contacto read(String pk);
    void create (Contacto contacto);
    void update (Contacto contacto);
    void delete (Contacto contacto);
    List <Contacto> list ();
}
