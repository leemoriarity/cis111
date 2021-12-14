// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner; // Import Scanner class from java.util package
import java.util.regex.Pattern; // Import Pattern class from java.util.regex package
import java.util.regex.Matcher; // Import Matcherclass from java.util.regex package
import java.text.DecimalFormat; // Import DecimalFormat class from java.text package

public class Sales
{
   public static void main(String[] args)
   {
      
      double sum, goal; // Declare sum and goal integer variables
      double min = 999999999; //Declare and set min value to highest int value
      double max = -999999999; // Declare and set max value to lowest int value
      int minid = 0; // Declare min id value
      int maxid = 0; // Declare mac id value
      int g = 0; // Declare int to count salespeople who met sales goal
      double[] sales = {}; // Declare double array to hold sales values for each sales person
      String input = ""; // Declare String input to hold input values in String form
      
      Scanner scan = new Scanner(System.in); // Declare and initialize scanner
      System.out.print("Enter number of sales people: "); // Ask user for number of sales people
      input = scan.next(); // Get user input in String form
      while (checkInput(input) == false) { // While input is not a digit
         System.out.println("Please only enter a whole number"); // Tell user to only enter a whole number
         System.out.print("Enter number of sales people: "); // Ask user for number of sales people
         input = scan.next(); // Get user input again
      }
      sales = new double[Integer.parseInt(input)]; // Set double array length to number of sales people
      for (int i=0; i<sales.length; i++) // For loop for each salesperson
      {
         System.out.print("Enter sales for salesperson " + (i+1) + ": "); // Ask user for sales for each salesperson
         input = scan.next(); // Get and set string value of input
         while (checkInput(input) == false && checkDouble(input) == false) { // While input is not a number or double
            System.out.println("Please only enter numbers"); // Tell user to only enter numbers
            System.out.print("Enter sales for salesperson " + (i+1) + ": "); // Ask user for sales for each salesperson
            input = scan.next(); // Get user input again
         }
      
         sales[i] = Double.parseDouble(input); // Assign sales value of sales person to sales array as a double

         if (sales[i] > max) // If sales is greater than current max value
         {
            max = sales[i]; // Set max value to current sales
            maxid = (i+1); // Set max id to current salesperson id
         }
         if (sales[i] < min) // If sales is less than current min value
         {
            min = sales[i]; // Set min value to current sales
            minid = (i+1); // Set min id to current salesperson id
         }
      }
      
      // Start Output
      System.out.println("\nSalesperson   Sales"); // Categorize list
      System.out.println("--------------------"); // Line seperator
      sum = 0; // Set sum value to 0
      for (int i=0; i<sales.length; i++) // For loop for each salesperson
      {
         System.out.println("    " + (i+1) + "          " + checkFormat(sales[i])); // Output salesperson id and sales
         sum += sales[i]; // Add current sales to total sum
      }
      System.out.println("\nTotal sales: $" + checkFormat(sum)); // Print total sales
      System.out.println("Average sales: $" + checkFormat(sum/sales.length)); // Calculate and print average sales
      System.out.println("\nSalesperson " + maxid + " had the highest sales with $" + checkFormat(max)); // Print maximum sales including id of salesperson
      System.out.println("Salesperson " + minid + " had the least sales with $" + checkFormat(min)); // Print minimum sales including id of salesperson
      
      System.out.print("\nEnter sales goal: "); // Ask user to enter sales goal amount
      goal = scan.nextInt(); // Set value of goal to sales goal
      
      System.out.println("\nSalesperson   Sales"); // Categorize output
      System.out.println("--------------------"); // Line seperator
      for (int i=0; i<sales.length; i++) // For loop for each salesperson
      {
         if (goal < sales[i]) { // If goal is less than current salesperson sales
            System.out.println("    " + (i+1) + "          " + checkFormat(sales[i])); // Print salesperson id and sales amount formatted to nearest cent
            g++; // Count number of salespeople who exceeded sales goal
         }     
      }
      System.out.println("\n" + g + " salespeople exceeded the sales goal of $" + checkFormat(goal)); // Print number of sales people who exceeded the sales goal
   }
   public static boolean checkInput(String check) // Boolean method to check if input is a number
   {
      // Credit https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
      Pattern p = Pattern.compile("\\d"); // Set pattern to see if string only contains digits
      Matcher m = p.matcher(check); // Check if string matches only digits 
      boolean b = m.matches(); // Set boolean to to or false based on the match results
      
      //Credit https://docs.oracle.com/javase/tutorial/java/javaOO/returnvalue.html
      return b; // Return true or false
   }
 
   public static boolean checkDouble(String check) // Boolean method to check if string is a double
   {
      // Credit https://stackoverflow.com/questions/3543729/how-to-check-that-a-string-is-parseable-to-a-double
      boolean b = true; // Set boolean to true as default
      try
      {
         Double.parseDouble(check); // Check if String converts to a double
      }
      catch(NumberFormatException e) // If String does not convert to a double
      {   
         b = false; // Set boolean to false
      }
      return b; // Return true or false
   }

   public static String checkFormat(double check) // String method to format output
      {
      if (String.valueOf(check).endsWith(".0") == true) { // If String value of double ends with .0 (a whole number)
         DecimalFormat whole = new DecimalFormat("0.#"); // Remove the decimals
         return whole.format(check); // Return whole number
      } else { // If String value of double has decimals
         DecimalFormat df = new DecimalFormat("0.00"); // Format to nearest cent
         return df.format(check); // Return double formatted to nearest cent
      }
      
   }
}