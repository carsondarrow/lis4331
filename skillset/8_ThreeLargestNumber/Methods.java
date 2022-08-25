import java.util.Scanner;


public class Methods {

//nonvlaue-returning method (static requires no object)
    public static void getRequirements() {
        System.out.println("Developer: Carson Darrow");
        System.out.println("Program evaluates largest of three numbers.");
        System.out.println("Note: Program checks for integers and non-numeric values.");
    }

    public static void validateUserInput() {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0;

        //prompt user for 3 integers
            System.out.print("Please enter a first number: ");
        while (!sc.hasNext())
        {
            System.out.println("Not valid integer!\n");
            sc.next(); //important! If omitted, will go into infinate loop on invalid input!
            System.out.print("Please try again. Enter first number: ");
        }
        num1 = sc.nextInt();

        //prompt user for 3 integers
        System.out.print("Please enter a second number: ");
        while (!sc.hasNextLine())
        {
            System.out.println("Not a valid integer!\n");
            sc.next();
            System.out.print("Please try again. Enter second number: ");
        }
        num2 = sc.nextInt();

        System.out.print("Please enter a thirds number: ");
        while (!sc.hasNextLine())
        {
            System.out.println("Not a valid integer!\n");
            sc.next();
            System.out.print("Please try again. Enter third number: ");
        }
        num3 = sc.nextInt();

        System.out.println();

        getLargestNumber(num1, num2, num3);
    }

    public static void getLargestNumber(int num1, int num2, int num3) {
        System.out.println("Numbers entered: " + num1 + ", " + num2 + ", " + num3);

        if (num1 > num2 && num1 > num3)
        System.out.print(num1 + " is largest.");
        else if (num2 > num1 && num2 > num3)
        System.out.print(num2 + " is largest.");
        else if (num3 > num1 && num3 > num2)
        System.out.print(num3 + " is largest.");
        else 
        System.out.println("Integers are equal.");
    }
}