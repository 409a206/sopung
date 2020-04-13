package com.kh.maskRush.model.dao.states;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;



public class InBus extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InBus frame = new InBus();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public InBus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 600);
		contentPane = new JPanel();	
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane textPane = new JTextPane();
		String[] busChat = {"혼자 도시에는 왜 가니?","가족들 마스크 사려구요!","오 참 착한 아이구나!\r\n" + 
				"꼭 구하길 바란다!","감사합니다!"};
		
		textPane.addKeyListener(new KeyAdapter() {

			int i = 0;
				@Override
				public void keyPressed(KeyEvent e) {
						
					if(e.getKeyCode() == KeyEvent.VK_SPACE) {
							textPane.setText(busChat[i]);
						}
				}
				
				@Override
				public void keyReleased(KeyEvent e) {
					i++;
				}
				
			});

		


		contentPane.add(textPane);
		textPane.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 24));
		textPane.setBounds(88, 400, 279, 60);

		
		//이미지 nullpoint
		JLabel chatWindow = new JLabel("\uC5B4\uB514\uAC00\uB2C8");
		chatWindow.setIcon(new ImageIcon(InBus.class.getResource("src/com/kh/maskRush/textures/대화창.png")));
		chatWindow.setBounds(0, 0, 784, 561);
		contentPane.add(chatWindow);

		JLabel bus = new JLabel("");
		bus.setIcon(new ImageIcon(InBus.class.getResource("src/com/kh/maskRush/textures/버스안.png")));
		bus.setBounds(187, 103, 479, 448);
		contentPane.add(bus);

		JLabel backGround = new JLabel("New label");
		backGround.setIcon(new ImageIcon(InBus.class.getResource("src/com/kh/maskRush/textures/map/시골길최최최종.png")));
		backGround.setBounds(-16, -15, 800, 600);
		contentPane.add(backGround);	

	}

}



