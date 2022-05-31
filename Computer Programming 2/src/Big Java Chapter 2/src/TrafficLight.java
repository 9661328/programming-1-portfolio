/*
 * Written by: Jonathan Su
 * Date: 10/07/2021
 * 
 * A graphical program that draws a traffic light.
 */

import java.awt.*;
import java.awt.geom.*;

import javax.swing.JFrame;
import javax.swing.JComponent;

public class TrafficLight {
    public static void main(String args[]) {
	JFrame frame = new JFrame();
	frame.setSize(280, 600);
	frame.getContentPane().setBackground(Color.BLACK);
	frame.setTitle("Traffic Light");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(new TrafficLightComponent());
	frame.setVisible(true);
    }
}