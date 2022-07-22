/*Extend the SList class from a based class similar to Java Collection 
abstract class with the following functionalities:add, clear, isEmpty,
size, contains, remove, and toString
*/
abstract class function
{
   public abstract void addFront(int a);
   public abstract void addLast(int a);
   public abstract boolean clear();
   public abstract boolean isEmpty();
   public abstract int size();
   /* ?? the toString prints out the values, i
   am confused as to what is method does?? */
   //public abstract int contains();
   public abstract boolean remove(int g);
   public abstract String toString();
   

}

/* to do delete the getter and setter ^ 
 make a nested link list ^
add element to the back ^
remove the first, ^
last^  and speicfic element 
remove all occurneces of a elemnt 
/
/* simplet singly linked listed implemnetation  

*/
//@Author Kairee Gay

//---------------------------------------------------
// singly linked list class

public class SL extends function
{
   private Node head;
   private Node tail;
   private int size = 0;


// defualt constructor - this constructor does not do anything  
   public SL()
   {
      this.head = null;
   }

/* copy conctruor - this constructor take in a object 
@param other - another single linked list class is pass */

   public SL(SL other) 
   {
      Node tmp = other.head;  
      while (tmp != null)
      {
         this.head = other.head;
         tmp = tmp.next;
      }
   }
   
   
   
/* add element to the front of the list
@parm a - take in a interger to be stored at the front of the list */
   public void addFront(int a)
   {
      Node tmp = new Node(a);
      if (this.head != null)
            tmp.next = this.head;
            this.head = tmp; 
   }

  /** count the number of nodes
  @return the size of the linked list */
   public int size(){
    int count = 0;
    Node tmp = this.head;
	while(tmp != null){
	  count++;
	  tmp = tmp.next;
	}
    return count;	
  }
  
  
  /* add element to the back of the list
  @parm a - take in a interger to be stored at the last node of the list */

   public void addLast(int a)
   {
      
      if(this.head == null)
      {
	      addFront(a);
	   }
      else
      {
         Node tmp = this.head;
	      while(tmp.next != null)
	       tmp = tmp.next;
	      tmp.next = new Node(a);
	   }

   }

 // this method is to remove node from the front
   public void removeFront()
   {
     Node tmp = new Node();
       if (this.head != null)
       {
          tmp = this.head;  
          this.head = this.head.next;
    tmp = null;
       }    
 
   }
// this method is to remove node from the end of the list
   public void removeLast()
   {
     Node tmp = new Node();
       if (this.head == null)
       {
        this.head = tmp;
       }  
       else
       {
         this.tail = this.head;
            while( tail.next.next != null)
            {
               tail = tail.next;
            }
            tail.next = null;

      }  
          tmp = tail;  
          this.tail = this.tail.next;
          tmp = null;

   }

 /*removing a  specific element in the linked list 
 @return true if the node was removed or false if the node was null
 @parm key - the value of the data that is to be remove
 */
   public boolean remove(int key)
   {
       Node tmp = findNode(key);
       if(tmp == null)
       {  
         return false;
       }
   	if(tmp == this.head)
      { 
   	   tmp = tmp.next;
   	   this.head.next = null; 
   	   this.head = tmp; 
       }
         Node tmp2 = tmp.next;
   	   tmp.next = tmp.next.next;
   	
   	return true;    
      
   
   }
   /* method to clear all of the nodes in the linked list
   @return  true if the node was removed or  */
   public boolean clear()
   {
     Node tmp = this.head;
     this.head = null;
     tmp = null;
     return true;
   
   }
      
// find method a node base on the key value 

   public boolean find(int key)
   {
     return(findNode(key)!= null);
   }
      
      /* 
         @parm key - the value to look for in the list 
         @return + null if the key is not in the list  
           +the head if the key is the only node   
           +the refrence to the node precceding the node holding the key 
      */
  
     /*@parm key - the value of the data that is to be found
     @returns a node that hold that value in data */
    private Node findNode(int key)
    {
      if (this.head == null)
      {
         return null;
      }
      
      if(this.head.next == null)
      {
         if(this.head.data == key)
         {
            return this.head;
         }
        return null; 
      } 
        // multiple node in the list
        Node tmp = this.head;
        if(tmp.data == key)
         {
         return tmp;
         }
         
        while(tmp.next != null)
        {
         if (tmp.next.data == key)
            return tmp;
            tmp = tmp.next;
         
        }
         return null; // not found 
     }
  

// toString method to return the object infomation (first in last out)
   public String toString()
   {
         String output= " ";
         Node tmp = this.head;
       try
       {
         while(tmp != null)
         {
            output += " " + tmp.data;
            tmp = tmp.next;
         }
       }
       catch(NullPointerException e) 
         {
             System.out.println("problem");
         }
      return output;
   }
   
   
   /* method checks if the linked list is empty
   @returns true or false if the linked list is empty */
   public boolean isEmpty()
   {
      Node tmp = this.head;
      if(tmp == null)
       return true;
         return false; 
   }
   

/** nested node class to encapsulate stored data */
     class Node
     {
         private int data;
         private Node next;
         private Node prev;
         
       //constructor with @parms the data that is being stored in the nodes
       public Node(int data)
       {
         this.data = data;
   	  this.next = null;
        this.prev = null;
       }
      //constructor
       public Node()
       {
         this.next = null;
       
       }
   
     } 
   }


