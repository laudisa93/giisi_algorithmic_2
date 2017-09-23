/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

/**
 *
 * @author David
 */
public class Problema2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQueue<Integer> colapri = new PriorityQueue<Integer>();
        colapri.addElement(new PriorityQueueNode(3, 9));
        colapri.addElement(new PriorityQueueNode(4, 8));
        colapri.addElement(new PriorityQueueNode(5, 3));
        colapri.addElement(new PriorityQueueNode(7, 5));
        colapri.addElement(new PriorityQueueNode(1, 2));
        colapri.addElement(new PriorityQueueNode(9, 6));
        colapri.addElement(new PriorityQueueNode(2, 10));

        while(!colapri.isEmpty()) {
            System.out.println(colapri.removeNext());
        }

    }

}
