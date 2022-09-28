/** ****************************************************************************
 * Chap18dinnerOrder.java
 * Kevin Bell
 *
 * This GUI program is a food order application.
 **************************************************************************** */
package chap18dinnerorder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import javax.swing.border.*;

public class Chap18dinnerOrder extends JFrame {

    JFrame frame = new JFrame("Dinner Order");
    private static final int WIDTH = 250;
    private static final int HEIGHT = 325;
    private String[] appetizerOptions = {"potato skins", "nachos", "buffalo wings"};
    private JComboBox appetizer = new JComboBox(appetizerOptions);
    private String[] mainDishOptions = {"cheeseburger", "pasta", "fish and chips"};
    private JComboBox mainDish = new JComboBox(mainDishOptions);
    private String[] dessertOptions = {"brownie", "apple pie", "ice cream"};
    private JComboBox dessert = new JComboBox(dessertOptions);
    private JButton button = new JButton("Submit");
    private JLabel result;
    JLabel prompt = new JLabel("Welcome to My Diner");

//******************************************************************************
    public Chap18dinnerOrder() {
        setTitle("Dinner Order");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContents();
        frame.setVisible(true);
    } // end constructor method
//******************************************************************************

    private void createContents() {  // Create components and add them to window 
        Listener listener = new Listener();
        result = new JLabel();
        frame.setSize(480, 640);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(prompt);
        frame.add(appetizer);
        frame.add(mainDish);
        frame.add(dessert);
        frame.add(button);
        frame.add(result);
        frame.setVisible(true);
        button.addActionListener(listener);
    } // end createContents method
//******************************************************************************

    private class Listener implements ActionListener {//InnerClass eventHandling

        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == button) {
                    Container contentPane = getContentPane();
                } // end if condition
            } catch (NumberFormatException nfe) {
                //guess = -1;
            } // end try/catch   
        } // end actionPerformed
    } // end Listener class
//******************************************************************************

    public static void main(String[] args) {
        new Chap18dinnerOrder();
    } // end main method
} // end Chap18dinnerOrder class
