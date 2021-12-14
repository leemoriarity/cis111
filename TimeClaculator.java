import java.util.Scanner; // Imports Java Util Scanner

public class TimeClaculator
{
   public static void main(String[] args)
   {
   
      Scanner scan = new Scanner(System.in); // Initiate keyboard seconds
      
      int seconds; // Declare seconds as an integer
      
      System.out.print("Enter the number of seconds: "); // Ask user to input number of seconds
      seconds = scan.nextInt(); // Get number of seconds from user and set value to seconds
      
      if (seconds < 60) { // If seconds is less than 60
         System.out.println(seconds + " seconds"); // Output time in seconds
      } else if (seconds >= 60 && seconds < 3600) { // If seconds is greater than or equal to 60 and less than 3600
         System.out.println(seconds / 60 + " minutes " + seconds % 60 + " seconds"); // Output time in minutes and seconds
      } else if (seconds >=3600 && seconds < 86400) { // If seconds is greater than or equal to 3600 and less than 86400
         System.out.println(seconds / 3600 + " hours " + seconds % 3600 / 60 + " minutes " + seconds % 3600 % 60 + " seconds"); // Output time in hours, minutes, and seconds
      } else if (seconds >= 86400) { // If seconds is greater or equal to 86,400
         System.out.println(seconds / 86400 + " days " + seconds % 86400 / 3600 + " hours "
         + seconds % 86400 % 3600 / 60 + " minutes " + seconds % 86400 % 3600 % 60 + " seconds"); // Output time in days, hours, minutes, and seconds
      }
      
   }
}