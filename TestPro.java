/**
 * =====================================
 * Please complete the remaining operations:
  0.  11add a default constructor with initial size of 10 - make this default size
     into a constant
  1.11 add/insert: an element to a given index (reset as necessary), and a method
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
 
 */
 class DArray1<T> extends GenerBase
  {
// array size growing rate
      private final double GROW_FACTOR = 0.5;
   	private final int DEFAULT_SIZE = 10;
//attributes
   	private int size;
//the actual array
      private T[] buffer;            
      
// defeat conctructor
      public DArray1()          
      {
        
         this.size = DEFAULT_SIZE;
         int bufferSize = (int) Math.ceil(this.size + this.size * GROW_FACTOR);
         this.buffer = (T[])new Object[bufferSize];
         
      }

//@param size - constructor with one parameter

      public DArray1 (int size) throws IndexOutOfBoundsException  
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
//the actual array size
         this.size = size;    
        
   	   
         int bufferSize = (int) Math.ceil(this.size + this.size * GROW_FACTOR);
//create the buffer
         this.buffer = (T[])new Object[bufferSize]; 
      }
    
      
     
//copy contrutor finish
      public DArray1(DArray1 x)
      {
         this.size = x.size;
         this.buffer = (T[]) new Object[x.buffer.length];
         for(int i = 0; i < this.size; i++)
         {
            this.buffer[i] = (T) x.buffer[i];
         }
      
      }
     
  
     
      

//methods

 //@return the actual size of the array

      public int length()
      {
   	   return this.size;
      }
  
     
 
//@return the max length of the dynamic array
 
      public int maxLength()
      {
   	   return this.buffer.length;
      }
      

 //@param index - the location of the element in the array
// @return the element at the given location/index

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
         
            return (int)this.buffer[index];
      }
     
      
      
// set method 
      public void set(int index , int value)throws IndexOutOfBoundsException   
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
            
            if (index >= this.size && index < this.buffer.length)
               {
// update size
                  this.size = index +1 ;
               } 
           
            if (index > this.buffer.length);
               {
                  resize(index +1);
//put in the value
                 
                  this.buffer[index - 1] = (T)(Integer)value; 
               }
      
      }
      
// @param size - the amount of to space need for the new array 

   
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
// create a new buffer
               int tmp[]  = new int[bufferSize]; 
               for (int i = 0; i < this.size; i++)
// point to th
               this.buffer[i] = (T)(Integer)tmp[i] ; 
             
             }    
            
        }
//  creates a to string respsentation of the object 
      
      public String toString()
      {
      String output = "[";
      for(int i = 0; i < this.size; i++)
        output += " " + this.buffer[i];
      return output + " ]";

          }
     
     
    
    
// getFrist method return the first element in the array
      public T getFirst() throws IndexOutOfBoundsException
      {
          try
           {
               if(size < 0)
               {
                  throw new IndexOutOfBoundsException("Empty");
               } 
            
            }
            catch(IndexOutOfBoundsException e)
            {
             System.out.println(e.getMessage());
            }
            return buffer[0];

      }
   
    // getLast method return the last element in the array

   
   public T getLast() throws IndexOutOfBoundsException
   {
      try
           {
             if(size < 0)
             {
              throw new IndexOutOfBoundsException("Empty");
             } 
            
            }
            catch(IndexOutOfBoundsException e)
            {
                System.out.println(e.getMessage());
            }
            
      return buffer[buffer.length-1];
   }
   
   
   
   
   
   //equal method - see if they are the same size - see if each a
     
     public boolean equals (DArray1 x)
     {
         if (this.size == x.size)
         return true;
         for(int i = 0; i < this.size; i++)
         {
            if(this.buffer[i] == x.buffer[i])
               return false;
         }return true; 
     }

      

} 
//==============================================================================    
       
//driver to test the code
public class TestPro
{
      public static void main(String[] args) throws IndexOutOfBoundsException 
      {
   	 
      DArray1 a = new DArray1(5);
   	System.out.println(a.length());       
      System.out.println(a.maxLength());
      a.set(0, 10);
      a.set(100, 50);//set value 50 to index 100
   	// a.resize(2);
   	   
      }
      //end of main
   
   }
   