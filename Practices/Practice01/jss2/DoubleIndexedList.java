//********************************************************************
//  DoubleIndexedList.java       Authors: Lewis/Chase
//                                  Mods: Davis
//  Defines the indexed list for a doubly linked list. Elements
//  are referenced by contiguous numeric indexes.
//********************************************************************

package jss2;

import jss2.exceptions.*;

public class DoubleIndexedList extends DoubleList implements IndexedListADT
{
   //-----------------------------------------------------------------
   //  Creates an empty list using the default capacity.
   //-----------------------------------------------------------------
   public DoubleIndexedList()
   {
      super();
   }
   //------------------------------------------------------------------
   // Creates an empty list using specified capacity, however, capacity
   // not important for linked implementation
   //------------------------------------------------------------------
   public DoubleIndexedList (int initialCapacity)
   {
      super (initialCapacity);
   }

   //  Inserts the specified element at the specified index
   public void add (int index, Object element)
   {
     DoubleNode newnode = new DoubleNode(element);     
     DoubleNode curr=front, prev=front;
     
     if(count==0)
       front=newnode;
     else
     {
       curr=curr.getNext();
       for(int i=0; i<=index; i++) 
       {
        prev = curr;    
        curr = curr.getNext(); 
       }
     }
     newnode.setPrevious(prev);
     newnode.setNext(curr);
     count++;
   }

   //  Sets the element at the specified index
   public void set (int index, Object element)
   {
     DoubleNode ptr = front;
     for (int i=1;i<=index;i++)
         ptr=ptr.getNext();

     ptr.setElement(element);
   }

   //  Adds the specified element to the rear of this list
   public void add (Object element)
   {
     DoubleNode newnode = new DoubleNode(element);
     if (count==0)
       front=newnode;
     else
     {
       rear.setNext(newnode);
       newnode.setPrevious(rear);    
     }
     rear=newnode;
     count++;
   }


   //  Returns a reference to the element at the specified index
   public Object get (int index)
   {
     if (index > count)
           throw new ElementNotFoundException("index greater than count");

      DoubleNode ptr = front;
      int i=1;
      while (i<index)
         {
         ptr = ptr.getNext();
         i++;
         }
      return ptr.getElement();
   }

   //  Returns the index of the specified element
   public int indexOf (Object element)
   {


      DoubleNode find = front;
      int result =1; 
      
      while((find!=null) && !(find.getElement().equals(element)))
      {      
        find = find.getNext();
        result++;
       }
      return result;


   }

   //  Removes and returns the element at the specified index
   public Object remove (int index)
   {
      Object result;
      DoubleNode indexnode = front;

      for(int i=1; i< index; i++)
      {
        indexnode = indexnode.getNext(); 
      }
   
      if(indexnode == null)
        throw new ElementNotFoundException("list");
       indexnode.getElement();

      if(indexnode == front)
       indexnode.setNext(front); 
      // result = this.removeFirst();
      else if(indexnode == rear)
      indexnode.setPrevious(rear); 
      // result = this.removeLast();  
      else
      {
       indexnode.getNext().setPrevious(indexnode.getPrevious());     
       indexnode.getPrevious().setNext(indexnode.getNext());
      }
     count--;
     return indexnode.getElement();  
   }
}


