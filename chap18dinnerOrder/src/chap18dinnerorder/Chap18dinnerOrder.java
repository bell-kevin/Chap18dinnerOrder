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
    private String[] appetizerOptions = {"potato skins", "nachos", "buffalo wings"};
    private JComboBox appetizer = new JComboBox(appetizerOptions);
    private String[] mainDishOptions = {"cheeseburger", "pasta", "fish and chips"};
    private JComboBox mainDish = new JComboBox(mainDishOptions);
    private String[] dessertOptions = {"brownie", "apple pie", "ice cream"};
    private JComboBox dessert = new JComboBox(dessertOptions);
    private JButton button = new JButton("Submit");
    private JLabel result;
    JLabel prompt = new JLabel("Welcome to My Diner");
    JLabel appLabel = new JLabel("Appetizers");
    JLabel mainDishLabel = new JLabel("Main Dish");
    JLabel desLabel = new JLabel("Dessert");
    JLabel ordCompLabel = new JLabel("Order Complete?");
    JLabel totalCostLabel = new JLabel("Welcome to My Diner");

//******************************************************************************
    public Chap18dinnerOrder() {
        setTitle("Dinner Order");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContents();
        frame.setVisible(true);
    } // end constructor method
//******************************************************************************

    private void createContents() {  // Create components and add them to window 
        Listener listener = new Listener();
        result = new JLabel();
        frame.setSize(200, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(prompt);
        frame.add(appLabel);
        frame.add(appetizer);
        frame.add(mainDishLabel);
        frame.add(mainDish);
        frame.add(desLabel);
        frame.add(dessert);
        frame.add(ordCompLabel);
        frame.add(button);
        frame.add(totalCostLabel);
        frame.add(result);
        frame.setVisible(true);
        button.addActionListener(listener);
    } // end createContents method
//******************************************************************************

    private class Listener implements ActionListener {//InnerClass eventHandling

        public void actionPerformed(ActionEvent e) {
            totalCostLabel.setText("");
            double ps = 0, n = 0, bw = 0, c = 0, p = 0, fnc = 0, b = 0, ap = 0, ic = 0, total;
            if (appetizer.getSelectedItem().equals("potato skins")) {
                ps = 3.50;
            }
            if (appetizer.getSelectedItem().equals("nachos")) {
                n = 1.75;
            }
            if (appetizer.getSelectedItem().equals("buffalo wings")) {
                bw = 4.50;
            }
            if (mainDish.getSelectedItem().equals("cheeseburger")) {
                c = 3.25;
            }
            if (mainDish.getSelectedItem().equals("pasta")) {
                p = 7.00;
            }
            if (mainDish.getSelectedItem().equals("fish and chips")) {
                fnc = 6.25;
            }
            if (dessert.getSelectedItem().equals("brownie")) {
                b = 4.00;
            }
            if (dessert.getSelectedItem().equals("apple pie")) {
                ap = 5.50;
            }
            if (dessert.getSelectedItem().equals("ice cream")) {
                ic = 2.50;
            }
            total = ps + n + bw + c + p + fnc + b + ap + ic;
            totalCostLabel.setText("Total: $" + total);
        } // end actionPerformed
    } // end Listener class
//******************************************************************************

    public static void main(String[] args) {
        new Chap18dinnerOrder();
    } // end main method
} // end Chap18dinnerOrder class
