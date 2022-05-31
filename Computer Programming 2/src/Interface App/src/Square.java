import static java.lang.Math.*;

public class Square implements Polygon {
    private double side;
    
    public Square(double side) {
	this.side = side;
    }

    @Override
    public double calculateArea() {
	return pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
	return side * 4;
    }

    @Override
    public String getName() {
	return "Square";
    }
}