import java.util.Scanner; // Imports Java Util Scanner

public class FavCity
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in); // Initiate keyboard input
      
      String favCity; //Declare String variable favCity to represent favorite city
      
      System.out.print("Enter the name of your favorite city: "); //Ask user to input favorite city
      favCity = keyboard.nextLine(); //Read input of whole line and set value of favCity to data entered
      
      System.out.println("Favorite City: " + favCity); //Output the name of users favorite city
      System.out.println("Number of characters: " + favCity.length()); //Output the number of characters
      System.out.println("Uppercase: " + favCity.toUpperCase()); //Output String favCity to all uppercase
      System.out.println("Lowercase: " + favCity.toLowerCase()); //Output String favCity to all lowercase
      System.out.println("First character: "+ favCity.charAt(0)); //Output first letter of String favCity 
   }
}