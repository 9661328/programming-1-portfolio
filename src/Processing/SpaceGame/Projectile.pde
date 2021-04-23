class Projectile {
  // Member variables
  int x, y, speed, wide;
  color c;

  // Constructor 
  Projectile(int x, int y) {
    this.x = x;
    this.y = y;
    speed = 30;
    wide = 10;
    c = 180;
  }

  // Member methods
  void display() {
    fill(c);
    noStroke();
    rectMode(CENTER);
    rect(x, y, wide, 120);
  }

  void fire() {
    y -= speed;
  }

  boolean reachedTop() {
    if (y < 0) {
      return true;
    } else {
      return false;
    }
  }
}
