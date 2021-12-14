import java.util.*;
public class Loop
{

   public static void main(String[] args)
   {
   
   Random r = new Random();
   
   for (int i = 1; i < 10; i++)
   {
      System.out.println( 1 + r.nextInt(6));
   }


     // for (int i=0; i<=1000; i++) {
            // if ((i%13==0) && (i%17==0) && (i!=0))
                  //System.out.println(i);
     // }
   }
}