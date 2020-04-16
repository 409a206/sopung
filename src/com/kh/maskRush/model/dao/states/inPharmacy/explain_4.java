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

public class explain_4 extends JPanel {

	private FirstMenuChoice frame;
	private JPanel contentPane;
	int i = 0;

	public explain_4(FirstMenuChoice frame) {

		contentPane = this;
		this.frame = frame;
		setBounds(0, 0, 800, 600);	
		this.setLayout(null);
		
		JLabel explain = new JLabel();
		explain.setIcon(new ImageIcon(explain_4.class.getResource("right4.png")));
		explain.setBounds(-16, -23, 800, 600);
		this.add(explain);

		explain.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				ChangePanel.changePanel(frame, contentPane, new covid_Quiz4(frame));

			}
		});		

		frame.add(this);
		frame.add(contentPane);


	}	

}

