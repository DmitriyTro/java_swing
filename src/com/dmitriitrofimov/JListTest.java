package com.dmitriitrofimov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JListTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("this is title form...");

		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());

		JPanel panel1 = new JPanel(new FlowLayout());
		JPanel panel2 = new JPanel(new FlowLayout());
		panel1.setPreferredSize(new Dimension(600, 200));

		JButton button = new JButton("Добавить");
		JTextField textField = new JTextField(15);

		DefaultListModel dfm = new DefaultListModel();
		JList jList = new JList(dfm);
		JScrollPane myScrollPaneList = new JScrollPane(jList);
		myScrollPaneList.setPreferredSize(new Dimension(300, 200));
		jList.setLayoutOrientation(JList.VERTICAL_WRAP);

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dfm.addElement(textField.getText());
			}
		});

		panel1.add(button);
		panel1.add(textField);
		panel2.add(myScrollPaneList);

		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}