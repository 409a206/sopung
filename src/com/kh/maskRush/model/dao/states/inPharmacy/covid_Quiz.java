package com.kh.maskRush.model.dao.states.inPharmacy;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class covid_Quiz extends JPanel {

	private Menu mainChoice;
	private JPanel contentPane;
	int i = 0;

	public covid_Quiz(Menu frame) {

		contentPane = this;
		this.mainChoice = frame;
		setBounds(0, 0, 800, 600);
		this.setLayout(null);
		
		JLabel right = new JLabel();
		right.setBounds(0,0,350,600);
		this.add(right);
		
		JLabel wrong = new JLabel();
		wrong.setBounds(400,0,350,600);
		this.add(wrong);
		
		JLabel charBoy = new JLabel();
		charBoy.setIcon(new ImageIcon(covid_Quiz.class.getResource("boy_moving_ff.gif")));
		charBoy.setBounds(305,350,150,150);
		this.add(charBoy);
		
		//배경라벨
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(covid_Quiz.class.getResource("q1.png")));
		background.setBounds(-16, -23, 800, 600);
		this.add(background);

		right.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
					changePanel.changePanel(mainChoice, contentPane, new explain_1(mainChoice));

			}
		});		
		
		wrong.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
					changePanel.changePanel(mainChoice, contentPane, new wrongAnswer(mainChoice));

			}
		});		
	
		frame.add(this);
		frame.add(contentPane);

	}	

}

