
package p1;

import java.util.Iterator;
import sets.*;

public class Main {

    public static void main(String[] args) {
        SetADT conjunto1 = new ArraySet();
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                conjunto1.add(i);
            }
        }
        System.out.println(conjunto1.toString());

        SetADT conjunto2 = new ArraySet();
        for (int i = 0; i <= 50; i++) {
            if (i % 3 == 0) {
                conjunto2.add(i);
            }
        }
        System.out.println(conjunto2.toString());

        SetADT conjunto3 = new ArraySet();
        conjunto3.addAll(conjunto1);
        conjunto3.addAll(conjunto2);
        Iterator it;
        it = conjunto2.iterator();
        while (it.hasNext()) {
            Object object = it.next();
            if (conjunto1.contains(object)) {
                conjunto3.remove(object);
            }
        }
        System.out.println(conjunto3.toString());
        System.out.println("Numero de elementos: "+conjunto3.size());
    }

}
