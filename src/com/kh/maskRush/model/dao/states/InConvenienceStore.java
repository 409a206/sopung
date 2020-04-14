package com.kh.maskRush.model.dao.states;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.kh.maskRush.model.dao.entities.Creature.Player;

public class InConvenienceStore extends JPanel {
	
	private JPanel panel;
	private testFrame mainChoice;
	
	public InConvenienceStore (testFrame mainChoice) {
		
		panel = this;
		this.mainChoice = mainChoice;
		setBounds(100,100,800,600);
		setLayout(null);
		
		//��ȭâ ���� ���ڿ��迭
		String[] conChat = {
			"��! ����ũ��!","�� ����!","",""	
		};
		
		String[] conChat2 = {
				"����ũ �� �� ����� �ּ���!","��! ���׵����� ��Ÿ����!","����ũ ��������~ ���������~!"
		};
		
		Font font = new Font("������������� Bold", Font.PLAIN, 24);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(88, 400, 446, 127);
	 	this.add(textPane); 
		textPane.setFont(font);

		textPane.addKeyListener(new KeyAdapter() {
			int i = 0;
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					if(i < conChat.length) { 
						textPane.setText(conChat[i]);
						keyReleased(e); 
						i++;
					}
				} 
			}
		});
		
		//��ȭâ�� ( pull�� ���� ) 
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(InPharmacy.class.getResource("/textures/��ȭâ.png")));
		talk.setBounds(70, 150, 800, 600);
		this.add(talk);
		
		//����
		JLabel backGround = new JLabel();
		backGround.setIcon(new ImageIcon(InConvenienceStore.class.getResource("/textures/ConvenienceStore.png")));
		backGround.setBounds(0,10,782,553);
		this.add(backGround);
		
		mainChoice.add(this);
		repaint();
		 
	}
	
}











