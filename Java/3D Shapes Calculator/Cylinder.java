public class Cylinder {
  private double radius, height;
  static String name = "Right cylinder";
  static String par = "radius, height";

  Cylinder(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }

  boolean nonnegative() {
    if (radius > 0 && height > 0) {
      return true;
    } else {
      return false;
    }
  }

  double calculateVolume() {
    double volume = Math.PI * Math.pow(radius, 2) * height;
    return volume;
  }

  double calculateSurface() {
    double surface = (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height);
    return surface;
  }

  double calculateBaseArea() {
    double base = Math.PI * Math.pow(radius, 2);
    return base;
  }

  double calculateLateralSurface() {
    double lateral = 2 * Math.PI * radius * height;
    return lateral;
  }

  double calculateDiameter() {
    double diameter = radius * 2;
    return diameter;
  }

  double calculateCircumference() {
    double circumference = 2 * Math.PI * radius;
    return circumference;
  }
}