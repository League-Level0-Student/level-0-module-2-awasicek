/**
 * @fileoverview Goal: Put the moles in their holes!
 */
 
final int MOLE_Y_OFFSET = 15;
 
void draw() {

/* Use the method below to put moles in the holes. */
  drawMole(200, 200 - MOLE_Y_OFFSET);
  drawMole(70, 119 - MOLE_Y_OFFSET);
  drawMole(300, 60 - MOLE_Y_OFFSET);
  drawMole(297, 350 - MOLE_Y_OFFSET);
}

void drawMole(int moleX, int moleY) {
     noStroke();
     fill(125, 93, 43);
     ellipse(moleX, moleY, 60, 60); // face
     fill(255, 237, 209);
     ellipse(moleX, moleY+10, 33, 28); 
     fill(0, 0, 0);
     ellipse(moleX-10, moleY-15, 10, 10); // eyes
     ellipse(moleX+10, moleY-15, 10, 10);
     ellipse(moleX, moleY-5, 10, 10); // nose
     ellipse(moleX, moleY+10, 20, 5); // mouth
}

void setup() {
     size(400, 400);
     background(78, 166, 51); // green grass
     fill(0, 0, 0);
     ellipse(200, 200, 100, 30); // holes!
     ellipse(70, 119, 100, 30);
     ellipse(300, 60, 100, 30);
     ellipse(297, 350, 100, 30);
}
