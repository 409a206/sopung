package com.kh.maskRush.minigame2.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public MainFrame() {
		this.setSize(1000, 800);
		
		this.add(new BackGroundPanel(this));
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	

}
