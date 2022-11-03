import java.util.Scanner;

public class TravelTime{
    public static void main(String[] args) {
        double miles = 0.0;
        double mph = 0.0;
        double validMiles = 0.0;
        double validMPH = 0.0;
        String choice = "";

        Scanner scnr = new Scanner(System.in);

        Methods.getRequirements();
        
        do {
            //validate miles
            miles = Methods.validateMilesDataType();
            validMiles = Methods.validateMilesRange(miles);

            //validate mph
            mph = Methods.validateMPHDataType();
            validMPH = Methods.validateMPHRange(mph);

            //display results
            Methods.calculateTravelTime(validMiles, validMPH);

            //continue?
            System.out.print("\nContinue? (y/n): ");
            choice = scnr.next();
            System.out.println();

        } while(choice.equalsIgnoreCase("y"));
        
    }//end main
}