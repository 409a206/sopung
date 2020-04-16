package com.kh.maskRush.model.dao.states;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import com.kh.maskRush.controller.Game;
import com.kh.maskRush.model.dao.entities.Creature.Player;

import com.kh.maskRush.model.dao.states.inPharmacy.talk2;



public class BedroomMonologue extends JPanel {

	private static Player player;
	private JPanel contentPane;
	private boolean exit = false;
	private FirstMenuChoice mainChoice;
	int i = 0;

	public BedroomMonologue(FirstMenuChoice mainChoice, Player player) {

		this.mainChoice = mainChoice;
		contentPane = this;
		setLayout(null);
		setBounds(100, 100, 800, 600);

		//클릭용
		JLabel click = new JLabel("(click)");
		click.setFont(new Font("DungGeunMo", Font.PLAIN, 24));
		click.setBounds(600, 300, 800,300);
		contentPane.add(click);
		click.setVisible(false);

		this.player = player;
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		String[] busChat = {"상쾌한 아침이다!","개학도 연기됐는데 오늘은 뭐하지","일단 거실로 나가보자!"};




		textPane.addKeyListener(new KeyAdapter() {


			@Override
			public void keyPressed(KeyEvent e) {

				if (i == busChat.length) {
					click.setVisible(true);
				}

				if(i < busChat.length) {
					if(e.getKeyCode() == KeyEvent.VK_SPACE) {
						textPane.setText(busChat[i]);

						   click.addMouseListener(new MouseAdapter() {
								public void mouseClicked(MouseEvent e) {
									System.out.println("cccccc");
		//							dispose();
//									Game game = new Game("Mask Rush", 800, 600, player);
//									game.start();
									
								}			
							});
					}
					
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				i++;
			}

		});




		contentPane.add(textPane);
		textPane.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		textPane.setBounds(88, 400, 446, 127);

		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(InPharmacy.class.getResource("/textures/대화창2.png")));
		talk.setBounds(-10, -25, 800, 600);
		this.add(talk);

		//
		//		JLabel bus = new JLabel();
		//		bus.setIcon(new ImageIcon(InBus.class.getResource("/textures/.png")));
		//		bus.setBounds(265, 100, 479, 448);
		//		contentPane.add(bus);

		JLabel backGround = new JLabel();
		backGround.setIcon(new ImageIcon(InBus.class.getResource("/textures/bedroomMonoC.png")));
		backGround.setBounds(-16, -15, 800, 600);
		this.add(backGround);	


	}

	/*
	public boolean isExit() {
		return exit;
	}


	public void setExit(boolean exit) {
		this.exit = exit;
	}
	 */
}


