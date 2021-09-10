package com.dmitriitrofimov;

import javax.swing.*;
import java.awt.*;

public class JMenuTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("this is title form...");

		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridBagLayout());

		JMenuBar jMenuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu searchMenu = new JMenu("Search");
		JMenu helpMenu = new JMenu("Help");


		JMenuItem createMenuItem = new JMenuItem("Create");
		JMenuItem openMenuItem = new JMenuItem("Open");
		JMenuItem saveMenuItem = new JMenuItem("Save");
		JMenuItem saveAsMenuItem = new JMenuItem("Save as");
		JMenuItem exitMenuItem = new JMenuItem("Exit");

		JMenuItem cutMenuItem = new JMenuItem("Cut");
		JMenuItem copyMenuItem = new JMenuItem("Copy");
		JMenuItem pasteMenuItem = new JMenuItem("Paste");
		JMenuItem deleteMenuItem = new JMenuItem("Delete");


		fileMenu.add(createMenuItem);
		fileMenu.add(openMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(saveMenuItem);
		fileMenu.add(saveAsMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);

		editMenu.add(cutMenuItem);
		editMenu.add(copyMenuItem);
		editMenu.add(pasteMenuItem);
		editMenu.add(deleteMenuItem);

		jMenuBar.add(fileMenu);
		jMenuBar.add(editMenu);
		jMenuBar.add(searchMenu);
		jMenuBar.add(helpMenu);

		exitMenuItem.addActionListener(e -> System.exit(1));

		frame.setJMenuBar(jMenuBar);
		frame.setVisible(true);
	}
}