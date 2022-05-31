public class Ellipsoid {
  private double a, b, c;
  static String name = "Ellipsoid";
  static String par = "a-axis, b-axis, c-axis";

  Ellipsoid(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  boolean nonnegative() {
    if (a > 0 && b > 0 && c > 0) {
      return true;
    } else {
      return false;
    }
  }

  double calculateVolume() {
    double volume = (4.0 / 3.0) * Math.PI * a * b * c;
    return volume;
  }

  double calculateSurface() {
    double surface = 4 * Math.PI * Math.pow(((Math.pow(a * b, 1.6) + Math.pow(a * c, 1.6) + Math.pow(b * c, 1.6)) / 3.0), 1.0 / 1.6);
    return surface;
  }
}