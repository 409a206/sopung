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

import com.kh.maskRush.model.dao.states.ChangePanel;
import com.kh.maskRush.model.dao.states.FirstMenuChoice;

public class Inphar_dayoon extends JPanel {

	private FirstMenuChoice frame;
	private JPanel contentPane;
	int i = 0;

	public Inphar_dayoon(FirstMenuChoice frame) {

		contentPane = this;
		this.frame = frame; // FirstMenuChoice�� �ִ� �������� ��ߵǴϱ� this �����ӵ� ���������̴�.
		setBounds(100, 100, 800, 600);
		this.setLayout(null);

		// ��ȭâ ���� ���ڿ��迭
		String pharChat[] = { "....??", "������! ����� �̸��� �귱ġ�� \r\n" + "�غ��Ϸ� ���ٳ�! �������̳�!",
				"(���� ��� ����̰� �ɾ��ִ�...\r\n" + "��� ����?)" };

		JLabel click = new JLabel("(click)");
		click.setFont(new Font("������������� Bold", Font.PLAIN, 24));
		click.setBounds(600, 300, 800,300);
		contentPane.add(click);
		click.setVisible(false);

		// ��ȭâ ��ü ����
		JTextPane textPane = new JTextPane();
		textPane.setBounds(88, 400, 446, 127);
		this.add(textPane);
		textPane.requestFocus();
		textPane.requestFocus(true);
		textPane.setEditable(false);
		textPane.setFont(new Font("������������� Bold", Font.PLAIN, 24));
		
		// ��ȭâ��
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(Inphar_dayoon.class.getResource("��ȭâ.png")));
		talk.setBounds(70, 150, 800, 600);
		
		this.add(talk);

		talk.addKeyListener(new KeyAdapter() {

			public void mouseClickedd(MouseEvent e) {
				if (e.getClickCount() == 1) {
					if (i < pharChat.length) {
						textPane.setText(pharChat[i]);
						i++;
					}

					if(i == 3) {
						System.out.println("click");
						click.setVisible(true);
						click.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent e) {
								ChangePanel.changePanel(frame, contentPane, new talk2(frame));
							}			
						});
					}
				}
			}
		});




		// ����
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(Inphar_dayoon.class.getResource("inPharFinalbg.png")));
		background.setBounds(-16, -23, 800, 600);
		this.add(background);

		frame.add(this);
		frame.add(contentPane);

	}

}
