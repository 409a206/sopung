package com.kh.maskRush.model.dao.states;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InCity extends JPanel{

	private JPanel contentPane;
	private FirstMenuChoice mainChoice;
	
	public InCity(FirstMenuChoice mainChoice) {

		contentPane = this;	//넘길때 써야하니까 패널변수 하나 만들어서 this 저장
		this.mainChoice = mainChoice;	//FirstMenuChoice에 있는 프레임을 써야되니까 this 프레임도 그프레임이다.
		setBounds(100, 100, 800, 600);
		this.setLayout(null);
		
		
		
		
		
		
		
		
		
		

		//배경라벨
		
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/background.png")));
		background.setBounds(0, 0, 782, 553);
		this.add(background);
		
		
		
		
		
		
		
	}

	
	
	
	
}
