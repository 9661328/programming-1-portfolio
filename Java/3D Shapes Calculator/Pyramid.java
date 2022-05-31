public class Pyramid {
  private int baseSides;
  private double baseEdge, height, volume, surface, baseArea, faceArea, lateralSurface;
  private String newName;
  static String name = "Pyramid";
  static String par = "base sides (3-6), base edge, height";

  Pyramid(int baseSides, double baseEdge, double height) {
    this.baseSides = baseSides;
    this.baseEdge = baseEdge;
    this.height = height;
  }

  boolean nonnegative() {
    if (baseSides > 0 && baseEdge > 0 && height > 0) {
      return true;
    } else {
      return false;
    }
  }

  boolean hasFormula() {
    if (baseSides == 3 || baseSides == 4 || baseSides == 5 || baseSides == 6) {
      return true;
    } else {
      return false;
    }
  }

  String getName() {
    switch (baseSides) {
    case 3:
      newName = "Triangular pyramid (tetrahedron)";
      break;
    case 4:
      newName = "Right square pyramid";
      break;
    case 5:
      newName = "Right pentagonal pyramid";
      break;
    case 6:
      newName = "Right hexagonal pyramid";
      break;
    }
    return newName;
  }

  double calculateVolume() {
    switch (baseSides) {
    case 3:
      volume = (Math.pow(baseEdge, 3) / (6.0 * Math.sqrt(2)));
      break;
    case 4:
      volume = (Math.pow(baseEdge, 2) * (height / 3.0));
      break;
    case 5:
      volume = ((5.0 / 12.0) * Math.tan(Math.toRadians(54)) * height * Math.pow(baseEdge, 2));
      break;
    case 6:
      volume = ((Math.sqrt(3) / 2.0) * Math.pow(baseEdge, 2) * height);
      break;
    }
    return volume;
  }

  double calculateSurface() {
    switch (baseSides) {
    case 3:
      surface = (Math.sqrt(3) * Math.pow(baseEdge, 2));
      break;
    case 4:
      surface = (Math.pow(baseEdge, 2) + (2 * baseEdge * Math.sqrt((Math.pow(baseEdge, 2) / 4.0) + Math.pow(height, 2))));
      break;
    case 5:
      surface = (5.0 / 4.0 * Math.tan(Math.toRadians(54)) * Math.pow(baseEdge, 2) + (5 * (baseEdge / 2.0)) * Math.sqrt(Math.pow(height, 2) + Math.pow((baseEdge * Math.tan(Math.toRadians(54)) / 2.0), 2)));
      break;
    case 6:
      surface = (((3 * Math.sqrt(3) / 2.0)) * Math.pow(baseEdge, 2) + 3 * baseEdge * Math.sqrt(Math.pow(height, 2) + (3 * Math.pow(baseEdge, 2)) / 4.0));
      break;
    }
    return surface;
  }

  double calculateBaseArea() {
    switch (baseSides) {
    case 3:
      baseArea = (Math.sqrt(3) / 4.0 * Math.pow(baseEdge, 2));
      break;
    case 4:
      baseArea = (Math.pow(baseEdge, 2));
      break;
    case 5:
      baseArea = (5.0 / 4.0 * Math.tan(Math.toRadians(54)) * Math.pow(baseEdge, 2));
      break;
    case 6:
      baseArea = ((3 * Math.sqrt(3)) / 2.0 * Math.pow(baseEdge, 2));
      break;
    }
    return baseArea;
  }

  double calculateFaceArea() {
    switch (baseSides) {
    case 3:
      faceArea = (Math.sqrt(3) / 4.0 * Math.pow(baseEdge, 2));
      break;
    case 4:
      faceArea = ((baseEdge / 2.0) * Math.sqrt((Math.pow(baseEdge, 2) / 4.0) + Math.pow(height, 2)));
      break;
    case 5:
      faceArea = ((baseEdge / 2.0) * Math.sqrt(Math.pow(height, 2) + Math.pow(baseEdge * Math.tan(Math.toRadians(54)) / 2.0, 2)));
      break;
    case 6:
      faceArea = ((baseEdge / 2.0) * Math.sqrt(Math.pow(height, 2) + (3 * Math.pow(baseEdge, 2)) / 4.0));
      break;
    }
    return faceArea;
  }

  double calculateLateralSurface() {
    switch (baseSides) {
    case 3:
      lateralSurface = (Math.sqrt(3) / 4.0 * Math.pow(baseEdge, 2)) * 3.0;
      break;
    case 4:
      lateralSurface = ((baseEdge / 2.0) * Math.sqrt((Math.pow(baseEdge, 2) / 4.0) + Math.pow(height, 2))) * 4.0;
      break;
    case 5:
      lateralSurface = ((baseEdge / 2.0) * Math.sqrt(Math.pow(height, 2) + Math.pow(baseEdge * Math.tan(Math.toRadians(54)) / 2.0, 2))) * 5.0;
      break;
    case 6:
      lateralSurface = ((baseEdge / 2.0) * Math.sqrt(Math.pow(height, 2) + (3 * Math.pow(baseEdge, 2)) / 4.0)) * 6.0;
      break;
    }
    return lateralSurface;
  }
}