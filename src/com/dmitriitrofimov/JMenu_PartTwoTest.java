package com.dmitriitrofimov;

import javax.swing.*;
import java.awt.*;

public class JMenu_PartTwoTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("this is title form...");

		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridBagLayout());

		JMenuBar jMenuBar = new JMenuBar();
		JMenu menu1 = new JMenu("menu_1");
		JMenu menu2 = new JMenu("menu_2");
		jMenuBar.add(menu1);
		jMenuBar.add(menu2);

		JMenu itemMenu1 = new JMenu("item_menu_1");
		JMenu itemMenu2 = new JMenu("item_menu_2");
		JMenu itemMenu3 = new JMenu("item_menu_3");
		menu1.add(itemMenu1);
		menu1.add(itemMenu2);
		menu1.add(itemMenu3);

		itemMenu2.setIcon(new ImageIcon("plus.png"));

		JRadioButtonMenuItem r1 = new JRadioButtonMenuItem("radio_button_1");
		JRadioButtonMenuItem r2 = new JRadioButtonMenuItem("radio_button_2");
		JCheckBoxMenuItem r3 = new JCheckBoxMenuItem("check_box");

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(r1);
		buttonGroup.add(r2);
		itemMenu1.add(r1);
		itemMenu1.add(r2);
		itemMenu1.add(r3);

		JMenuItem subMenuItem1 = new JMenuItem("sub_menu_item_1");
		JMenuItem subMenuItem2 = new JMenuItem("sub_menu_item_2");
		JMenuItem subMenuItem3 = new JMenuItem("sub_menu_item_3");
		itemMenu1.add(subMenuItem1);
		itemMenu1.add(subMenuItem2);
		itemMenu1.add(subMenuItem3);

		frame.setJMenuBar(jMenuBar);
		frame.setVisible(true);
	}
}
