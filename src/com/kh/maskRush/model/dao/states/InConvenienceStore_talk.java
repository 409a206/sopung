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

	String[] contalk = { "����ũ �Ѱ� ����� �ּ���!", "��! ���׵����� ��Ÿ����!", "����ũ ��������~! ����������~!", "���׵����� ����ũ�� ���İ���!!!",
			"�� ��ã�ƾ���!!" };

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

		// �˹ٻ�
		JLabel cu = new JLabel();
		cu.setIcon(new ImageIcon(InConvenienceStore_talk.class.getResource("src/InConvenience/�˹ٻ�.png")));
		cu.setBounds(447, 22, 129, 135);
		add(cu);

		// ��ȭ
		JTextPane textPane = new JTextPane();
		textPane.requestFocus();
		textPane.requestFocus(true);
		textPane.setEditable(false);
		textPane.setBounds(88, 400, 446, 127);
		this.add(textPane);
		textPane.setFont(new Font("������������� Bold", Font.PLAIN, 24));

		
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

		
		// ���׵���
		JLabel thief = new JLabel();
		thief.setVisible(true);
		thief.setIcon(new ImageIcon(InConvenienceStore_talk.class.getResource("src/InConvenience/thief2.png")));
		thief.setBounds(390, 125, 129, 135);
		add(thief);


		// ��ȭâ��
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(InConvenienceStore_talk.class.getResource("src/InConvenience/��ȭâ.png")));
		talk.setBounds(70, 150, 800, 600);
		this.add(talk);

		// ����
		JLabel back = new JLabel();
		// boy.setLabelFor(back);
		back.setIcon(new ImageIcon(InConvenienceStore_talk.class.getResource("src/InConvenience/map.png")));
		back.setBounds(14, 0, 858, 629);
		this.add(back);
	}
}
