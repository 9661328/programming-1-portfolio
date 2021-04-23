// Global Variable //<>//
float x, y;
int xpos, ypos, wdth, ht, xspeed, yspeed;
PFont font;

void setup() {
  size(displayWidth, displayHeight);
  x = 0;
  y = 0;
  xpos = width/2;
  ypos = height/2;
  wdth = 100;
  ht = 100;
  xspeed = 100;
  yspeed = 30;
  font = loadFont("AppleSDGothicNeo-UltraLight-50.vlw");
}

void draw() {
  background(0);
  noCursor();
  frameRate(1);
  color c = color(random(255), random(255), random(255));

  // Name
  x = random(width - 450);
  y = random((height * 0.7) - 200);
  strokeWeight(random(1, 12));
  stroke(c);
  drawName();

  // Clock
  int h = hour();
  int mi = minute();
  fill(c);
  textFont(font);
  textSize(80);
  if (mi<10) {
    text(h + ":" + "0" + mi, width * 0.8, height * 0.8);
  } else {
    text(h + ":" + mi, width * 0.8, height * 0.8);
  }

  // Shapes
  ellipse(xpos, ypos, wdth, ht);
  xpos += xspeed;
  ypos += yspeed;
  if (xpos >= width - wdth/2 || xpos <= wdth/2) {
    xspeed *= -1;
  }
  if (ypos >= (height * 0.7) - ht/2 || ypos <= ht/2) {
    yspeed *= -1;
  }
}

// Algorithm for your first name
void drawName() {
  moveRight(50);
  moveDown(150);
  moveLeft(50);
  moveUp(50);
  moveDown(50);
  moveRight(60);
  moveUp(75);
  moveRight(50);
  moveDown(75);
  moveLeft(50);
  moveRight(60);
  moveUp(75);
  moveRight(50);
  moveDown(75);
  moveRight(10);
  moveUp(75);
  moveRight(40);
  moveDown(75);
  moveLeft(40);
  moveRight(40);
  moveUp(10);
  moveRightDown(10);
  moveRight(10);
  moveRight(25);
  moveUp(150);
  moveDown(60);
  moveLeft(25);
  moveRight(50);
  moveLeft(25);
  moveDown(90);
  moveRight(35);
  moveUp(150);
  moveDown(75);
  moveRight(50);
  moveDown(75);
  moveRight(10);
  moveUp(75);
  moveRight(40);
  moveDown(75);
  moveLeft(40);
  moveRight(40);
  moveUp(10);
  moveRightDown(10);
  moveRight(10);
  moveUp(75);
  moveRight(50);
  moveDown(75);
  moveRight(10);
}

//Method to draw left line
void moveLeft (int rep) {
  for (int i = 0; i < rep; i++) {
    point(x - i, y);
  }
  x = x - rep;
}

// Method to draw right line
void moveRight(int rep) {
  for (int i = 0; i < rep; i++) {
    point(x + i, y);
  }
  x = x + rep;
}

//Method to draw lines up
void moveUp (int rep) {
  for (int i = 0; i < rep; i++) {
    point(x, y - i);
  }
  y = y - rep;
}

//Method to draw lines down
void moveDown (int rep) {
  for (int i = 0; i < rep; i++) {
    point(x, y + i);
  }
  y = y + rep;
}

//Method to draw lines right and up
void moveRightUp (int rep) {
  for (int i = 0; i < rep; i++) {
    point(x+i, y-i);
  }
  x = x + rep;
  y = y - rep;
}

//Method to draw lines right and down
void moveRightDown (int rep) {
  for (int i = 0; i < rep; i++) {
    point(x+i, y+i);
  }
  x = x + rep;
  y = y + rep;
}
