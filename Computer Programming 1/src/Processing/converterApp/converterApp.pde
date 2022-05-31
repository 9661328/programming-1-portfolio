void setup() {
  size(400, 400);
}

void draw() {
  background(100);
  //Vertical Render 2 (bottom to top)
  line(100, 0, 100, height);
  for (int i=height; i>0; i-=20) {
    line(96, i, 104, i);
    textSize(8);
    textAlign(CENTER);
    text(i, 85, height-i);
  }
  rect(100, mouseY, 25, height-mouseY);
  text("Cel:" + convertToCel(height-mouseY), 130, mouseY);

  ////Vertical Render 1
  //line(100, 0, 100, height);
  //for(int i=0; i<height; i+=20) {
  //  line(96, i, 104, i);
  //  textSize(8);
  //  textAlign(CENTER);
  //  text(i, 85, i+5);
  //}
  //rect(100, 0, 5, mouseY);
  //text("Cel:" + convertToCel(mouseY), 130, mouseY);

  ////horizontal
  //line(0, 100, width, 100);
  //for(int i=0; i<width; i+=20) {
  //  line(i, 96, i, 104);
  //  textSize(8);
  //  textAlign(CENTER);
  //  text(i, i, 94);
  //}
  //ellipse(mouseX, 100, 5, 5);
  //text("Cel:" + convertToCel (mouseX), mouseX, 115);

  //println("Convert 20 Fahrenheit to Celsius: " + convertToCel(20.0));
  //println("Convert 20 Celsius to Fahrenheit: " + convertToFah(20.0));
}

float convertToCel(float val) {
  val = (val - 32)*(5.0/9.0);
  return val;
}

float convertToFah(float val) {
  val = val*(9.0/5.0)+32;
  return val;
}
