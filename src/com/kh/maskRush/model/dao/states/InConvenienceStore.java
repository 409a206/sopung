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
		
		//대화창 내용 문자열배열
		String[] conChat = {
			"앗! 마스크다!","얼른 사자!","",""	
		};
		
		String[] conChat2 = {
				"마스크 한 개 계산해 주세요!","앗! 공항도둑이 나타났다!","마스크 내꺼라고오~ 내놓으라고~!"
		};
		
		Font font = new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 24);
		
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
		
		//대화창라벨 ( pull후 수정 ) 
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(InPharmacy.class.getResource("/textures/대화창.png")));
		talk.setBounds(70, 150, 800, 600);
		this.add(talk);
		
		//배경라벨
		JLabel backGround = new JLabel();
		backGround.setIcon(new ImageIcon(InConvenienceStore.class.getResource("/textures/ConvenienceStore.png")));
		backGround.setBounds(0,10,782,553);
		this.add(backGround);
		
		mainChoice.add(this);
		repaint();
		 
	}
	
}











