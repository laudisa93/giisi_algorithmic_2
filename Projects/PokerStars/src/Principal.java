
import sets.*;

public class Principal {

    public static void main(String[] args) {
        SetADT<Carta> baraja = new ArraySet<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j < 15; j++) {
                baraja.add(new Carta(j, i));
            }
        }
        System.out.println("Mi mano:");
        SetADT<Carta> mano = new ArraySet<>();
        mano.add(baraja.removeRandom());
        mano.add(baraja.removeRandom());
        System.out.println(mano);
        System.out.println("Flop,Turn,River:");
        SetADT<Carta> juego = new ArraySet<>();
        for (int i = 0; i < 5; i++) {
            juego.add(baraja.removeRandom());
        }
        System.out.println(juego);
    }
}
