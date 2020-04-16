package com.kh.maskRush.model.dao.states;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.kh.maskRush.model.dao.entities.Creature.Player;

public class House extends JPanel {

	private Player a;
	private JPanel panel;
	private FirstMenuChoice mainChoice;
	int i = 0;

	String[] housetalk = { "����..", "���̷����� �����ε� ����ũ�� ��� �����̳�..", "������ ������ �����ϰ� �����Ϸ� �ٺ��� ����ũ�� ����ڴ�?",
			"��, ���� ����ũ�� ��� ������?", "�켱 ���÷� ���� ��Ʈ�� �鷯���Ŷ�", "��Ʈ�� ����ũ�� ���ٸ� ����������\r\n" + "����ũ�� �Ǵܴ�!",
			"���������� ����ũ�� ���ٸ� �౹���� �ѹ�\r\n" + "�鷯����.", "�� ���� �ٳ�ðԿ�!", "�ٸ� ������ ������ �ִ��� ���ϰ�\r\n" + "����ũ�� ����� ���� ����!",
			"�� ����ҰԿ� ����. �ٳ���ڽ��ϴ�!" };

	public House(FirstMenuChoice mainChoice, Player a) {

		this.mainChoice = mainChoice;
		panel = this;
		setLayout(null);
		setBounds(0, 0, 800, 600);

		// ��ȭ
		JTextPane textPane = new JTextPane();
		textPane.requestFocus();
		textPane.requestFocus(true);
		textPane.setEditable(false);
		textPane.setBounds(88, 400, 446, 127);
		this.add(textPane);
		textPane.setFont(new Font("������������� Bold", Font.PLAIN, 24));

		// Ŭ����
		JLabel click = new JLabel("(click)");
		click.setFont(new Font("DungGeunMo", Font.PLAIN, 24));
		click.setBounds(600, 300, 800, 300);
		panel.add(click);
		click.setVisible(false);

		textPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				if (i == housetalk.length) {
					click.setVisible(true);
				}

				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					if (i < housetalk.length) {
						textPane.setText(housetalk[i]);
						keyReleased(e);
						i++;
					}
					click.addMouseListener(new MouseAdapter() {
//						public void mouseClicked(MouseEvent e) {
//							changePanel.changePanel(mainChoice, panel, new InConvenienceStore_talk_2(mainChoice));
//						}
					});
				}
			}
		});
		// ��ȭâ��
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(House.class.getResource("/InConvenience/��ȭâ.png")));
		talk.setBounds(70, 150, 800, 600);
		this.add(talk);

		// ����
		JLabel back = new JLabel();
		// boy.setLabelFor(back);
		back.setIcon(new ImageIcon(House.class.getResource("/InConvenience/living3.png")));
		back.setBounds(0, -16, 858, 629);
		this.add(back);
	}
}