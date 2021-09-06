package com.dmitriitrofimov;

import javax.swing.*;
import java.awt.*;

public class JProgressBarTest {
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("this is title form...");

		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridBagLayout());

		JLabel label = new JLabel();
		label.setText("Loading...");

		JProgressBar jProgressBar = new JProgressBar();
		jProgressBar.setStringPainted(true);
//		jProgressBar.setIndeterminate(true);
		jProgressBar.setMinimum(0);
		jProgressBar.setMaximum(100);

		frame.add(jProgressBar);
		frame.add(label);
		frame.setVisible(true);

		for (int i = jProgressBar.getMinimum(); i <= jProgressBar.getMaximum(); i++) {
			Thread.sleep(30);
			jProgressBar.setValue(i);
		}

		label.setText("Done!");
	}
}