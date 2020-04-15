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


	//�⺻�гμ���
	public InMarket (FirstMenuChoice mainChoice) {

		contentPane = this;	//�ѱ涧 ����ϴϱ� �гκ��� �ϳ� ���� this ����
		this.mainChoice = mainChoice;	//FirstMenuChoice�� �ִ� �������� ��ߵǴϱ� this �����ӵ� ���������̴�.
		setBounds(0, 0, 800, 600);
		this.setLayout(null);
		boy();
		infectee();

		//���Ϲ��
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/market.png")));
		background.setBounds(-20, -20, 800, 600);
		this.add(background);

		mainChoice.add(this);
		
	}

	//���ΰ�
	public void boy () {

		//ĳ�����г�
		character = new JPanel();
		character.setFocusable(true); //�г� �����̰� �Ϸ��� �ʼ�
		character.addKeyListener(new MyKeyListener());
		character.setBounds(400, 450, 100, 100);	
		character.setBackground(new Color(255, 0, 0, 0));	//�г� ��� ��������
		this.add(character);

		//ĳ���Ͷ��� ĳ���� �г� ����.
		boy = new JLabel();
		boy.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/boy.png")));
		character.add(boy);
	}

	//������
	public void infectee() {

		int x = 175;
		int y = 200;

		//ĳ�����г�
		infectee = new JPanel();
		infectee.setFocusable(true); //�г� �����̰� �Ϸ��� �ʼ�
		infectee.addKeyListener(new MyKeyListener());
		infectee.setBounds(x, y, 100, 100);	
		infectee.setBackground(new Color(255, 0, 0, 0));	//�г� ��� ��������
		this.add(infectee);

		//ĳ���Ͷ��� ĳ���� �г� ����.
		infecteeboy = new JLabel();
		infecteeboy.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/boy.png")));
		infectee.add(infecteeboy);

	}

	//����Ŭ���� Ű������
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {

			int keyCode = e.getKeyCode();
			int move = 5;

			switch (keyCode) {
			case KeyEvent.VK_UP:
				character.setLocation(character.getX(), character.getY() - move);
				System.out.println("��");
				break;
			case KeyEvent.VK_DOWN:
				character.setLocation(character.getX(), character.getY() + move);
				System.out.println("�Ʒ�");
				break;
			case KeyEvent.VK_LEFT:
				character.setLocation(character.getX() - move, character.getY());
				System.out.println("��");
				break;
			case KeyEvent.VK_RIGHT:
				character.setLocation(character.getX() + move, character.getY());
				System.out.println("��");
				break;
			}
		}
	}

}
