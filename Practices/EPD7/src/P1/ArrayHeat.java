/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

import binaryTrees.ArrayUnorderedList;
import heap.HeapADT;
import java.util.Iterator;

/**
 *
 * @author David
 */
public class ArrayHeat<T> implements HeapADT<T> {
    private static final int MAXTAM = 100;
    private Object[] monticulo;
    private int tamaño;

    public ArrayHeat() {
        monticulo = new Object[MAXTAM];
        tamaño = 0;
    }

    @Override
    public void addElement(T element) {
        int i;
        Comparable<T> compelement = (Comparable<T>) element;
        if(element != null) {
            if(isEmpty()) {
                monticulo[0] = null;
                monticulo[1] = element;
                tamaño = 2;
            } else {
                if(element != null) {
                    monticulo[size()] = element;
                    tamaño++;
                    rotarArriba(compelement, size() - 1);
                }
            }
        }

    }

    private void rotarArriba(Comparable<T> nodo, int pos) {
        if(pos > 1 && nodo.compareTo((T) monticulo[pos / 2]) <= 0) {
            T padre = (T) monticulo[pos / 2];
            monticulo[pos / 2] = monticulo[pos];
            monticulo[pos] = padre;
            rotarArriba(nodo, pos / 2);
        }
    }

    @Override
    public T removeMin() {
        T aux = (T) monticulo[1];
        monticulo[1] = monticulo[size() - 1];
        monticulo[size() - 1] = null;
        Comparable<T> raiz = (Comparable<T>) monticulo[1];
        rotarAbajo(raiz, 1);
        return aux;
    }

    private void rotarAbajo(Comparable<T> nodo, int pos) {
        if(pos * 2 + 1 < size() && !isEmpty()) {
            
            if(monticulo[pos * 2 + 1] != null && monticulo[pos * 2] != null) {
                int cIzq = nodo.compareTo((T) monticulo[pos * 2]);
                int cDer = nodo.compareTo((T) monticulo[pos * 2 + 1]);
                if(cDer > 0 && cIzq > 0) {
                    Comparable<T> der = (Comparable<T>) monticulo[pos * 2 + 1];
                    if(der.compareTo((T) monticulo[pos * 2]) > 0) {
                        T aux = (T) monticulo[pos];
                        monticulo[pos] = monticulo[pos * 2];
                        monticulo[pos * 2] = aux;
                        rotarAbajo(nodo, pos * 2);
                    } else {
                        T aux = (T) monticulo[pos];
                        monticulo[pos] = monticulo[pos * 2 + 1];
                        monticulo[pos * 2 + 1] = aux;
                        rotarAbajo(nodo, pos * 2 + 1);
                    }
                } else if(cIzq > 0) {
                    T aux = (T) monticulo[pos];
                    monticulo[pos] = monticulo[pos * 2];
                    monticulo[pos * 2] = aux;
                    rotarAbajo(nodo, pos * 2);
                } else if(cDer > 0) {
                    T aux = (T) monticulo[pos];
                    monticulo[pos] = monticulo[pos * 2 + 1];
                    monticulo[pos * 2 + 1] = aux;
                    rotarAbajo(nodo, pos * 2 + 1);
                }
                
            } else if(monticulo[pos * 2 + 1] == null && monticulo[pos * 2] != null) {
                if(nodo.compareTo((T) monticulo[pos * 2]) > 0) {
                    T aux = (T) monticulo[pos];
                    monticulo[pos] = monticulo[pos * 2];
                    monticulo[pos * 2] = aux;
                    rotarAbajo(nodo, pos * 2);
                }
                
            } else if(monticulo[pos * 2 + 1] != null && monticulo[pos * 2] == null) {
                T aux = (T) monticulo[pos];
                monticulo[pos] = monticulo[pos * 2 + 1];
                monticulo[pos * 2 + 1] = aux;
                rotarAbajo(nodo, pos * 2 + 1);
            }
        }
    }

    @Override
    public void removeLeftSubtree() {
        if(!isEmpty() && monticulo[2] != null) {
            int i = 2, j = i;
            monticulo[i] = null;
            boolean enc = false;
            i = 2 * j;
            while(i < size() && enc == false) {
                if(monticulo[i] != null) {
                    monticulo[i] = null;
                    i = 2 * i;
                } else {
                    enc = true;
                }
            }
            enc = false;
            i = 2 * j + 1;
            while(i < size() && enc == false) {
                if(monticulo[i] != null) {
                    monticulo[i] = null;
                    i = 2 * i + 1;
                } else {
                    enc = true;
                }

            }
            i = size() - 1;
            while(i >= 1 && monticulo[i] == null) {
                tamaño--;
                i--;
            }
        }
    }

    @Override
    public void removeRightSubtree() {
        if(!isEmpty() && monticulo[3] != null) {
            int i = 3, j = i;
            monticulo[i] = null;
            boolean enc = false;
            i = 2 * j;
            while(i < size() && enc == false) {
                if(monticulo[i] != null) {
                    monticulo[i] = null;
                    i = 2 * i;
                } else {
                    enc = true;
                }
            }
            enc = false;
            i = 2 * j + 1;
            while(i < size() && enc == false) {
                if(monticulo[i] != null) {
                    monticulo[i] = null;
                    i = 2 * i + 1;
                } else {
                    enc = true;
                }

            }
            i = size() - 1;
            while(i >= 1 && monticulo[i] == null) {
                tamaño--;
                i--;
            }
        }
    }

    @Override
    public void removeAllElements() {
        if(!isEmpty()) {
            for(int i = 1; i < size(); i++) {
                monticulo[i] = null;
            }
        }
        tamaño = 0;
    }

    @Override
    public boolean isEmpty() {
        return tamaño == 0;
    }

    @Override
    public int size() {
        return tamaño;
    }

    @Override
    public boolean contains(T element) {
        if(element == null) {
            return false;
        }
        if(!isEmpty()) {
            for(int i = 0; i < size(); i++) {
                if(element.equals(monticulo[i])) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @Override
    public T findMin() {
        if(isEmpty()) {
            return null;
        } else {
            return (T) monticulo[1];
        }
    }

    @Override
    public T find(T element) {
        T res = null;
        if(element != null) {
            if(!isEmpty()) {
                int i = 1;
                boolean enc = false;
                while(i < size() && enc == false) {
                    if(element.equals((T) monticulo[i])) {
                        enc = true;
                        res = (T) monticulo[i];
                    }
                    i++;
                }
            }
        }
        return res;
    }

    @Override
    public Iterator<T> iteratorInOrder() {
        if(!isEmpty()) {
            ArrayUnorderedList<T> lista = recorrerInOrden(monticulo, 1);
            return lista.iterator();
        }
        return null;
    }

    private ArrayUnorderedList<T> recorrerInOrden(Object[] monticulo, int i) {
        ArrayUnorderedList<T> lista = new ArrayUnorderedList<T>();
        if(monticulo[i * 2] != null) {
            ArrayUnorderedList<T> sub = recorrerInOrden(monticulo, i * 2);
            Iterator<T> it = sub.iterator();
            while(it.hasNext()) {
                lista.addToRear(it.next());
            }
        }
        lista.addToRear((T) monticulo[i]);
        if(monticulo[i * 2 + 1] != null) {
            ArrayUnorderedList<T> sub = recorrerInOrden(monticulo, i * 2 + 1);
            Iterator<T> it = sub.iterator();
            while(it.hasNext()) {
                lista.addToRear(it.next());
            }
        }
        return lista;
    }

    @Override
    public Iterator<T> iteratorPreOrder() {
        if(!isEmpty()) {
            ArrayUnorderedList<T> lista = recorrerPreOrden(monticulo, 1);
            return lista.iterator();
        }
        return null;
    }

    private ArrayUnorderedList<T> recorrerPreOrden(Object[] monticulo, int i) {
        ArrayUnorderedList<T> lista = new ArrayUnorderedList<T>();
        lista.addToRear((T) monticulo[i]);
        if(monticulo[i * 2] != null) {
            ArrayUnorderedList<T> sub = recorrerPreOrden(monticulo, i * 2);
            Iterator<T> it = sub.iterator();
            while(it.hasNext()) {
                lista.addToRear(it.next());
            }
        }
        if(monticulo[i * 2 + 1] != null) {
            ArrayUnorderedList<T> sub = recorrerPreOrden(monticulo, i * 2 + 1);
            Iterator<T> it = sub.iterator();
            while(it.hasNext()) {
                lista.addToRear(it.next());
            }
        }
        return lista;
    }

    @Override
    public Iterator<T> iteratorPostOrder() {
        if(!isEmpty()) {
            ArrayUnorderedList<T> lista = recorrerPostOrden(monticulo, 1);
            return lista.iterator();
        }
        return null;
    }

    private ArrayUnorderedList<T> recorrerPostOrden(Object[] monticulo, int i) {
        ArrayUnorderedList<T> lista = new ArrayUnorderedList<T>();
        if(monticulo[i * 2] != null) {
            ArrayUnorderedList<T> sub = recorrerPostOrden(monticulo, i * 2);
            Iterator<T> it = sub.iterator();
            while(it.hasNext()) {
                lista.addToRear(it.next());
            }
        }

        if(monticulo[i * 2 + 1] != null) {
            ArrayUnorderedList<T> sub = recorrerPostOrden(monticulo, i * 2 + 1);
            Iterator<T> it = sub.iterator();
            while(it.hasNext()) {
                lista.addToRear(it.next());
            }
        }
        lista.addToRear((T) monticulo[i]);
        return lista;
    }

    @Override
    public Iterator<T> iteratorLevelOrder() {
        ArrayUnorderedList<T> lista = new ArrayUnorderedList<T>();
        if(!isEmpty()) {
            int i;
            for(i = 1; i < size(); i++) {
                if(monticulo[i] != null) {
                    lista.addToRear((T) monticulo[i]);
                }
            }
            return lista.iterator();
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        String cad = "";
        for(int i = 1; i < tamaño; i++) {
            cad += "\nPadre: " + monticulo[i];
            if(monticulo[i * 2] != null) {
                cad += "\nHijo Izquierdo: " + monticulo[i * 2];
            } else {
                cad += "\nHijo Izquierdo: Nulo";
            }
            if(monticulo[i * 2 + 1] != null) {
                cad += "\nHijo Derecho: " + monticulo[i * 2 + 1];
            } else {
                cad += "\nHijo Derecho: Nulo";
            }
        }
        return cad;
    }

}
