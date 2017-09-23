
/**
 *
 * @author Fran
 */
public class Carta {

    private int numero;
    private int palo;

    public Carta(int numero, int palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPalo() {
        return palo;
    }

    public void setPalo(int palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        String value = null;
        switch (palo) {
            case 0:
                value = "Picas";
                break;
            case 1:
                value = "Corazones";
                break;
            case 2:
                value = "Diamantes";
                break;
            case 3:
                value = "Treboles";
                break;
        }
        String number = null;
        switch(numero)
        {
            case 11:
                number = "J";
                break;
            case 12:
                number = "Q";
                break;
            case 13:
                number = "K";
                break;
            case 14:
                number = "A";
                break;
        }
        if (numero <= 10) {
            return "Carta{" + numero + " de " + value + '}';
        } else {
            return "Carta{" + number + " de " + value + '}';
        }
    }
}
