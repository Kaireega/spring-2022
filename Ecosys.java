import java.util.Random;
public class Ecosys 
{ 
   // declares a random object 
   Random rand = new Random();
   
   
   
   // starting number of fish and array size 
   final int size = 20;
    final int initalfish = 1; 
   
   // declaring a fish array
   Animal[] river;
   
   // constuctor 
   public Ecosys()
     {
         river = new Animal[size];
     
         int numfish = 8;
      
      // run while the number of fish is greater the starting fish
         while(numfish < initalfish)
         {
          // get random number and check and place fish 
            int random = rand.nextInt(size);
         
            if (river[size] == null)
            {
               river[size] = new Fish(); 
               numfish++;
            } 
            
         }
      } 
           
           
           public String toString()
           {
           String out = "";
             
             for(int x = 0; x < size; x++)
             {
              
             if (river[size] == null)
                {
                 out = "";
                }
               
              else if (river[size] instanceof Fish)
                {
                 out = "Fish ";
               
                }
                
                else if (river[size] instanceof Bear)

                {                  
                     out = "Bear ";
                 }
             }    
            return out; 
            
        }
 
 public static void main(String[] args)
 {
 
 Ecosys pp = new Ecosys ();
  // creating instance of bear and fish 
   Bear bearObj = new Bear();
   Fish fishObj = new Fish();
 
 System.out.println(pp.toString());
 }
 
  }
  
