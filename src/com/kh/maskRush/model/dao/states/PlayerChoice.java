package com.kh.maskRush.model.dao.states;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PlayerChoice extends JFrame {

	private JPanel d;

/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//PlayerChoice frame = new PlayerChoice();
					FirstMenu frame = new FirstMenu();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/

	public PlayerChoice() {
		
		d = new JPanel();
		getContentPane().add(d);
		repaint();
		setVisible(true);
		
		
		JLabel boy = new JLabel("����ĳ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		d.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(d);
		d.setLayout(null);

		
		boy.setIcon(new ImageIcon(PlayerChoice.class.getResource("/textures/boyWithoutMask3.png")));
		boy.setBounds(-130, 110, 453, 407);
		d.add(boy);
		
		boy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("��ĳ ����");
				new PlayerSetting();
			}
		});

		JLabel girl = new JLabel("����ĳ����");

		girl.setIcon(new ImageIcon(PlayerChoice.class.getResource("/textures/girlWithoutMask.png")));
		girl.setBounds(337, 90, 459, 446);
		d.add(girl);
		
		girl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("��ĳ ����");

				new PlayerSetting();
				getContentPane().removeAll();
				revalidate();
				d.updateUI();
				
				//Ŭ���ϸ� PlayerChoice ����
				try {
					Thread.sleep(200);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				//���������� ����
				dispose();
			}
		});
		

		JLabel lblChoice = new JLabel("ĳ���� ������ �����ϼ���");
		lblChoice.setFont(new Font("�ü�", Font.PLAIN, 43));
		lblChoice.setBounds(153, 23, 511, 58);
		d.add(lblChoice);

		JLabel lblHome = new JLabel("���");
		lblHome.setIcon(new ImageIcon(PlayerChoice.class.getResource("/textures/background.png")));
		lblHome.setBounds(0, 0, 782, 553);
		d.add(lblHome);
	
	
	
	}


}


	

