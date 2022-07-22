/* this interface is the basic frame for a stack data base */
interface Stack <E>
{
   public void push(E e);
   //public E pop();
   //public E top();
   public int size();
   public boolean isEmpty();
}
public class ArrayStack<E> implements Stack<E>{
   private static final int CAPACITY = 1000; 
      private E data[]; 
      private int t = -1;
       
      public ArrayStack()
      {
         this.data = (E[])new Object[CAPACITY];
      }
       
       
      public ArrayStack(int capacity)
      {
         this.data = (E[])new Object[capacity];
         
      }
     
     
     
      public void push(E e){
                  
         this.data[++t] = e;
      }
     
     
     
      public int size()
      {
         return t + 1 ;
      }
      public E pop()
      {
         if(isEmpty())return null;
         E answer = data[t];
         t--;
         return answer;
       }
       public E top()
       {
          if(isEmpty())return null;
          return data[t];
       }
       public boolean isEmpty()
       {
         return (t == -1);
       }

}















//======================================================

class SingleLinkedStack<E> implements Stack<E>
{
  private Node head;
  private Node tail;
  private int size = 0;
 
 
 public void push(E e)
 {
   Node tmp = new Node(e);
   if(this.head != null)
      tmp.next = this.head;
      this.head = tmp;
 }
 
 
 public E pop()
 {
      
     
 }
 
 public E top()
 {
   
 }
 public int size()
 {
   int count = 0;
    Node tmp = this.head;
	while(tmp != null){
	  count++;
	  tmp = tmp.next;
	}
    return count;	

 }
 public boolean isEmpty()
 {
   Node tmp = this.head;
      if(tmp == null)
       return true;
         return false; 
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


/** nested node class to encapsulate stored data */
     class Node<E>
     {
         private E data;
         private Node next;
         
         
       //constructor with @parms the data that is being stored in the nodes
       public Node(E data)
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
