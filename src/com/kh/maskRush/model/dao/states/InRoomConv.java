package com.kh.maskRush.model.dao.states;

import java.awt.Color;
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

public class InRoomConv extends JPanel{


	private JPanel panel;
	private FirstMenuChoice mainChoice;
	private Player a;
	int i = 0;

	String[] contalk = { "������ ��ħ�̴�!", "���е� ����ƴµ� ������ ������...", "�ϴ� �ŽǷ� ��������!", "�̵��Ϸ��� �� �տ��� �����̽��ٸ� ��������!"};

	public InRoomConv(FirstMenuChoice mainChoice, Player a) {

		
		this.mainChoice = mainChoice;
		panel = this;
		setLayout(null);
		setBounds(100, 100, 800, 600);


		//Ŭ����
		JLabel click = new JLabel("(click)");
		click.setFont(new Font("DungGeunMo", Font.PLAIN, 24));
		click.setBounds(600, 300, 800,300);
		panel.add(click);
		click.setVisible(false);


		// ��ȭ
		JTextPane textPane = new JTextPane();
		textPane.requestFocus(true);
		textPane.setEditable(false);
		textPane.setBounds(88, 400, 446, 127);
		this.add(textPane);
		textPane.setFont(new Font("������������� Bold", Font.PLAIN, 24));


		textPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				if (i == contalk.length) {
					click.setVisible(true);
				}

				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					if (i < contalk.length) {
						textPane.setText(contalk[i]);
						keyReleased(e);
						i++;
					}
					click.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							ChangePanel.changePanel(mainChoice, panel, new House(mainChoice));
						}
					});
				}
			}
		});


		// ��ȭâ��
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(InConvenienceStore_talk.class.getResource("/InConvenience/��ȭâ.png")));
		talk.setBounds(70, 150, 800, 600);
		this.add(talk);

		// ����
		JLabel back = new JLabel();
		// boy.setLabelFor(back);
		back.setIcon(new ImageIcon(InConvenienceStore_talk.class.getResource("/textures/bedroomMonoC.png")));
		back.setBounds(-10, -30, 858, 629);
		this.add(back);
	}

	
	
}
