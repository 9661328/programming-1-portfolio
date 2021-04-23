public class Sphere {
  private double radius;
  static String name = "Sphere";
  static String par = "radius";

  Sphere(double radius) {
    this.radius = radius;
  }

  boolean nonnegative() {
    if (radius > 0) {
      return true;
    } else {
      return false;
    }
  }

  double calculateVolume() {
    double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    return volume;
  }

  double calculateSurface() {
    double surface = 4 * Math.PI * Math.pow(radius, 2);
    return surface;
  }

  double calculateHemisphereVolume() {
    double hemVol = ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3)) / 2.0;
    return hemVol;
  }

  double calculateHemisphereSurface() {
    double hemSur = (4 * Math.PI * Math.pow(radius, 2)) / 2.0;
    return hemSur;
  }

  double calculateDiameter() {
    double diameter = 2 * radius;
    return diameter;
  }

  double calculateCircumference() {
    double circumference = 2 * Math.PI * radius;
    return circumference;
  }
}