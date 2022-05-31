public class Cone {
  private double radius, height;
  static String name = "Right circular cone";
  static String par = "radius, height";

  Cone(double radius, double height) {
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
    double volume = Math.PI * Math.pow(radius, 2) * (height / 3);
    return volume;
  }

  double calculateSurface() {
    double surface = Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    return surface;
  }

  double calculateBaseArea() {
    double base = Math.PI * Math.pow(radius, 2);
    return base;
  }

  double calculateLateralSurface() {
    double lateral = Math.PI * radius * Math.sqrt(Math.pow(height, 2) + (Math.pow(radius, 2)));
    return lateral;
  }

  double calculateSlantHeight() {
    double slant = Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2));
    return slant;
  }

  double calculateBaseDiameter() {
    double diameter = 2 * radius;
    return diameter;
  }

  double calculateBaseCircumference() {
    double circumference = 2 * Math.PI * radius;
    return circumference;
  }
}