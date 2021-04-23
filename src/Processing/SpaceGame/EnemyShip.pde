class EnemyShip {
  // Member variables
  int x, y, health, ammo, lives, radius, speed;
  char displayMode;
  color c1;
  String warning;

  // Constructor
  EnemyShip(color c1) {
    x = 0;
    y = 0;
    health = 500;
    ammo = 5;
    lives = 3;
    radius = 40;
    speed = 8;
    displayMode = '1';
    this.c1 = c1;
    warning = "";
  }

  // Member methods
  void display(int x, int y) {
    this.x = x;
    this.y = y;
    if (displayMode == '1') {
      stroke(0);
      strokeWeight(1);
      rectMode(CENTER);
      fill(c1);
      rect(x, y, 50, 80, 10);
      triangle(x-24, y-35, x, y-60, x+24, y-35);
      //fill(c1);
      ellipse(x, y-15, 20, 20);
      fill(230);
      ellipse(x, y-20, 18, 8);
      fill(c1);
      quad(x, y+20, x-10, y+30, x, y+60, x+10, y+30);
      quad(x-25, y+20, x-40, y+35, x-20, y+60, x-25, y+40);
      quad(x+25, y+20, x+40, y+35, x+20, y+60, x+25, y+40);
      strokeWeight(3);
      stroke(255, 255, 0);
      line(x-22, y+10, x+22, y+10);
      textAlign(CENTER);
      textSize(6);
      fill(#3647FC);
      text("SpaceX", x, y-40);
      textSize(15);
      fill(255, 0, 0);
      text(warning, width/2, height * 0.9);
    }
  }
}
