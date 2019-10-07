package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		// 1. Get 5 random numbers to put on your lottery ticket
		Random ranGenerator = new Random();
		final int MAX_RANGE_EXCL = 100;
		
		// 2. Display the selected numbers to the user in a pop-up
		JOptionPane.showMessageDialog(null, 
				"Lottery Ticket: " + ranGenerator.nextInt(MAX_RANGE_EXCL) + " " + ranGenerator.nextInt(MAX_RANGE_EXCL) + 
				" " + ranGenerator.nextInt(MAX_RANGE_EXCL) + " " + ranGenerator.nextInt(MAX_RANGE_EXCL) + " " 
				+ ranGenerator.nextInt(MAX_RANGE_EXCL) + " ");
		
		System.exit(0);
	}
}
