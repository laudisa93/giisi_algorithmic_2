

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sergio
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<Integer>();
        HeapSort ordenar = new HeapSort();
        array.add(5);
        array.add(2);
        array.add(1);
        array.add(7);
        array.add(9);
        array.add(4);

        ordenar.ordenarArray(array, 1, 9);

        for (Integer integer : array) {
            System.out.println(integer);
        }
    }
}
