import java.util.Scanner; // Imports Java Util Scanner

public class TheSpeedOfSound
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in); // Initiate keyboard input
      
      double distance, time = 0; // Declare distance and time as doubles to get exact calculation when dividing
      String medium; // Declare String medium to represent the medium of sound
      
      System.out.print("Enter the medium (air, water, or steel): "); // Ask user to input medium of air, water, or steel
      medium = scan.next(); // Get medium from user and set value of medium
      
      System.out.print("Enter the distance in feet: "); // Ask user to input the distance the sound will travel in feet
      distance = scan.nextInt(); // Get distance from user and set value of distance
      
      switch(medium) {
         case "air":    time = distance / 1100; // If medium is air, divide distance by 1,100
                        break;
         case "water":  time = distance / 4900; // If medium is water, divide distance by 4,900
                        break;
         case "steel":  time = distance / 16400; // If medium is steel, divide distance by 16,400
                        break;
         default:       System.out.println("Please enter a valid medium."); // If medium is not air, steel, or water then tell user to enter valid medium
                        System.exit(0); //quit program before output
                        break;
      }

      if (time % 1 == 0) { // Check if time is an integer number to remove decimals
      //Output the time as an integer to remove the decimals when not needed
      System.out.println("it will take " + (int) time + " seconds for the sound to travel through " + (int) distance + " feet of " + medium);
      } else { // If time is a decimal, then print the exact amount of seconds
      // Output the time of seconds as a decimal for precise time
      System.out.println("it will take " + time + " seconds for the sound to travel through " + (int) distance + " feet of " + medium);
      }
   }
}