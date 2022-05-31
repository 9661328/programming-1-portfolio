import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Scanner;

public class LabelAnimator extends JFrame {
    LabelComponent l;
    Scanner scanner = new Scanner(System.in);
    
    class TimerListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	    l.move();
	}
    }

    public LabelAnimator() {
	System.out.print("Text: ");
	String text = scanner.nextLine();
	l = new LabelComponent(text);
	
	setVisible(true);
	getContentPane().setPreferredSize(new Dimension(1000, 50));
	pack();
	setResizable(false);
	getContentPane().add(l);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Timer t = new Timer(50, new TimerListener());
	t.start();
    }
}