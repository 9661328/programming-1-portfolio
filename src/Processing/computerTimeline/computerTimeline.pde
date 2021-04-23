//Jonathan Su | Computer Timeline //<>//
//Sept. 15, 2020
boolean hover = false;
PFont font;

void setup () {
  size(900, 400);
  font = loadFont("TsukuBRdGothic-Regular-40.vlw");
}

void draw () {
  background(255);
  textFont(font);
  println(hover);
  println(mouseX + " " + mouseY);
  drawRef();
  histEvent(100, 200, 100, 25, "Zuse Z3 (1941)", "World's first working programmable, fully automatic digital computer completed in Berlin in 1941 by Konrad Zuse.", true);
  histEvent(200, 275, 150, 25, "Colossus Mark 1 (1944)", "Designed by British engineer Tommy Flowers and used to break Lorenz ciphers used by Nazis during World War II. Not made public until 1970s. ", false);
  histEvent(300, 200, 110, 25, "IBM ASCC (1944)", "Also called the Harvard Mark 1, conceived by Harvard professor and designed/built by IBM. \n The IBM ASCC was a room-sized general-purpose calculator.", true);
  histEvent(400, 275, 100, 25, "ENIAC (1946)", "The ENIAC was 1000 times faster than any previous computer because of its electronic (as opposed to electromachanical) technology.", false);
  histEvent(500, 200, 150, 25, "Manchester Baby (1948)", "The SSEC produced the moon position tables used in early planning of the 1969 Apollo XII moon landing.", true);
  histEvent(600, 275, 100, 25, "EDSAC (1949)", "EDSAC was built at Cambridge University using vacuum tubes and mercury delay lines for memory.", false);
  histEvent(700, 200, 100, 25, "CSIRAC (1949)", "First in the world to play digital music, and Australia's first stored-memory computer.", true);
  histEvent(740, 275, 100, 25, "EDSAC (1949)", "First computer built following Von Neumann's plan, built at Cambridge University. It could store programs internally rather than using switches.", false);
}

void drawRef() {
  //Title Text
  textAlign(CENTER);
  textSize(40);
  fill(255, 0, 0);
  text("Historic Computer Systems", width/2, 65);

  //Timeline
  strokeWeight(5);
  stroke(#CFE844);
  line(100, 250, 800, 250);

  //Descriptive Text
  textSize(15);
  text("Describes major computer systems in the 20th century and beyond. \n Jonathan Su | 2020", width/2, 110);

  //Draw tick marks
  for (int i = 100; i < 801; i += 50) {
    line (i, height * 0.6-5, i, height * 0.6+5);
  }
}

void histEvent (int x, int y, int w, int h, String title, String description, boolean top) {
  //Detect the location of the mouse
  hover = (mouseX > x && mouseX < x+w && mouseY > y && mouseY < y+h);

  //Draw a rectangle
  strokeWeight(1);
  if (hover == true) {
    fill(0, 255, 0);
  } else {
    fill(255);
  }
  stroke(#CFE844);
  rect(x, y, w, h, 5);

  //Draw the title for the rectangle, description
  fill(0);
  textSize(12);
  textAlign(LEFT);
  text(title, x + 5, y + 20);
  textAlign(CENTER);
  if (hover == true) {
    text(description, width/2, 350);
  }

  //Draw the connecting line
  stroke(#CFE844);
  if (top == true) {
    line(x + 20, y + 25, x + 35, y + 50);
  } else {
    line(x + 20, y, x + 35, y - 25);
  }
}
