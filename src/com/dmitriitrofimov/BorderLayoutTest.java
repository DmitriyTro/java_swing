package com.dmitriitrofimov;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("this is title form...");

		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();

		panel1.setBackground(Color.YELLOW);
		panel2.setBackground(Color.BLUE);
		panel3.setBackground(Color.GREEN);
		panel4.setBackground(Color.RED);
		panel5.setBackground(Color.GRAY);

		frame.add(panel1, BorderLayout.PAGE_START);
		frame.add(panel2, BorderLayout.PAGE_END);
		frame.add(panel3, BorderLayout.LINE_END);
		frame.add(panel4, BorderLayout.LINE_START);
		frame.add(panel5, BorderLayout.CENTER);

		JButton button = new JButton("button");

		panel5.add(button, BorderLayout.PAGE_START);

		frame.setVisible(true);
	}
}