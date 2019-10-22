//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_intro_to_random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {
		
		 int num = 0;
		
		//3   Now to make num random. 
		//3a. Create an object of the Random class, Hint: Random ran = new Random()
		 Random ran = new Random();
		
		//3b. Next, set the value of num, using .nextInt() to get a random number from the Random object
		num = ran.nextInt(); // the next pseudorandom, uniformly distributed int value from this random number generator's sequence (out of 2^32 int values)

		//4. Now limit the value of num to be between 0 and 100
		num = ran.nextInt(101); // random integer between 0 and 100 (inclusive)

		//5. Now limit the value of num to be between 25 and 75. Hint: ((highest value - lowest value)+1) + lowest value
		num = ran.nextInt(51) + 25; // between 0 and 50 inclusive, offset so between 25 and 75 inclusive

		//6. Challenge: Limit the value of num to be between -222 and 88
		num = ran.nextInt(311) - 222; // between 0 and 310 inclusive, offset so between -222 and 88 inclusive

		//1. Print out the value of num
		System.out.println(num);
		
		//2. Run the program.  What number appears in the console?
		//   Run it again. Is the number the same?
	}
}
