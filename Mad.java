public class Mad
{
  public static void main(String[] args)
  {
    binaryDecimal("110" , 2);
    System.out.println("The sum of the digits is: " + sumDigits(7835));
  }


  /* converting a binary number to a decimal -- convert a
  string to int with given redix; base
  @param String x - the binary integer and int y - base to be converted to  */
  public  static void binaryDecimal(String x , int y)
  {

    System.out.println(Integer.parseInt(x,y));

  }

  /* method takes a integer and adds the digits together
  @param long n - intger to be added */
  public static int sumDigits(long n)
  {
        int sum = 0;
        while (n != 0)
        {
            //n is moded by 10
            sum += n % 10;

            // n is then divded by 10
            n /= 10;
        }
      return sum;
  }






  
}
