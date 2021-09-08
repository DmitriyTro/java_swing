package com.dmitriitrofimov;

import javax.swing.*;
import java.awt.*;

public class JTableTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("this is title form...");

		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridBagLayout());

		JButton addButton = new JButton("Добавить");
		JButton deleteButton = new JButton("Удалить");
		JButton clearButton = new JButton("Очистить");


		BookTableModel btm = new BookTableModel();
		JTable bookTable = new JTable(btm);
		JScrollPane bookTableScrollPage = new JScrollPane(bookTable);
		bookTableScrollPage.setPreferredSize(new Dimension(400, 400));

		String[] str = new String[4];
		str[0] = "0";
		str[1] = "book title";
		str[2] = "453221233";
		str[3] = "book description";

		for (int i = 0; i < 100; i++) {
			btm.addDate(str);
		}

		frame.add(bookTableScrollPage, new GridBagConstraints(0, 0, 3, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.BOTH,
				new Insets(1, 1, 1, 1), 0, 0));

		frame.add(addButton, new GridBagConstraints(0, 1, 1, 1, 1, 1,
				GridBagConstraints.PAGE_END, GridBagConstraints.HORIZONTAL,
				new Insets(1, 1, 1, 1), 0, 0));

		frame.add(deleteButton, new GridBagConstraints(1, 1, 1, 1, 1, 1,
				GridBagConstraints.PAGE_END, GridBagConstraints.HORIZONTAL,
				new Insets(1, 1, 1, 1), 0, 0));

		frame.add(clearButton, new GridBagConstraints(2, 1, 1, 1, 1, 1,
				GridBagConstraints.PAGE_END, GridBagConstraints.HORIZONTAL,
				new Insets(1, 1, 1, 1), 0, 0));

		frame.setVisible(true);
		frame.pack();
	}
}