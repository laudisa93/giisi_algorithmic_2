
import binaryTrees.*;
import java.util.Iterator;

public class EJ1 {

    public static void main(String[] args) {

        BinarySearchTreeADT arbol = new LinkedBinarySearchTree<String>();
        arbol.addElement("Hola");
        arbol.addElement("me");
        arbol.addElement("llamo");
        arbol.addElement("Pablo");
        arbol.addElement("Hola");
        arbol.addElement("me");
        arbol.addElement("llamo");
        arbol.addElement("María");

        //System.out.println(arbol.toString());

        Iterator it = arbol.iteratorInOrder();
        
        int cont = 0;
        while (it.hasNext()) {
            String aux = (String) it.next();
            Iterator it2 = arbol.iteratorInOrder();
            while (it2.hasNext()) {
                if (aux.equalsIgnoreCase((String) it2.next())) {
                    cont++;
                }
            }
            System.out.println("La palabra " + aux + " se repite " + cont + " veces");
            cont=0;
        }



    }
}
