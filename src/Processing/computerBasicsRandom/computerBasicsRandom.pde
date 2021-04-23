void setup () {
  size(600, 600);
}

void draw () {
  fill(random(255), random(255), random(255));
  ellipse(mouseX, mouseY, random(100), random(100));
}
