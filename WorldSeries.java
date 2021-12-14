import java.io.File; // Import java.io package File class
import java.io.IOException; // Import java.io package IOException class
import java.util.Scanner; // Import java util Scanner class

public class WorldSeries
{
   public static void main(String[] args) throws IOException
   {
      File myFile = new File("WorldSeriesWinners.txt"); // Set path to txt file
      Scanner inputFile = new Scanner(myFile); // Declare and initialize scanner to scan txt file
      Scanner scan = new Scanner(System.in); // Declare and initialize scanner to get keyboard input
      String[] list = new String[count()]; // Declare and initialize String array list and set count using count() method
      int o = 0; // Declare o as integer to increment through list array
      int w = 0; // Declare w as integer to count number of wins
      String team; // Declare String team to get user input
      String years = ""; // Declare string years to output the years the team won the world series
     
      while (inputFile.hasNext()) // While text file has next
      {
         list[o]= inputFile.nextLine(); // Assign value of sub o to Next line of text file
         o++; // Increment o
      }
      inputFile.close(); // Close file input
      //Print ascii art 
      System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&   ##############");
      System.out.println("&&&&&&&&&&&&&&&&&&&&        &&&&   ############");
      System.out.println("&&&&  WORLD  &&&&&&           &&&&  ###########");
      System.out.println("&&&$  SERIES &&&&             &&&&&,  #########");
      System.out.println("&&&&  WINS   &&&&&&                &&   #######");
      System.out.println("&&&&&&&&&&&&&&&&&&&&                      #####");
      System.out.println("&&&&&&&&&&&&&&&&&&                          ###");
      System.out.println("&&&&   %&&&&&&&&&                             #");
      System.out.println("&&&&&&&&&&&&&&&&&                           ###");
      System.out.println("&&&&&&&&&&&&&&&&&&&&                   ########");
      
      System.out.print("\nPlease enter a team: "); // Ask user to enter a team name
      team = scan.nextLine(); // Assign value to string team with team entered by user
      
      for (int i = 0; i < (list.length - 1); i++) // For each team in the list
      {
         if (list[i].toLowerCase().contains(team.toLowerCase())) // If the team matches the team name in the list
         {
         years += list[i] + " " + (i+1903) + "\n"; // Add name of team and the year they won to string years
            w++; // Count number of total wins using increment
         }
      }
      if (w < 10) { // If wins are single digit
         System.out.println("+---------------------+");
         System.out.println("| " + w + " World Series wins |"); // Output number of wins and print the name of the team and the years won
         System.out.println("+---------------------+");
      } else {  // If wins are double digits
         System.out.println("+----------------------+");
         System.out.println("| " + w + " World Series wins |"); // Output number of wins and print the name of the team and the years won
         System.out.println("+----------------------+");
      }
         System.out.println(years);
      
   } // end main
   
   public static int count() throws IOException // Start count() method
   {
      File myFile = new File("WorldSeriesWinners.txt"); // Set path to text file
      Scanner inputFile = new Scanner(myFile); // Scan through text file
      int lines = 0; // Declare int lines to count number of lines
      
      while (inputFile.hasNext()) // While text file has next
      {
         lines++; // Count number of lines
         inputFile.nextLine(); // Move to next line to keep counting
      }
      
      inputFile.close(); // Close file scanner
      return lines; // Return number of lines to initialize array length

   } // end count
} // end class