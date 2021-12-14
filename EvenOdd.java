import java.util.Random; // Import java.util package Random class

public class EvenOdd
{
   public static void main(String[] args)
   {
      Random r = new Random(); // Declare Random n;
      int e = 0; // Declare integer e to represent number of even numbers and set value to 0
      int o = 0; // Declare integer o to represent number of odd numbers and set value to 0
      
      for (int i=0; i<100; i++) // For numbers 1 - 100
      {
         int n = r.nextInt(1000); // Generate random number between 1 and 1000
         if (isEven(n) == true) // If number is even
            e++; // Add count to e
         else // If number is odd
            o++; // Add count to o
      }
      System.out.print("even: " + e + "\n odd: " + o); // Output number of even and odd numbers
   }
   
   public static boolean isEven(int n) // Method isEven that takes an int argument and returns a boolean
   {
      boolean result = false; // Declare boolean result and set default value to false
      
      if (n%2==0) // If number is even
         result = true; // Set result to true
      
      return result; // Return true or false
   }
}