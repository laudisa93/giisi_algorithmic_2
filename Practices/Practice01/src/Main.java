
import edi.io.IO;
import java.util.*;
import jss2.*;

public class Main {

    public static void main(String[] args) {
        /*
         * E2
         */
        OrderedListADT<Integer> X = new ArrayOrderedList<Integer>();
        X.add(new Integer(4));
        X.add(new Integer(7));
        System.out.println(X.toString());

        Object Y = X.first();
        System.out.println("Y = " + Y.toString() + "\n");

        X.add(new Integer(3));
        X.add(new Integer(2));
        X.add(new Integer(5));
        System.out.println(X.toString());

        Y = X.removeLast();
        System.out.println("Y = " + Y.toString() + "\n");
        //Y = X.remove(new Integer(7)); No se puede porque ya se ha borrado el 7

        X.add(new Integer(9));
        System.out.println(X.toString());

        /*
         * E3
         */
        Object a = X.last();
        System.out.println("a = " + a);
        Object z = X.contains(new Integer(3));
        System.out.println("z = " + z);
        Object b = X.first();
        System.out.println("b = " + b);
        Y = X.remove(new Integer(2));
        System.out.println("Y = " + Y);
        Object c = X.first();
        System.out.println("c = " + c + "\n");

        /*
         * E4
         */

        X.add(new Integer(7));
        X.add(new Integer(2));
        System.out.println(X.toString());

        System.out.println("¿Está vacía? " + X.isEmpty());
        System.out.println("Tamaño: " + X.size());
        System.out.println("¿Contiene valor 10?: " + X.contains(new Integer(10)));

        UnorderedListADT<Integer> W = new ArrayUnorderedList<Integer>();
        W.addToFront(new Integer(5));
        W.addToFront(new Integer(4));
        W.addToFront(new Integer(3));
        W.addToFront(new Integer(2));
        W.addToFront(new Integer(1));
        System.out.println("\nLista W: \n" + W.toString());

        W.addToRear(6);
        System.out.println("\nLista W: \n" + W.toString());

        W.addAfter(7, 1);
        System.out.println("\nLista W: \n" + W.toString());

        System.out.println("Último valor: " + W.last());

        /*
         * E5
         */

        W.addAfter(10, W.size() / 2 - 1);
        System.out.println("\nLista W: \n" + W.toString());

        /*
         * EJ1
         */
        System.out.println("\nJOSEFO:");
        UnorderedListADT<Integer> Josefo = new ArrayUnorderedList<Integer>();

        Josefo.addToRear(1);
        Josefo.addToRear(2);
        Josefo.addToRear(3);
        Josefo.addToRear(4);
        Josefo.addToRear(5);

        System.out.println("Lista Josefo: \n" + Josefo.toString());

        int salto = 3;

        while (!Josefo.isEmpty()) {
            int i;
            for (i = 0; i < salto; i++) {
                Josefo.addToRear(Josefo.removeFirst());
            }
            Josefo.removeFirst();
            System.out.println(Josefo);
        }


        /*
         * P1. Dadas dos listas no ordenadas, l1 y l2, escriba un método
         * estático denominado intercambia tal que los elementos repetidos de l1
         * y que no estén en l2 se copien en l2 y se borren de l1 (sólo se
         * borrará un elemento, esto es, en caso de que hubiera tres elementos
         * iguales en l1, al final de la ejecución deberían quedar 2). Por
         * ejemplo, si las listas están inicializadas como: l1 =
         * {1,2,3,3,4,2,1,5,4} y l2 = {1,3,1} Al terminar la ejecución, deberían
         * quedar como: l1 = {1,3,3,2,1,5,4} y l2 = {1,3,1,2,4}
         */

        UnorderedListADT<Integer> l1 = new ArrayUnorderedList<Integer>();
        l1.addToFront(4);
        l1.addToFront(5);
        l1.addToFront(1);
        l1.addToFront(2);
        l1.addToFront(4);
        l1.addToFront(3);
        l1.addToFront(3);
        l1.addToFront(2);
        l1.addToFront(1);
        UnorderedListADT<Integer> l2 = new ArrayUnorderedList<Integer>();
        l2.addToFront(1);
        l2.addToFront(3);
        l2.addToFront(1);
        System.out.println("l1: \n" + l1.toString());
        System.out.println("l2: \n" + l2.toString());

        intercambia(l1, l2);

        System.out.println("l1: \n" + l1.toString());
        System.out.println("l2: \n" + l2.toString());

        /*
         * P2. Escriba rutinas union e interseccion que devuelvan la unión e
         * intersección de dos listas enlazadas. Asuma que las listas de entrada
         * están ordenadas.
         */

        OrderedListADT lista1 = new ArrayOrderedList<Integer>();
        lista1.add(1);
        lista1.add(3);
        lista1.add(5);
        lista1.add(7);
        lista1.add(6);
        lista1.add(8);
        lista1.add(7);
        System.out.println("Lista1:\n" + lista1.toString());

        OrderedListADT lista2 = new ArrayOrderedList<Integer>();
        lista2.add(7);
        lista2.add(3);
        lista2.add(2);
        lista2.add(4);
        lista2.add(4);
        lista2.add(9);
        System.out.println("Lista2:\n" + lista2.toString());

        OrderedListADT lUnion = union(lista1, lista2);
        System.out.println("Lista Union:\n" + lUnion.toString());

        OrderedListADT lIntereseccion = interseccion(lista1, lista2);
        System.out.println("Lista Intersección:\n" + lIntereseccion);

        /*
         * P3. Si el orden en el que se almacenan los elementos en una lista no
         * es importante, entonces podemos acelerar las búsquedas usando la
         * siguiente heurística, conocida como mover-al-frente: siempre que
         * acceda a un elemento, muévalo al principio de la lista. La razón por
         * la que esto constituye una mejora es que los elementos a los que se
         * accede frecuentemente tienden a migrar hacia el principio de la
         * lista. En consecuencia, los elementos más frecuentemente accedidos
         * requerirán una búsqueda más breve. Implemente la heurística
         * mover-al-frente para listas enlazadas.
         */

        UnorderedListADT lista = new ArrayUnorderedList();
        lista.addToFront(6);
        lista.addToFront(2);
        lista.addToFront(4);
        lista.addToFront(8);
        lista.addToFront(5);
        System.out.println("Lista:\n" + lista.toString());
        boolean existe = false;
        while (!existe) {
            System.out.println("Acceda a un elemento de la lista: ");
            int num = new Integer(IO.readLine());
            if (lista.contains(num)) {
                moverAlFrente(num, lista);
                existe=true;
            } 
        }
        System.out.println("Lista movida:\n" + lista);
    }

    public static void intercambia(UnorderedListADT lista1, UnorderedListADT lista2) {
        Iterator<Integer> it = lista1.iterator();
        int[] aux = {0, 0, 0, 0, 0};
        int i;
        for (i = 0; i < 5; i++) {
            if (lista1.contains(i + 1)) {
                aux[i] += 1;
            }
        }

        while (it.hasNext()) {
            int num = it.next();
            if (!lista2.contains(num) && aux[num - 1] > 1) {
                lista2.addToRear(lista1.remove(num));
            }
        }
    }

    public static OrderedListADT union(OrderedListADT l1, OrderedListADT l2) {
        OrderedListADT res = new ArrayOrderedList<Integer>();
        Iterator<Integer> it1 = l1.iterator();
        Iterator<Integer> it2 = l2.iterator();
        while (it1.hasNext()) {
            res.add(it1.next());
        }
        while (it2.hasNext()) {
            res.add(it2.next());
        }
        return res;
    }

    public static OrderedListADT interseccion(OrderedListADT l1, OrderedListADT l2) {
        OrderedListADT res = new ArrayOrderedList<Integer>();
        Iterator<Integer> it1 = l1.iterator();
        Iterator<Integer> it2 = l2.iterator();
        while (it1.hasNext()) { //problema si hay elementos repetidos
            int aux = it1.next();
            if (l2.contains(aux)) {
                res.add(aux);
                l2.remove(aux);
            }
        }
        return res;
    }

    public static UnorderedListADT moverAlFrente(Object o, UnorderedListADT list) {
        list.addToFront(list.remove(o));
        return list;
    }
}
