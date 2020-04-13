package com.kh.maskRush.model.dao.states;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class InPharmacy extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InPharmacy frame = new InPharmacy();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public InPharmacy() {

		int cnt = 0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane textPane = new JTextPane();
		String pharChat [][] = {
				{"....??","������! ����� �̸��� �귱ġ�� \r\n"+"�غ��Ϸ� ���ٳ�! �������̳�!","(���� ��� ����̰� �ɾ��ִ�...\r\n" + "��� ����?)",""},{
					"> ����̸� �����ϰ� ����ũ�� ��������.","\n"+">����ũ�� �����Ϸ� �Ծ� �߿˾�!"}};

		JButton maskAsk1 = new JButton("> ����̸� �����ϰ� ����ũ�� ��������.");
		maskAsk1.setBounds(108, 394, 97, 23);
		JButton maskAsk2 = new JButton(">����ũ�� �����Ϸ� �Ծ� �߿˾�!");
		maskAsk2.setBounds(108, 469, 97, 23);

		contentPane.add(maskAsk1);
		contentPane.add(maskAsk2);

		textPane.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {

				int i = 0;
				int j = 0;				

				if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					if(i <= 3) { 
						textPane.setText(pharChat[0][i]);
						keyReleased(e);
						i++;
					}

					if(i == 3) {
						maskAsk1.addActionListener(event -> {
						});
						maskAsk2.addActionListener(event -> {
						});
					}
				}
			}

		});

		textPane.setBounds(88, 400, 446, 127);
		contentPane.add(textPane); 
		textPane.setFont(new Font("������������� Bold", Font.PLAIN, 24));

		//�̹��� ���� 
		JLabel ��ȭâ = new JLabel("New label");
		��ȭâ.setIcon(new ImageIcon(new ImageIcon("textures/��ȭâ.png").getImage()));
		��ȭâ.setBounds(-10, -20, 800, 600);
		contentPane.add(��ȭâ);

		JLabel �౹��� = new JLabel("New label");
		�౹���.setIcon(new ImageIcon(new ImageIcon("textures/map/�౹������.png").getImage()));
		�౹���.setBounds(-16, -23, 800, 600);
		contentPane.add(�౹���);
	}	
}




