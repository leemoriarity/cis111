import java.util.Scanner; // Import Java Util Scanner package

public class Question7
{
   public static void main(String[] args)
   {
   
      Scanner scan = new Scanner(System.in); // Initiate scanner
      String word = ""; // Declare String word and set value to nothing

      System.out.print("Enter a word: "); // Ask user to enter a word
      word = scan.nextLine(); // Set value of word to word entered by the user
      
      if (word.contains("z")) { // If word contains z
      System.out.print("Weird word ! "); // Print Weird word ! 
      }
      
      if (word.endsWith("est")) { // If word ends with est
      System.out.print("Superlative!"); // Print Superlative!      
      }
      
      System.out.print("\n" + 5 * word.length()); // Print 5 times number of letters
      
   }
}