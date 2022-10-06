import java.util.Scanner;

public class Methods 
{

   public static void getRequirements()
   {
    System.out.println("Developer: Carson Darrow");
    System.out.println("Program evaluates user-entered characters.");
    System.out.println("Use following characters: W or w, C or c, H or h, N or n.");
    System.out.println("Use following decision structures: if...else, and switch.");

    System.out.println();
}


public static void convertTime() 
{
   int seconds=0;
   double minutes=0.0;
   double hours=0.0;
   double days=0.0;
   double weeks=0.0;
   double years=0.0;

   //constants
   final double SECS_IN_MINS =60;
   final double MIN_IN_HR=60;
   final double HRS_IN_DAY=24;
   final double DAYS_IN_WEEK=7;
   final double DAYS_IN_YEAR=365;


   Scanner sc = new Scanner(System.in);

   System.out.println("Please enter number of seconds: ");
   while (!sc.hasNextInt())
   {
    System.out.println("Not valid integer!\n");
    sc.next();
    System.out.println("Please enter number of secinds: ");
   }
seconds = sc.nextInt();


   minutes = seconds / SECS_IN_MINS;
   hours = minutes / MIN_IN_HR;
   days = hours / HRS_IN_DAY;
   weeks = days / DAYS_IN_WEEK;
   years = days /DAYS_IN_YEAR;

   System.out.printf("%,d seconds(s) equals\n\n%,.2f minutes(s)\n%,.3f hours(s)\n%,.4f day(s)\n%,.5f week(s)\n%,.6f year(s)\n", seconds, minutes, hours, days, weeks, years);
 
        sc.close();
    }
}
