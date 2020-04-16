package com.kh.maskRush.model.dao.states;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.maskRush.model.dao.states.InMarket.MyKeyListener;

public class InVillage extends JPanel {
	
	private JPanel contentPane;
	private JPanel character;
	private JPanel infectee;
	private JLabel boy;
	private FirstMenuChoice mainChoice;
	
	public InVillage (FirstMenuChoice mainChoice) {

		contentPane = this;	//넘길때 써야하니까 패널변수 하나 만들어서 this 저장
		this.mainChoice = mainChoice;	//FirstMenuChoice에 있는 프레임을 써야되니까 this 프레임도 그프레임이다.
		setBounds(0, 0, 800, 600);
		this.setLayout(null);
		boy();
		
		mainChoice.getContentPane().add(this);

		//마켓배경
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(InVillage.class.getResource("/textures/countryside/\uC9D1\uC55E.png")));
		background.setBounds(-97, -11, 1099, 702);
		this.add(background);
		
	}

	//주인공
	public void boy () {

		//캐릭터패널
		character = new JPanel();
		character.setFocusable(true); //패널 움직이게 하려면 필수
		character.addKeyListener(new MyKeyListener());
		character.setBounds(373, 378, 100, 100);	
		character.setBackground(new Color(255, 0, 0, 0));	//패널 배경 투명으로
		this.add(character);
		
				//캐릭터라벨을 캐릭터 패널 위로.
				boy = new JLabel();
				character.add(boy);
				boy.setIcon(new ImageIcon(InVillage.class.getResource("/textures/maskwithboy.png")));
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
