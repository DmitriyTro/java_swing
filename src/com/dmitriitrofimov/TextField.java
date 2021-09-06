package com.dmitriitrofimov;

import javax.swing.*;
import java.awt.*;

public class TextField {
	public static void main(String[] args) {
		JFrame frame = new JFrame("this is title form...");

		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridBagLayout());

//		JTextField textField = new JTextField(20);
		JPasswordField passwordField = new JPasswordField(20);
		JButton button = new JButton("Кнопка");

//		frame.add(textField);
		frame.add(passwordField);
		frame.add(button);

		frame.setVisible(true);
	}
}
