class Button {
  //Member Variables
  int x, y, w, h;
  String val;
  color c1, c2;
  boolean hover, isNumber, isMisc;
  PFont buFont;

  //Constructor
  Button(int tempX, int tempY, int tempW, int tempH, String tempVal, boolean isNumber, boolean isMisc) {
    x = tempX;
    y = tempY;
    w = tempW;
    h = tempH;
    val = tempVal;
    c1 = (255);
    c2 = (200);
    hover = false;
    buFont = loadFont("CourierNewPSMT-24.vlw");
    this.isNumber = isNumber;
    this.isMisc = isMisc;
  }

  //Method for display
  void display() {
    if (isNumber) {
      if (hover) {
        fill(c2);
      } else {
        fill(c1);
      }
      strokeWeight(3);
      rect(x, y, w, h, 10);
      fill(0);
      textFont(buFont);
      textSize(24);
      textAlign(CENTER, CENTER);
      text(val, x+w/2, y+h/2);
    } else {
      if (hover) {
        fill(200);
      } else {
        fill(#BBC0B3);
      }
      strokeWeight(3);
      rect(x, y, w, h, 10);
      fill(255);
      textFont(buFont);
      textSize(24);
      textAlign(CENTER, CENTER);
      text(val, x+w/2, y+h/2);
    }
    if (isMisc) {
      if (hover) {
        fill(c2);
      } else {
        fill(#0F4063);
      }
      strokeWeight(1);
      rect(x, y, w, h, 10);
      fill(255);
      textFont(buFont);
      textSize(24);
      textAlign(CENTER, CENTER);
      text(val, x+w/2, y+h/2);
    }
  }

  //Method for mouse interaction
  void hover() {
    hover = mouseX < x+w && mouseX > x && mouseY < y+h && mouseY > y;
  }
}
