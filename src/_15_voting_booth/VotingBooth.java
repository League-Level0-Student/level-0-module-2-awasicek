/**
 * @fileoverview Goal: Check if a person is old enough to vote!
 */

package _15_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		// 1. Ask the user how old they are (in years)
		int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you (in years)?"));
		
		// 2. If they are over 18, ask them who the next president should be
		if (age >= 18) {
			JOptionPane.showInputDialog("Who should the next president be?");
		} else { // 3. If they are younger, tell them nobody cares what they think
			JOptionPane.showMessageDialog(null, "No one cares what you think.");
		}
		
	}
}
