package P1;

import binaryTrees.BinarySearchTreeADT;
import binaryTrees.LinkedBinarySearchTree;
import java.util.Iterator;

public class P1 {

    public static void main(String[] args) {

        Linea l1 = new Linea("Hola Laura ", 1);
        Linea l2 = new Linea("Hola Dani ", 2);
        Linea l3 = new Linea("Eso no es una frase ", 3);
        Linea l4 = new Linea("Esto es Esparta ", 4);

        Texto texto = new Texto();
        texto.add(l1);
        texto.add(l2);
        texto.add(l3);
        texto.add(l4);

        System.out.println(texto.toString());

        BinarySearchTreeADT<Palabra> arbol = new LinkedBinarySearchTree<Palabra>();

        for (int i = 0; i < texto.getTexto().size(); i++) {
            Linea l = (Linea) texto.getTexto().get(i);
            String s = l.String();
            Character esp = ' ';
            String aux = "";
            for (int j = 0; j < s.length() - 1; j++) {
                if (!esp.equals(s.charAt(j))) {
                    aux += s.charAt(j);
                } else {
                    Palabra p = new Palabra(aux, l.getNumLinea(), 0);
                    arbol.addElement(p);
                    aux = "";
                }
            }
        }
        Iterator it = arbol.iteratorInOrder();
        System.out.println("\nArbol: ");
        while (it.hasNext()) {
            Palabra p = (Palabra) it.next();
            System.out.println(p.toString());

        }

        Iterator it1 = arbol.iteratorInOrder();
        
        while (it1.hasNext()) {
            Palabra p = (Palabra) it1.next();
            Iterator it2 = arbol.iteratorInOrder();
            while (it2.hasNext()) {
                Palabra p2 = (Palabra) it2.next();
                if (p.getPalabra().equalsIgnoreCase(p2.getPalabra())) {
                    p.setCont(p.getCont() + 1);
                }
            }
        }
            Iterator it3 = arbol.iteratorInOrder();
            System.out.println("\nArbol: ");
            while (it3.hasNext()) {
                Palabra p3 = (Palabra) it3.next();
                System.out.println(p3.toString());

            }
        }
    }
