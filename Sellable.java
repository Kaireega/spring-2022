/*
where the item name, price quantity, description are required parameters for a method 
(you can name the method any name you like) in the interface, and amazon and Walmart
 have different way of processing these parameters. Obviously, we need to write a main 
 method to test the code.
 */ 
 
// TO DO
// create an interface for different online stores
// Method that take item name, price quantity, description
// main method to test 

public interface Sellable
{
   public String name(String n);
    public double price(double p);
    public String desc(String d);
    public double quan(double q);

}