public class Prism {
  private int sides;
  private double baseWidth, baseHeight, height, baseArea;
  static String name = "Prism";
  static String par = "sides, base width, base height or apothem, height";
  String newName;

  Prism(int sides, double baseWidth, double baseHeight, double height) {
    this.sides = sides;
    this.baseWidth = baseWidth;
    this.baseHeight = baseHeight;
    this.height = height;
  }

  boolean nonnegative() {
    if (baseWidth > 0 && baseHeight > 0 && height > 0) {
      return true;
    } else {
      return false;
    }
  }

  String getName() {
    switch (sides) {
    case 3:
      newName = "Triangular prism";
      break;
    case 4:
      newName = "Rectangular prism";
      break;
    case 5:
      newName = "Pentagonal prism";
      break;
    case 6:
      newName = "Hexagonal prism";
      break;
    case 7:
      newName = "Heptagonal prism";
      break;
    case 8:
      newName = "Octagonal prism";
      break;
    case 9:
      newName = "Enneagonal prism";
      break;
    case 10:
      newName = "Decagonal prism";
      break;
    case 11:
      newName = "Hendecagonal prism";
      break;
    case 12:
      newName = "Dodecagonal prism";
      break;
    default: 
      newName = "null";
      break;
    }
    return newName;
  }

  double calculateBaseArea() {
    switch (sides) {
    default:
      baseArea = ((baseWidth * baseHeight) / 2.0) * sides;
      break;
    case 3:
      baseArea = (baseWidth * baseHeight) / 2.0;
      break;
    case 4:
      baseArea = baseWidth * baseHeight;
      break;
    }
    return baseArea;
  }

  double calculateVolume() {
    double volume = baseArea * height;
    return volume;
  }

  double calculateSurface() {
    double surface = (baseArea * 2) + (baseWidth * height * sides);
    return surface;
  }

  double calculateLateralSurface() {
    double lateralSurface = baseWidth * sides * height;
    return lateralSurface;
  }
}