import java.util.Scanner; // Imports Java Until Scanner
import java.text.DecimalFormat; //imports Java Text Decimal Format
public class TestAverage
{
   private static DecimalFormat df = new DecimalFormat("0.00"); // Round to nearest hundredth
   // Credit https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/

   public static void main(String[] args)
   {
   
      Scanner keyboard = new Scanner(System.in); // Initiate keyboard input of user
      
      float test1, test2, test3, testAverage; // Declare variables for three tests along with test average
      
      System.out.print("Enter the score of Test 1: "); // Ask user for score of test 1
      test1 = keyboard.nextFloat(); // Set value of variable test1 with user given data
      
      System.out.print("Enter the score of Test 2: "); // Ask user for score of test 2
      test2 = keyboard.nextFloat(); // Set value of variable test2 with user given data
      
      System.out.print("Enter the score of Test 3: "); // Ask user for score of test 3
      test3 = keyboard.nextFloat(); // Set value of variable test3 with user given data
      
      testAverage = (test1 + test2 + test3) / 3; // Calculate the average of the three tests by adding them and dividing by 3
      
      System.out.println("The score of Test 1 is: " + df.format(test1)); // Output score of test 1
      System.out.println("The score of Test 2 is: " + df.format(test2)); // Output score of test 2
      System.out.println("The score of Test 3 is: " + df.format(test3)); // Output score of test 3
      System.out.println("The average score of the tests are: " + df.format(testAverage));
      // Output average test score rounded to the nearest hundredth
      
   }
}
      
      
