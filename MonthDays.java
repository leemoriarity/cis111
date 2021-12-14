import java.util.Scanner; // Import java.util package Scanner class

public class MonthDays
{
   private int month; // Private integer month to hold month
   private int year; // Private integer year to hold year
   private static int days; // Private static integer days to hold number of days in the given month

   public static int numberOfDays(int month, int year) // Method named numberOfDays that returns number of days in the month of year
   {
      
      switch(month) // Switch statement 
      {
         case 1: case 3: case 5: case 7: case 8: case 10: case 12: // For months 1,3,5,7,8,10,12
            days = 31; // Return 31 days
            break;
         case 4: case 6: case 9: case 11: // For months 4,6,9,11
            days = 30; // Return 30 days
            break;
         case 2: // For month 2
            if ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) // If year is a leap year
               days = 29; // Return 29 days
            else // If month is not a leap year
               days = 28; // Return 28 days
            break;
      }
      return days; // Return number of days in given month and year
   }
   
   public static void main(String[] args)
   {
      int month; // Declare integer month
      int year; // Decalre integer year
      Scanner scan = new Scanner(System.in); // Declare Scanner to intiialize keyboard input
      
      System.out.print("Enter a month (1-12): "); // Ask user to enter a month
      month = scan.nextInt(); // Assign month with value entered by user
      while (month > 12 || month < 1) // While month is not between 1 and 12
      {
         System.out.println("Please enter a number between 1 and 12"); // Ask user to enter a valid month
         System.out.print("Enter a month (1-12): "); // Ask user to enter a month
         month = scan.nextInt(); // Assign month with new value entered by user
      }
      
      System.out.print("Enter a year: "); // Ask user to enter a year
      year = scan.nextInt(); // Assign year to year entered by user 
      while (year < 0) // While year is less than 0
      {
         System.out.println("Please enter a valid year"); // Ask user to enter a valid year
         System.out.print("Enter a year: "); // Ask user to enter a year again
         year = scan.nextInt(); // Assign year to year entered by user
      }
      
      System.out.print(numberOfDays(month,year) + " days"); // Print out number of says using numberOfDays method in MonthDays class
   }
}