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

public class talk_5bu extends JPanel {
	private Menu mainChoice;
	private JPanel contentPane;
	int i = 0;

	public talk_5bu(Menu frame) {

		contentPane = this;
		this.mainChoice = frame;	//FirstMenuChoice에 있는 프레임을 써야되니까 this 프레임도 그프레임이다.
		setBounds(0, 0, 800, 600);
		this.setLayout(null);


		String pharChat2[] = {"오늘은 (받은요일) 요일이다옹. 생년월일 끝자리가 \r\n(받은끝자리)인 인간만 마스크를 구매할 수 있다옹!!!!",
				"미성년자는 부모님이 같이 오지 않으면","'학생증, 여권, 주민등록등본'을 가져와야 \r\n마스크 구매가 된다옹", "아하!\r\n아까 엄마가 챙겨주신 '주민등록등본'을 말하는거구나!",
				"그렇다냥! 하지만 순순히 넘겨줄 수는 없다!", "코로나에 걸리지 않기 위한 올바른 예방수칙 퀴즈를 \r\n모두 풀어야만 마스크를 주겠다옹!", "(O/X) 문제 출제!"};
		

		// 대화창 객체 생성
		JTextPane textPane = new JTextPane();
		textPane.requestFocus(true);
		textPane.setBounds(88, 400, 600, 127);
		this.add(textPane);
		textPane.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 24));

		textPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					if (i < pharChat2.length) {
						textPane.setText(pharChat2[i]);
						keyReleased(e);
						i++;
					}
				}

				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					changePanel.changePanel(mainChoice, contentPane, new covid_Quiz(mainChoice));

				}
			}
		});
		
		//대화창라벨
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(talk_5bu.class.getResource("대화창.png")));
		talk.setBounds(70, 150, 800, 600);
		this.add(talk);

		//배경라벨
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(talk_5bu.class.getResource("약국최최최종.png")));
		background.setBounds(-16, -23, 800, 600);
		this.add(background);


		frame.add(this);
		frame.add(contentPane);


	}	
}
