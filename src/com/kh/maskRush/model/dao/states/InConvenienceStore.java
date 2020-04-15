package com.kh.maskRush.model.dao.states;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.maskRush.model.dao.entities.Creature.Player;

import Convenienve.Contalk;
import Convenienve.FirstMenuChoice;
import Convenienve.InConvenienceStore2;
import Convenienve.changePanel;

public class InConvenienceStore extends JPanel {

	private JPanel panel;
	private FirstMenuChoice mainChoice;

	public InConvenienceStore(FirstMenuChoice mainChoice) {
		setBackground(Color.LIGHT_GRAY);
		this.mainChoice = mainChoice;
		panel = this;
		setLayout(null);
		setBounds(100, 100, 800, 600);

		JLabel mask = new JLabel();
		mask.setBounds(33, 316, 90, 72);
		mask.setIcon(new ImageIcon(InConvenienceStore.class.getResource("/Convenienve/mask.gif")));
		add(mask);

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
				
				if(keyCode == KeyEvent.VK_SPACE) {
					if(boyPanel.getX() <= 99 && boyPanel.getX() >= 66) {
						ChangePanel.changePanel(mainChoice, panel, new Contalk(mainChoice));
					}
				}
				
			}

		});

		boyPanel.setBounds(669, 131, 90, 100);
		add(boyPanel);

		JLabel boy = new JLabel();
		boyPanel.add(boy);
		boy.setIcon(new ImageIcon(InConvenienceStore.class.getResource("/Convenienve/maskwithboy.png")));
		boy.setVisible(true);
		

		JLabel cu = new JLabel();
		cu.setIcon(new ImageIcon(InConvenienceStore.class.getResource("/Convenienve/\uC54C\uBC14\uC0DD.png")));
		cu.setBounds(447, 22, 129, 135);
		add(cu);

		// 배경라벨
		JLabel back = new JLabel();
		// boy.setLabelFor(back);
		back.setIcon(new ImageIcon(InConvenienceStore.class.getResource("/Convenienve/map.png")));
		back.setBounds(14, 0, 858, 629);
		this.add(back);

	}
}
	
	

