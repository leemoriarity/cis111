import java.util.Scanner; // Import Java Util Scanner package

public class Question6
{
   public static void main(String[] args)
   {
      
      Scanner scan = new Scanner(System.in); // Initiate scanner
      String input, output = ""; // Declare string input and output
      String[] num; // Declare array to hold values after splitting string
      
      System.out.print("Enter a series of numbers ending with a 0: "); // Ask user to enter a series of numbers
      input = scan.nextLine().replaceAll(" ",""); // Get numbers entered by user, remove spaces
      
      while (input.endsWith(",0") == false && input.contains(",0,") == false) // While user has not entered 0
      {
         System.out.print("Your series of numbers must end with a 0: "); // Request that the user end with a 0
         input+= "," + scan.nextLine().replaceAll(" ",""); // Continue getting numbers entered by user until they enter a 0, remove spaces
      }
      
      num = input.split(","); // Assign array values by splitting string using comma as a delimiter
      
      for (int i = 0; i<num.length; i++) // Begin for loop for each number entered
      {         
         int x = Integer.parseInt(num[i]); // Convert string to integer
         
         if (x==0) { // If number is 0
            System.out.print(output); // Print output
            System.exit(0); // Exit program
         }
         
         if (x % 3 == 0 ) { // If number is divisible by 3
            num[i] = "FIZZ"; // Replace number with FIZZ
         }
         
         if (x % 5 == 0) { // If number is divisible by 5
            num[i] = "BUZZ"; // Replace number with BUZZ
         }
         
         if (x % 3 == 0 && x % 5 == 0) { // If number is divisible by 3 and 5
            num[i] = "FIZZBUZZ"; // Replace number with FIZZBUZZ
         }
         
         output += num[i] + " "; // Add result to output
         
      }
   }
}