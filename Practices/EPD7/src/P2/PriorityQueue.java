package P2;

import heap.*;

/**
 *
 * @author David
 */
//*******************************************************************
//
// PriorityQueue.java		Authors: Lewis/Chase
//
//*******************************************************************
public class PriorityQueue<T> extends LinkedHeap<PriorityQueueNode<T>> {
    //================================================================
    //  Creates an empty expression tree.
    //================================================================
    public PriorityQueue() {
        super();
    }  // constructor PriorityQueue

    //================================================================
    //  adds the given element to the PriorityQueue
    //================================================================
    public void addElement(T object, int priority) {
        PriorityQueueNode<T> node = new PriorityQueueNode<T>(object, priority);
        super.addElement(node);

    }  // constructor PriorityQueue

    //================================================================
    //  Removes the next highest priority element from the priority queue
    //  and returns a reference to it.
    //================================================================
    public T removeNext() {
        PriorityQueueNode<T> temp = (PriorityQueueNode<T>) super.removeMin();
        return temp.getElement();
    }  // method removeNext

}  // class PriorityQueue
