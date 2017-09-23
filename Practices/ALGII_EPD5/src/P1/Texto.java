/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

import java.util.ArrayList;
import java.util.List;


public class Texto {
    List texto = new ArrayList<Linea>();

    public Texto() {
        
    }

    public List getTexto() {
        return texto;
    }

    public void setTexto(List texto) {
        this.texto = texto;
    }

    public void add(Linea l){
        texto.add(l);
    }

    @Override
    public String toString() {
        return "Texto: \n" + texto.toString();
    }
    
}
