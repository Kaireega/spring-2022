public class Amazon implements Sellable
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

public double quan(double q)
       {
       double quan = q;
       return quan;
    public Amazon()
         {
      // System.out.print("Amazon");
        
         }
}



class SellingDemo  
{
   public static void main(String[] args)
   {
  Amazon amazon = new Amazon();
   //Amazon dog = new Amazon(); 
   // System.out.println(wal.name);
  System.out.println(amazon.name("toms"));
  System.out.println(amazon.price(10.87));
   System.out.println(amazon.desc("Very soft slides."));
   }

}