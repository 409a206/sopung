package com.kh.maskRush.model.dao.states.inPharmacy;

import java.awt.CardLayout;
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

import com.kh.maskRush.model.dao.states.FirstMenuChoice;

public class covid_Quiz2 extends JPanel {

	private FirstMenuChoice Frame;
	private JPanel contentPane;
	int i = 0;

	public covid_Quiz2(FirstMenuChoice frame) {

		contentPane = this;
		this.Frame = frame;
		setBounds(0, 0, 800, 600);	
		this.setLayout(null);

		
		JLabel right = new JLabel();
		right.setBounds(0,0,350,600);
		this.add(right);
		
		JLabel wrong = new JLabel();
		wrong.setBounds(400,0,350,600);
		this.add(wrong);
		
		JLabel charBoy = new JLabel();
		charBoy.setIcon(new ImageIcon(covid_Quiz2.class.getResource("boy_moving_ff.gif")));
		charBoy.setBounds(305,350,150,150);
		this.add(charBoy);
		
		//배경라벨
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(covid_Quiz2.class.getResource("q2.png")));
		background.setBounds(-16, -23, 800, 600);
		this.add(background);

		right.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
					changePanel.changePanel(Frame, contentPane, new explain_2(Frame));

			}
		});		
		
		
		wrong.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
					changePanel.changePanel(Frame, contentPane, new wrAn2(Frame));

			}
		});		

		frame.add(this);
		frame.add(contentPane);


	}	

}

