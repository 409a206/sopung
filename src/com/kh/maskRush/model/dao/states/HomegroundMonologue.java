package com.kh.maskRush.model.dao.states;

import java.awt.EventQueue; 
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicEditorPaneUI;



public class HomegroundMonologue extends JFrame {
	
	
	private JLabel backGround;
	private JPanel contentPane;
	private String path;

	public void doRun() {

		
					HomegroundMonologue frame = new HomegroundMonologue();
					frame.setVisible(true);
			
	}


	public HomegroundMonologue() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 600);
		contentPane = new JPanel();	
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);;
		
		contentPane.add(textPane);
		textPane.setFont(new Font("�ձٸ��", Font.PLAIN, 24));
		textPane.setBounds(88, 400, 446, 127);

		

		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(InPharmacy.class.getResource("/textures/��ȭâ2.png")));
		talk.setBounds(-10, -25, 800, 600);
		this.add(talk);
		
		path = "/textures/living1.png";
		
		backGround = new JLabel();
		backGround.setIcon(new ImageIcon(InBus.class.getResource(path)));
		contentPane.add(backGround);	

		
		String[] busChat = {"�ϴ� �� �ð� ��Ʈ�� ����.. ��������... �౹��...","...","�׷� �ϴ� ���÷� ���߰ھ�!", "(������ ��� ��������!)"};
		
		
		textPane.addKeyListener(new KeyAdapter() {
			
			int i = 0;
			@Override
			public void keyPressed(KeyEvent e) {
				

	            if(i < busChat.length) {
	            if(e.getKeyCode() == KeyEvent.VK_SPACE) {
	               textPane.setText(busChat[i]);
	            }
	         }
			}

			@Override
			public void keyReleased(KeyEvent e) {
				i++;
			}

		});


	

		JLabel backGround = new JLabel();
		backGround.setIcon(new ImageIcon(InBus.class.getResource("/textures/HomegroundMonologue.png")));
		backGround.setBounds(-16, -15, 800, 600);
		this.add(backGround);	

		
		

	}
	
	

}