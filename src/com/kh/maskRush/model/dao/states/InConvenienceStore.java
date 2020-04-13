package com.kh.maskRush.model.dao.states;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.maskRush.model.dao.entities.Creature.Player;

public class InConvenienceStore extends JPanel {
	
	Player player = new Player();
	private JPanel panel;
	private FirstMenuChoice mainChoice;
	
	public InConvenienceStore (FirstMenuChoice mainChoice) {
		this.mainChoice = mainChoice;
		panel = this;
		setLayout(null);
		setBounds(100,100,800,600);
		
		JLabel backGround = new JLabel();
		backGround.setIcon(new ImageIcon(InConvenienceStore.class.getResource("")));
		
		
	}
	
	
}
