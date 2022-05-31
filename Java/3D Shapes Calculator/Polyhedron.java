public class Polyhedron {
  private int faces;
  private double edge, volume;
  static String name = "Polyhedron";
  static String par = "faces, edge";

  Polyhedron(int faces, double edge) {
    this.faces = faces;
    this.edge = edge;
  }

  boolean nonnegative() {
    if (faces > 0 && edge > 0) {
      return true;
    } else {
      return false;
    }
  }

  boolean hasFormula() {
    if (faces == 3 || faces == 4 || faces == 8 || faces == 12 || faces == 20) {
      return true;
    } else {
      return false;
    }
  }

  double calculateVolume() {
    switch (faces) {
    case 3:
      // tetrahedron
      volume = Math.pow(edge, 3) / (6.0 * Math.sqrt(2));
      break;
    case 4:
      // cube
      volume = Math.pow(edge, 3);
      break;
    case 8:
      // octahedron
      volume = (Math.sqrt(2) / 3.0) * Math.pow(edge, 3);
      break;
    case 12:
      // dodecahedron
      volume = ((15.0 + (7.0 * Math.sqrt(5))) / (4.0)) * Math.pow(edge, 3);
      break;
    case 20:
      // icosahedron
      volume = ((5.0 * (3 + Math.sqrt(5))) / 12.0) * Math.pow(edge, 3);
      break;
    }
    return volume;
  }
}

// fix