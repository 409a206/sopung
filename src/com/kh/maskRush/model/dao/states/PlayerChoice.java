package com.kh.maskRush.model.dao.states;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PlayerChoice extends JFrame {

	private JPanel contentPane;
	final int FLYING_UNIT = 50;
	JLabel boy = new JLabel("남자캐릭터");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayerChoice frame = new PlayerChoice();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PlayerChoice() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		boy.setIcon(new ImageIcon(PlayerChoice.class.getResource("/textures/boyWithoutMask3.png")));
		boy.setBounds(-130, 110, 453, 407);
		contentPane.add(boy);
		
		boy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("남캐 선택");
				new PlayerSetting();
			}
		});

		JLabel girl = new JLabel("여자캐릭터");

		girl.setIcon(new ImageIcon(PlayerChoice.class.getResource("/textures/girlWithoutMask.png")));
		girl.setBounds(337, 90, 459, 446);
		contentPane.add(girl);
		
		girl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("여캐 선택");
			}
		});
		

		JLabel lblChoice = new JLabel("캐릭터 성별을 선택하세요");
		lblChoice.setFont(new Font("궁서", Font.PLAIN, 43));
		lblChoice.setBounds(153, 23, 511, 58);
		contentPane.add(lblChoice);

		JLabel lblHome = new JLabel("배경");
		lblHome.setIcon(new ImageIcon(PlayerChoice.class.getResource("/textures/background.png")));
		lblHome.setBounds(0, 0, 782, 553);
		contentPane.add(lblHome);
	}


}


	

