package com.kh.maskRush.model.dao.states.inPharmacy;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.kh.maskRush.model.dao.states.FirstMenuChoice;

public class wrAn4 extends JPanel {
	private FirstMenuChoice frame;
	private JPanel contentPane;
	int i = 0;
	int j = 0;

	public wrAn4(FirstMenuChoice frame) {

		contentPane = this;
		this.frame = frame;	//FirstMenuChoice에 있는 프레임을 써야되니까 this 프레임도 그프레임이다.
		setBounds(0, 0, 800, 600);
		this.setLayout(null);


		// 대화창 객체 생성
		JTextPane textPane = new JTextPane();
		textPane.requestFocus(true);
		textPane.setBounds(88, 400, 446, 127);
		this.add(textPane);
		textPane.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 24));

		textPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					changePanel.changePanel(frame, contentPane, new covid_Quiz4(frame));
				}

				if(e.getKeyCode() == KeyEvent.VK_ENTER ) {
					textPane.setText("오답이다옹...! 다시 풀어보라옹...!");
					keyReleased(e);
				}
			}

		});

		//대화창라벨
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(wrAn4.class.getResource("대화창.png")));
		talk.setBounds(70, 150, 800, 600);
		this.add(talk);

		//배경라벨
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(wrAn4.class.getResource("inPharFinalbg.png")));
		background.setBounds(-16, -23, 800, 600);
		this.add(background);


		frame.add(this);
		frame.add(contentPane);


	}	
}
