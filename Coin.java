import java.util.Random; // Import java.util package Random class

public class Coin
{
   private String sideUp; // Declare rivate String sideup to hold "heads" or "tails" 
   
   public Coin() // No-arg constructor Coin
   {
      toss(); //Initialize sideUp field by calling toss method 

   }
   
   public void toss() // Void Method named toss
   {
      Random r = new Random(); // Made new Random 
      if (r.nextBoolean() == true) // If random boolean is true
         this.sideUp = "heads"; // Side up is heads
      else // If random boolean is false
         this.sideUp = "tails"; // Side up is tails
   }
   
   public String getSideUp() // String method getSideUp
   {
      return sideUp; // Return side up
   }
   
   public static void main(String[] args)
   {
      final int NUMBER = 20; // Declare final integer NUMBERS and initialize value to 20
      Coin c = new Coin(); // IDeclare Coin c and initialize nusing Coin method
      int heads = 0; // Declare integer heads
      int tails = 0; // Declare integer tails
      
      System.out.println("The side initially facing up: "+ c.getSideUp()); // Show the initial side up using getSideUp method
      System.out.println("Flipping coin " + NUMBER + " times"); // Output number of times coin will be flipped
      for (int i = 0; i < NUMBER; i++) // Cycle through number of coin flips
      {
         c.toss(); // Toss coin using toss method
         System.out.printf("%9s %5s",
         "Toss " + (i+1) + ": ", c.getSideUp() + "\n"); // Print formatted toss number and side up
         if (c.getSideUp() == "heads") // If side up is heads
            heads++; // Add to total heads count
         else // If side up is tails
            tails++; // Add to total tails count
      }  
      System.out.println("\nheads: " + heads + "      tails: " + tails); // Output total number of heads and tails
   }
}