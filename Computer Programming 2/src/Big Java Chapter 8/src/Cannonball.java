import java.awt.Point;
import java.util.ArrayList;

public class Cannonball {
    private double x, y, xVelocity, yVelocity;

    public Cannonball(double x) {
	this.x = x;
	this.y = 0;
    }

    public void move(double deltaSec) {
	x += (deltaSec * xVelocity);
	y += (deltaSec * yVelocity - 0.5 * 9.81 * Math.pow(deltaSec, 2));

	yVelocity = yVelocity - 9.81 * deltaSec;
    }

    public Point getLocation() {
	return new Point((int) x, (int) y);
    }

    public ArrayList<Point> shoot(double alpha, double v, double deltaSec) {
	ArrayList<Point> coordinates = new ArrayList<Point>();

	xVelocity = v * Math.cos(Math.toRadians(alpha));
	yVelocity = v * Math.sin(Math.toRadians(alpha));

	do {
	    coordinates.add(getLocation());  
	    move(deltaSec);
	} while (y > 0);
	
	return coordinates;
    }
}