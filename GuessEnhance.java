import java.util.*; // Imports Java Util Package
public class GuessEnhance
{
   public static void main(String[] args)
   {
   
      Scanner scan = new Scanner(System.in); // Initiate keyboard input
      Random r = new Random(); // Make new random variable
      int guess; // Declare variable guess as integer
      int n = 1 + r.nextInt(10); // Declare variable n and and make new random number between 1 and 10 by adding 1
      int i = 1; // Declare variable i and set value to 1
      
      System.out.print("Guess a number between 1 and 10: "); // Ask user to guess a number between 1 and 10
      guess = scan.nextInt(); // Set value of guess with number guessed by the user
               
      while (guess != n){ // While guess is not correct
         if (guess > n) // If guess is too high
            System.out.println("Too high, try again"); // Tell user guess is too high, try again
         if (guess < n) // If guess is too low
            System.out.println("Too low, try again"); // Tell user guess is too low, try again
            
         System.out.print("Guess a number between 1 and 10: "); // Ask user to guess again
         guess = scan.nextInt(); // Get new guess, repeat process until user guesses correct answer
         i++; // Count number of guesses
      }
      if (i == 1) // If user guesses on the first try
         System.out.println("You guessed correct on the first try! The number was " + n + ".");
      else // If user guesses more than one guess
         System.out.println("You guessed correct in " + i + " guesses! The number was " + n + ".");
   }
}