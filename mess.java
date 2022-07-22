 /*@param capacity - constructor with one parameter*/
   public GenerBase (int capacity) 
   {
      data = (Y[]) new Object[capacity];
   }
 
    /**
    * @param index, @param element - set method  
    */
  public void set(int index, Y element) throws IndexOutOfBoundsException
  {
      try
         {
            if(index < 0 || index >= this.data.length)
   		   {
               throw new IndexOutOfBoundsException("Index out of bound");
            } 
         
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }

      data[index] = element;
  }
 
 
  
  public Y getFirst() 
  {
      return data[0];
  }   
  
  
  
  
  
   
     /* 
   size
   */
   
   public int size()
   {
     return data.length;
   } 
   
  
  
  
  
   
   /*
   return a string of the object  
   

   public void toString()
   {
   
   } 
   */
   
   /*
   check to see if one object is eqauls other objects 
   
   */
   
   
   
   public void equals()
   {
   
   } 
   
