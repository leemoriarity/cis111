import java.util.Scanner; // Imports Java Util Scanner

public class BookClubPoints
{
   public static void main(String[] args)
   {
   
      Scanner scan = new Scanner(System.in); // Initiate keyboard input
      
      int books, points = 0; // Declare books and points as an integer and set value to 0
      
      System.out.print("Enter the number of books purchased this month: "); // Ask user to input number of books
      books = scan.nextInt(); // Get number of books from user and set value of books variable
      
      switch(books) {
         case 0:  points = 0; // If amount of books is 0 then award 0 points
                  break;
         case 1:  points = 5; // If amount of books is 1 then award 5 points
                  break;
         case 2:  points = 15; // If amount of books is 2 then award 15 points
                  break;
         case 3:  points = 30; // If amount of books is 3 then award 30 points
                  break;
         default: points = 60; // If amount of books is 4 or more then award 60 points
                  break;
      }
      
      System.out.println(books + " books earns you " + points + " points"); // Output number of books purchased and how many points awarded
      
   }
}