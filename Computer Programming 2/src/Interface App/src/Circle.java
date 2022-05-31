import static java.lang.Math.*;

public class Circle implements Polygon {
    private double radius;

    public Circle(double radius) {
	this.radius = radius;
    }

    @Override
    public double calculateArea() {
	return PI * pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
	return 2 * PI * radius;
    }

    @Override
    public String getName() {
	return "Circle";
    }
}