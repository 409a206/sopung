package com.kh.maskRush.model.dao.states;

import java.awt.CardLayout;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FirstMenu extends JFrame {

	private JPanel contentPane;
	final int right = 423-122;
	final int up = 435-315;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable(){
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
		
		CardLayout card = new CardLayout();
		this.setLayout(card);
		contentPane = new JPanel();
		
		
		setBounds(100, 100, 800, 600);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Ŀ��
		Toolkit tk = Toolkit.getDefaultToolkit(); 
		Image cursorimage = tk.createImage(getClass().getResource("/textures/cursor_w.png"));//Ŀ���� ����� �̹��� 
		Point point = new Point(0,0); 
		Cursor mycursor = tk.createCustomCursor(cursorimage, point, "haha"); 
		contentPane.setCursor(mycursor); 
		setCursor(mycursor);

		//���۹�ư
		JButton newgame = new JButton();
		newgame.setBorderPainted(false);
		newgame.setContentAreaFilled(false);
		newgame.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/newgame.png")));
		newgame.setBounds(122, 315, 244, 87);
		contentPane.add(newgame);
		newgame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("new game ����");
				
				new PlayerChoice();
				getContentPane().removeAll();
				revalidate();
				contentPane.updateUI();
				
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

		//��ŷ��ư
		JButton ranking = new JButton();
		ranking.setBorderPainted(false);
		ranking.setContentAreaFilled(false);
		ranking.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/ranking.png")));
		ranking.setBounds(423, 315, 244, 87);
		contentPane.add(ranking);
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
		contentPane.add(credit);
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
		contentPane.add(exit);
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("exit ����");
			}
		});

		//�ΰ��
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/MASK RUSH .png")));
		label.setBounds(226, 32, 495, 262);
		contentPane.add(label);

		//����
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/background.png")));
		background.setBounds(0, 0, 782, 553);
		contentPane.add(background);

	}
	/*class MyactionListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			contentPane.change("contentPane2");
		}
		
	}*/

}

