package com.kh.maskRush.model.dao.states;

import java.awt.Color;

import javax.swing.JPanel;

import com.kh.maskRush.model.dao.entities.Creature.Player;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PlayerChoice extends JPanel {

	private JPanel panel;
	private FirstMenuChoice mainChoice;
	Player a = new Player();

	public PlayerChoice(FirstMenuChoice mainChoice) {
		
		this.mainChoice = mainChoice;
		panel = this;
		setLayout(null);
		setBounds(100, 100, 800, 600);
		
		//남캐
		JLabel boy = new JLabel();
		boy.setIcon(new ImageIcon(PlayerChoice.class.getResource("/textures/boyWithoutMask4.gif")));
		boy.setBounds(90, 130, 453, 407);
		this.add(boy);
		boy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainChoice.soundclick();
				a.setGenderName('m');	
				System.out.println("남캐 선택");
				revalidate();
				ChangePanel.changePanel(mainChoice, panel, new BirthYear(mainChoice,a));
			}
		});

		//여캐
		JLabel girl = new JLabel();
		girl.setBackground(new Color(255, 255, 255));
		girl.setIcon(new ImageIcon(PlayerChoice.class.getResource("/textures/girlWithoutMask.gif")));
		girl.setBounds(350, 130, 453, 407);
		this.add(girl);
		girl.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				mainChoice.soundclick();
				a.setGenderName('f');	
				System.out.println(a.toString());
				
				System.out.println("여캐 선택");
				revalidate();
				ChangePanel.changePanel(mainChoice, panel, new BirthYear(mainChoice,a));
				
				
			}
		});
		
		//위에 뜨는 라벨
		JLabel lblChoice = new JLabel();
		lblChoice.setIcon(new ImageIcon(PlayerChoice.class.getResource("/textures/choicechar.gif")));
		lblChoice.setBounds(50, 30, 700, 200);
		lblChoice.setForeground(Color.getHSBColor(3, 47, 82));
		this.add(lblChoice);

		//배경라벨
		JLabel lblHome = new JLabel("배경");
		lblHome.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/background.png")));
		lblHome.setBounds(0, 0, 800, 600);
		this.add(lblHome);
		
		mainChoice.add(this);
		repaint();
		
		
	}



}


	

