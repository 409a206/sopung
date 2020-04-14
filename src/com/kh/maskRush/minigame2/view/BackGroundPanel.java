package com.kh.maskRush.minigame2.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BackGroundPanel extends JPanel{
	
	private JFrame mf;
	private JPanel panel;

	public BackGroundPanel(JFrame mf) {
		
		this.mf = mf;
		this.setLayout(null);
		
		panel = this;
		
		JLabel label = new JLabel(new ImageIcon(new ImageIcon("res/textures/back.png").getImage().getScaledInstance(1000, 800, 0)));
		label.setBounds(0, 0, 1000, 800);
		
		JLabel start = new JLabel(new ImageIcon(new ImageIcon("res/textures/message.png").getImage().getScaledInstance(800, 600, 0)));
		start.setBounds(100, 100, 800, 600);
		
		start.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanel cp = new ChangePanel(mf, panel);
				
				GamePanel gp = new GamePanel(mf);
				
				cp.replacePanel(gp);
			}
		});
		
		this.add(label);
		this.add(start);
		this.setComponentZOrder(label, 1);
	}
}
