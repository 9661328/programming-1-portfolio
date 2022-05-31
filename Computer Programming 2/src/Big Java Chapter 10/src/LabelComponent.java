import javax.swing.*;
import java.awt.*;
import java.io.*;

public class LabelComponent extends JLabel {
    public static Font font = new Font("minisystem", Font.PLAIN, 36);
    
    String text;
    int x;

    public LabelComponent(String text) {
        try {
            InputStream fontFile = getClass().getResourceAsStream("/minisystem/minisystem.ttf");
            Font f = Font.createFont(Font.TRUETYPE_FONT, fontFile);

            GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
            g.registerFont(f);
        } catch (Exception e) {
            e.printStackTrace();
        }
	
        setFont(font);
	this.text = text;
	x = 0;
    }

    public void paintComponent(Graphics g) {
	g.drawString(text, x, 35);
    }

    public void move() {
	x -= 10;

	if (x + getWidth() < 0) {
	    x = 1000;
	}

	repaint();
    }
}