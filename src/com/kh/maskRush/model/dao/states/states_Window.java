package com.kh.maskRush.model.dao.states;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.maskRush.model.dao.entities.Creature.Player;

public class states_Window extends JPanel {
	
	private Player player;
	private FirstMenuChoice frame;
	private JPanel contentPane;
	private JPanel namePane;
	int i = 0;
	String userName = " ";
	
	public states_Window(FirstMenuChoice testFrame) {
		
		contentPane = this;
		this.frame = testFrame;	//FirstMenuChoice에 있는 프레임을 써야되니까 this 프레임도 그프레임이다.
		setBounds(0, 0, 800, 600);
		this.setLayout(null);


		userName = "임희진";
		//player.getName();

		//이름라벨
		JLabel namePane = new JLabel();
		namePane.setText(userName);
		namePane.setBounds(100, 20, 300, 30);
		namePane.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 16));
		this.add(namePane);
		
		//배경라벨
		JLabel backGround = new JLabel();
		backGround.setText(userName);
		backGround.setIcon(new ImageIcon(states_Window.class.getResource("/textures/status/default_status_W.png")));
		backGround.setBounds(10, 10, 800, 600);
		this.add(backGround);


		testFrame.add(this);
		testFrame.add(contentPane);	}

}
