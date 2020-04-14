package com.kh.maskRush.model.dao.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.kh.maskRush.model.dao.entities.Creature.Player;

public class Ranking extends JPanel {
	private JPanel contentPane;
	private JTextPane textPane;
	private String randomName = null;
	private JTextPane textField;
	private JTextPane rankShowName;
	private JTextPane rankShowNum;
	private JTextPane rankShowTime;
	private FirstMenuChoice mainChoice;
	private Player a;


	public Ranking(FirstMenuChoice mainChoice) {

		this.mainChoice = mainChoice;
		contentPane = this;
		setLayout(null);

		//�̸��Է�
		textField = new JTextPane();
		textField.setFont(new Font("����ǹ��� �ѳ��� ���ѻ�", Font.PLAIN, 22));
		textField.setBorder(null);		//�׵θ�
		textField.setOpaque(false); 	//�����ϰ�
		textField.setText("�̰��� Ŭ���Ͽ� �Է��ϼ���!");
		textField.setBounds(150, 448, 284, 50);
		this.add(textField);

		//���� ǥ�� â - �ð�
		rankShowTime = new JTextPane();
		rankShowTime.setFont(new Font("����ǹ��� �ѳ��� ���ѻ�", Font.PLAIN, 22));
		rankShowTime.setBorder(null);		//�׵θ�
		rankShowTime.setOpaque(false); 	//�����ϰ�
		rankShowTime.setBounds(560, 200, 284, 50);
		rankShowTime.setText("08:49:23");
		this.add(rankShowTime);
		rankShowTime.setVisible(false);

		//���� ǥ�� â - ����
		rankShowNum = new JTextPane();
		rankShowNum.setFont(new Font("����ǹ��� �ѳ��� ���ѻ�", Font.PLAIN, 22));
		rankShowNum.setBorder(null);		//�׵θ�
		rankShowNum.setOpaque(false); 	//�����ϰ�
		rankShowNum.setBounds(200, 200, 284, 50);
		rankShowNum.setText("1");
		this.add(rankShowNum);
		rankShowNum.setVisible(false);

		//���� ǥ�� â - �̸�
		rankShowName = new JTextPane();
		rankShowName.setFont(new Font("����ǹ��� �ѳ��� ���ѻ�", Font.PLAIN, 22));
		rankShowName.setBorder(null);		//�׵θ�
		rankShowName.setOpaque(false); 	//�����ϰ�
		rankShowName.setBounds(350, 200, 284, 50);
		this.add(rankShowName);
		rankShowName.setVisible(false);


		//�Է��ϱ��ư
		JButton startButton = new JButton();
		startButton.setContentAreaFilled(false);
		startButton.setFont(new Font("����ǹ��� �ѳ��� ���ѻ�", Font.PLAIN, 15));
		startButton.setBounds(492, 428, 90, 54);
		this.add(startButton);

		//�Է¹�ư Ŭ���׼�
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainChoice.soundclick();
				randomName = textField.getText();
				rankShowName.setText(randomName);
				rankShowName.setEditable(false);
				rankShowName.setVisible(true);
				rankShowNum.setEditable(false);
				rankShowNum.setVisible(true);
				rankShowTime.setEditable(false);
				rankShowTime.setVisible(true);
				System.out.println(randomName);
			}
		});


		//���ư����ư
		JButton returnButton = new JButton("���ư���");
		returnButton.setContentAreaFilled(true);
		returnButton.setFont(new Font("����ǹ��� �ѳ��� ���ѻ�", Font.PLAIN, 15));
		returnButton.setBounds(700, 428, 90, 54);
		this.add(returnButton);

		
		//���ư����ư Ŭ���׼�
		returnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainChoice.backToMain(mainChoice, contentPane);
				mainChoice.soundclick();
			}
		});

		
		//����
		JLabel lblHome = new JLabel("���");
		lblHome.setIcon(new ImageIcon(PlayerSetting.class.getResource("/textures/rankingImage.png")));
		lblHome.setBounds(0, -25, 800, 600);
		this.add(lblHome);




	}

}
