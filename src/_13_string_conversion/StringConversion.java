package _13_string_conversion;

import javax.swing.JOptionPane;

public class StringConversion {
	public static void main(String[] args) {
		// 1. Place the value to be converted into a String variable.
		String userNumber = JOptionPane.showInputDialog("Please enter a number");
		
		// 2. Change the String value into an int using the Integer.parseInt() method
		int parsedNum = Integer.parseInt(userNumber);
		
		// 3. Place the int value into a variable
		JOptionPane.showMessageDialog(null, "This is your number plus 10: " + (parsedNum + 10));
	}
}
