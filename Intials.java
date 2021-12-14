public class Intials
{
   public static void main(String[] args)
   {
      String firstName = "Lee"; //Declare String firstName and set value to my first name
      String middleName = "Michael"; //Declare String middleName and set value to my middle name
      String lastName = "Moriarity"; //Declare String lastName and set value to my last name
      char firstInitial = firstName.charAt(0); //Declare char firstInitial and set value to first character of my first name
      char middleInitial = middleName.charAt(0);//Declare char middleInitial and set value to first character of my middle name
      char lastInitial = lastName.charAt(0); //Declare char lastInitial and set value to first character of my last name
      
      System.out.println("Full Name: " + firstName + " " + middleName + " " + lastName); //Output my first, middle, and last name
      System.out.println("Initials: " + firstInitial + middleInitial + lastInitial); //Output my first, middle, and last initials
   }
}