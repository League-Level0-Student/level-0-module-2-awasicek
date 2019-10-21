/**
 * @fileoverview Goal: Check if a person is tall enough to ride the roller coaster!
 */

package _14_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		// 1. Ask the user what height they are (in inches)
		int height = Integer.parseInt(JOptionPane.showInputDialog("How tall are you (in inches)?"));
		
		// 2. If they are over 48" tall, tell them they can go on the rollercoaster
		if(height > 48) {
			JOptionPane.showMessageDialog(null, "You are tall enough to ride the rollercoaster.");
		} else { // 3. If they are 48" or less, tell them they need to grow more first
			JOptionPane.showMessageDialog(null, "You need to grow more first.");
		}
		
	}
}
