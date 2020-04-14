package com.kh.maskRush.model.dao.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.maskRush.model.dao.entities.Creature.Player;

public class BirthYear extends JPanel{

	private JPanel contentPane;
	private FirstMenuChoice mainChoice;
	private JTextField textField;
	private String birth;
	private int birthNum = 0 ;
	private int birthLastNum = 0;

	public BirthYear(FirstMenuChoice mainChoice, Player a) {

		this.mainChoice = mainChoice;
		contentPane = this;
		setLayout(null);
		setBounds(100, 100, 800, 600);
		
		//���� �ߴ� ��
		JLabel lblChoice = new JLabel();
		lblChoice.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/birthYear.png")));
		lblChoice.setFont(new Font("����ǹ��� �ѳ��� ���ѻ�", Font.PLAIN, 43));
		lblChoice.setForeground(Color.getHSBColor(3, 47, 82));
		lblChoice.setBounds(50, 30, 700, 200);
		this.add(lblChoice);

		//�����Է�
		textField = new JTextField();
		textField.setFont(new Font("08���ﳲ��ü EB", Font.PLAIN, 22));
		textField.setBounds(270, 400, 244, 70);
		textField.setColumns(10);
		this.add(textField);

		//Ȯ�ι�ư
		JButton birthButton = new JButton();
		birthButton.setBorderPainted(false);
		birthButton.setContentAreaFilled(false);
		birthButton.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/start.png")));
		birthButton.setFont(new Font("����ǹ��� �ѳ��� ���ѻ�", Font.PLAIN, 30));
		birthButton.setBounds(400, 486, 114, 44);
		this.add(birthButton);

		birthButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainChoice.soundclick();
				birth = textField.getText();
				birthNum = Integer.parseInt(birth);
				System.out.println(birth);
				a.setBirth(birthNum);
				

				if(birthNum >= 2000) {
					birthLastNum = (birthNum - 2000);
				} else if (birthNum < 2000) {
					birthLastNum = (birthNum - 1990);
				}
				
				System.out.println(birthLastNum);
				switch(birthLastNum) {
				case 1 : a.setDay("��"); break;
				case 2 : a.setDay("ȭ"); break;
				case 3 : a.setDay("��"); break;
				case 4 : a.setDay("��"); break;
				case 5 : a.setDay("��"); break;
				case 6 : a.setDay("��"); break;
				case 7 : a.setDay("ȭ"); break;
				case 8 : a.setDay("��"); break;
				case 9 : a.setDay("��"); break;
				case 0 : a.setDay("��"); break;
				}
				revalidate();
				ChangePanel.changePanel(mainChoice, contentPane, new PlayerSetting(mainChoice,a));
			}
		});

		//5����
		
		//����
		JLabel lblHome = new JLabel("���");
		lblHome.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/background.png")));
		lblHome.setBounds(0, 0, 800, 600);
		this.add(lblHome);

		mainChoice.add(this);
		repaint();
	}
}
