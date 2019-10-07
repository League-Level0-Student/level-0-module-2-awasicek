//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		for(int i = 0; i < 10; i ++) { // 2. Repeat all the code above 10 times
			int randomNumber = randomMaker.nextInt(5); // random integer between 0 and 4 inclusive
			
			// 1. Use each value of randomNumber to give the user a random compliment.
			String compliment;
			switch(randomNumber) {
				case 0: {
					compliment = "You look nice today!";
					break;
				}
				case 1: {
					compliment = "You are a genius!";
					break;
				}
				case 2: {
					compliment = "You are such a kind person!";
					break;
				}
				case 3: {
					compliment = "You are so friendly!";
					break;
				}
				case 4: {
					compliment = "You are my favorite person!";
					break;
				}
				default: {
					throw new Error("oops something went wrong...");
				}
			}
			System.out.println(randomNumber);
			JOptionPane.showMessageDialog(null, compliment);
		}
		
		System.exit(0);
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
