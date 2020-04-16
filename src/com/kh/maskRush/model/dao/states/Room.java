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
	private FirstMenuChoice mainChoice;

	public Room(FirstMenuChoice mainChoice, Player a) {
		this.mainChoice = mainChoice;
		panel = this;
		setLayout(null);
		setBounds(0, 0, 800, 600);

		JPanel boyPanel = new JPanel();
		boyPanel.setBackground(new Color(255, 0, 0, 0));
		boyPanel.setFocusable(true);
		boyPanel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				final int FLY_UNIT = 8;
				switch (keyCode) {
				case KeyEvent.VK_UP:
					boyPanel.setLocation(boyPanel.getX(), boyPanel.getY() - FLY_UNIT);
					break;
				case KeyEvent.VK_DOWN:
					boyPanel.setLocation(boyPanel.getX(), boyPanel.getY() + FLY_UNIT);
					break;
				case KeyEvent.VK_RIGHT:
					boyPanel.setLocation(boyPanel.getX() + FLY_UNIT, boyPanel.getY());
					break;
				case KeyEvent.VK_LEFT:
					boyPanel.setLocation(boyPanel.getX() - FLY_UNIT, boyPanel.getY());
					break;

					
				}
				
				if(keyCode == KeyEvent.VK_LEFT) {
					if (boyPanel.getY() <= 432 && boyPanel.getY() >= 368) {
						ChangePanel.changePanel(mainChoice, panel, new House2(mainChoice));
					}
				}
				
			}

		});

		boyPanel.setBounds(184, 262, 90, 100);
		add(boyPanel);

		JLabel boy = new JLabel();
		boyPanel.add(boy);
		boy.setIcon(new ImageIcon(Room.class.getResource("/textures/maskwithboy.png")));
		boy.setVisible(true);

		// 배경라벨
		JLabel back = new JLabel();
		// boy.setLabelFor(back);
		back.setIcon(new ImageIcon(Room.class.getResource("/textures/bedroomMonoC.png")));
		back.setBounds(0, -12, 800, 600);
		this.add(back);

	}

}
