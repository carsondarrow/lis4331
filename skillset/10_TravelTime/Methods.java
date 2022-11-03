import java.util.Scanner;

public class Methods {
    public static void getRequirements() {
        System.out.println("Developer: Carson Darrow");
        System.out.println("Program Calculates approximate travel time.");
        System.out.println("Program prompts user to enter miles and mph.");
        System.out.println("Accept decimal entries.");
        System.out.println("Prompt user to continue (only is user enters \"y\" or \"Y\").");
        System.out.println("*Must perform data validation*");
        System.out.println("Display approximate travel time in hours and minutes.");
        System.out.println();
    }//end getRequirements

    public static double validateMilesDataType(){
        double miles = 0.0;
        Scanner scnr = new Scanner(System.in);

        //input
        System.out.print("Please enter miles: ");
        while(!scnr.hasNextDouble()){
            System.out.println("Invalid input--miles must be a number.\n");
            scnr.next();
            System.out.print("Please enter miles:");
        }//end while

        miles = scnr.nextDouble();

        return miles;
    }//end validateMilesDataType

    public static double validateMilesRange(double miles) {
        while(miles <= 0 || miles > 3000){
            System.out.println("Miles must be greater than 0, and no more than 3000.\n");
            miles = validateMilesDataType();
        }//end while

        return miles;
    }//end validateMilesRange

    public static double validateMPHDataType(){
        double mph = 0.0;
        Scanner scnr = new Scanner(System.in);

        //input
        System.out.print("Please enter MPH: ");
        while(!scnr.hasNextDouble()){
            System.out.println("Invalid input--mph must be a number.\n");
            scnr.next();
            System.out.print("Please enter MPH: ");
        }//end while
        mph = scnr.nextDouble();
        return mph;
    }//end validateMPHDataType

    public static double validateMPHRange(double mph){
        while(mph <= 0 || mph > 100){
            System.out.println("MPH must be greater than 0, and no more than 100.\n");
            mph = validateMPHDataType();
        }//end while
        return mph;
    }//end validateMPHRange

    public static void calculateTravelTime(double miles, double mph) {
        double hours = 0.0;
        int minutes = 0;
        int hoursInt = 0;
        int minutesRemainder = 0;

        hours = miles / mph;

        minutes = (int)(hours * 60);

        hoursInt = minutes / 60;
        minutesRemainder = minutes % 60;

        System.out.println("Estimated travel time: " + hoursInt + " hr(s) " + minutesRemainder + " Minutes");
    }//end calculateTravelTime

}//end class
