import jss2.ArrayUnorderedList;
import jss2.UnorderedListADT;
public class JOSEFO {
public static void main(String[] args) {
System.out.println("EJERCICIO 1");
System.out.println("\nJOSEFO:");
UnorderedListADT<Integer> Josefo = new ArrayUnorderedList<Integer>();
Josefo.addToRear(1);
Josefo.addToRear(2);
Josefo.addToRear(3);
Josefo.addToRear(4);
Josefo.addToRear(5);
System.out.println("Lista Josefo: \n" + Josefo.toString());
int salto = 2;
while (!Josefo.isEmpty()) {
int i;
for (i = 0; i < salto; i++) {
Josefo.addToRear(Josefo.removeFirst());
}
Josefo.removeFirst();
System.out.println(Josefo);
}
}
}
