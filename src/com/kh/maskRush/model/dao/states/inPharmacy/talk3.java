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

import com.kh.maskRush.model.dao.states.FirstMenuChoice;

public class talk3 extends JPanel {
	private FirstMenuChoice mainChoice;
	private JPanel contentPane;
	int i = 0;
	int j = 0;

	public talk3(FirstMenuChoice frame) {

		contentPane = this;
		this.mainChoice = frame;	//FirstMenuChoice�� �ִ� �������� ��ߵǴϱ� this �����ӵ� ���������̴�.
		setBounds(0, 0, 800, 600);
		this.setLayout(null);


		String pharChat2[] = { "�Ͼƾ�!!! ���� ���� ���� �ųĿ�!!!", "�ƾ�;; ����̰� ȭ������ �Ф� \r\n" + "�ٽ� �����ϰ� ��Ź����" };

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
					if (i < pharChat2.length) {
						textPane.setText(pharChat2[i]);
						keyReleased(e);
						i++;
					}
				}

				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					changePanel.changePanel(mainChoice, contentPane, new talk2(frame));

				}
			}
		});

		//��ȭâ��
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(talk3.class.getResource("��ȭâ.png")));
		talk.setBounds(70, 150, 800, 600);
		this.add(talk);

		//����
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(talk3.class.getResource("�౹��������.png")));
		background.setBounds(-16, -23, 800, 600);
		this.add(background);


		frame.add(this);
		frame.add(contentPane);


	}	
}
