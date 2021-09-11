package com.dmitriitrofimov.DrawLine;

import javax.swing.*;
import java.awt.*;

public class GraphicsPanel extends JPanel {

	private Line line;
	private Line line2;
	private Rectangle rectangle;
	private Circle circle;

	public GraphicsPanel() {
		line = new Line(25, 150, 78, 2);
		line2 = new Line(210, 55, 108, 32);

		rectangle = new Rectangle(170, 200, 75, 100);

		circle = new Circle(100, 250, 75, 75);
	}

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		g2.draw(line);
		g2.draw(line2);
		g2.draw(rectangle);
		g2.draw(circle);
	}
}