//Calculator for Computer Programming 1
//Jonathan Su || Nov. 2020

PFont font1, font2;
PImage tiLogo, battery, gear;
String displayVal, op;
boolean left;
float l, r, result;
color h;
Button[] numButtons = new Button[10];
Button[] opButtons = new Button[19];

void setup() {
  size(440, 800);
  background(255);

  font1 = loadFont("AppleSDGothicNeo-Bold-24.vlw");
  font2 = loadFont("AppleSDGothicNeo-Light-24.vlw");
  tiLogo = loadImage("tiLogo.png");
  battery = loadImage("battery.jpg");
  gear = loadImage("gear.jpg");
  displayVal = "0";
  op = "+";
  left = true;
  l = 0.0;
  r = 0.0;
  result = 0.0;
  numButtons[0] = new Button(130, 670, 60, 60, "0", true, false);
  numButtons[1] = new Button(130, 600, 60, 60, "1", true, false);
  numButtons[4] = new Button(130, 530, 60, 60, "4", true, false);
  numButtons[7] = new Button(130, 460, 60, 60, "7", true, false);
  numButtons[2] = new Button(200, 600, 60, 60, "2", true, false);
  numButtons[5] = new Button(200, 530, 60, 60, "5", true, false);
  numButtons[8] = new Button(200, 460, 60, 60, "8", true, false);
  numButtons[3] = new Button(270, 600, 60, 60, "3", true, false);
  numButtons[6] = new Button(270, 530, 60, 60, "6", true, false);
  numButtons[9] = new Button(270, 460, 60, 60, "9", true, false);
  opButtons[18] = new Button(200, 670, 60, 60, ".", true, false);
  opButtons[0] = new Button(345, 450, 57, 50, "/", false, false);
  opButtons[1] = new Button(345, 510, 57, 50, "*", false, false);
  opButtons[2] = new Button(345, 570, 57, 50, "-", false, false);
  opButtons[3] = new Button(345, 630, 57, 50, "+", false, false);
  opButtons[4] = new Button(345, 690, 57, 50, "=", false, false);
  opButtons[5] = new Button(345, 390, 55, 50, "C", false, true);
  opButtons[6] = new Button(270, 670, 60, 60, "±", true, false);
  opButtons[7] = new Button(30, 670, 90, 60, "off", false, true);
  opButtons[8] = new Button(30, 600, 90, 60, "^2", false, true);
  opButtons[9] = new Button(30, 530, 90, 60, "√", false, true);
  opButtons[10] = new Button(30, 460, 90, 60, "π", false, true);
  opButtons[11] = new Button(30, 390, 90, 60, "|x|", false, true);
  opButtons[12] = new Button(30, 320, 90, 60, "Rand", false, true);
  opButtons[13] = new Button(130, 320, 60, 60, "bin", false, true);
  opButtons[14] = new Button(200, 320, 60, 60, "hehe", false, true);
  opButtons[15] = new Button(130, 390, 60, 60, "F>C", false, true);
  opButtons[16] = new Button(200, 390, 60, 60, "C>F", false, true);
  opButtons[17] = new Button(270, 390, 60, 60, "?", false, true);
}

void draw() {
  //Red
  noStroke();
  rectMode(CENTER);
  fill(#FC635D);
  rect(width/2, 530, 420, 520, 70);

  //Black
  noStroke();
  rectMode(CENTER);
  fill(#282828);
  rect(width/2, 170, 400, 310, 50);

  ////Display window
  //rectMode(CORNER);
  //fill(255);
  //rect(50, 90, 340, 150);
  //stroke(0);
  //strokeWeight(1);
  //rect(49, 90, 341, 30);

  //Blue
  noStroke();
  rectMode(CORNER);
  fill(#2F6FB5);
  rect(20, 288, 400, 200);
  rect(20, 450, 400, 330, 50);

  //Logos
  textAlign(LEFT);
  fill(255);
  textFont(font1);
  text("TI-84", 150, 70);
  textFont(font2);
  text("Plus CE", 215, 70);
  image(tiLogo, 120, 700, 197, 111);
  stroke(0);
  ellipse(335, 340, 100, 60);

  //Display and hover buttons
  for (int i = 0; i < numButtons.length; i++) {
    numButtons[i].display();
    numButtons[i].hover();
  }
  for (int i = 0; i < opButtons.length; i++) {
    opButtons[i].display();
    opButtons[i].hover();
  }
  //Show calculator display
  updateDisplay();
}

void mouseReleased() {
  for (int i = 0; i < numButtons.length; i++) {
    if (numButtons[i].hover && displayVal.length() < 22) {
      handleEvent(numButtons[i].val, true);
    }
  }
  for (int i = 0; i < opButtons.length; i++) {
    if (opButtons[i].hover) {
      handleEvent(opButtons[i].val, false);
    }
  }
  println("");
  println("l: " + l + " r: " + r + " op: " + op);
  println("result: " + result + " displayVal: " + displayVal + " Left: " + left);
}

void keyPressed() {
  if (key == '0') {
    handleEvent("0", true);
  } else if (key == '1') {
    handleEvent("1", true);
  } else if (key == '2') {
    handleEvent("2", true);
  } else if (key == '3') {
    handleEvent("3", true);
  } else if (key == '4') {
    handleEvent("4", true);
  } else if (key == '5') {
    handleEvent("5", true);
  } else if (key == '6') {
    handleEvent("6", true);
  } else if (key == '7') {
    handleEvent("7", true);
  } else if (key == '8') {
    handleEvent("8", true);
  } else if (key == '9') {
    handleEvent("9", true);
  } else if (key == '+') {
    handleEvent("+", false);
  } else if (key == '-') {
    handleEvent("-", false);
  } else if (key == '*') {
    handleEvent("*", false);
  } else if (key == '/') {
    handleEvent("/", false);
  } else if (key == '.') {
    handleEvent(".", false);
  } else if (key == 'c' || key == 'C' || key == 8) {
    handleEvent("C", false);
  } else if (key == '#') {
    handleEvent("±", false);
  } else if (key == 10) {
    if (key == ENTER || key == RETURN) {
      handleEvent("=", false);
    }
  }
  println("");
  println("Key: " + key + " Keycode: " + keyCode);
  println("l: " + l + " r: " + r + " op: " + op);
  println("result: " + result + " displayVal: " + displayVal + " Left: " + left);
}

String handleEvent(String val, boolean num) {
  if (left && num && displayVal.length() < 22) {
    if (displayVal.equals("0")) {
      displayVal = val;
      l = float(displayVal);
    } else {
      displayVal += val;
      l = float(displayVal);
    }
  } else if (!left && num && displayVal.length() < 22) {
    if (displayVal.equals("0")) {
      displayVal = val;
      r = float(displayVal);
    } else {
      displayVal += val;
      r = float(displayVal);
    }
  } else if (val.equals("C")) {
    displayVal = "0";
    op = "";
    left = true;
    l = 0.0;
    r = 0.0;
    result = 0.0;
  } else if (val.equals("+")) {
    if (!left) {
      performCalculation();
    } else {
      op = "+";
      left = false;
      displayVal = "0";
    }
  } else if (val.equals("-")) {
    if (!left) {
      performCalculation();
    } else {
      op = "-";
      left = false;
      displayVal = "0";
    }
  } else if (val.equals("*")) {
    if (!left) {
      performCalculation();
    } else {
      op = "*";
      left = false;
      displayVal = "0";
    }
  } else if (val.equals("/")) {
    if (!left) {
      performCalculation();
    } else {
      op = "/";
      left = false;
      displayVal = "0";
    }
  } else if (val.equals("±")) {
    if (left) {
      l *= -1;
      displayVal = str(l);
    } else {
      r *= -1;
      displayVal = str(r);
    }
  } else if (val.equals(".") && !displayVal.contains(".")) {
    displayVal += val;
  } else if (val.equals("=")) {
    performCalculation();
  } else if (val.equals("√")) {
    if (left) {
      l = sqrt(l);
      displayVal = str(l);
    } else {
      r = sqrt(r);
      displayVal = str(r);
    }
  } else if (val.equals("^2")) {
    if (left) {
      l = l * l;
      displayVal = str(l);
    } else {
      r = r * r;
      displayVal = str(r);
    }
  } else if (val.equals("π")) {
    if (left) {
      l = PI * l;
      displayVal = str(l);
    } else {
      r = PI * r;
      displayVal = str(r);
    }
  } else if (val.equals("|x|")) {
    if (left && displayVal.contains("-")) {
      l = l * -1;
      displayVal = str(l);
    } else if (!left && displayVal.contains("-")) {
      r = r * -1;
      displayVal = str(r);
    }
  } else if (val.equals("Rand")) {
    if (left) {
      l = random(0, 1);
      displayVal = str(l);
    } else {
      r = random(0, 1);
      displayVal = str(r);
    }
  } else if (val.equals("bin") && !displayVal.contains(".")) {
    displayVal = binary(int(displayVal), 32);
  } else if (val.equals("hehe")) {
    background(random(200), random(200), random(200));
  } else if (val.equals("F>C")) {
    if (left) {
      l = (l - 32)*(5.0/9.0);
      displayVal = str(l);
    } else {
      r = (r - 32)*(5.0/9.0);
      displayVal = str(r);
    }
  } else if (val.equals("C>F")) {
    if (left) {
      l = l * (9.0/5.0) + 32;
      displayVal = str(l);
    } else {
      r = r * (9.0/5.0) + 32;
      displayVal = str(r);
    }
  } else if (val.equals("?")) {
    displayVal = ("Jonathan Su | Nov. 2020 \nComputer Programming 1");
  } else if (val.equals("off")) {
    displayVal = (" ");
  }
  return val;
}

void performCalculation() {
  if (op.equals("+")) {
    result = l + r;
  } else if (op.equals("-")) {
    result = l - r;
  } else if (op.equals("*")) {
    result = l * r;
  } else if (op.equals("/")) {
    result = l / r;
  }
  l = result;
  displayVal = str(result);
  left = true;
}

void updateDisplay() {
  if (opButtons[14].hover) {
    for (int x = 0; x < width; x+=10) {
      for (int y = 0; y < height; y+=10) {
        noStroke();
        fill(random(255));
        rect(x, y, 1, 1);
      }
    }
  }
  rectMode(CORNER);
  noStroke();
  fill(255);
  rect(50, 90, 340, 150);
  stroke(0);
  strokeWeight(1);
  fill(239);
  rect(49, 90, 341, 30);
  image(battery, 50, 91, 30, 29);
  image(gear, 360, 91, 30, 29);

  if (displayVal.length() < 17) {
    textSize(32);
  } else if (displayVal.length() < 18) {
    textSize(30);
  } else if (displayVal.length() < 19) {
    textSize(29);
  } else if (displayVal.length() < 20) {
    textSize(28);
  } else if (displayVal.length() < 21) {
    textSize(27);
  } else if (displayVal.length() < 22) {
    textSize(26);
  } else if (displayVal.length() < 23) {
    textSize(25);
  } else {
    textSize(17);
  }
  fill(0);
  text(displayVal, width/2, 200);
}
