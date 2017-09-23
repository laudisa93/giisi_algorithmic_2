
import jss2.*;

public class Polinomio {

    public static void main(String[] args) {
        UnorderedListADT<Integer> polinomio = new ArrayUnorderedList();
        polinomio.addToRear(1);
        polinomio.addToRear(2);
        polinomio.addToRear(3);
        int result = resolver(polinomio);
        System.out.println("El total es: " + result);
    }

    private static int resolver(UnorderedListADT<Integer> polinomio) {
        int result = 0;
        int x, i=0;
        while (!polinomio.isEmpty()) {
            x = polinomio.removeFirst();
            result += Math.pow(x, i);
            System.out.println(x + "^" + i + "=" + Math.pow(x, i));
            i++;
        }
        return result;
    }
}
