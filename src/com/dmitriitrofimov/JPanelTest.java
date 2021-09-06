package com.dmitriitrofimov;

import javax.swing.*;
import java.awt.*;

public class JPanelTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("this is title form...");

		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridBagLayout());

		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JButton button = new JButton("the button");

		panel.setBackground(Color.YELLOW);
		panel2.setBackground(Color.GREEN);
		panel.add(button);
		panel.add(panel2);

		frame.add(panel);
		frame.setVisible(true);

		Component[] comp = panel.getComponents();
		for (int i = 0; i < comp.length; i++) {
			if (comp[i] instanceof JPanel) {
				System.out.println("panel");
			}
			if (comp[i] instanceof JButton) {
				String titleButton = ((JButton) comp[i]).getText();
				System.out.println("titleButton: " + titleButton);
			}
		}
	}
}