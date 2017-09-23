
import jss2.*;

public class Polinomio {

    public static void main(String[] args) {
        
        int x = 2;
        
        //Ponemos que el polinomio a resolver va a ser 3x^4+2x^2+x^0
        UnorderedListADT<Integer> polinomio = new ArrayUnorderedList();
        //Metemos en la lista los exponentes de las x.
        //Cada exponente tiene que ir acompañado del número que multiplica x
        polinomio.addToRear(0);
        polinomio.addToRear(1);
        polinomio.addToRear(2);
        polinomio.addToRear(2);
        polinomio.addToRear(4);
        polinomio.addToRear(3);
        System.out.println(polinomio.toString());
        int result = resolver(polinomio,x);
        System.out.println("El total es: " + result);
    }

    private static int resolver(UnorderedListADT<Integer> polinomio,int x) {
        int result = 0;
        int aux,i = 0;
        while (!polinomio.isEmpty()) {
            i = polinomio.removeFirst();
            aux = (int) Math.pow(x, i);
            result += polinomio.removeFirst()*aux;
            //System.out.println(x + "^" + i + "=" + Math.pow(x, i));
        }
        return result;
    }
}

//sumatorio de todo i de Ai * x^i
//f(x) x=2 y= 3x^4+2x^2+x^0