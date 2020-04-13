package com.kh.maskRush.model.dao.states;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class InPharmacy_soyi extends JPanel {

	private FirstMenuChoice mainChoice;
	private JPanel contentPane;
	int i = 0;
	int j = 0;

	public InPharmacy_soyi(FirstMenuChoice frame) {
		
		contentPane = this;
		this.mainChoice = frame;	//FirstMenuChoice에 있는 프레임을 써야되니까 this 프레임도 그프레임이다.
		setBounds(100, 100, 800, 600);
		this.setLayout(null);

		//대화창 내용 2차원배열
		String pharChat [][] = {
				{"....??","어서오라냥! 집사는 이몸의 브런치를 \r\n"+"준비하러 갔다냥! 무슨일이냥!","(약사님 대신 고양이가 앉아있다...\r\n" + "어떻게 하지?)", " "," "},
				{"> 고양이를 무시하고 마스크를 가져간다.","\n"+">마스크를 구매하러 왔어 야옹아!"}};
		System.out.println(pharChat[0].length);

		//대화창 객체 생성
		JTextPane textPane = new JTextPane();
		textPane.setBounds(88, 400, 446, 127);
	 	this.add(textPane); 
		textPane.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 24));

		textPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					if(i < pharChat[0].length) { 
						textPane.setText(pharChat[0][i]);
						keyReleased(e); 
						i++;
					}
				} 
			}
		});

		textPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(i >= 4) {
					
					JLabel lb1 = new JLabel("> 고양이를 무시하고 마스크를 가져간다.");
					lb1.setBounds(108, 394, 300, 23);
					lb1.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 24));
					JLabel lb2 = new JLabel(">마스크를 구매하러 왔어 야옹아!");
					lb2.setBounds(108, 469, 97, 23);
					
					contentPane.add(lb1);
					contentPane.add(lb2);
				}
				
				
				
				
//				JButton maskAsk1 = new JButton("> 고양이를 무시하고 마스크를 가져간다.");
//				maskAsk1.setBounds(108, 394, 300, 23);
//				JButton maskAsk2 = new JButton(">마스크를 구매하러 왔어 야옹아!");
//				maskAsk2.setBounds(108, 469, 97, 23);
				
				System.out.println(i);
			}
		});


		//대화창라벨
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(InPharmacy.class.getResource("/textures/대화창.png")));
		talk.setBounds(70, 150, 800, 600);
		this.add(talk);

		//배경라벨
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(InPharmacy.class.getResource("/textures/map/약국최최최종.png")));
		background.setBounds(-16, -23, 800, 600);
		this.add(background);

		frame.add(this);
		frame.add(contentPane);
		
		
	}	

}




