//@author Kairee Gay
import java.util.Scanner;
/*Write a Java program that can simulate a simple calculator,
   using the Java console as the exclusive input and output device.
   That is, each input to the calculator, be it a number, like 12.34
   or 1034, or an operator, like + or =, can be done on a separate line.
   After each such input, you should output to the Java console what
   would be displayed on your calculator.*/
   
   
   /* 
   decalare a Double for result
   decalare a double for first input
   decalare a double for secound input
  
   place in a  while loop (= to -1 )
    Scan input for first value
       make sure its a  number not operator 
   
    Scan input for operator 
         make sure its a  number not number
   
   Scan input for secound value
       make sure its a  number not operator
   
 
   pass operator to switch statement
      case + addition
          result = input one + input two 
           return return 
     case - subtration
           result = input one - input two
            return return  
     case  * or x multipication
            result = input one *input two
            return reslut
      case / division
           result = input one / input two
            return result  

   */  
import java.util.Scanner;
public class SimpleCalculator
{
  public static void main(String[] args)
   {
     Scanner scan = new Scanner(System.in);
    
      char oper;
      double inOne = 0;
      double result;
      double inTwo;
      boolean exit = true;
     
      
      do{
           
          inOne = scan.nextDouble();
         
          oper = scan.next().charAt(0);
      
         inTwo = scan.nextDouble();
        
          
          
         switch (oper)
            {
               case '+' : result = inOne + inTwo; 
               System.out.println(result);
                  break;
               
               case '-' :
               result = inOne - inTwo;
               System.out.println(result);
                  break;
               
               case '/' :
               result = inOne / inTwo;
               System.out.println(result);
                  break;
               
               case '*' :
               case 'x' :
               result = inOne * inTwo;
               System.out.println(result);
                  break;
         
         default:
         System.out.println("ERROR");
            break;
        }
        System.out.println("another true or false?");
        exit = scan.nextBoolean();
      } while(exit != true);
   }  
} 