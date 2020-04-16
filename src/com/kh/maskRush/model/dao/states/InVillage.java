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

		contentPane = this;	//�ѱ涧 ����ϴϱ� �гκ��� �ϳ� ���� this ����
		this.mainChoice = mainChoice;	//FirstMenuChoice�� �ִ� �������� ��ߵǴϱ� this �����ӵ� ���������̴�.
		setBounds(0, 0, 800, 600);
		this.setLayout(null);
		boy();
		
		mainChoice.getContentPane().add(this);

		//���Ϲ��
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(InVillage.class.getResource("/textures/countryside/\uC9D1\uC55E.png")));
		background.setBounds(-97, -11, 1099, 702);
		this.add(background);
		
	}

	//���ΰ�
	public void boy () {

		//ĳ�����г�
		character = new JPanel();
		character.setFocusable(true); //�г� �����̰� �Ϸ��� �ʼ�
		character.addKeyListener(new MyKeyListener());
		character.setBounds(373, 378, 100, 100);	
		character.setBackground(new Color(255, 0, 0, 0));	//�г� ��� ��������
		this.add(character);
		
				//ĳ���Ͷ��� ĳ���� �г� ����.
				boy = new JLabel();
				character.add(boy);
				boy.setIcon(new ImageIcon(InVillage.class.getResource("/textures/maskwithboy.png")));
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
