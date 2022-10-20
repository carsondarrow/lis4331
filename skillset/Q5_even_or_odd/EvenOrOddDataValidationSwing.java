package skillset.Q5_even_or_odd;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EvenOrOddDataValidationSwing implements ActionListener {
    static JLabel label;
    static JTextField text;
    static JButton button;
    static JPanel panel;
    static JFrame frame;
    static JLabel evenLabel;
    static JLabel oddLabel;

    public void planWindow() {
        frame = new JFrame("Even Or Odd");
        panel = new JPanel();
        frame.add(panel);

        label = new JLabel("Enter: ");

        text = new JTextField(2);
        text.setBackground(Color.BLUE);
        text.setForeground(Color.WHITE);

        button = new JButton("Evaluate");

        evenLabel = new JLabel("num is an even number.");
        oddLabel = new JLabel("num is an odd number.");

        button.addActionListener(this);
        // evenLabel.setVisible(false);
        // oddLabel.setVisible(false);
        panel.add(label);
        panel.add(text);
        panel.add(button);
        panel.add(evenLabel);
        panel.add(oddLabel);

        evenLabel.setBackground(Color.DARK_GRAY);
        evenLabel.setForeground(Color.RED);

        oddLabel.setBackground(Color.DARK_GRAY);
        oddLabel.setForeground(Color.RED);

        evenLabel.setVisible(false);
        oddLabel.setVisible(false);

        frame.setSize(300, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }// end planWindow

    public void actionPerformed(ActionEvent e) {
        String numText = text.getText();

        if (!isNumber(numText)) {
            JOptionPane.showMessageDialog(null, "Invalid integer. Please enter integer.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {

            int num = Integer.parseInt(numText);

            if (num % 2 == 0) {
                // JLabel evenLabel = new JLabel(num + " is an even number.");
                evenLabel.setText(num + " is an even number.");
                // evenLabel.setBackground(Color.DARK_GRAY);
                // evenLabel.setForeground(Color.RED);
                evenLabel.setVisible(true);
                // JOptionPane.showMessageDialog(null, num + " is an even number.");
            } else {
                // JLabel oddLabel = new JLabel(num + " is an odd number.");
                oddLabel.setText(num + " is an odd number.");
                // oddLabel.setBackground(Color.DARK_GRAY);
                // oddLabel.setForeground(Color.RED);
                oddLabel.setVisible(true);
                // JOptionPane.showMessageDialog(null, num + " is an odd number.");
            }
        } // end else
    }// end actionPerformed

    private static boolean isNumber(String n) {
        try {
            Integer.parseInt(n);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }// end isNumber

    public static void main(String[] args) {
        EvenOrOddDataValidationSwing frame = new EvenOrOddDataValidationSwing();
        frame.planWindow();
    }// end main
}// end class
