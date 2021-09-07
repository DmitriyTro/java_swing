package com.dmitriitrofimov;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("this is title form...");

		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());

		JPanel panel = new JPanel(new FlowLayout());
		panel.setPreferredSize(new Dimension(600, 100));
		panel.setBackground(Color.GREEN);

		JButton button1 = new JButton("button_1");
		JButton button2 = new JButton("button_2");
		JButton button3 = new JButton("button_3");
		JTextField textField = new JTextField(10);

//		JButton[] buttons = new JButton[10];
//
//		for (int i = 0; i < buttons.length; i++) {
//			buttons[i] = new JButton(String.valueOf(i));
//			frame.add(buttons[i]);
//		}

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(textField);

		frame.add(panel, BorderLayout.PAGE_END);
		frame.setVisible(true);
	}
}