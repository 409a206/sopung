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

import com.kh.maskRush.model.dao.states.ChangePanel;
import com.kh.maskRush.model.dao.states.FirstMenuChoice;

public class SuccessPhar extends JPanel {
	private FirstMenuChoice frame;
	private JPanel contentPane;
	int i = 0;
	int j = 0;

	public SuccessPhar(FirstMenuChoice frame) {

		contentPane = this;
		this.frame = frame;	//FirstMenuChoice에 있는 프레임을 써야되니까 this 프레임도 그프레임이다.
		setBounds(0, 0, 800, 600);
		this.setLayout(null);


		// 대화창 객체 생성
		JTextPane textPane = new JTextPane();
		textPane.requestFocus(true);
		textPane.setBounds(88, 400, 446, 127);
		this.add(textPane);
		textPane.requestFocus();
		textPane.requestFocus(true);
		textPane.setEditable(false);
		textPane.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 24));

		textPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					textPane.setText("모두 맞췄다옹! \r\n" + "마스크 2개를 가져가라옹! ");
					keyReleased(e);
				}
			}

		});

		//대화창라벨
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(SuccessPhar.class.getResource("대화창.png")));
		talk.setBounds(70, 150, 800, 600);
		this.add(talk);

		//배경라벨
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(SuccessPhar.class.getResource("inPharFinalbg.png")));
		background.setBounds(-16, -23, 800, 600);
		this.add(background);


		frame.add(this);
		frame.add(contentPane);


	}	
}
