package com.dmitriitrofimov;

import javax.swing.*;
import java.awt.*;

public class GridLayoutTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("this is title form...");

		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());

		JPanel panel = new JPanel(new GridLayout(3, 3));

		JButton b1 = new JButton("B_1");
		JButton b2 = new JButton("B_2");
		JButton b3 = new JButton("B_3");
		JButton b4 = new JButton("B_4");
		JButton b5 = new JButton("B_5");


		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		frame.add(panel, BorderLayout.NORTH);
		frame.setVisible(true);
	}
}