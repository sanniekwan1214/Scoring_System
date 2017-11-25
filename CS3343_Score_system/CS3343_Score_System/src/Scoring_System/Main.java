package Scoring_System;

import javax.swing.*;
import java.awt.*;

public class Main{

	public static void main(String[] args) {
		  String[] items = {"Year1", "Year2", "Year3", "Year4"};
		    JComboBox combo = new JComboBox(items);
		    JTextField Student_EID = new JTextField("sanniekwan");
		    JTextField Student_ID = new JTextField("5440");
		    JPanel panel = new JPanel(new GridLayout(10, 10));
		    // panel.setSize(800, 600);
		    panel.add(combo);
		    panel.add(new JLabel("Student_EID"));
		    panel.add(Student_EID);
		    panel.add(new JLabel("Student_ID"));
		    panel.add(Student_ID);
		    
		   int result = JOptionPane.showConfirmDialog(null, panel, "Student Residence Application",
		        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		    if (result == JOptionPane.OK_OPTION) {
		        System.out.println(combo.getSelectedItem()
		            + " " + Student_EID.getText()
		            + " " + Student_ID.getText());
		    } else {
		        System.out.println("Cancelled");
		    }
		
		
	}
	
}