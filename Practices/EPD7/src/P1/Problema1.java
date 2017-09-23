/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

import heap.HeapADT;
import java.util.Iterator;

/**
 *
 * @author David
 */
public class Problema1 {
    public static void main(String[] args) {

        HeapADT monticulo = new ArrayHeat<Integer>();
        monticulo.addElement(30);
        monticulo.addElement(15);
        monticulo.addElement(20);
        monticulo.addElement(5);
        monticulo.addElement(25);
        monticulo.addElement(10);
        monticulo.addElement(1);

        System.out.println("Montículo por niveles:");
        Iterator it = monticulo.iteratorLevelOrder();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
