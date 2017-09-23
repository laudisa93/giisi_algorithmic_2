
import binaryTrees.LinkedBinaryTree;
import java.util.*;
import jss2.*;

public class Main {

    public static void main(String[] args) {
        String texto = "Una niña recibe de su madre el encargo de llevar una cesta a su abuela enferma que vive "
                + "en el bosque, advirtiéndole que no hable con desconocidos. Pero por el camino se encuentra un "
                + "lobo y se para a hablar con él, dándole detalles de lo que va a hacer.";

        binaryTrees.UnorderedListADT<Caracter> listaCaracteres = new binaryTrees.ArrayUnorderedList<>();

        //texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            Character c = texto.charAt(i);
            Caracter car = new Caracter(c);


            Iterator it = listaCaracteres.iterator();
            boolean encontrado = false;
            while (it.hasNext() && !encontrado) {
                Caracter cIt = (Caracter) it.next();
                if (c.equals(cIt.getCaracter())) { //preguntar
                    cIt.addApariciones();
                    encontrado = true;
                }
            }
            if (encontrado == false) {
                listaCaracteres.addToRear(car);
            }
        }


        jss2.OrderedListADT<Caracter> listaOrdenada = new ArrayOrderedList();
        Iterator it2 = listaCaracteres.iterator();
        while (it2.hasNext()) {
            Caracter cAux = (Caracter) it2.next();
            listaOrdenada.add(cAux);

        }


        System.out.println(listaCaracteres.toString());
        System.out.println(listaOrdenada.toString());

        Huffman huff = new Huffman();
        LinkedBinaryTree arbolH;
        arbolH = huff.crearArbolHuffman(listaOrdenada);
        
        Iterator itH = arbolH.iteratorLevelOrder();
        while (itH.hasNext()) {
            Object object = itH.next();
            System.out.println(object);
        }
        
        

    }
}
