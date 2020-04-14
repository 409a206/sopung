package com.kh.maskRush.model.dao.states;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Credit extends JPanel {

	private FirstMenuChoice mainChoice;
	private JPanel contentPane;
	
	public Credit(FirstMenuChoice mainChoice) {
		
		this.mainChoice = mainChoice;
		contentPane = this;
		setLayout(null);
		setBounds(0, 0, 800, 600);
		
		
		JLabel credit = new JLabel("¹è°æ");
		credit.setForeground(new Color(0,0,0));
		credit.setIcon(new ImageIcon(PlayerSetting.class.getResource("/textures/creditfinal.gif")));
		credit.setBounds(1, -30, 800, 600);
		this.add(credit);
		
		
		
		
	}
	
	
}
