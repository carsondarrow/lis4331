package start;
import javax.swing.*; 

public class EvenOrOddDataValidationSwing {
    public static void main(String[] args) {
        //show intro message
        JOptionPane.showMessageDialog(null, "Program uses Java GUI message and input dialogs.\nProgram evaluates integers as even or odd.\nNote: Program *does* perform data validation, \nprompting user until correct data is entered.");

        //read the users number input
        String numText = JOptionPane.showInputDialog(null, "Enter integer:");

        while(!isNumber(numText)){
            numText = JOptionPane.showInputDialog(null, "Invalid integer. Please enter integer:", "Input", JOptionPane.QUESTION_MESSAGE);
        }
        
        int num = Integer.parseInt(numText);
        
        //show different response depending on answer
        if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null, num + " is an even number.");
        }
        else {
            JOptionPane.showMessageDialog(null, num + " is an odd number.");
        }
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
