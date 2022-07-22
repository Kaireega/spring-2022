interface Queue<E>
{
   public void enqueue(E e); // Add elemnent to the back of queue
   
   public E dequene();  // remove and return the first element from the queue
   
   public E first();      /* Returns the first element of the queue, without removing it
                        (or null if the queue is empty).*/
   
   public int  size();       //Returns the number of elements in the queue.
   
   public boolean isEmpty(); // Returns a boolean indicating whether the queue is empty.
}


public class ArrayQueue<E> implements Queue<E>
{
   private static final int CAPACITY = 1000; 
      private E[] data; 
      private int t = -1;
      
      
   public ArrayQueue()
      {
         data = (E[])new Object[CAPACITY];
      }
       
       
      public ArrayQueue(int capacity)
      {
         data = (E[])new Object[capacity];

  

   
   public void enqueue(E e)
   {


   }

}

