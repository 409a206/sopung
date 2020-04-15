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

public class talk2 extends JPanel {
	private Menu mainChoice;
	private JPanel contentPane;
	int i = 0;
	int j = 0;

	public talk2(Menu frame) {

		contentPane = this;
		this.mainChoice = frame;	//FirstMenuChoice�� �ִ� �������� ��ߵǴϱ� this �����ӵ� ���������̴�.
		setBounds(0, 0, 800, 600);
		this.setLayout(null);




		JLabel lb1 = new JLabel("> ����̸� �����ϰ� ����ũ�� ��������.");
		lb1.setBounds(108, 410, 800, 23);
		lb1.setFont(new Font("������������� Bold", Font.PLAIN, 24));
		this.add(lb1);
		JLabel lb2 = new JLabel("> ����ũ�� �����Ϸ� �Ծ� �߿˾�!");
		lb2.setBounds(108, 469, 800, 23);
		lb2.setFont(new Font("������������� Bold", Font.PLAIN, 24));
		this.add(lb2);

		lb1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				changePanel.changePanel(mainChoice, contentPane, new talk3(mainChoice));
			}
		});		

		lb2.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				changePanel.changePanel(mainChoice, contentPane, new talk4(mainChoice));
			}
		});		
				
			
		//��ȭâ��
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(talk2.class.getResource("��ȭâ.png")));
		talk.setBounds(70, 150, 800, 600);
		this.add(talk);

		//����
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(talk2.class.getResource("�౹��������.png")));
		background.setBounds(-16, -23, 800, 600);
		this.add(background);


		frame.add(this);
		frame.add(contentPane);


	}	
}
