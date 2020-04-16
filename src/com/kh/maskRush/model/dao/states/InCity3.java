package com.kh.maskRush.model.dao.states;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class InCity3 extends JPanel {

	private JPanel contentPane;
	private JPanel character;
	private JPanel infectee;
	private JLabel boy;
	private JLabel infecteeboy1;
	private JLabel infecteeboy2;
	private JLabel infecteeboy3;
	private JLabel infecteeboy4;
	private JLabel infecteeboy5;
	private JLabel marketm;
	private JLabel marketw;
	private JLabel mask;
	private FirstMenuChoice mainChoice;


	//기본패널설정
	public InCity3 (FirstMenuChoice mainChoice) {

		contentPane = this;	//넘길때 써야하니까 패널변수 하나 만들어서 this 저장
		this.mainChoice = mainChoice;	//FirstMenuChoice에 있는 프레임을 써야되니까 this 프레임도 그프레임이다.
		setBounds(0, 0, 800, 600);
		this.setLayout(null);
		boy();
				
//				//마스크
//				mask = new JLabel();
//				mask.setSize(128, 88);
//				add(mask);
//				mask.setIcon(new ImageIcon(InMarket.class.getResource("/InConvenience/mask.gif")));
//				mask.setLocation(327, 26);
		
//				//감염자1
//				infecteeboy1 = new JLabel();
//				infecteeboy1.setSize(57, 66);
//				add(infecteeboy1);
//				infecteeboy1.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/감염자1.gif")));
//				infecteeboy1.setLocation(514, 138);
//
//		//감염자2
//		infecteeboy2 = new JLabel();
//		infecteeboy2.setSize(57, 66);
//		add(infecteeboy2);
//		infecteeboy2.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/감염자2.png")));
//		infecteeboy2.setLocation(363, 280);
//
//		//감염자3
//		infecteeboy3 = new JLabel();
//		infecteeboy3.setSize(57, 66);
//		add(infecteeboy3);
//		infecteeboy3.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/감염자3.png")));
//		infecteeboy3.setLocation(199, 295);
//		
//		//감염자4
//		infecteeboy4 = new JLabel();
//		infecteeboy4.setSize(57, 66);
//		add(infecteeboy4);
//		infecteeboy4.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/감염자2.png")));
//		infecteeboy4.setLocation(610, 251);
//		
//		//감염자5
//		infecteeboy5 = new JLabel();
//		infecteeboy5.setSize(57, 66);
//		add(infecteeboy5);
//		infecteeboy5.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/감염자1.gif")));
//		infecteeboy5.setLocation(280, 170);
//
//		//마트직원w
//		marketw = new JLabel();
//		marketw.setSize(57, 66);
//		add(marketw);
//		marketw.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/마트직원w.gif")));
//		marketw.setLocation(327, 430);
//
//		//마트직원m
//		marketm = new JLabel();
//		marketm.setSize(57, 66);
//		add(marketm);
//		marketm.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/마트직원m.gif")));
//		marketm.setLocation(428, 76);
//
//		mainChoice.getContentPane().add(this);

		//도시배경
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/city/city3.png")));
		background.setBounds(-20, -20, 800, 600);
		this.add(background);

	}

	//주인공
	public void boy () {

		//캐릭터패널
		character = new JPanel();
		character.setFocusable(true); //패널 움직이게 하려면 필수
		character.addKeyListener(new MyKeyListener());
		character.setBounds(20, 20, 100, 100);	//캐릭터 위치 크기 설정
		character.setBackground(new Color(255, 0, 0, 0));	//패널 배경 투명으로
		this.add(character);

		//캐릭터라벨을 캐릭터 패널 위로.
		boy = new JLabel();
		boy.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/boy.png")));
		character.add(boy);
	}

	//내부클래스 키리스너
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {

			int keyCode = e.getKeyCode();
			int move = 5;

			switch (keyCode) {
			case KeyEvent.VK_UP:
				character.setLocation(character.getX(), character.getY() - move);
				System.out.println("위");
				break;
			case KeyEvent.VK_DOWN:
				character.setLocation(character.getX(), character.getY() + move);
				System.out.println("아래");
				break;
			case KeyEvent.VK_LEFT:
				character.setLocation(character.getX() - move, character.getY());
				System.out.println("왼");
				break;
			case KeyEvent.VK_RIGHT:
				character.setLocation(character.getX() + move, character.getY());
				System.out.println("오");
				break;
			}
		}
	}

}
