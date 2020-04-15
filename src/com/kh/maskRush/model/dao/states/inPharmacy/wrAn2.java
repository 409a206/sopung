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

public class wrAn2 extends JPanel {
	private Menu mainChoice;
	private JPanel contentPane;
	int i = 0;
	int j = 0;

	public wrAn2(Menu frame) {

		contentPane = this;
		this.mainChoice = frame;	//FirstMenuChoice�� �ִ� �������� ��ߵǴϱ� this �����ӵ� ���������̴�.
		setBounds(0, 0, 800, 600);
		this.setLayout(null);


		// ��ȭâ ��ü ����
		JTextPane textPane = new JTextPane();
		textPane.requestFocus(true);
		textPane.setBounds(88, 400, 446, 127);
		this.add(textPane);
		textPane.setFont(new Font("������������� Bold", Font.PLAIN, 24));

		textPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					changePanel.changePanel(mainChoice, contentPane, new covid_Quiz2(mainChoice));
				}

				if(e.getKeyCode() == KeyEvent.VK_ENTER ) {
					textPane.setText("�����̴ٿ�...! �ٽ� Ǯ����...!");
					keyReleased(e);
				}
			}

		});

		//��ȭâ��
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(wrAn2.class.getResource("��ȭâ.png")));
		talk.setBounds(70, 150, 800, 600);
		this.add(talk);

		//����
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(wrAn2.class.getResource("�౹��������.png")));
		background.setBounds(-16, -23, 800, 600);
		this.add(background);


		frame.add(this);
		frame.add(contentPane);


	}	
}
