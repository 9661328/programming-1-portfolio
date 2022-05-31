public class Torus {
  private double majorRadius, minorRadius;
  static String name = "Torus";
  static String par = "major radius, minor radius";

  Torus(double majorRadius, double minorRadius) {
    this.majorRadius = majorRadius;
    this.minorRadius = minorRadius;
  }

  boolean nonnegative() {
    if (majorRadius > 0 && minorRadius > 0) {
      return true;
    } else {
      return false;
    }
  }

  boolean majorGreaterThanMinor() {
    if (majorRadius > minorRadius) {
      return true;
    } else {
      return false;
    }
  }

  double calculateVolume() {
    double volume = (Math.PI * Math.pow(minorRadius, 2) * (2 * Math.PI * majorRadius));
    return volume;
  }

  double calculateSurface() {
    double surface = (2 * Math.PI * majorRadius) * (2 * Math.PI * minorRadius);
    return surface;
  }
}