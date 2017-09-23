
package P1;

public class Linea {
    String linea;
    int numLinea;

    public Linea(String linea, int numLinea) {
        this.linea = linea;
        this.linea += " ";
        this.numLinea = numLinea;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public int getNumLinea() {
        return numLinea;
    }

    public void setNumLinea(int numLinea) {
        this.numLinea = numLinea;
    }

    @Override
    public String toString() {
        return  "\n"+numLinea +" - "+ linea;
    }
    
    public String String() {
        return  linea;
    }
    
}
