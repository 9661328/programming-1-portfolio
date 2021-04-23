class Asteroid {
  // Member variables
  int x, y, health, speed, radius;
  color c;
  char displayMode;

  // Constructor 
  Asteroid(int x, int y) {
    this.x = x;
    this.y = y;
    health = 50;
    speed = int(random(5, 30));
    radius = 20;
    c = color(random(180), random(180), random(180));
  }

  // Member methods
  void display() {
    fill(c);
    noStroke();
    ellipse(x, y, 50, 50);
    fill(0);
  }

  void move() {
    y += speed;
  }

  boolean projectileIntersection(Projectile projectile) {
    float distance = dist(x, y, projectile.x, projectile.y);
    if (distance < radius + projectile.wide) {
      return true;
    } else {
      return false;
    }
  }

  boolean reachedBottom() {
    if (y > height) {
      return true;
    } else {
      return false;
    }
  }
}
