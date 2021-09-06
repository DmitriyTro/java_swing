package com.dmitriitrofimov;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(600, 400);
		frame.setTitle("this is title form...");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);

		frame.setVisible(true);

//		frame.setState(JFrame.ICONIFIED);
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//		frame.setExtendedState(JFrame.NORMAL);
	}
}