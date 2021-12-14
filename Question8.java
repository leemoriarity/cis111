public class Question8
{
   public static void main(String[] args)
   {
   
      int max = 5; // Set value to maximum number you want to loop through, which is 5
   
      for (int i = 1; i <=max; i++) // Start for loop depending on how many numbers you want to output
      {   
         int num = max-i; // Declare and set value of num to maximum number minus the current number
         
         for (int o = 0; o < num; o++) // For numbers 0 to maximum number minus the current number
         {
            System.out.print("."); // Print dots
         }
   
         for (int j = 0; j < max-num; j++) // For numbers 0 to maximum number minus (maximum number minus the current number)
         {
            System.out.print(i); // Print the number
         }
         
         System.out.print("\n"); // Print new line for next number
      }
      
   }
}