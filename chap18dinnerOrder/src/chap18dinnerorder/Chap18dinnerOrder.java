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

    private static final int WIDTH = 250;
    private static final int HEIGHT = 325;
    private JComboBox appetizer;
    private String[] appetizerOptions = {"potato skins", "nachos", "buffalo wings"};
    private JComboBox mainDish;
    private String[] mainDishOptions = {"cheeseburger", "pasta", "fish and chips"};
    private JComboBox dessert;
    private String[] dessertOptions = {"brownie", "apple pie", "ice cream"};
    private JButton button = new JButton("Submit");
    private JLabel result;
    JLabel prompt = new JLabel("Welcome to My Diner");
//******************************************************************************

    public Chap18dinnerOrder() {
        setTitle("Dinner Order");
        setSize(WIDTH, HEIGHT);
        JFrame frame = new JFrame("Dinner Order");
        setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContents();
        setVisible(true);
    } // end constructor method
//******************************************************************************

    private void createContents() {  // Create components and add them to window 
        Listener listener = new Listener();
        result = new JLabel();
        add(prompt);
        add(appetizer);
        add(mainDish);
        add(dessert);
        add(button);
        add(result);
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
