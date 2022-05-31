// Jonathan Su, Mar. 2021

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    boolean run = true;
    System.out.println("Jonathan Su, Mar. 2021\n\nWelcome!");
    System.out.println("Instructions: Enter a shape to calculate. Then, enter the parameters in the order specified, pressing enter after each one.");
    do {
      try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n***************************");
        System.out.println(
          "1 - Box\n2 - Cone\n3 - Cylinder\n4 - Ellipsoid\n5 - Polyhedron\n6 - Prism\n7 - Pyramid\n8 - Sphere\n9 - Torus\nPI - Print the value of PI\nHELP - Get instructions\nSTOP - Stop the program\n");
        String shape = scanner.nextLine();
        if (shape.equals("1")) {
          System.out.println(Box.name + ": " + Box.par + "\n");
          double a = scanner.nextDouble();
          double b = scanner.nextDouble();
          double c = scanner.nextDouble();
          Box box = new Box(a, b, c);
          if (box.nonnegative()) {
            System.out.println("");
            System.out.println("Volume: " + box.calculateVolume());
            System.out.println("Surface area: " + box.calculateSurface());
            System.out.println("Space diagonal: " + box.calculateSpaceDiagonal());
          } else {
            System.out.println("\nInvalid input: Values cannot be zero or negative!");
          }
        } else if (shape.equals("2")) {
          System.out.println(Cone.name + ": " + Cone.par + "\n");
          double a = scanner.nextDouble();
          double b = scanner.nextDouble();
          Cone cone = new Cone(a, b);
          if (cone.nonnegative()) {
            System.out.println("");
            System.out.println("Volume: " + cone.calculateVolume());
            System.out.println("Surface area: " + cone.calculateSurface());
            System.out.println("Base area: " + cone.calculateBaseArea());
            System.out.println("Lateral surface area: " + cone.calculateLateralSurface());
            System.out.println("Slant height: " + cone.calculateSlantHeight());
            System.out.println("Base diameter: " + cone.calculateBaseDiameter());
            System.out.println("Base circumference: " + cone.calculateBaseCircumference());
          } else {
            System.out.println("\nInvalid input: Values cannot be zero or negative!");
          }
        } else if (shape.equals("3")) {
          System.out.println(Cylinder.name + ": " + Cylinder.par + "\n");
          double a = scanner.nextDouble();
          double b = scanner.nextDouble();
          Cylinder cylinder = new Cylinder(a, b);
          if (cylinder.nonnegative()) {
            System.out.println("");
            System.out.println("Volume: " + cylinder.calculateVolume());
            System.out.println("Surface area: " + cylinder.calculateSurface());
            System.out.println("Base area: " + cylinder.calculateBaseArea());
            System.out.println("Lateral surface area: " + cylinder.calculateLateralSurface());
            System.out.println("Base diameter: " + cylinder.calculateDiameter());
            System.out.println("Base circumference: " + cylinder.calculateCircumference());
          } else {
            System.out.println("\nInvalid input: Values cannot be zero or negative!");
          }
        } else if (shape.equals("4")) {
          System.out.println(Ellipsoid.name + ": " + Ellipsoid.par + "\n");
          double a = scanner.nextDouble();
          double b = scanner.nextDouble();
          double c = scanner.nextDouble();
          Ellipsoid ellipsoid = new Ellipsoid(a, b, c);
          if (ellipsoid.nonnegative()) {
            System.out.println("");
            System.out.println("Volume: " + ellipsoid.calculateVolume());
            System.out.println("Surface area: " + ellipsoid.calculateSurface());
          } else {
            System.out.println("\nInvalid input: Values cannot be zero or negative!");
          }
        } else if (shape.equals("5")) {
          System.out.println(Polyhedron.name + ": " + Polyhedron.par + "\n");
          int a = scanner.nextInt();
          double b = scanner.nextDouble();
          Polyhedron polyhedron = new Polyhedron(a, b);
          if (polyhedron.nonnegative()) {
            if (polyhedron.hasFormula()) {
              System.out.println("");
              System.out.println("Volume: " + polyhedron.calculateVolume());
            } else {
              System.out.println("\nThis program currently doesn't have the formula to calculate that shape!");
            }
          } else {
            System.out.println("\nInvalid input: Values cannot be zero or negative!");
          }
        } else if (shape.equals("6")) {
          System.out.println(Prism.name + ": " + Prism.par + "\n");
          int a = scanner.nextInt();
          double b = scanner.nextDouble();
          double c = scanner.nextDouble();
          double d = scanner.nextDouble();
          Prism prism = new Prism(a, b, c, d);
          if (prism.nonnegative()) {
            System.out.println("");
            System.out.println("Name: " + prism.getName());
            System.out.println("Volume: " + prism.calculateVolume());
            System.out.println("Surface area: " + prism.calculateSurface());
            System.out.println("Base area: " + prism.calculateBaseArea());
            System.out.println("Lateral surface area: " + prism.calculateLateralSurface());
          } else {
            System.out.println("\nInvalid input: Values cannot be zero or negative!");
          }
        } else if (shape.equals("7")) {
          System.out.println(Pyramid.name + ": " + Pyramid.par + "\n");
          int a = scanner.nextInt();
          double b = scanner.nextDouble();
          double c = scanner.nextDouble();
          Pyramid pyramid = new Pyramid(a, b, c);
          if (pyramid.nonnegative()) {
            if (pyramid.hasFormula()) {
              System.out.println("");
              System.out.println("Name: " + pyramid.getName());
              System.out.println("Volume: " + pyramid.calculateVolume());
              System.out.println("Surface area: " + pyramid.calculateSurface());
              System.out.println("Base area: " + pyramid.calculateBaseArea());
              System.out.println("Face area: " + pyramid.calculateFaceArea());
              System.out.println("Lateral surface area: " + pyramid.calculateLateralSurface());
            } else {
              System.out.println("\nThis program currently doesn't have the formula to calculate that shape!");
            }
          } else {
            System.out.println("\nInvalid input: Values cannot be zero or negative!");
          }
        } else if (shape.equals("8")) {
          System.out.println(Sphere.name + ": " + Sphere.par + "\n");
          double a = scanner.nextDouble();
          Sphere sphere = new Sphere(a);
          if (sphere.nonnegative()) {
            System.out.println("");
            System.out.println("Volume: " + sphere.calculateVolume());
            System.out.println("Surface area: " + sphere.calculateSurface());
            System.out.println("Hemisphere volume: " + sphere.calculateHemisphereVolume());
            System.out.println("Hemisphere surface area: " + sphere.calculateHemisphereSurface());
            System.out.println("Diameter: " + sphere.calculateDiameter());
            System.out.println("Circumference: " + sphere.calculateCircumference());
          } else {
            System.out.println("\nInvalid input: Values cannot be zero or negative!");
          }
        } else if (shape.equals("9")) {
          System.out.println(Torus.name + ": " + Torus.par + "\n");
          double a = scanner.nextDouble();
          double b = scanner.nextDouble();
          Torus torus = new Torus(a, b);
          if (torus.nonnegative()) {
            System.out.println("");
            if (torus.majorGreaterThanMinor()) {
              System.out.println("Volume: " + torus.calculateVolume());
              System.out.println("Surface area: " + torus.calculateSurface());
            } else {
              System.out.println("Invalid input: Make sure R > r!");
            }
          } else {
            System.out.println("\nInvalid input: Values cannot be zero or negative!");
          }
        } else if (shape.equals("PI")) {
          System.out.println(Math.PI);
        } else if (shape.equals("HELP")) {
          System.out.println("\nInstructions: Enter a shape to calculate. Then, enter the parameters in the order specified, pressing enter after each one.");
        } else if (shape.equals("STOP")) {
          run = false;
          System.out.println("\nGoodbye!");
        } else {
          System.out.println("\nNot a valid shape!");
        }
      } catch (Exception e) {
        System.out.println("\nInvalid input: Input must be numeric!");
      }
    } while (run);
  }
}