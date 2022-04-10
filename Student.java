


public class Student extends PersonalInfo
{
   private String major;
   private String standing;
   private double gpa;
   
 

   public Student(String name, String phonNum, int age, String address, String email)
      {
      super(name, phonNum, age, address, email);
      this.major = "undecide";
      this.standing = standing;
      this.gpa = -1; // new student without any course taken 

      }
  
}