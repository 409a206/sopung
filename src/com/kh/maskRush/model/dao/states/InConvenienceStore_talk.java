package com.kh.maskRush.model.dao.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;


public class InConvenienceStore_talk extends JPanel {

	private JPanel panel;
	private FirstMenuChoice mainChoice;
	int i = 0;

	String[] contalk = { "마스크 한개 계산해 주세요!", "앗! 공항도둑이 나타났다!", "마스크 내꺼라고오~! 내놓으라고오~!", "공항도둑이 마스크를 훔쳐갔다!!!",
			"얼른 되찾아야해!!" };

	public InConvenienceStore_talk(FirstMenuChoice mainChoice) {

		setBackground(Color.LIGHT_GRAY);
		this.mainChoice = mainChoice;
		panel = this;
		setLayout(null);
		setBounds(100, 100, 800, 600);

		JPanel boyPanel = new JPanel();
		boyPanel.setBackground(new Color(255, 0, 0, 0));
		boyPanel.setFocusable(true);
		boyPanel.setBounds(468, 148, 90, 100);
		add(boyPanel);

		JLabel boy = new JLabel();
		boyPanel.add(boy);
		boy.setIcon(new ImageIcon(InConvenienceStore_talk.class.getResource("src/InConvenience/maskwithboy.png")));
		boy.setVisible(true);

		// 알바생
		JLabel cu = new JLabel();
		cu.setIcon(new ImageIcon(InConvenienceStore_talk.class.getResource("src/InConvenience/알바생.png")));
		cu.setBounds(447, 22, 129, 135);
		add(cu);

		// 대화
		JTextPane textPane = new JTextPane();
		textPane.requestFocus();
		textPane.requestFocus(true);
		textPane.setEditable(false);
		textPane.setBounds(88, 400, 446, 127);
		this.add(textPane);
		textPane.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 24));

		
		textPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					if (i < contalk.length) {
						textPane.setText(contalk[i]);
						keyReleased(e);
						i++;
						if(i == 5) {
							ChangePanel.changePanel(mainChoice, panel, new InConvenienceStore_talk_2(mainChoice));
						}
					}
				}

			}
		});

		
		// 공항도둑
		JLabel thief = new JLabel();
		thief.setVisible(true);
		thief.setIcon(new ImageIcon(InConvenienceStore_talk.class.getResource("src/InConvenience/thief2.png")));
		thief.setBounds(390, 125, 129, 135);
		add(thief);


		// 대화창라벨
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(InConvenienceStore_talk.class.getResource("src/InConvenience/대화창.png")));
		talk.setBounds(70, 150, 800, 600);
		this.add(talk);

		// 배경라벨
		JLabel back = new JLabel();
		// boy.setLabelFor(back);
		back.setIcon(new ImageIcon(InConvenienceStore_talk.class.getResource("src/InConvenience/map.png")));
		back.setBounds(14, 0, 858, 629);
		this.add(back);
	}
}
