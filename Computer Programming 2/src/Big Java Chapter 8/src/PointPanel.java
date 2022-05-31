import javax.swing.*;
import java.awt.*;
import java.util.*;

public class PointPanel extends JPanel {
    ArrayList<Point> p;

    public PointPanel(ArrayList<Point> p) {
        this.p = p;
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.translate(0, getHeight() - 1);
        g2.scale(1, -1);

        for (Point point : p) {
            g2.drawLine(point.x, point.y, point.x, point.y);
            System.out.println(point.x + " " + point.y);
        }
    }
}