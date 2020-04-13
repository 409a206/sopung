package com.kh.maskRush.model.dao.states;

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

public class InPharmacy_soyi extends JPanel {

	private FirstMenuChoice mainChoice;
	private JPanel contentPane;
	int i = 0;
	int j = 0;

	public InPharmacy_soyi(FirstMenuChoice frame) {
		
		contentPane = this;
		this.mainChoice = frame;	//FirstMenuChoice�� �ִ� �������� ��ߵǴϱ� this �����ӵ� ���������̴�.
		setBounds(100, 100, 800, 600);
		this.setLayout(null);

		//��ȭâ ���� 2�����迭
		String pharChat [][] = {
				{"....??","������! ����� �̸��� �귱ġ�� \r\n"+"�غ��Ϸ� ���ٳ�! �������̳�!","(���� ��� ����̰� �ɾ��ִ�...\r\n" + "��� ����?)", " "," "},
				{"> ����̸� �����ϰ� ����ũ�� ��������.","\n"+">����ũ�� �����Ϸ� �Ծ� �߿˾�!"}};
		System.out.println(pharChat[0].length);

		//��ȭâ ��ü ����
		JTextPane textPane = new JTextPane();
		textPane.setBounds(88, 400, 446, 127);
	 	this.add(textPane); 
		textPane.setFont(new Font("������������� Bold", Font.PLAIN, 24));

		textPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					if(i < pharChat[0].length) { 
						textPane.setText(pharChat[0][i]);
						keyReleased(e); 
						i++;
					}
				} 
			}
		});

		textPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(i >= 4) {
					
					JLabel lb1 = new JLabel("> ����̸� �����ϰ� ����ũ�� ��������.");
					lb1.setBounds(108, 394, 300, 23);
					lb1.setFont(new Font("������������� Bold", Font.PLAIN, 24));
					JLabel lb2 = new JLabel(">����ũ�� �����Ϸ� �Ծ� �߿˾�!");
					lb2.setBounds(108, 469, 97, 23);
					
					contentPane.add(lb1);
					contentPane.add(lb2);
				}
				
				
				
				
//				JButton maskAsk1 = new JButton("> ����̸� �����ϰ� ����ũ�� ��������.");
//				maskAsk1.setBounds(108, 394, 300, 23);
//				JButton maskAsk2 = new JButton(">����ũ�� �����Ϸ� �Ծ� �߿˾�!");
//				maskAsk2.setBounds(108, 469, 97, 23);
				
				System.out.println(i);
			}
		});


		//��ȭâ��
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(InPharmacy.class.getResource("/textures/��ȭâ.png")));
		talk.setBounds(70, 150, 800, 600);
		this.add(talk);

		//����
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(InPharmacy.class.getResource("/textures/map/�౹��������.png")));
		background.setBounds(-16, -23, 800, 600);
		this.add(background);

		frame.add(this);
		frame.add(contentPane);
		
		
	}	

}




