//Global Variable //<>//
int x, y;

void setup() {
  size(1000, 400);
  background(255);
  strokeWeight(5);
  stroke(0);
  x = 20;
  y = 50;
}

void draw() {
  fill(255);
  //drawName();
  //noLoop();
}

void mousePressed() {
  saveFrame("line-######.png");
}

void keyPressed() {
  if (key == 'w' || key == 'W') {
    moveUp(5);
  } else if (key == 'a' || key == 'A') {
    moveLeft(10);
  } else if (key == 's' || key == 'S') {
    moveDown(10);
  } else if (key == 'd' || key == 'D') {
    moveRight(10);
  }
  if (key == CODED) {
    if (keyCode == RIGHT) {
      moveRight(10);
    } else if (keyCode == LEFT) {
      moveLeft(10);
    } else if (keyCode == UP) {
      moveUp(10);
    } else if (keyCode == DOWN) {
      moveDown(10);
    }
  }
}

// Algorithm for your first name
void drawName() {
  moveRight(100);
  moveDown(300);
  moveLeft(100);
  moveUp(100);
  moveDown(100);
  moveRight(120);
  moveUp(150);
  moveRight(100);
  moveDown(150);
  moveLeft(100);
  moveRight(120);
  moveUp(150);
  moveRight(100);
  moveDown(150);
  moveRight(20);
  moveUp(150);
  moveRight(80);
  moveDown(150);
  moveLeft(80);
  moveRight(80);
  moveUp(20);
  moveRightDown(20);
  moveRight(20);
  moveRight(50);
  moveUp(300);
  moveDown(120);
  moveLeft(50);
  moveRight(100);
  moveLeft(50);
  moveDown(180);
  moveRight(70);
  moveUp(300);
  moveDown(150);
  moveRight(100);
  moveDown(150);
  moveRight(20);
  moveUp(150);
  moveRight(80);
  moveDown(150);
  moveLeft(80);
  moveRight(80);
  moveUp(20);
  moveRightDown(20);
  moveRight(20);
  moveUp(150);
  moveRight(100);
  moveDown(150);
  moveRight(20);
}

// Method to draw left line
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

// Method to draw lines up
void moveUp (int rep) {
  for (int i = 0; i < rep; i++) {
    point(x, y - i);
  }
  y = y - rep;
}

// Method to draw lines down
void moveDown (int rep) {
  for (int i = 0; i < rep; i++) {
    point(x, y + i);
  }
  y = y + rep;
}

//Method to draw lines right and up
void moveRightUp (int rep) {
  for (int i = 0; i < rep; i++) {
    point(x + i, y - i);
  }
  x = x + rep;
  y = y - rep;
}

//Method to draw lines right and down
void moveRightDown (int rep) {
  for (int i = 0; i < rep; i++) {
    point(x + i, y + i);
  }
  x = x + rep;
  y = y + rep;
}
