/* @Author Kairee Gay
Extend the SList-
*/
import java.util.*;

public class DL extends SL 
{

  
  private Node head;
  private Node tail;
  
   // defualt constructor that does not do anything  
   public DL()
   {
      
      this.head = null;
   }
   

   
  /*
  Insert after: method that takes a key and a value and 
  then insert the value after the node containing the same value as the given key.
  add the new node to the end of the list
  */
  
   public void insertAfter(int key ,int value)
   {
   Node tmp = this.head;
    if(find(key) == true)
    {
     }  
      else
       {
        
        }

   }
 // Implement a list iterator for the your doubly-linked list 
 
    class LinkedListIterator  implements Iterator 
   {	
   	private Node head;
      private Node tail;
      private Node current;
      
      Node tmp = this.head; 
      public boolean hasNext() 
      {
         return tmp != null;
      }
      
      public Node next() 
      {
         if (!hasNext()) throw new NoSuchElementException();
          current = current.next;  // if next is null, hasNext will return false.
         return tmp;
      }
   }
 
      /** nested node class to encapsulate stored data */
     class Node
     {
         private int data;
         private Node next;
         private Node prev;
         
       //constructor with parms
       public Node(int data)
       {
         this.data = data;
   	  this.next = null;
       }
      //constructor
       public Node()
       {
         this.next = null;
       
       }
   
     } 

  }

