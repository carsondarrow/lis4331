package start;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class TriangleGUI implements ActionListener{
    public static void main(String[] args) {
        TriangleGUI gui = new TriangleGUI();
    }//end main

    //onscreen components stored as fields
    private JFrame frame;
    private JTextField aField;
    private JTextField bField;
    private JLabel label;
    private JButton computeButton;

    public TriangleGUI(){
        aField = new JTextField(5);
        bField = new JTextField(5);
        label = new JLabel("Compute Distance Leg C.");
        computeButton = new JButton("Compute");

        //attach GUI as event listener to Compute button
        computeButton.addActionListener(this);

        //layout
        JPanel north = new JPanel(new GridLayout(2, 2));
        north.add(new JLabel("Leg A: "));
        north.add(aField);
        north.add(new JLabel("Leg B: "));
        north.add(bField);

        //overall frame
        frame = new JFrame("Distance");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(north, BorderLayout.NORTH);
        frame.add(label, BorderLayout.CENTER);
        frame.add(computeButton, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }//end TriangleGui

    //handles clicks on Compute button by computing BMI
    public void actionPerformed(ActionEvent event){
        //read height/weight info from text fields
        String aText = aField.getText();
        double a = Double.parseDouble(aText);
        String bText = bField.getText();
        double b = Double.parseDouble(bText);

        //compute BMI and display it onscreen
        double c = Math.sqrt((a * a) + (b * b));
        label.setText(String.format("Leg C: %.2f", c));
    }//end actionPerformed
}//end class