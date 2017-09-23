import heap.*;
import java.util.*;
public class HeapSort {
public void ordenarArray(List<Integer> array, int valorMayor, int valorMenor) {
HeapADT monticulo = new LinkedHeap();
for (Integer e : array) {
monticulo.addElement(e);
}
for (int i = 0; i < array.size(); i++) {
array.set(i, (Integer) monticulo.removeMin());
}
}
}
