/* to do delete the getter and setter ^ 
 make a nested link list ^
add element to the back ^
remove the first, ^
last^  and speicfic element 
remove all occurneces of a elemnt 
/*


/* simplet singly linked listed implemnetation  

*/


//---------------------------------------------------
// singly linked list 
class SL
{
   private Node head;
   private Node tail;
   //private int size = 0;
// defualt constructor that does not do anything yet 
   public SL()
   {
      this.head = null;
   }

// add element to the front of the list
   public void addFront(int a)
   {
      Node tmp = new Node(a);
      if (this.head != null)
            tmp.next = this.head;
            this.head = tmp; 
   }



  /** count the number of nodes */
   public int size(){
    int count = 0;
    Node tmp = this.head;
	while(tmp != null){
	  count++;
	  tmp = tmp.next;
	}
    return count;	
  }
  
  
  // add element to the back of the list
   public void addLast(int a)
   {
     Node tmp = new Node(a);
       if (this.head == null)
       {
        this.head = tmp;
       }  
       else
       {
         this.tail = this.head;
            while(tail.next != null)
            {
               tail = tail.next;
            }
           tail.next = tmp;
         }
          
   }
   
   
   
 // remove node from the front
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
// remove the last node 
 
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
            tail.next =null;

      }  
          tmp = tail;  
          this.tail = this.tail.next;
          tmp = null;

   }

// removing a spicific node 
   public void removeSpicific()
   {
      
   
   }
   








// toString method to return the object infomation (first in last out)
   public String toString()
      {
         String output= "";
         Node tmp = this.head;
       
         while(tmp != null)
         {
            output += " " + tmp.data;
            tmp = tmp.next;
         }
    
      return output;
      }
 
      
/** nested node class to encapsulate stored data */
      private class Node
     {
         private int data;
         private Node next;
         private Node prev;
      
    //constructor with parms
    public Node(int data){
      this.data = data;
	  this.next = null;
    }
   //constructor
    public Node(){
      this.next = null;
    
    }

  }       
}   
//-------------------------------------------------
// driver class to test the linked list 
  
   public class TestSL
   {
      public static void main(String[] args)
      {
         SL myList = new SL();
        
      
         myList.addFront(7);
         myList.addFront(2);
         myList.addFront(3);
         myList.addLast(1);
         myList.removeFront();

         myList.addFront(4);
         myList.addFront(5);
        myList.removeLast();
         myList.addFront(9);
        
        
          
         System.out.println(myList);
         System.out.println(myList.size());
        

      
      }
   
   
   }


private class Iterator Implement{
   private 


}
