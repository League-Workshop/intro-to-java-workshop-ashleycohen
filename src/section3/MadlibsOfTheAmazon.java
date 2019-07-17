 package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		
		// Get the user to enter an adjective
String adj = JOptionPane.showInputDialog("Enter an adjective.");
		// Get the user to enter a type of liquid
String liquid = JOptionPane.showInputDialog("Enter a liquid.");
		// Get the user to enter a body part
String part = JOptionPane.showInputDialog("Enter a body part.");
		// Get the user to enter a verb
String verb = JOptionPane.showInputDialog("Enter a verb.");
		// Get the user to enter a place
String place = JOptionPane.showInputDialog("Enter a place.");
		// Fit the user's words into this sentence, and save it in a String:
JOptionPane.showMessageDialog(null, "Piranhas are more " + adj + " during the day, so cross the river at night. Piranhas are attracted to fresh \n"
		+ liquid + " and will most likely take a bite out of your " + part + " if you " + verb + ". Whatever you do, if you have an open wound,"
				+ "\n try to find another way to get back to the " + place + ". Good luck!");
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

