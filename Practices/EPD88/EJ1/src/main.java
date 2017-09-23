
import java.util.Iterator;
import sets.*;

public class main {

    public static void main(String[] args) {

        SetADT conjunto1 = new ArraySet();
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                conjunto1.add(i);
            }
        }
        System.out.println(conjunto1.toString());

        SetADT conjunto2 = new ArraySet();
        for (int i = 0; i <= 20; i++) {
            if (i % 3 == 0) {
                conjunto2.add(i);
            }
        }
        System.out.println(conjunto2.toString());
        SetADT c = new ArraySet();
        
//        c = recursivo(conjunto1, conjunto2);
        
        
        


        //Iterativo
        SetADT cit = new ArraySet();
        Object aux;
        Iterator it = conjunto1.iterator();
        while (it.hasNext()) {
            aux = it.next();
            if (conjunto2.contains(aux)) {
                cit.add(aux);
            }
        }

        System.out.println(cit.toString());

    }

    public static SetADT recursivo(SetADT a, SetADT b) {
        SetADT c = new ArraySet();
        int aux;
        while(!a.isEmpty() && !b.isEmpty()) {
            aux = (int) a.removeRandom();
            if (!b.contains(aux)) {
                c.add(aux);
            } else {
                b.remove(aux);
            }
        }
        return c;
    }
}
