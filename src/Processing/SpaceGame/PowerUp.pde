class PowerUp {
  // Member variables
  int x, y, speed, radius, pu;
  String[] puInfo = {"Ammo", "Health"};

  // Constructor 
  PowerUp(int x, int y) {
    this.x = x;
    this.y = y;
    speed = int(random(1, 10));
    radius = 10;
    pu = int(random(2));
  }

  // Member methods
  void display() {
    switch(pu) {
    case 0: //Ammo
      fill(255, 0, 0);
      ellipse(x, y, radius, radius);
      fill(255);
      textSize(9);
      textAlign(CENTER);
      text(puInfo[0], x, y);
      break;
    case 1: //Health
      fill(255, 0, 0);
      ellipse(x, y, radius, radius);
      fill(255);
      textSize(9);
      textAlign(CENTER);
      text(puInfo[1], x, y);
      break;
    }
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
