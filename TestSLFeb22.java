/** Simplest singly linked list implementation illustration 
Todo: write methods to
+ add an element to the to the back
+ remove the first element
+ remove the last element
+ find if an element exist
+ remove a specific element
+ remove all occurences of a specific element
+ update the driver to test all newly added methods
*/



/** singly linked list */
class SL{
  private Node head;
  
  //default constructor that does not do anything yet
  public SL(){
     this.head = null;	  
  }
  
  //add an element to the font of the list
  public void addFront(int a){
	Node tmp = new Node(a);    
	if(this.head != null)
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
  
  /** return the content of the list as a space fused string */
  public String toString(){
	String output = "";
	Node tmp = this.head;
	while(tmp != null){
	  output += " " + tmp.data; //grab the data
      tmp = tmp.next; //go to the next node	  
	}
	
    return output;	
  }
  
  /** nested node class to encapsulate stored data */
  private class Node {
    private int data;
    private Node next;
  
    //constructor
    public Node(int data){
      this.data = data;
	  this.next = null;
    }  
  }
}

/** a driver class to test the linked list */

public class TestSLFeb22{
  public static void main(String[] args){
    SL myList  = new SL();
	myList.addFront(3);
	myList.addFront(9);
	myList.addFront(1);
	System.out.println(myList);
	System.out.println(myList.size());
  }
}






