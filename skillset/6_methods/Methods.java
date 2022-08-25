import java.util.*;

public class Methods {

   public static void getRequirements(){
      System.out.println("Developer: Carson Darrow");
      System.out.println("Program prompts user for first name and age, then prints result.");
      System.out.println("Create four methods from the following reqiurments:");
      System.out.println("1) getRequirments(): Void method displays programing requirments.");
      System.out.println("2) getUserInput(): Void method prompts for user input, \nthen calls two methods: myVoidMethod() and myValueReturningMethod().");
      System.out.println("3) myVoidMethod():");
      System.out.println("      a. Accepts two arguments: String and int");
      System.out.println("      b. Prints user's first name and age.");
      System.out.println("4) myValueReturning()");
      System.out.println("      a. Accepts two arguments: String and int");
      System.out.println("      b. Returns String contains first name and age.");
      System.out.println();
   }

   public static void method() 
   {
      int age;
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter first name: ");
      String str = sc.nextLine();
      System.out.println();
      System.out.println("Enter age: ");
      age = sc.nextInt();

      System.out.println();

      System.out.print("void method call: "); 
      System.out.println(str + " is " + age);
      
      System.out.print("value-returning method call: ");
      System.out.println(str + " is " + age);
   }

}
      