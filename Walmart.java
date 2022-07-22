 public class Walmart implements Sellable 
{
   
   // Method that take item name, price quantity, description
      public String name(String n)
      {
      String name = n;
      return name;    
      }
      
      
       public double price(double p)
       {
          double price = p;
          price = (.02 * price)*100; 
           return  price;
       }
      
       public String desc(String d)
       {
         String desc = d; 
         return desc; 
       }
      public Walmart()
      {
   // System.out.print("walmart");
     
      }

   


   }

// main method to test 

 class SellingDemo  
{
   public static void main(String[] args)
   {
  Walmart walmart = new Walmart();
   //Amazon dog = new Amazon(); 
   // System.out.println(wal.name);
   System.out.println(walmart.name("toms"));
   System.out.println(walmart.price(10.87));
   System.out.println(walmart.desc("Very comfortable shoes"));
   }

}