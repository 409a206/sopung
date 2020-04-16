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

import com.kh.maskRush.model.dao.states.ChangePanel;
import com.kh.maskRush.model.dao.states.FirstMenuChoice;

public class explain_1 extends JPanel {

	private FirstMenuChoice frame;
	private JPanel contentPane;
	int i = 0;

	public explain_1(FirstMenuChoice frame) {

		contentPane = this;
		this.frame = frame;
		setBounds(0, 0, 800, 600);	
		this.setLayout(null);
		
		JLabel explain1 = new JLabel();
		explain1.setIcon(new ImageIcon(explain_1.class.getResource("right1.png")));
		explain1.setBounds(-16, -23, 800, 600);
		this.add(explain1);

		explain1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				ChangePanel.changePanel(frame, contentPane, new covid_Quiz2(frame));

			}
		});		

		frame.add(this);
		frame.add(contentPane);


	}	

}

