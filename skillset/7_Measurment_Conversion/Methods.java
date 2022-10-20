import java.util.Scanner;

public class Methods {
    public static void getRequirements(){
        System.out.println("Developer: Carson Darrow");
        System.out.println("Program converts inches to centimeters, meters, feet, yards, and miles.");
        System.out.println("***Notes***:");
        System.out.println("1) Use integer for inches (must validate integer input).");
        System.out.println("2) Use printf() function to print (format values per below output).");
        System.out.println("3) Create Java \"constants\" for the following values:");
        System.out.println("\tINCHES_TO_CENTIMETER,\n\tINCHES_TO_METER,\n\tINCHES_TO_FOOT,\n\tINCHES_TO_YARD,\n\tFEET_TO_MILE\n");
    }//end getRequirements

    public static void validateUserInput(){
        int num = 0;
        Scanner scnr = new Scanner(System.in);

       System.out.print("Please enter number of inches: ");
       while(!scnr.hasNextInt()){
        System.out.println("Not valid integer!\n");
        scnr.next();
        System.out.print("Please enter number of inches: ");
       }
       num = scnr.nextInt();

       printResults(num);
       scnr.close();
    }//end validateUserInput 

    public static void printResults(int inch){
        final double INCHES_TO_CENTIMETER = inch * 2.540000;
        final double INCHES_TO_METER = inch * 0.025400;
        final double INCHES_TO_FOOT = inch * 0.08333333334;
        final double INCHES_TO_YARD = inch * 0.027777777777;
        final double FEET_TO_MILE = inch * 0.0000157828282828;

        System.out.println(inch + " inch(es) equals\n");        
        System.out.printf("%,.6f centimeter(s)\n", INCHES_TO_CENTIMETER);
        System.out.printf("%,.6f meter(s)\n", INCHES_TO_METER );
        System.out.printf("%,.6f feet\n", INCHES_TO_FOOT);
        System.out.printf("%,.6f yard(s)\n", INCHES_TO_YARD);
        System.out.printf("%,.8f mile(s)\n\n", FEET_TO_MILE);
    }//end printResults

    public static void findMultipleNumbers() {
    }

}//end class