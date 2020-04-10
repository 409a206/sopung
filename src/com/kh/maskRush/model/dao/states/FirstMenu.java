package com.kh.maskRush.model.dao.states;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FirstMenu extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstMenu frame = new FirstMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public FirstMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//시작버튼
		JButton newgame = new JButton();
		newgame.setBorderPainted(false);
		newgame.setContentAreaFilled(false);
		newgame.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/newgame.png")));
		newgame.setBounds(122, 315, 244, 87);
		contentPane.add(newgame);
		
		
		//랭킹버튼
		JButton ranking = new JButton();
		ranking.setBorderPainted(false);
		ranking.setContentAreaFilled(false);
		ranking.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/ranking.png")));
		ranking.setBounds(423, 315, 244, 87);
		contentPane.add(ranking);
		
		
		//크레딧버튼
		JButton credit = new JButton();
		credit.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/credit.png")));
		credit.setBounds(122, 435, 244, 87);
		contentPane.add(credit);
		
		
		//종료버튼
		JButton exit = new JButton();
		exit.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/exit.png")));
		exit.setBounds(423, 435, 244, 87);
		contentPane.add(exit);
		
		//로고라벨
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/MASK RUSH .png")));
		label.setBounds(226, 32, 495, 262);
		contentPane.add(label);
		
		
		//배경라벨
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/background.png")));
		lblNewLabel.setBounds(0, 0, 782, 553);
		contentPane.add(lblNewLabel);

	}
	
	
	
	
	
}
