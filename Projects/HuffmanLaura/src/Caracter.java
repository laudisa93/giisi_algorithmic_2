
public class Caracter implements Comparable {

    private int apariciones;
    private char caracter;
    private String codigo;

    public Caracter(char caracter) {
        this.apariciones = 1;
        this.caracter = caracter;
    }

    public int getApariciones() {
        return apariciones;
    }

    public void addApariciones() {
        this.apariciones++;
    }

    public char getCaracter() {
        return caracter;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean equals(char c) {
        if (this.caracter != c) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        Caracter cAux = (Caracter) o;
        if (this.apariciones < cAux.getApariciones()) {
            return -1;
        } else if (this.apariciones == cAux.getApariciones()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Caracter: " + caracter + ". Apariciones: " + apariciones;
    }
}
