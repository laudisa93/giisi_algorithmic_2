package epd7;

import binaryTrees.*;
import java.util.Iterator;
import poo.io.IO;

public class Main {

    public static void main(String[] args) {

        //Introducimos el texto con toda la puntuación.

        System.out.println("Introduzca texto: ");
        String texto = "";
        texto = IO.readLine();
        System.out.println("Texto: " + texto);

        //Separamos el texto en palabras y la vamos introduciendo en el árbol:
        BinarySearchTreeADT<String> arbol = new LinkedBinarySearchTree<String>();
        String aux = "";
        for (int i = 0; i < texto.length(); i++) {
            Character c = texto.charAt(i);
            if (Character.isLetter(c)) {
                aux +=c.toString();
                if(i==texto.length()-1){
                    arbol.addElement(aux.toLowerCase());
                }
            } else {
                if(!aux.equals("")){
                    arbol.addElement(aux.toLowerCase());
                    aux="";
                }
            }
        }

        //Imprimimos los elementos del árbol en orden alfabético
        Iterator it = arbol.iteratorInOrder();
        System.out.println("Árbol InOrder:");
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s.toString());

        }

        //Procedemos a contar el número de veces que se repite la palabra:
        //Nos auxiliamos de otro árbol donde se guardarán las palabras sin repeticiones
        BinarySearchTreeADT arbolAux = new LinkedBinarySearchTree();
        int cont = 0;
        Iterator it2 = arbol.iteratorInOrder();
        while (it2.hasNext()) {
            String s = (String) it2.next();
            if (!arbolAux.contains(s)) {
                arbolAux.addElement(s);
                Iterator it3 = arbol.iteratorInOrder();
                while (it3.hasNext()) {
                    String aux3 = (String) it3.next();
                    if (s.equalsIgnoreCase(aux3)) {
                        cont++;
                    }
                }
                System.out.println("La palabra " + s + " está " + cont + " veces");
                cont = 0;
            }
        }


    }
}
