package com.kh.maskRush.model.dao.states;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InCity extends JPanel{

	private JPanel contentPane;
	private FirstMenuChoice mainChoice;
	
	public InCity(FirstMenuChoice mainChoice) {

		contentPane = this;	//�ѱ涧 ����ϴϱ� �гκ��� �ϳ� ���� this ����
		this.mainChoice = mainChoice;	//FirstMenuChoice�� �ִ� �������� ��ߵǴϱ� this �����ӵ� ���������̴�.
		setBounds(100, 100, 800, 600);
		this.setLayout(null);
		
		
		
		
		
		
		
		
		
		

		//����
		
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/background.png")));
		background.setBounds(0, 0, 782, 553);
		this.add(background);
		
		
		
		
		
		
		
	}

	
	
	
	
}
