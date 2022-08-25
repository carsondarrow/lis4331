import java.util.Scanner;
import java.util.Random;

public class Methods {

   public static void getRequirements()
   {
      System.out.println("Developer: Carson Darrow");
      System.out.println("Print minimum and maximum integer values.");
      System.out.println("Program prompts user to enter desired number of pseudorandom-generated integers (min 1).");
      System.out.println("Use following loop structures: for, enhannced for, while, do...while.");

      System.out.println();

      System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
      System.out.println("Integer.MAX_VLUE: " + Integer.MAX_VALUE);
      System.out.println();
   }
   

   public static int[] createArray()
    {
      Scanner sc = new Scanner(System.in);
      int arraySize = 0;
      
      System.out.println("Entered desired number of pseudorandom-generated integers (min 1): 5");
      arraySize = sc.nextInt();

      int yourArray[] = new int[arraySize];
      return yourArray;

    }

   public static void generatedpseudorandomintegers(int[] myArray) 
   {
   Random r = new Random();

   int i = 0;
   System.out.println("for loop");
   for(i=0; i < myArray.length; i++)
   {
   System.out.println(r.nextInt());
   }

   System.out.println("\nEnhanced for loop:");
   for (int n: myArray)
   {
      System.out.println(r.nextInt());
   }

   System.out.println("\nwhile loop:");
   i=0;
   while (i< myArray.length)
   {
      System.out.println(r.nextInt());
      i++;
   }

   i=0;
   System.out.println("\ndo...while loop:");
   do
   {
      System.out.println(r.nextInt());
      i++;
   }
   while (i < myArray.length);


}


}
