import java.util.Scanner; //imports Java Util Scanner package
import java.text.DecimalFormat; //imports Java Text Decimal Format package

public class RestaurantBill
{
   private static DecimalFormat cents = new DecimalFormat("0.00"); // Convert data to currency format
   // Credit https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/
   
   public static void main(String[] args)
   {
   
      Scanner keyboard = new Scanner(System.in); // Initiate keyboard input of user
      
      double meal, total, taxAmount, tipAmount; // Declare variables without a value
      double tax = 0.0675; // Declare and set value of tax percentage
      double tip = 0.2; // Declare and set value of tip percentage
                  
      System.out.print("Enter the cost of your meal: $"); // Ask user to input meal charge
      
      meal = keyboard.nextDouble(); // Set value of meal charge from user input
      taxAmount = meal * tax; // Calculate tax amount
      tipAmount = meal * tip; // Calculate tip amount
      total = meal + taxAmount + tipAmount; // Calculate total amount
      
      System.out.println("Meal Charge: $" + cents.format(meal)); // Output meal charge rounded to nearest cent
      System.out.println("Tax Amount (6.75%): $" + cents.format(taxAmount)); // Output tax amount rounded to nearest cent
      System.out.println("Tip Amount (20%): $" + cents.format(tipAmount)); // Output tip amount rounded to nearest cent
      System.out.println("Total Amount: $" + cents.format(total)); // Output total amount rounded to nearest cent
      
   }
}