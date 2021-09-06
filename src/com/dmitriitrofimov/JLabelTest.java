package com.dmitriitrofimov;

import javax.swing.*;
import java.awt.*;

public class JLabelTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("this is title form...");

		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridBagLayout());

		JLabel label = new JLabel("qwerty");
		Font font = new Font("Verdana", Font.ITALIC, 25);

		label.setFont(font);
		frame.add(label);

		frame.setVisible(true);
	}
}