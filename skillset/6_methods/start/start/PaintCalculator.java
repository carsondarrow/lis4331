package start;
import javax.swing.*; 

public class PaintCalculator {
    public static void main(String[] args) {
        //show intro message
        JOptionPane.showMessageDialog(null,"Program uses Java GUI messsage and input dialogs.\nProgram determines paint cost per room (i.e. \"area\").\nFor paint \"area\" simplicity: use length X height X 2 + width X height X 2.\nFormat numbers as per below: thousand separator, decimal point and $ sign for currency.\nResearch how many square feet a gallon of paint covers.\nNote: Program performs data validation."); 

        //read the users price input
        String priceText = JOptionPane.showInputDialog(null, "Paint price per gallon:");

        while(!isNumber(priceText)){
            priceText = JOptionPane.showInputDialog(null, "Invalid integer. Please enter integer:", "Input", JOptionPane.QUESTION_MESSAGE);
        }
        
        double price = Double.parseDouble(priceText);

        //read users length input
        String lengthText = JOptionPane.showInputDialog(null, "Length:");

        while(!isNumber(lengthText)){
            lengthText = JOptionPane.showInputDialog(null, "Invalid integer. Please enter integer:", "Input", JOptionPane.QUESTION_MESSAGE);
        }
        
        int length = Integer.parseInt(lengthText);

        //read users width input
        String widthText = JOptionPane.showInputDialog(null, "Width:");

        while(!isNumber(widthText)){
            widthText = JOptionPane.showInputDialog(null, "Invalid integer. Please enter integer:", "Input", JOptionPane.QUESTION_MESSAGE);
        }
        
        int width = Integer.parseInt(widthText);

        //read users height input
        String heightText = JOptionPane.showInputDialog(null, "Height:");

        while(!isNumber(heightText)){
            heightText = JOptionPane.showInputDialog(null, "Invalid integer. Please enter integer:", "Input", JOptionPane.QUESTION_MESSAGE);
        }
        
        int height = Integer.parseInt(heightText);

        //calculate and print results
        double area = (length * height * 2) + (width * height * 2);
        double total = (area/350) * price; 

        JOptionPane.showMessageDialog(null, String.format("Paint = $%,.2f per gallon.\nArea of room = %,.2fsq ft.\nTotal = $%,.2f", price, area, total));
    }//end main

    private static boolean isNumber(String n) {
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}//end isNumber

}//end class