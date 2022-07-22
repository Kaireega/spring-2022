/** Illustration of sellable interface in class after initial practice

Todo: based on our in-class discussion, 
 + extend the Item class to handle specific requirement of each store
 + write code to test and exchange items between stores

*/
interface Sellable{//a simple interface
  public String sellListing(String name, double price, int qty, String desc);
}
/** a simple class represeting a sell item */
class Item{
  private String name;
  private String desc;
  private double price;
  private int qty;
  public Item(String name, double price, int qty, String desc){
    this.name = name;
	this.price = price;
	this.qty = qty;
	this.desc = desc;
  }	 

  public String toString(){
    return "Name: " + this.name +"\n Price: " + this.price +
	       "\nQuantity: " + this.qty;
  }	  
}

class Amazon implements Sellable{
  private Item[] items;
  private int iCount; //number of items in the array
  
  //constructor
  public Amazon(){
	this.iCount = 0;
    this.items = new Item[10];	
  }
  
  public String sellListing(String name, double price, int qty, String desc){
    this.items[iCount++] = new Item(name, price*1.2, (int)(qty*1.05), desc);
	
	return "Conf: Amazon received " + qty + " of  " + name + 
	       " with listing price of " + price;
	
  }
  public String toString(){
	String mesg = "";
    for(int i = 0; i < this.iCount; i++){
      mesg += this.items[i].toString();
	}
    return mesg;	
  }
}

class Walmart implements Sellable{
  public String sellListing(String name, double price, int qty, String desc){
    return "Conf: Walmart received " + qty + " of  " + name + 
	       " with listing price of " + price;
  }
}


public class TestStore{
  public static void main(String[] args){
    Amazon a = new Amazon();
	Walmart w = new Walmart();
	a.sellListing("broken chair", 25.5, 5, "It's broken");
	System.out.println(a);
	
  }
}