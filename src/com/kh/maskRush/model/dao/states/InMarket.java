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


public class InMarket extends JPanel {

	private JPanel contentPane;
	private JPanel character;
	private JPanel infectee;
	private JLabel boy;
	private JLabel infecteeboy;
	private FirstMenuChoice mainChoice;


	//기본패널설정
	public InMarket (FirstMenuChoice mainChoice) {

		contentPane = this;	//넘길때 써야하니까 패널변수 하나 만들어서 this 저장
		this.mainChoice = mainChoice;	//FirstMenuChoice에 있는 프레임을 써야되니까 this 프레임도 그프레임이다.
		setBounds(0, 0, 800, 600);
		this.setLayout(null);
		boy();
		infectee();

		//마켓배경
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/market.png")));
		background.setBounds(-20, -20, 800, 600);
		this.add(background);

		mainChoice.add(this);
		
	}

	//주인공
	public void boy () {

		//캐릭터패널
		character = new JPanel();
		character.setFocusable(true); //패널 움직이게 하려면 필수
		character.addKeyListener(new MyKeyListener());
		character.setBounds(400, 450, 100, 100);	
		character.setBackground(new Color(255, 0, 0, 0));	//패널 배경 투명으로
		this.add(character);

		//캐릭터라벨을 캐릭터 패널 위로.
		boy = new JLabel();
		boy.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/boy.png")));
		character.add(boy);
	}

	//감염자
	public void infectee() {

		int x = 175;
		int y = 200;

		//캐릭터패널
		infectee = new JPanel();
		infectee.setFocusable(true); //패널 움직이게 하려면 필수
		infectee.addKeyListener(new MyKeyListener());
		infectee.setBounds(x, y, 100, 100);	
		infectee.setBackground(new Color(255, 0, 0, 0));	//패널 배경 투명으로
		this.add(infectee);

		//캐릭터라벨을 캐릭터 패널 위로.
		infecteeboy = new JLabel();
		infecteeboy.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/boy.png")));
		infectee.add(infecteeboy);

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
