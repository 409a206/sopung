package com.kh.maskRush.model.dao.states;

import java.awt.Cursor;  
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class FirstMenu extends JPanel {
	
	private JPanel contentPane;
	private FirstMenuChoice mainChoice;
	final int right = 423-122;
	final int up = 435-315;

	//전달받아서 쓸 프레임을 ()에 넣어서 .
	public FirstMenu(FirstMenuChoice mainChoice) {

	
		contentPane = this;	//넘길때 써야하니까 패널변수 하나 만들어서 this 저장
		this.mainChoice = mainChoice;	//FirstMenuChoice에 있는 프레임을 써야되니까 this 프레임도 그프레임이다.
		setBounds(100, 100, 800, 600);
		this.setLayout(null);

		//시작버튼
		JButton newgame = new JButton();
		newgame.setBorderPainted(false);
		newgame.setContentAreaFilled(false);
		newgame.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/newgame.png")));
		newgame.setBounds(122, 315, 244, 87);
		this.add(newgame);	//add는 this(패널!)에 바로 붙임.
		newgame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("new game 선택");
				revalidate();
				ChangePanel.changePanel(mainChoice, contentPane, new PlayerChoice(mainChoice));
				//1. 유지하는 프레임
				//2. 현재 패널 - this패널 바로 안들어가니까 변수
				//3. 다음 패널 - new로 프레임 포함해서 넘겨.
				
			}
		});

		//랭킹버튼
		JButton ranking = new JButton();
		ranking.setBorderPainted(false);
		ranking.setContentAreaFilled(false);
		ranking.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/ranking.png")));
		ranking.setBounds(423, 315, 244, 87);
		this.add(ranking);
		ranking.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("ranking 선택");
			}
		});

		//크레딧버튼
		JButton credit = new JButton();
		credit.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/credit.png")));
		credit.setBounds(122, 435, 244, 87);
		this.add(credit);
		credit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("credit 선택");
			}
		});

		//종료버튼
		JButton exit = new JButton();
		exit.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/exit.png")));
		exit.setBounds(423, 435, 244, 87);
		this.add(exit);
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("exit 선택");
			}
		});

		//로고라벨
		JLabel label1 = new JLabel();
		label1.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/MASK RUSH .png")));
		label1.setBounds(226, 32, 495, 262);
		this.add(label1);

		//배경라벨
		
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/background.png")));
		System.out.println("dsff");
		background.setBounds(0, 0, 782, 553);
		this.add(background);
		
		
		
		mainChoice.add(this);	//this 패널을 최종적으로 프레임에 붙임
		this.repaint();	//넘길때 없애는거?

	}
}

