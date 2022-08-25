import java.util.Scanner;

public class Methods {

   public static void getRequirements()
   {
    System.out.println("Developer: Carson Darrow");
    System.out.println("Program evaluates largest number");
    System.out.println("Note: Program does *not* check for non-numeric characters or non-integer values");   
   }

   public static void largestNumber()
   {
    int num1, num2;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter first integer: ");
    num1 = sc.nextInt();

        System.out.println("Enter second integer: ");
        num2 = sc.nextInt();

    if (num1 > num2){
        System.out.println(num1 + " is greater than " + num2);
    }
    else if (num1 < num2) {
        System.out.println(num2 + " is greater than " + num1);
    } 
    else 
        System.out.println("Integers are equal");


   }
}
