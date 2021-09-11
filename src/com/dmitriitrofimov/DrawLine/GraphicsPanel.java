package com.dmitriitrofimov.DrawLine;

import javax.swing.*;
import java.awt.*;

public class GraphicsPanel extends JPanel {

	private Line line;
	private Line line2;

	public GraphicsPanel() {
		line = new Line(25, 150, 78, 2);
		line2 = new Line(210, 55, 108, 32);
	}

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		g2.draw(line);
		g2.draw(line2);
	}
}