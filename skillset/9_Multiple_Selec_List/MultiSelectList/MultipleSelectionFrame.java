import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame {
    private JList<String> burgerJList;
    private JList copyJList;
    private JButton copyJButton;
    private static final String[] burgerNames = {"Mushroom-Swiss", "Black and Bleu", "Death by Bacon", "Frenchie", "Just OK", "BBQ Texan", "Californian", "Sunrise Special", "Triple Threat", "Garbage"};

    //MultipleSelectionFrame constructor
    public MultipleSelectionFrame() {
        super("Multiple Selection Lists");
        setLayout (new FlowLayout());
        burgerJList = new JList<>(burgerNames);
        burgerJList.setVisibleRowCount(5);
        burgerJList.setFixedCellWidth(140);
        burgerJList.setFixedCellHeight(15);
        burgerJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        add(new JScrollPane(burgerJList));
        copyJButton = new JButton("Copy >>>");
        copyJButton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    copyJList.setListData(burgerJList.getSelectedValuesList().toArray());
                }//end actionPerformed
            }//end inner class
        );//end call to addActionListener

        add(copyJButton);
        copyJList = new JList();

        copyJList.setVisibleRowCount(5);
        copyJList.setFixedCellWidth(140);
        copyJList.setFixedCellHeight(15);
        copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(copyJList));
    }//end constructor
}//end class
