//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int ranNum = new Random().nextInt(4); // random integer between 0 and 3 inclusive
		
		// 3. Print out this variable
		System.out.println(ranNum);

		// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("Ask the Magic Eight Ball a question...");

		switch(ranNum)  {
			case 0:
				// 5. If the random number is 0
				// -- tell the user "Yes"
				JOptionPane.showMessageDialog(null, "Yes.");
				break;
			case 1:
				// 6. If the random number is 1
				// -- tell the user "No"
				JOptionPane.showMessageDialog(null, "No.");
				break;
			case 2: 
				// 7. If the random number is 2
				// -- tell the user "Maybe you should ask Google?"
				JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
				break;
			case 3: 
				// 8. If the random number is 3
				// -- write your own answer
				JOptionPane.showMessageDialog(null, "That isn't funny! Don't you take the Magic Eight Ball seriously?!");
				break;
			default:
				throw new Error("oops something went wrong");
		}
		
		System.exit(0);
	}
}
