package com.kh.maskRush.model.dao.states;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.maskRush.model.dao.entities.Creature.Player;
import com.kh.maskRush.model.dao.states.inPharmacy.Menu;

public class states_Window extends JPanel {
	
	private Player player;
	private testFrame frame;
	private JPanel contentPane;
	int i = 0;

	public states_Window(testFrame testFrame) {
		
		contentPane = this;
		this.frame = testFrame;	//FirstMenuChoice�� �ִ� �������� ��ߵǴϱ� this �����ӵ� ���������̴�.
		setBounds(0, 0, 800, 600);
		this.setLayout(null);
		
		


		String userName = player.getName();

		//����
		JLabel backGround = new JLabel();
		backGround.setIcon(new ImageIcon(states_Window.class.getResource("/textures/status/default_status_W.png")));
		backGround.setBounds(10, 10, 800, 600);
		backGround.setText(userName);
		this.add(backGround);


		testFrame.add(this);
		testFrame.add(contentPane);	}

}
