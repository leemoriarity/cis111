public class Question3
{
   public static void main(String[] args)
   {
   
      int sum = 0; // Declare variable sum and set value to 0
      
      for (int i = 0; i<1000; i++) // For numbers 0-999
      {
      
         if (i % 2 == 0) { // If number is even
         sum += i; // Add number to total sum
         }
         
      }
      
      System.out.print(sum); // Print total sum of all even numbers
      
   }
}