import java.util.Scanner;

public class Methods 
{
    public static void getRequirements() 
    {
        System.out.println("Sphere Calculator Program\n");

        System.out.println("Program calculates sphere volume in liquid U.S. gallons from user-entered diamter value in inches, \nand rounds to two decimal places.");
        System.out. println("Must use Java's *built-in*  PI and pow() capabilities.");
        System.out.println("Program checks for non-integers and non-numeric values.");
        System.out.println("Program continues to prompt user for user entry until no longer requested, prompt accepts upper of lower case letters.");

        System.out.println(); //print break line
    }

    public static void getSphereVolume() 
    {
        Scanner sc = new Scanner(System.in);
        double volume = 0.0;
        double gallons = 0.0;
        char choice = ' ';
        int diamter = 0;

        do{
            System.out.print("Please enter diameter in inches: ");
            while (!sc.hasNextInt())
            {
                System.out.println("Not valid integer!\n");
                sc.next();
                System.out.print("Please try again. Enter diameter in inches: ");
            }
            diamter = sc.nextInt();

            System.out.println();

            volume = ((4.0/3.0))* Math.PI * Math.pow(diamter/2.0, 3);
            gallons = volume/231;
            System.out.println("Sphere volume " + String.format("%,.2f", gallons) + " liquid U.S. gallons");

            System.out.print("\nDo you want to calculate another sphere volume (y or n)? ");
            choice = sc.next().charAt(0);
            choice = Character.toLowerCase(choice);
        }
        while (choice == 'y');

        System.out.println("Thank you for using our Sphere Volume Calculator!");

    }
}
