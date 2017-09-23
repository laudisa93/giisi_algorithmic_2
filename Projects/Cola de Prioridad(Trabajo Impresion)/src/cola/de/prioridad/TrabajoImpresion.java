package cola.de.prioridad;

public class TrabajoImpresion {
    String nombre;
    int numPag;
    int prioridad;
    public TrabajoImpresion(String nombre,  int numPag, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.numPag = numPag;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumPag() {
        return numPag;
    }
    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    public int getPrioridad() {

        return prioridad;
    }
    public void setPrioridad(int prioridad) {
        if (prioridad >= 0 && prioridad <=100)
        this.prioridad = prioridad;
        else
            System.out.println("ERROR-Numero muy grande");
    }
    @Override
    public String toString() {
        return "Nombre:" + nombre + "/ Numero de Paginas:" + numPag + "/ Prioridad: " + prioridad ;
    }
}

