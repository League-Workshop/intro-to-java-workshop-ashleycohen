package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
int score = 0;		
		// 2.  Ask the user a question 
String ans1 = JOptionPane.showInputDialog("What is Chandler's last name in the show Friends?");		
		// 3.  Use an if statement to check if their answer is correct
if(ans1.equalsIgnoreCase("Bing")) {


		// 4.  if the user's answer was correct, add one to their score 
	score += 1;
}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
String ans2 = JOptionPane.showInputDialog("Where does Blair Waldorf live in Gossip Girl?");
if(ans2.equalsIgnoreCase("Upper East Side")) {
	score += 1;
}
String ans3 = JOptionPane.showInputDialog("What is Spongebob's pet snail's name?");
if(ans3.equalsIgnoreCase("Gary")) {
	score += 1;
}	
	// 6.  After all the questions have been asked, print the user's score 
JOptionPane.showMessageDialog(null, "Score = " + score + "\nGood job!");	
	}
}
