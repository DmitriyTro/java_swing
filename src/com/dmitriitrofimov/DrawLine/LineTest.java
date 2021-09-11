package com.dmitriitrofimov.DrawLine;

import javax.swing.*;
import java.awt.*;

public class LineTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("this is title form...");

		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridBagLayout());

		GraphicsPanel graphicsPanel = new GraphicsPanel();

		frame.add(graphicsPanel, new GridBagConstraints(0, 0, 1, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2), 0, 0));

		frame.setVisible(true);
	}
}