void setup() {
  size(200, 200);
}

void draw() {
  for (int x = 0; x < width; x += 1) {
    for (int y = 0; y < height; y += 1) {
      noStroke();
      fill(random(255));
      rect(x, y, 1, 1);
    }
  }
}
