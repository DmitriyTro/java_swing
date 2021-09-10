package com.dmitriitrofimov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorChooserTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("this is title form...");

		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());

		JPanel panel = new JPanel(new BorderLayout());
		JColorChooser colorChooser = new JColorChooser();
		JLabel label = new JLabel("text text text");
		JButton labelButton = new JButton("Chooser color");

		labelButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				Color c = colorChooser.getColor();
				label.setForeground(c);
			}
		});

		panel.add(label, BorderLayout.SOUTH);
		panel.add(labelButton, BorderLayout.NORTH);
		frame.add(colorChooser, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.SOUTH);
		frame.setVisible(true);
	}
}