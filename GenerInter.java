// Create an iterator interface with hasNext, and next method

// interface with hasNext, and next method
public interface GenerInter<Y>
{
   
  /*Returns true if there is at least one additional element in the sequence,
 and false otherwise.*/ 
   public boolean hasNext();
   
   /*Returns the next element in the sequence.*/
   public Y next();
   
}

class DArray1Itr<E>  implements GenerInter {
  private DArray1<E> storage; //points at the data structure
  private int curLoc; //points at the current location
 
 //contructor
  public DArray1Itr(DArray1<E> a){
    //deal with invalid object and range errors here
    if(a == null) {
    // ++++ error handling codes go here snf get out +++====
    }

    this.storage = a; //point at the same source
    this.curLoc = 0; //point at the first index
  }

  /**
    @return true if and only if the curent location is in a valid 
     indexing range 
  */
  public boolean hasNext(){
    return this.curLoc < this.storage.length();
  }

  /**
    @return the element at the current index location and 
     advance the currenet location to the next index slot
  */
  public E next(){
    return (E)(Integer)this.storage.elementAt(curLoc++);
  }
}
