class Star {
  // Member variables
  int x, y, speed, diameter;
  color c;

  // Constructor 
  Star(int x, int y) {
    this.x = x;
    this.y = y;
    speed = int(random(1, 5));
    diameter = int(random(5));
    c = 255;
  }

  // Member methods
  void display() {
    fill(c);
    noStroke();
    ellipse(x, y, diameter, diameter);
  }

  void move() {
    y += speed;
  }

  boolean reachedBottom() {
    if (y > height) {
      return true;
    } else {
      return false;
    }
  }
}
