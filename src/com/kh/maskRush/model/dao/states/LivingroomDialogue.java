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



public class LivingroomDialogue extends JFrame {
	
	
	private JLabel backGround;
	private JPanel contentPane;
	private String path;

	public void doRun() {

		
					LivingroomDialogue frame = new LivingroomDialogue();
					frame.setVisible(true);
			
	}


	public LivingroomDialogue() {
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

		
		String[] busChat = {"TV�Ҹ� : �ֱ� ���� �ڷγ� ���̷����� �ؼ��Դϴ�. ����� ������ �����Ͻð�...", "(��! ġ����...)","����...", "���̷����� �����ε� " + 
						"����ũ�� ��� �����̳�...", "���ó��� ��ȣ�� ������ ����ũ�� �����!", "������ ������ �����ϰ� �����Ϸ� �ٺ��� " + 
								"�װ� �� ���� ������ ���ڱ���.", "�� ����. ����ũ�� ��� ������?", "�켱 ���÷� ���� ��Ʈ�� �鷯 ���Ŷ�.",
								"��Ʈ�� ����ũ�� ���ٸ� ���������� " + 
								"����ũ�� �Ǵܴ�!", "���������� ����ũ�� ���ٸ� �౹���� �ѹ�" + 
										" �鷯����.", "�� ���� �ٳ�ðԿ�!", "���! ���� ����ũ�� ���� ������!", "(����ũ��(��) �����!)",
										"�ٸ� ������ ������ �ִ��� ���ϰ� " + 
										"����ũ�� ����� ���� ����!", "�� ����ҰԿ� ����. �ٳ���ڽ��ϴ�!", "������ �ٳ�;ߵ�!", "���� ���� ����������! �ݹ� �ٳ�ðԿ�!",
										"(������ ��������!)"};
		
		
		textPane.addKeyListener(new KeyAdapter() {
			
			int i = 0;
			@Override
			public void keyPressed(KeyEvent e) {
				
				
				if(i < busChat.length) {
				if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					textPane.setText(busChat[i]);
						backGround.setIcon(new ImageIcon(InBus.class.getResource("/textures/living1.png")));
						backGround.setBounds(-16, -15, 800, 600);
						contentPane.add(backGround);
						if(i == 1) {
							backGround.setIcon(new ImageIcon(InBus.class.getResource("/textures/living2.png")));
							backGround.setBounds(-16, -15, 800, 600);
							contentPane.add(backGround);
						}
						if(i >= 2) {
							backGround.setIcon(new ImageIcon(InBus.class.getResource("/textures/living3.png")));
							backGround.setBounds(-16, -15, 800, 600);
							contentPane.add(backGround);
						}
					} 
			
			}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				i++;
			}

		});


	
		
//
//		JLabel bus = new JLabel();
//		bus.setIcon(new ImageIcon(InBus.class.getResource("/textures/.png")));
//		bus.setBounds(265, 100, 479, 448);
//		contentPane.add(bus);
		
		
		

	}
	
	

}
