/**
 * =====================================
 * Please complete the remaining operations:
  0. add a default constructor with initial size of 10 - make this default size
     into a constant
  1. add/insert: an element to a given index (reset as necessary), and a method
     to add an element to the back of the array
  2. resize: reset the size of the array as the user insert data pass the 
     maxSize/capacity or they explicitly invoke the operation 
  3. add getFirst/getLast methods to retrieve the corresponding element
  4. Modify the class so it can handle any kind of data type (generic data type
     class)
  5. Make sure the code is fully documented and the file is fully described 
     with appropriate information and algorithms
 * ==================================
 * @author Kairee Gay
 * @purpose: simple illustration of a dynamic array/vector 
 */
 class DArray
  {
      private final double GROW_FACTOR = 0.5;// array size growing rate
   	private final int DEFAULT_SIZE = 10;
      
   	//attributes
   	private int size;
   	private int buffer[]; //the actual array
   	
      // defeat conctructor 
      public DArray()
      {
         this.size = DEFAULT_SIZE;
         int bufferSize = (int) Math.ceil(this.size + this.size * GROW_FACTOR);
      }
     
     
      //@param size - constructor with one parameter
      public DArray(int size) throws Exception
      {
   	    try
        {
         if(size < 0)
   		   {
            throw new IndexOutOfBoundsException("Index out of bound");
            } 
         
        }
         catch(IndexOutOfBoundsException e)
         {
          System.out.println(e.getMessage());
         }
}
   	   
         this.size = size;//the actual array size
   	   int bufferSize = (int) Math.ceil(this.size + this.size * GROW_FACTOR);
   	   this.buffer = new int[bufferSize]; //create the buffer
      }
      
      //methods
      /**
       * 
       * @return the actual size of the array
       */
      public int length()
      {
   	   return this.size;
      }
      
     
     
      /**
       * @return the max length of the dynamic array
       */
      public int maxLength()
      {
   	   return this.buffer.length;
      }
      
      /**
       * @param index - the location of the element in the array
       * @return the element at the given location/index
       */
      public int elementAt(int index) throws IndexOutOfBoundsException
      {
   	  try
        {
         if(index < 0 || index >= this.size)
   		   {
            throw new IndexOutOfBoundsException("Index out of bound");
            } 
         
        }
         catch(IndexOutOfBoundsException e)
         {
          System.out.println(e.getMessage());
         }
         
            return this.buffer[index];
      }
     
      
      
      // set method 
      public void set(int index , int value)throws IndexOutOfBoundsException   {
         try
        {
         if(index < 0 || index >= this.size)
   		   {
            throw new IndexOutOfBoundsException("Index out of bound");
            } 
         
        }
         catch(IndexOutOfBoundsException e)
         {
          System.out.println(e.getMessage());
         }
         
         if (index >= this.size && index < this.buffer.length)
         this.size = index +1 ; // update size 
        
         if (index > this.buffer.length);
         resize(index +1);
            this.buffer[index] = value; //put in the value
      }
      
      /* @param size - the amount of to space need for the new array 
       */
   
      public void resize(int size)throws IndexOutOfBoundsException   
      {
        try
        {
            if(size < 0)
            {
               throw new IndexOutOfBoundsException("not vaild range");
            } 
         
         }
         catch(IndexOutOfBoundsException e)
         {
          System.out.println(e.getMessage());
         }
            
            
         if (size > this.size || size > this.buffer.length)
         {
           this.size = size;
            
         }
                
         else 
         {
            
            
            int bufferSize = (int) Math.ceil(this.size + this.size * GROW_FACTOR);
            int tmp[]  = new int[bufferSize]; // create a new buffer
            for (int i = 0; i < this.size; i++)
            
         
             
               this.buffer[i- 1] = tmp[i] ; // point to th
          
         
           }    
         
         }
      
      
      // equals()
      
      
      //copy constutor()
      public DArray(DArray a)
      {
      this.size = a.size;
      this.buffer= new int [(a.buffer.length)];
      // for loop to copy from one array to other 
      }
      
      
      
      //////////////////////////////////////////////////////////
      //driver to test the code
      public static void main(String[] args)throws Exception {
   	
       // DArray a = new DArray(-5);
   	  //System.out.println(a.length());
   	  //System.out.println(a.maxLength());
   	  
    //this.size = size;	
    
    // create sset method 
      //a.set(0, 10);
     // a.set(100, 50);//set value 50 to index 100
   	 // a.resize(2);
   	   
      }
      //end of main
   
   }//end of DArray class
   