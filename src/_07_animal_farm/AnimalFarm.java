//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _07_animal_farm;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0


import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		while(true) { /* 2. Make it so that the user can keep entering new animals. */
			/*
			 * 1. Ask the user which animal they want, then play the sound of that animal.
			 */
			String userInput = JOptionPane.showInputDialog("Enter the name of the animal you want to hear (duck, cow, dog, cat, llama).");
			
			if (userInput == null) { // returns null if user canceled
				System.exit(0);
			} else if (userInput.equalsIgnoreCase("duck")) {
				playNoise("quack.wav");
			} else if (userInput.equalsIgnoreCase("cow")) {
				playNoise("moo.wav");
			} else if (userInput.equalsIgnoreCase("dog")) {
				playNoise("woof.wav");
			} else if (userInput.equalsIgnoreCase("cat")) {
				playNoise("meow.wav");
			} else if (userInput.equalsIgnoreCase("llama")) {
				playNoise("llama.wav");
			} else {
				JOptionPane.showMessageDialog(null, "Sorry. I don't recognize that animal.");
			}
			
		}

	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
