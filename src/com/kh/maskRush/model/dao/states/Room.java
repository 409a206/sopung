package com.kh.maskRush.model.dao.states;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.maskRush.model.dao.entities.Creature.Player;

public class Room extends JPanel {
	private JPanel panel;
	private JPanel boyPanel;
	private FirstMenuChoice mainChoice;
	private Player a;

	public Room(FirstMenuChoice mainChoice) {
		this.mainChoice = mainChoice;
		panel = this;
		setLayout(null);
		setBounds(0, 0, 800, 600);
		boy();
		
		// 배경라벨
		JLabel back = new JLabel();
		// boy.setLabelFor(back);
		back.setIcon(new ImageIcon(Room.class.getResource("/textures/\uBC292.png")));
		back.setBounds(-92, -115, 1355, 769);
		this.add(back);

	}

	public void boy() {
		boyPanel = new JPanel();
		boyPanel.setBackground(new Color(255, 0, 0, 0));
		boyPanel.setFocusable(true);
		boyPanel.addKeyListener(new MyKeyListener());
		boyPanel.setBounds(224, 261, 90, 100);

		JLabel boy = new JLabel();
		boyPanel.add(boy);
		mainChoice.add(boyPanel);
		boy.setIcon(new ImageIcon(Room.class.getResource("/InConvenience/maskwithboy.png")));
		boy.setVisible(true);
	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {

			int keyCode = e.getKeyCode();
			int move = 5;

			switch (keyCode) {
			case KeyEvent.VK_UP:
				boyPanel.setLocation(boyPanel.getX(), boyPanel.getY() - move);
				System.out.println("위");
				break;
			case KeyEvent.VK_DOWN:
				boyPanel.setLocation(boyPanel.getX(), boyPanel.getY() + move);
				System.out.println("아래");
				break;
			case KeyEvent.VK_LEFT:
				boyPanel.setLocation(boyPanel.getX() - move, boyPanel.getY());
				System.out.println("왼");
				break;
			case KeyEvent.VK_RIGHT:
				boyPanel.setLocation(boyPanel.getX() + move, boyPanel.getY());
				System.out.println("오");
				break;
			}

			if (keyCode == KeyEvent.VK_LEFT) {
				if (boyPanel.getY() <= 432 && boyPanel.getY() >= 368) {
					ChangePanel.changePanel(mainChoice, panel, new House(mainChoice));
				}
			}

		}
	}



}
