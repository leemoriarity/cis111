import java.util.Scanner; // Imports Java Util Scanner
public class MilesPerGallon
{
   public static void main(String[] args)
   {
   
      Scanner keyboard = new Scanner(System.in); // Initiate keyboard input
      
      int mileage, gallons, mpg; // Declare variables without setting a value
      
      System.out.print("Enter the number of miles driven: "); // Ask user to input miles driven
      mileage = keyboard.nextInt(); // Read and set the value into the variable named mileage
      
      System.out.print("Enter the number of gallons used: "); // Ask user to input gallons used
      gallons = keyboard.nextInt(); // Read and set the value into the variable named gallons
      
      mpg = mileage/gallons; // Calculate MPG by dividing mileage by gallons used
      System.out.println("The miles-per-gallon is: " + mpg + " MPG"); // Output Miles-per-gallon
      
   }
}      
      
