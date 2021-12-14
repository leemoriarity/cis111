import java.util.Scanner; // Imports Java Util Scanner
import java.text.DecimalFormat; // Imports Java Text Decimal Format

public class Rainfall
{
   private static DecimalFormat df = new DecimalFormat("0.00"); // Convert rainfall inches to 2 decimal points
   
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in); // Initiate keyboard input
      
      int years, i, o; // Declare increment variables
      double rainfall, total = 0; // declare rainfall and total rainfall variables as double
      double[] month = new double[13]; // declare array month to hold 13 values (to allow 1-12)
      
      System.out.print("Enter the number of years: "); // Ask user to input number of years
      years = scan.nextInt(); // Set value of years to data inputted by user
      
      while (years < 1) { // While years entered is less than one
         System.out.println("Enter a minimum of 1 year. Try again."); // Tell user to enter a number no less than 1
         System.out.print("Enter the number of years: "); // Ask user to input number of years again
         years = scan.nextInt(); // Recheck value entered by user
      }
         
      for (i = 1; i <= years; i++) // Set loop to run for each year entered
      {
         for (o = 1; o <= 12; o++) // Set loop to run for each month of the year
         {
            // Ask user to input rainfall for each month of the year
            System.out.print("Enter rainfall for month " + o + " of year " + i + " in inches: ");
            rainfall = scan.nextDouble(); // Read value of rainfall inputted by user
            
            if (rainfall < 0) { // If rainfall is less than 0
               // Tell user to try again with a positive number
               System.out.println("Do not enter a negative number. Try again. ");
               --o; // Reset month to get new rainfall for incorrect response.
            } else { // If rainfall is 0 or greater
               month[o] = rainfall; // Assign rainfall to month array
               total += month[o]; // Add rainfall for the month to the total rainfall
            }
         }
      }
      
      System.out.println("The number of months is " + --i * 12); // Output total number of months by subtracting 1 from i and multiplying by 12
      System.out.println("Total rainfall is " + df.format(total) + " inches"); // Output total rainfall rounded to nearest hundredth
      System.out.println("Average rainfall is " + df.format(total/(i * 12)) + " inches"); // Output average rainfall calculation rounded to nearest hundredth
   }
}