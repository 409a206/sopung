package com.kh.maskRush.model.dao.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;


public class InConvenienceStore_talk_2 extends JPanel {

	private JPanel panel;
	private FirstMenuChoice mainChoice;
	int i = 0;

	String[] contalk2 = { "��Ҵ� ���!!!!!!!", "��! ����ũ ��������! ������ ���� ó���Ұ�!", "�ʹ� ���ִ�!! ������ �ʹ� ���־�!" };

	public InConvenienceStore_talk_2(FirstMenuChoice mainChoice) {

		setBackground(Color.LIGHT_GRAY);
		this.mainChoice = mainChoice;
		panel = this;
		setLayout(null);
		setBounds(0, 0, 800, 600);

		//���̶�+�г�
		JLabel boy = new JLabel();
		boy.setIcon(new ImageIcon(InConvenienceStore_talk_2.class.getResource("/InConvenience/boy2.png")));
		boy.setVisible(true);
		
		JPanel boyPanel = new JPanel();
		boyPanel.setBackground(new Color(255, 0, 0, 0));
		boyPanel.setFocusable(true);
		boyPanel.setBounds(367, 255, 90, 100);
		boyPanel.add(boy);
		add(boyPanel);


		// �˹ٻ�
		JLabel cu = new JLabel();
		cu.setIcon(new ImageIcon(InConvenienceStore_talk_2.class.getResource("/InConvenience/�˹ٻ�.png")));
		cu.setBounds(447, 22, 129, 135);
		add(cu);

		//����
		JLabel police = new JLabel();
		police.setIcon(new ImageIcon(InConvenienceStore_talk_2.class.getResource("/InConvenience/police2.png")));
		police.setBounds(479, 250, 129, 135);
		add(police);

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
					if (i < contalk2.length) {
						textPane.setText(contalk2[i]);
						keyReleased(e);
						i++;
					}
				}

			}
		});

		// ���׵���
		JLabel thief = new JLabel();
		thief.setVisible(true);
		thief.setIcon(new ImageIcon(InConvenienceStore_talk_2.class.getResource("/InConvenience/thief3.png")));
		thief.setBounds(460, 250, 129, 135);
		add(thief);

		// ��ȭâ��
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(InConvenienceStore_talk_2.class.getResource("/InConvenience/��ȭâ.png")));
		talk.setBounds(70, 150, 800, 600);
		this.add(talk);

		// ����
		JLabel back = new JLabel();
		// boy.setLabelFor(back);
		back.setIcon(new ImageIcon(InConvenienceStore_talk_2.class.getResource("/InConvenience/map.png")));
		back.setBounds(14, 0, 858, 629);
		this.add(back);
	}
}
