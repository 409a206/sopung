package com.kh.maskRush.model.dao.states;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.kh.maskRush.model.dao.entities.Creature.Player;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		JLabel boy = new JLabel("남자캐릭터");
	//	d.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		boy.setIcon(new ImageIcon(PlayerChoice.class.getResource("/textures/boyWithoutMask3.png")));
		boy.setBounds(-130, 110, 453, 407);
		this.add(boy);
		boy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				a.setGenderName('m');	
				System.out.println("남캐 선택");
				revalidate();
				ChangePanel.changePanel(mainChoice, panel, new BirthYear(mainChoice,a));
			}
		});

		//여캐
		JLabel girl = new JLabel();
		girl.setBackground(new Color(255, 255, 255));
		girl.setIcon(new ImageIcon(PlayerChoice.class.getResource("/textures/girlWithoutMask.png")));
		girl.setBounds(337, 90, 459, 446);
		this.add(girl);
		girl.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				a.setGenderName('f');	
				System.out.println(a.toString());
				
				System.out.println("여캐 선택");
				revalidate();
				ChangePanel.changePanel(mainChoice, panel, new BirthYear(mainChoice,a));
				
				
			}
		});
		
		//위에 뜨는 라벨
		JLabel lblChoice = new JLabel("캐릭터 성별을 선택하세요");
		lblChoice.setFont(new Font("배달의민족 한나는 열한살", Font.PLAIN, 43));
		lblChoice.setBounds(190, 50, 511, 58);
		lblChoice.setForeground(Color.getHSBColor(3, 47, 82));
		this.add(lblChoice);

		//배경라벨
		JLabel lblHome = new JLabel("배경");
		lblHome.setIcon(new ImageIcon(PlayerChoice.class.getResource("/textures/background.png")));
		lblHome.setBounds(0, 0, 782, 553);
		this.add(lblHome);
		
		mainChoice.add(this);
		repaint();
		
		
	}



}


	

