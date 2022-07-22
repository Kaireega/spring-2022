import java.util.Scanner;
public class practice
{
   public static void main(String[] args)
   {
      MethodClass db = new MethodClass();
      Scanner sb = new Scanner(System.in);      
     
     
     
     
     
      // sum to numbers and print to screen
      int numOne;
      int numTwo;
      System.out.println("Addition");
      System.out.println("Input first interger");
      numOne = sb.nextInt();
      System.out.println("Input second interger");
      numTwo = sb.nextInt();
      System.out.println("Sum of " + numOne + " + " + numTwo + " = " + db.Sum(numOne , numTwo));
      
      // set varibles to zero
      numOne = 0;
      numTwo = 0;
     
      
      // divide  two numbers and print to screen
      System.out.println("numbers to be divided");      
      System.out.println("Input first interger ");
      numOne = sb.nextInt();
      System.out.println("Input second interger ");
      numTwo = sb.nextInt();
      
      System.out.println("result of " + numOne + " / " + numTwo + " = " +db.Divide(numOne , numTwo));
      
      
      // write a program to print out multipcations of a input up to 10 
       int num1;
        System.out.println("Enter a interger to be multiplied."); 
        num1 = sb.nextInt();
        
        
        
        
           }
   
} 
//========================================================= 
 //a method to sum to numbers and print to screen
class MethodClass
{ 
  
   public int Sum(int i , int t)
   {
    int result = i + t;
      return result;
   }
   
   public int Divide(int i , int t)
   {
    int result = i / t;
      return result;
   }
   
   public void Multi(int k)
   {
    int num1 = k; 
   for(int i = 0;i <= 10;i++)
        {
            System.out.println(num1 + " x " + i + " = " + 
            (num1 * i));
        }    


   
   }
}
//==============================================