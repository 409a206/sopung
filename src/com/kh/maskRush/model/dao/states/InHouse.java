package com.kh.maskRush.model.dao.states;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.maskRush.model.dao.entities.Creature.Player;

public class InHouse extends JPanel {

	private JPanel panel;
	private FirstMenuChoice mainChoice;
	private Player a;

	public InHouse(FirstMenuChoice mainChoice, Player a) {
		
		this.mainChoice = mainChoice;
		panel = this;
		setLayout(null);
		setBounds(0, 0, 800, 600);

		//사람
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
					System.out.println("위");
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
				
				if(keyCode == KeyEvent.VK_SPACE) {
					if(boyPanel.getX() <= 99 && boyPanel.getX() >= 66) {
						ChangePanel.changePanel(mainChoice, panel, new InConvenienceStore_talk(mainChoice));
					}
				}
			}
		});

		boyPanel.setBounds(300, 300, 90, 100);

		JLabel boy = new JLabel();
		boy.setIcon(new ImageIcon(InHouse.class.getResource("/textures/maskwithboy.png")));
		boy.setVisible(true);
		boyPanel.add(boy);
		this.add(boyPanel);


		// 배경라벨////////////////////////바꿔야ㅎ돼////////////////////////
		JLabel back = new JLabel();
		// boy.setLabelFor(back);
		back.setIcon(new ImageIcon(InHouse.class.getResource("/textures/bedroomMonoC.png")));
		back.setBounds(-10, -30, 858, 629);
		this.add(back);
	}
	
	
}
