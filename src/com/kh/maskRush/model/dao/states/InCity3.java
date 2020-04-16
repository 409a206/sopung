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


	//�⺻�гμ���
	public InCity3 (FirstMenuChoice mainChoice) {

		contentPane = this;	//�ѱ涧 ����ϴϱ� �гκ��� �ϳ� ���� this ����
		this.mainChoice = mainChoice;	//FirstMenuChoice�� �ִ� �������� ��ߵǴϱ� this �����ӵ� ���������̴�.
		setBounds(0, 0, 800, 600);
		this.setLayout(null);
		boy();
				
//				//����ũ
//				mask = new JLabel();
//				mask.setSize(128, 88);
//				add(mask);
//				mask.setIcon(new ImageIcon(InMarket.class.getResource("/InConvenience/mask.gif")));
//				mask.setLocation(327, 26);
		
//				//������1
//				infecteeboy1 = new JLabel();
//				infecteeboy1.setSize(57, 66);
//				add(infecteeboy1);
//				infecteeboy1.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/������1.gif")));
//				infecteeboy1.setLocation(514, 138);
//
//		//������2
//		infecteeboy2 = new JLabel();
//		infecteeboy2.setSize(57, 66);
//		add(infecteeboy2);
//		infecteeboy2.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/������2.png")));
//		infecteeboy2.setLocation(363, 280);
//
//		//������3
//		infecteeboy3 = new JLabel();
//		infecteeboy3.setSize(57, 66);
//		add(infecteeboy3);
//		infecteeboy3.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/������3.png")));
//		infecteeboy3.setLocation(199, 295);
//		
//		//������4
//		infecteeboy4 = new JLabel();
//		infecteeboy4.setSize(57, 66);
//		add(infecteeboy4);
//		infecteeboy4.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/������2.png")));
//		infecteeboy4.setLocation(610, 251);
//		
//		//������5
//		infecteeboy5 = new JLabel();
//		infecteeboy5.setSize(57, 66);
//		add(infecteeboy5);
//		infecteeboy5.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/������1.gif")));
//		infecteeboy5.setLocation(280, 170);
//
//		//��Ʈ����w
//		marketw = new JLabel();
//		marketw.setSize(57, 66);
//		add(marketw);
//		marketw.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/��Ʈ����w.gif")));
//		marketw.setLocation(327, 430);
//
//		//��Ʈ����m
//		marketm = new JLabel();
//		marketm.setSize(57, 66);
//		add(marketm);
//		marketm.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/��Ʈ����m.gif")));
//		marketm.setLocation(428, 76);
//
//		mainChoice.getContentPane().add(this);

		//���ù��
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/city/city3.png")));
		background.setBounds(-20, -20, 800, 600);
		this.add(background);

	}

	//���ΰ�
	public void boy () {

		//ĳ�����г�
		character = new JPanel();
		character.setFocusable(true); //�г� �����̰� �Ϸ��� �ʼ�
		character.addKeyListener(new MyKeyListener());
		character.setBounds(20, 20, 100, 100);	//ĳ���� ��ġ ũ�� ����
		character.setBackground(new Color(255, 0, 0, 0));	//�г� ��� ��������
		this.add(character);

		//ĳ���Ͷ��� ĳ���� �г� ����.
		boy = new JLabel();
		boy.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/InMarket/boy.png")));
		character.add(boy);
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
