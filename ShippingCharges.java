import java.util.Scanner; // Imports Java Util Scanner
import java.text.DecimalFormat; // Imports Java Text Decimal Format package

public class ShippingCharges
{
   private static DecimalFormat df = new DecimalFormat("0.00"); // Convert data to currency format

   public static void main(String[] args)
   {
   
      Scanner scan = new Scanner(System.in); // Initiate keyboard input
      
      int weight, distance, miles; // Declare weight, distance, and miles as integers
      double rate = 0; // Declare rate as a double in order to get currency value
      
      System.out.print("Enter the weight of the package in pounds: "); //Ask user to input weight of package
      weight = scan.nextInt(); // Get weight of package from user and set value of weight
      
      System.out.print("Enter the number of shipping miles : "); //Ask user to input number of shipping mile
      distance = scan.nextInt(); // Get shipping miles from user and set value of distance
      
      miles = distance / 500; // Calculate the number of miles the customer will be charged for
      
      if(distance % 500 > 0) { // Calculate the additional miles that are not prorated
         miles++; // Add extra 500 miles rate to total miles
      }

      if (weight <= 2) { // If weight of package 2 pounds or less
         rate = 1.10; // Shipping rate is $1.10
      } else if (weight > 2 && weight <= 6) { // If weight of package is over 2 pounds but no more than 6 pounds
         rate = 2.20; // Shipping rate is $2.20
      } else if (weight > 6 && weight <= 10) { // If weight of package is over 6 pounds but no more than 10 pounds
         rate = 3.70; // Shipping rate is $3.70
      } else if (weight > 10) { // If weight of package is over 10 pounds
         rate = 3.80; // Shipping rate is $3.80
      }
      
      System.out.println("Shipping cost is: $" + df.format(miles * rate)); // Output total shipping cost by multiplying miles charged by shipping rate
      
   }
}