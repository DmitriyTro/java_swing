package com.dmitriitrofimov;

import javax.swing.*;
import java.awt.*;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("this is title form...");

		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridBagLayout());

		JButton button = new JButton("button");
		JButton button2 = new JButton("button 2");
		button.setCursor(new Cursor(Cursor.W_RESIZE_CURSOR));

		button.setBackground(Color.YELLOW);
		button.setForeground(Color.RED);
		Color color = button.getBackground();
		button2.setBackground(color);

		frame.add(button);
		frame.add(button2);
		frame.setVisible(true);
	}
}