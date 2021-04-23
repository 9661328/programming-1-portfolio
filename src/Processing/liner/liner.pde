size(1000, 1000);

// Horizontal
int y = 0;
while (y <= width) {
  line(0, y, width, y);
  text(y, 5, y-10);
  y += 100;
}

// Vertical
int x = 0;
while (x <= height) {
  line(x, 0, x, height);
  text(x, x-35, 15);
  x += 100;
}
