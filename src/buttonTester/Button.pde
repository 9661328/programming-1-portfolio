class Button {
  //Member Variables
  int x, y, w, h;
  String val;
  color c1, c2;
  boolean hover;

  //Constructor
  Button(int tempX, int tempY, int tempW, int tempH, String tempVal) {
    x = tempX;
    y = tempY;
    w = tempW;
    h = tempH;
    val = tempVal;
    c1 = #F5C06F;
    c2 = #742CF2;
    hover = false;
  }

  //Method for display
  void display() {
    if (hover) {
      fill(c1);
    } else {
      fill(c2);
    }
    rect(x, y, w, h, 5);
    fill(0);
    textAlign(CENTER);
    text(val, x + w/2, y + h/2);
  }

  //Method for mouse interaction
  void hover() {
    hover = mouseX < x + w && mouseX > x && mouseY < y + h && mouseY > y;
  }
}
