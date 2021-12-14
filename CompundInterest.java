import java.lang.Math; //Imports java lang Math package
import java.util.Scanner; //Imports Java Util Scanner package
import java.text.DecimalFormat; //imports Java Text Decimal Format package

public class CompundInterest
{
   private static DecimalFormat cents = new DecimalFormat("0.00"); // Convert data to currency format
   // Credit https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/
   
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in); //Initiate keyboard input

      double A, P, r, n, t; //Declare variables used for compound interest formula
      
      //Ask user to input original principal amount
      System.out.print("Enter the amount of principal originally deposited into account: $");
      P = keyboard.nextDouble(); //Read input of user and set value of P
             
      //Ask user to input anual interest rate percentage
      System.out.print("Enter the percentage of annual interest rate paid by the account (Ex: 2% is .02): ");
      r = keyboard.nextDouble(); //Read input of user and set value of r
      
      //Ask user to input number of times per year that interest is compounded
      System.out.print("Enter the number of times per year that the interest is compounded: ");
      n = keyboard.nextDouble(); //Read input of user and set value of n 
      
      //Ask user to input the number of years the account will be left to earn interest
      System.out.print("Enter the number of years the account will be left to earn interest: ");
      t = keyboard.nextDouble(); //Read input of user and set value of t
            
      //Calculate the amount of money in the account after number of years using the compound interest formula
      A = P * Math.pow(1+r/n, n*t);
      
      //Output the amount of money that will be in the account after the amount of years entered by user
      System.out.println("Amount of money that will be in the account after " + (int) t + " years: $" + cents.format(A));
      //Output the total interest earned by calculating the new total from the original amount
      System.out.println("Total interest earned: $" + cents.format(A-P));
   }
}