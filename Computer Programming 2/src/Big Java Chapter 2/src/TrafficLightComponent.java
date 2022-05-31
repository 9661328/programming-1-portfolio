import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

class TrafficLightComponent extends JComponent {
    public void paint(Graphics g) {
	Graphics2D g2 = (Graphics2D) g;

	g2.setColor(Color.WHITE);
	g2.fillRoundRect(10, 10, 260, 540, 20, 20);
	g2.drawRoundRect(10, 10, 260, 540, 20, 20);

	g2.setColor(Color.BLACK);
	g2.fillRoundRect(30, 30, 220, 500, 20, 20);
	g2.drawRoundRect(30, 30, 220, 500, 20, 20);

	g2.setColor(Color.RED);
	Ellipse2D.Double redLight = new Ellipse2D.Double(60, 60, 150, 150);
	g2.fillOval(60, 60, 150, 150);
	g2.draw(redLight);

	g2.setColor(Color.YELLOW);
	Ellipse2D.Double yellowLight = new Ellipse2D.Double(60, 210, 150, 150);
	g2.fillOval(60, 210, 150, 150);
	g2.draw(yellowLight);

	g2.setColor(Color.GREEN);
	Ellipse2D.Double greenLight = new Ellipse2D.Double(60, 360, 150, 150);
	g2.fillOval(60, 360, 150, 150);
	g2.draw(greenLight);
    }
}