public class Box {
  private double x, y, z;
  static String name = "Box";
  static String par = "length, width, height";

  Box(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  boolean nonnegative() {
    if (x > 0 && y > 0 && z > 0) {
      return true;
    } else {
      return false;
    }
  }

  double calculateVolume() {
    double volume = x * y * z;
    return volume;
  }

  double calculateSurface() {
    double surface = ((x * y) + (x * z) + (y * z)) * 2;
    return surface;
  }

  double calculateSpaceDiagonal() {
    double diagonal = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    return diagonal;
  }
}