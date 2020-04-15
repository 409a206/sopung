package com.kh.maskRush.model.dao.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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


		JLabel credit = new JLabel("배경");
		credit.setForeground(new Color(0,0,0));
		credit.setIcon(new ImageIcon(PlayerSetting.class.getResource("/textures/creditfinal.gif")));
		credit.setBounds(1, -30, 800, 600);
		this.add(credit);

		//화면크기만한 투명한 돌아가기버튼
		JButton returnButton = new JButton();
		returnButton.setContentAreaFilled(false);
		returnButton.setBorderPainted(false);
		returnButton.setBounds(0, 0, 700, 500);
		this.add(returnButton);

		//돌아가기버튼 클릭액션
		returnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainChoice.backToMain(mainChoice, contentPane);
				mainChoice.soundclick();
				mainChoice.soundstop(2);
			}
		});
	}


}
