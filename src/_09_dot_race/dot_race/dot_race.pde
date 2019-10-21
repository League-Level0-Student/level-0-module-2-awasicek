/**
 * @fileoverview Goal: Make the dot move across the screen when you press the mouse.
 */

//1. Make a variable to hold the X co-ordinate of the dot and set it to 50.
int xDot = 50;
int dotSpeed = 5;
int finishXPos = 750;

void setup() {
    size(800, 200);
}

void draw() {
    background(#000000);
    // finish line;
    fill(#F3F5B2);
    rect(finishXPos, 0, 10, 200);
  
    //3. make the ellipse a nice color
    fill(#6D72EA);

    //4. If the mouse is pressed change the X co-ordinate so that the dot moves to the right
    if(mousePressed) {
          //5. Make your dot move faster
          //  (you have to figure out what part of your code to change)
      xDot += dotSpeed;
    }
    
    //2. Draw an ellipse of height and width 10. Make sure to use your variable for the X position.
    ellipse(xDot, 100, 10, 10);
 
    //6. Use the playSound() method to play a ding when your dot crosses the finish line. 
    if(xDot >= finishXPos) {
      playSound();
    }

}

import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding.wav");
        sound.trigger();
        soundPlayed = true;
    }
}
