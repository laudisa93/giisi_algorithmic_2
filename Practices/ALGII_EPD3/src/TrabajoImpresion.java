
public class TrabajoImpresion {
    String nombre;
    int numPag;
    int prioridad;

    public TrabajoImpresion(String nombre, int numPag, int prioridad) {
        this.nombre = nombre;
        this.numPag = numPag;
        this.prioridad = prioridad;
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
        if(prioridad>=0 && prioridad<=100)
        this.prioridad = prioridad;
        else
            System.out.println("Debe ser un número entre 0 y 100.");
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n\tNumPag: " + numPag + "\n\tPrioridad: " + prioridad;
    }
    
}
