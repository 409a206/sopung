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
		
		//위에 뜨는 라벨
		JLabel lblChoice = new JLabel();
		lblChoice.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/birthYear.png")));
		lblChoice.setFont(new Font("배달의민족 한나는 열한살", Font.PLAIN, 43));
		lblChoice.setForeground(Color.getHSBColor(3, 47, 82));
		lblChoice.setBounds(50, 30, 700, 200);
		this.add(lblChoice);

		//생년입력
		textField = new JTextField();
		textField.setFont(new Font("08서울남산체 EB", Font.PLAIN, 22));
		textField.setBounds(270, 400, 244, 70);
		textField.setColumns(10);
		this.add(textField);

		//확인버튼
		JButton birthButton = new JButton();
		birthButton.setBorderPainted(false);
		birthButton.setContentAreaFilled(false);
		birthButton.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/start.png")));
		birthButton.setFont(new Font("배달의민족 한나는 열한살", Font.PLAIN, 30));
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
				case 1 : a.setDay("월"); break;
				case 2 : a.setDay("화"); break;
				case 3 : a.setDay("수"); break;
				case 4 : a.setDay("목"); break;
				case 5 : a.setDay("금"); break;
				case 6 : a.setDay("월"); break;
				case 7 : a.setDay("화"); break;
				case 8 : a.setDay("수"); break;
				case 9 : a.setDay("목"); break;
				case 0 : a.setDay("금"); break;
				}
				revalidate();
				ChangePanel.changePanel(mainChoice, contentPane, new PlayerSetting(mainChoice,a));
			}
		});

		//5부제
		
		//배경라벨
		JLabel lblHome = new JLabel("배경");
		lblHome.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/background.png")));
		lblHome.setBounds(0, 0, 800, 600);
		this.add(lblHome);

		mainChoice.add(this);
		repaint();
	}
}
