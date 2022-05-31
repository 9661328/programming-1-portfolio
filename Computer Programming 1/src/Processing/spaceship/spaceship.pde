void setup() {
  size(300, 300);
}

void draw() {
  background(255);
  println("mouseX: " + mouseX, "mouseY: " + mouseY);
  spaceShip();
}

void spaceShip() {
  stroke(0);
  strokeWeight(2);
  rectMode(CENTER);
  fill(#27E5FC);
  rect(mouseX, mouseY, 50, 80, 10);
  triangle(mouseX-24, mouseY-35, mouseX, mouseY-60, mouseX+24, mouseY-35);
  fill(#1681FA);
  ellipse(mouseX, mouseY-15, 20, 20);
  fill(230);
  ellipse(mouseX, mouseY-20, 18, 8);
  fill(#565CF9);
  quad(mouseX, mouseY+20, mouseX-10, mouseY+30, mouseX, mouseY+60, mouseX+10, mouseY+30);
  quad(mouseX-25, mouseY+20, mouseX-40, mouseY+35, mouseX-20, mouseY+60, mouseX-25, mouseY+40);
  quad(mouseX+25, mouseY+20, mouseX+40, mouseY+35, mouseX+20, mouseY+60, mouseX+25, mouseY+40);
  strokeWeight(3);
  stroke(255, 255, 0);
  line(mouseX-23, mouseY+10, mouseX+23, mouseY+10);
  textAlign(CENTER);
  textSize(6);
  fill(#FC3D21);
  text("NASA", mouseX, mouseY-40);
}
