//-------------------------------------------------
// driver class to test the linked list 

   public class TestDL
   {
      public static void main(String[] args)
      {
         DL myList = new DL();
        
      
         myList.addFront(2);
         myList.addFront(3);
         myList.addFront(5);
         myList.addLast(7);
         myList.removeFront();
         myList.addFront(8);
         myList.addFront(2);
         myList.removeLast();
         myList.addFront(3);
         myList.addFront(9);
         myList.addFront(9);
         myList.insertAfter(1,7);
         System.out.println(myList);
         System.out.println(myList.size());
        

      
      }
   
   
   }
