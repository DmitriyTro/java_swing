package com.dmitriitrofimov.DrawLine;

import javax.swing.*;
import java.awt.*;

public class GraphicsPanel extends JPanel implements Runnable {

	private Line line;
	private Line line2;
	private Rectangle rectangle;
	private Circle circle;

	public GraphicsPanel() {
		line = new Line(300, 100, 300, 200);
//		line2 = new Line(210, 55, 108, 32);
//
//		rectangle = new Rectangle(170, 200, 75, 100);
//
//		circle = new Circle(100, 250, 75, 75);

		new Thread(this).start();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		g2.draw(line);
//		g2.draw(line2);
//		g2.draw(rectangle);
//		g2.draw(circle);
	}

	@Override
	public void run() {
		while (true) {
			try {
				line.movie();
				super.repaint();
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}