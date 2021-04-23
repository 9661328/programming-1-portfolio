Button[] buttons = new Button[2];

void setup() {
  size(400, 400);
  buttons[0] = new Button(50, 50, 90, 30, "Button 1");
  buttons[1] = new Button(50, 250, 50, 30, "Button 2");
}

void draw() {
  background(255);
  for (int i = 0; i < buttons.length; i++) {
    buttons[i].display();
    buttons[i].hover();
  }
}
