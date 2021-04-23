// Warning: Contains flashy animations and may cause seizures.
float x, y, strokeW, pointCount;

void setup() {
  size(displayWidth, displayHeight);
  background(0);
  x = random(width);
  y = random(height);
}

void draw() {
  fill(255);
  rectMode(CENTER);
  textAlign(CENTER);
  noCursor();
  rect(width/2, height/2, 300, 120);
  int m = month();
  int d = day();
  int ye = year();
  int h = hour();
  int mi = minute();
  int s = second();
  fill(0);
  textSize(20);
  text(m + "/" + d + "/" + ye, width/2, height/2-20);
  text(h + ":" + mi + ":" + s, width/2, height/2);
  text(frameCount, width/2, height/2+50);

  strokeW = random(1, 10);
  pointCount = random(2, 100);
  if (x > width || x < 0 || y > height || y < 0) {
    x = random(width);
    y = random(height);
  } else {
    strokeWeight(strokeW);
    stroke(random(100), random(255), random(100));
    if (random(100) > 75) {
      moveUp(x, y, pointCount);
    } else if (random(100) > 50) {
      moveDown(x, y, pointCount);
    } else if (random(100) > 25) {
      moveLeft(x, y, pointCount);
    } else if (random(100) > 0) {
      moveRight(x, y, pointCount);
    }
    if (frameCount > 600) {
      clear();
      frameCount = 0;
    }
  }
}

void moveRight(float startX, float startY, float moveCount) {
  for (float i = 0; i < moveCount; i++) {
    point(startX + i, startY);
    x = startX+i;
    //y = startY+i;
  }
}

void moveLeft(float startX, float startY, float moveCount) {
  for (float i = 0; i < moveCount; i++) {
    point(startX - i, startY);
    x = startX - i;
    //y = startY+i;
  }
}

void moveUp(float startX, float startY, float moveCount) {
  for (float i = 0; i < moveCount; i++) {
    point(startX, startY - i);
    //x = startX+i;
    y = startY - i;
  }
}

void moveDown(float startX, float startY, float moveCount) {
  for (float i = 0; i < moveCount; i++) {
    point(startX, startY + i);
    //x = startX+i;
    y = startY + i;
  }
}
