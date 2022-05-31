import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

// import java.awt.Color;
// import java.awt.Graphics;
// import java.awt.Graphics2D;
// import java.awt.geom.Line2D;
// import java.awt.geom.Ellipse2D;
// import javax.swing.JComponent;
// import javax.swing.JFrame;

class Main {
    public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setSize(400, 400);
	frame.setTitle("FaceViewer");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	// Draw the FaceComponent
	frame.add(new FaceComponent());

	frame.setVisible(true);
    }
}

class FaceComponent extends JComponent {
    public void paint(Graphics g) {
	Graphics2D g2 = (Graphics2D) g;

	int faceRadius = 100, eyeRadius = 30;

	g2.setColor(Color.GREEN);

	// draw face
	Ellipse2D.Double face = new Ellipse2D.Double(0, 0, faceRadius, faceRadius);
	g2.draw(face);

	// draw eyes
	Ellipse2D.Double lEye = new Ellipse2D.Double(20, 20, eyeRadius, eyeRadius);
	g2.draw(lEye);

	Ellipse2D.Double rEye = new Ellipse2D.Double(60, 60, eyeRadius, eyeRadius);
	g2.draw(rEye);

	// draw mouth
	Line2D.Double mouth = new Line2D.Double(20, 60, 80, 60);
	g2.draw(mouth);

	g2.drawString("Message", 50, 50);
    }
}