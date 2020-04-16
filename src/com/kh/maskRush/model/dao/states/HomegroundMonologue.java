package com.kh.maskRush.model.dao.states;

import java.awt.EventQueue; 
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicEditorPaneUI;



public class HomegroundMonologue extends JPanel {


	private JLabel backGround;
	private JPanel contentPane;
	private String path;
	private FirstMenuChoice mainChoice;
	int i = 0;
	String[] busChat = {"일단 이 시골엔 마트도 없고.. 편의점도... 약국도...","...","그래 일단 도시로 가야겠어!", "(오른쪽 길로 나가세요!)"};


	public HomegroundMonologue(FirstMenuChoice mainChoice) {

		this.mainChoice = mainChoice;	//FirstMenuChoice에 있는 프레임을 써야되니까 this 프레임도 그프레임이다.
		contentPane = this;	//넘길때 써야하니까 패널변수 하나 만들어서 this 저장
		setLayout(null);
		setBounds(0, 0, 800, 600);

		JTextPane textPane = new JTextPane();
		textPane.requestFocus(true);
		textPane.setEditable(false);
		textPane.setBounds(88, 400, 446, 127);
		this.add(textPane);
		textPane.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 24));

		// 클릭용
		JLabel click = new JLabel("(click)");
		click.setFont(new Font("DungGeunMo", Font.PLAIN, 24));
		click.setBounds(600, 300, 800, 300);
		contentPane.add(click);
		click.setVisible(false);

		textPane.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {

				if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					if(i < busChat.length) {
						textPane.setText(busChat[i]);
						//keyReleased(e);
						i++;
					}
				}

				if (i == busChat.length) {
					ChangePanel.changePanel(mainChoice, contentPane, new InVillage(mainChoice));
					click.setVisible(true);
					click.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							ChangePanel.changePanel(mainChoice, contentPane, new InVillage(mainChoice));
						}
					});
				}

			}
		});


		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(InPharmacy.class.getResource("/textures/대화창2.png")));
		talk.setBounds(-10, -25, 800, 600);
		this.add(talk);

		path = "/textures/living1.png";
		backGround = new JLabel();
		backGround.setIcon(new ImageIcon(InBus.class.getResource(path)));
		contentPane.add(backGround);	

		JLabel backGround = new JLabel();
		backGround.setIcon(new ImageIcon(InBus.class.getResource("/textures/HomegroundMonologue.png")));
		backGround.setBounds(-16, -15, 800, 600);
		this.add(backGround);	




	}



}
