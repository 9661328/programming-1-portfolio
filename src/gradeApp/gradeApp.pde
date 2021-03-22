void setup() {
  size(401, 100);
}

void draw() {
  background(#3A4B57);
  line(0, 50, width, 50);
  ellipse(mouseX, 50, 5, 5);
  assignGrade(mouseX);
}

void assignGrade(float grade) {
  if (mouseX > width/2) {
    textAlign(RIGHT);
  } else {
    textAlign(LEFT);
  }

  grade *= 0.01;
  if (grade >= 3.51) {
    text("Assign letter grade A: " + grade, mouseX - 5, 40);
  } else if (grade >= 3.00) {
    text("Assign letter grade A-: " + grade, mouseX, 40);
  } else if (grade >= 2.84) {
    text("Assign letter grade B+: " + grade, mouseX, 40);
  } else if (grade >= 2.67) {
    text("Assign letter grade B: " + grade, mouseX, 40);
  } else if (grade >= 2.50) {
    text("Assign letter grade B-: " + grade, mouseX, 40);
  } else if (grade >= 2.34) {
    text("Assign letter grade C+: " + grade, mouseX, 40);
  } else if (grade >= 2.17) {
    text("Assign letter grade C: " + grade, mouseX, 40);
  } else if (grade >= 2.00) {
    text("Assign letter grade  C-: " + grade, mouseX, 40);
  } else if (grade >= 1.66) {
    text("Assign letter grade D+: " + grade, mouseX, 40);
  } else if (grade >= 1.33) {
    text("Assign letter grade D: " + grade, mouseX, 40);
  } else if (grade >= 1.00) {
    text("Assign letter grade D-: " + grade, mouseX, 40);
  } else {
    text("Assign letter grade F: " + grade, mouseX + 5, 40);
  }
}
