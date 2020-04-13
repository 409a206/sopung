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
		
		//��ĳ
		JLabel boy = new JLabel("����ĳ����");
	//	d.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		boy.setIcon(new ImageIcon(PlayerChoice.class.getResource("/textures/boyWithoutMask3.png")));
		boy.setBounds(-130, 110, 453, 407);
		this.add(boy);
		boy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				a.setGenderName('m');	
				System.out.println("��ĳ ����");
				revalidate();
				ChangePanel.changePanel(mainChoice, panel, new BirthYear(mainChoice,a));
			}
		});

		//��ĳ
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
				
				System.out.println("��ĳ ����");
				revalidate();
				ChangePanel.changePanel(mainChoice, panel, new BirthYear(mainChoice,a));
				
				
			}
		});
		
		//���� �ߴ� ��
		JLabel lblChoice = new JLabel("ĳ���� ������ �����ϼ���");
		lblChoice.setFont(new Font("����ǹ��� �ѳ��� ���ѻ�", Font.PLAIN, 43));
		lblChoice.setBounds(190, 50, 511, 58);
		lblChoice.setForeground(Color.getHSBColor(3, 47, 82));
		this.add(lblChoice);

		//����
		JLabel lblHome = new JLabel("���");
		lblHome.setIcon(new ImageIcon(PlayerChoice.class.getResource("/textures/background.png")));
		lblHome.setBounds(0, 0, 782, 553);
		this.add(lblHome);
		
		mainChoice.add(this);
		repaint();
		
		
	}



}


	

