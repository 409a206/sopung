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

	//���޹޾Ƽ� �� �������� ()�� �־ .
	public FirstMenu(FirstMenuChoice mainChoice) {

	
		contentPane = this;	//�ѱ涧 ����ϴϱ� �гκ��� �ϳ� ���� this ����
		this.mainChoice = mainChoice;	//FirstMenuChoice�� �ִ� �������� ��ߵǴϱ� this �����ӵ� ���������̴�.
		setBounds(100, 100, 800, 600);
		this.setLayout(null);

		//���۹�ư
		JButton newgame = new JButton();
		newgame.setBorderPainted(false);
		newgame.setContentAreaFilled(false);
		newgame.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/newgame.png")));
		newgame.setBounds(122, 315, 244, 87);
		this.add(newgame);	//add�� this(�г�!)�� �ٷ� ����.
		newgame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("new game ����");
				revalidate();
				ChangePanel.changePanel(mainChoice, contentPane, new PlayerChoice(mainChoice));
				//1. �����ϴ� ������
				//2. ���� �г� - this�г� �ٷ� �ȵ��ϱ� ����
				//3. ���� �г� - new�� ������ �����ؼ� �Ѱ�.
				
			}
		});

		//��ŷ��ư
		JButton ranking = new JButton();
		ranking.setBorderPainted(false);
		ranking.setContentAreaFilled(false);
		ranking.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/ranking.png")));
		ranking.setBounds(423, 315, 244, 87);
		this.add(ranking);
		ranking.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("ranking ����");
			}
		});

		//ũ������ư
		JButton credit = new JButton();
		credit.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/credit.png")));
		credit.setBounds(122, 435, 244, 87);
		this.add(credit);
		credit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("credit ����");
			}
		});

		//�����ư
		JButton exit = new JButton();
		exit.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/exit.png")));
		exit.setBounds(423, 435, 244, 87);
		this.add(exit);
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("exit ����");
			}
		});

		//�ΰ��
		JLabel label1 = new JLabel();
		label1.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/MASK RUSH .png")));
		label1.setBounds(226, 32, 495, 262);
		this.add(label1);

		//����
		
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/background.png")));
		System.out.println("dsff");
		background.setBounds(0, 0, 782, 553);
		this.add(background);
		
		
		
		mainChoice.add(this);	//this �г��� ���������� �����ӿ� ����
		this.repaint();	//�ѱ涧 ���ִ°�?

	}
}

