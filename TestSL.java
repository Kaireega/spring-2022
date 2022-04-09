//-------------------------------------------------
// driver class to test the linked list 
  
   public class TestSL
   {
      public static void main(String[] args)
      {
         SL myList = new SL();
         SL myList1 = new SL(myList);
        
      
       
         myList.addFront(2);
         myList.addFront(3);
         myList.addLast(1);
         myList.removeFront();
         myList.addFront(4);
         myList.addFront(5);
         myList.removeLast();
         myList.addFront(9);
         myList.addFront(9);
         myList.addFront(9);
          System.out.println(myList.remove(4));
         System.out.println(myList.isEmpty());
         System.out.println(myList.remove(5));
         System.out.println(myList);
         System.out.println(myList.size());
         System.out.println(myList1.size());
 
      //System.out.println(myList.clear());
   //  System.out.println(myList.size());
    

    
    
      }
   
   
   }

