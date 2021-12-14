import java.text.DecimalFormat; // Import java.text package DecimalFormat class

public class Celsius
{
   public static void main(String[] args)
   {
      System.out.println("   °F            °C"); // Print out list labels
      System.out.println(" ------  __  -----------"); // Print line divider
      
      for (int i=20; i>=0; i--) // For number 20-0
      {
         if (i<10) // If number is less than 10
            System.out.println("   " + i + "°F  |**|  " + celcius(i) + "°C"); // Print fahrenheit and celcius equivalent values
         else // If number is more than 10
            System.out.println("  " + i + "°F  |  |  " + celcius(i) + "°C"); // Print fahrenheit and celcius equivalent values
      }
      System.out.println("        '**` "); // Print thermometer ascii art
      System.out.println("       (****) ");
      System.out.println("        `--' ");
   }
   
   public static double celcius(int f) // Method celcius that takes a fahrenheit integer and returns celsius equivalent as a double
   {
      double c = 5.0/9*(f-32); // Convert to celcius from farenheit
      return Double.parseDouble(new DecimalFormat("#.###").format(c)); // Return degrees celcius as double to formatted to three decimal places
   }
}