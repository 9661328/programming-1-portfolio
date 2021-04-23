PFont font1, font2;
boolean hover = false;

void setup() {
  size(1201, 501);
  font1 = loadFont("AndaleMono-15.vlw");
  font2 = loadFont("Trattatello-20.vlw");
}

void draw() {
  background(255);
  fill(0);
  strokeWeight(1);
  println("mouseX: " + mouseX, "mouseY: " + mouseY);
  textFont(font1);
  //Reference items
  ellipse(width/4, height/2, 300, 300);
  line(1100, 0, 1100, height);
  int i = height;
  while (i>0) {
    i-=20;
    line(1095, i, 1105, i);
    fill(0);
    ellipse(1100, mouseY, 5, 5);
    textSize(8);
    text(mouseY*0.1, 1075, mouseY+3);

    textSize(15);
    textAlign(CENTER);
    fill(#29F72D);
    text("Knot: " + mouseY*0.1, width/4, 190);
    text("KPH: " + knotToKph(mouseY*0.1), width/4, 220);
    text("MPH: " + knotToMph(mouseY*0.1), width/4, 250);
    text("M/S: " + knotToMps(mouseY*0.1), width/4, 280);
    text("F/S: " + knotToFps(mouseY*0.1), width/4, 310);
  }
  steeringWheel();
  info();
}

void steeringWheel() {
  stroke(0);
  fill(255);
  strokeWeight(15);
  ellipse(700, height/2, 300, 300);

  fill(0);
  ellipse(700, height/2, 50, 50);
  line(700, height/2, 700, 100);
  line(700, height/2, 560, 300);
  line(700, height/2, 840, 300);
}

void info() {
  //Developer information box
  fill(255);
  strokeWeight(2);
  stroke(#B7CBF5);
  rectMode(CENTER);
  rect(width/2, 50, 365, 40);
  //Developer information
  textFont(font2);
  textSize(20);
  fill(#B7CBF5);
  textAlign(CENTER);
  text("Conversion App | Jonathan Su | 10/09/2020", width/2, 60);
  //Onscreen instructions
  textFont(font1);
  hover = (mouseX > 30 && mouseX < 130 && mouseY > 350 && mouseY < 450);
  if (hover == true) {
    fill(0);
    text("Move mouse up and down to see the conversion of knots to KPH, MPH, M/S, and F/S", width/2, 450);
  }  
  fill(255, 0, 0);
  stroke(255, 0, 0);
  rect(80, 400, 100, 100);
  fill(0);
  text("SOS", 80, 410);
}

//Convert knot to kilometers per hour
float knotToKph (float val) {
  val = val*1.852;
  return val;
}

//Convert knot to miles per hour
float knotToMph (float val) {
  val = val*1.151;
  return val;
}

//Convert knot to meters per second
float knotToMps(float val) {
  val = val/1.944;
  return val;
}

//Convert knot to feet per second
float knotToFps (float val) {
  val = val*1.688;
  return val;
}
