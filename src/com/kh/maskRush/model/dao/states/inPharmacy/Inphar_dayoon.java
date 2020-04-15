package com.kh.maskRush.model.dao.states.inPharmacy;

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

public class Inphar_dayoon extends JPanel {

	private Menu mainChoice;
	private JPanel contentPane;
	int i = 0;

	public Inphar_dayoon(Menu frame) {

		contentPane = this;
		this.mainChoice = frame; // FirstMenuChoice에 있는 프레임을 써야되니까 this 프레임도 그프레임이다.
		setBounds(100, 100, 800, 600);
		this.setLayout(null);

		// 대화창 내용 문자열배열
		String pharChat[] = { "....??", "어서오라냥! 집사는 이몸의 브런치를 \r\n" + "준비하러 갔다냥! 무슨일이냥!",
				"(약사님 대신 고양이가 앉아있다...\r\n" + "어떻게 하지?)" };
		
		JLabel click = new JLabel("(click)");
		click.setFont(new Font("DungGeunMo", Font.PLAIN, 24));
		click.setBounds(600, 300, 800,300);
		contentPane.add(click);
		click.setVisible(false);

		// 대화창 객체 생성
		JTextPane textPane = new JTextPane();
		textPane.setBounds(88, 400, 446, 127);
		this.add(textPane);
		textPane.setFont(new Font("DungGeunMo", Font.PLAIN, 24));

		textPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					if (i < pharChat.length) {
						textPane.setText(pharChat[i]);
						keyReleased(e);
						i++;
					}
					
					if(i == 3) {
						System.out.println("click");
						click.setVisible(true);
						click.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent e) {
								changePanel.changePanel(mainChoice, contentPane, new talk2(mainChoice));
							}			
						});
						}
				}
			}
		});

		// 대화창라벨
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(Inphar_dayoon.class.getResource("대화창.png")));
		talk.setBounds(70, 150, 800, 600);
		this.add(talk);

		
		// 배경라벨
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(Inphar_dayoon.class.getResource("약국최최최종.png")));
		background.setBounds(-16, -23, 800, 600);
		this.add(background);

		frame.add(this);
		frame.add(contentPane);

	}

}
