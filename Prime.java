public class Prime
{
   public static void main(String[] args)
   {
      int i = 0; // Declare i and set value to 0
      int o = 0; // Declare o and set value to 0
      
      for (i=0;i<=1000000;i++) // For numbers 0 - 1000
      {
         if (isPrime(i) == true) // If number is a prime number
         {
            System.out.printf("%6d ",i); // Print formatted number padded with blank spaces
            o++; // Increment o
            
            if (o%15==0) // For every 15 digits
               System.out.println(); // Start a new line
         }
      }
      System.out.println("\n\n" + o + " prime numbers between 0 and " + (i-1)); // Output total number of prime numbers 
   }
   
   public static boolean isPrime(int n) // isPrime method that takes an integer argument and returns boolean
   {
      boolean result = true; // Declare boolean and set default value to true 
      
      if (n<2) // If number is less than 2
         result = false; // Number is not prime
       
      for(int i=2; i<=Math.sqrt(n); i++) // For numbers 2 to square root of number
      {
         if(n%i==0) // If number mod i is 0
            result = false; // Number is not prime
      }
      
      return result; // Return true or false
   }
}