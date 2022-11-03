import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {
        String code = "";
        String description = "";
        double price = 0.0;

        Scanner scnr = new Scanner(System.in);

        Product p1 = new Product();

        //print output
        System.out.println("/////Below are default constructor values://///\n");
        System.out.println("Inside product default constructor.\n");
        System.out.println("Code = " + p1.getCode());
        System.out.println("Description = " + p1.getDescription());
        System.out.println("Price = $" + p1.getPrice());

        System.out.println("\n/////Below are user-entered values://///\n");

        //get user input
        System.out.print("Code: "); 
        code = scnr.next();
        scnr.nextLine();

        System.out.print("Description: ");
        description = scnr.nextLine();

        System.out.print("Price: ");
        price = scnr.nextDouble();
        scnr.nextLine();

        Product p2 = new Product(code, description, price);

        System.out.println("\nInside product constructor with parameters.\n");
        System.out.println("Code = " + p2.getCode());
        System.out.println("Description = " + p2.getDescription());
        System.out.println("Price = $" + p2.getPrice());

        System.out.println("\n/////Below use setter methods to pass literal values, then print() method to display values://///\n");
        p1.setCode("xyz789");
        p1.setDescription("Test widget");
        p1.setPrice(89.99);
        p1.print();

        scnr.close();
    }//end main
}//end class
