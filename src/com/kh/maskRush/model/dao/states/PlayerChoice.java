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
		
		
		JLabel boy = new JLabel("남자캐릭터");
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
				System.out.println("남캐 선택");
				new PlayerSetting();
			}
		});

		JLabel girl = new JLabel("여자캐릭터");

		girl.setIcon(new ImageIcon(PlayerChoice.class.getResource("/textures/girlWithoutMask.png")));
		girl.setBounds(337, 90, 459, 446);
		d.add(girl);
		
		girl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("여캐 선택");

				new PlayerSetting();
				getContentPane().removeAll();
				revalidate();
				d.updateUI();
				
				//클릭하면 PlayerChoice 실행
				try {
					Thread.sleep(200);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				//기존프레임 삭제
				dispose();
			}
		});
		

		JLabel lblChoice = new JLabel("캐릭터 성별을 선택하세요");
		lblChoice.setFont(new Font("궁서", Font.PLAIN, 43));
		lblChoice.setBounds(153, 23, 511, 58);
		d.add(lblChoice);

		JLabel lblHome = new JLabel("배경");
		lblHome.setIcon(new ImageIcon(PlayerChoice.class.getResource("/textures/background.png")));
		lblHome.setBounds(0, 0, 782, 553);
		d.add(lblHome);
	
	
	
	}


}


	

