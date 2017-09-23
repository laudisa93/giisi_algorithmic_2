/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

/**
 *
 * @author laudisa93
 */
public class Palabra implements Comparable{
    String palabra;
    int numlinea;
    int cont;

    public Palabra(String palabra, int numlinea, int cont) {
        this.palabra = palabra;
        this.numlinea = numlinea;
        this.cont = cont;
    } 

    @Override
    public String toString() {
        return palabra + "[" + numlinea + ", " + cont + ']';
    }

    @Override
    public int compareTo(Object o) {
        Palabra p = (Palabra) o;
        return palabra.compareToIgnoreCase(p.palabra);
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getNumlinea() {
        return numlinea;
    }

    public void setNumlinea(int numlinea) {
        this.numlinea = numlinea;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
    
}
