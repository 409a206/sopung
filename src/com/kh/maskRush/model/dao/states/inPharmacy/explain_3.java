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

public class explain_3 extends JPanel {

	private Menu mainChoice;
	private JPanel contentPane;
	int i = 0;

	public explain_3(Menu frame) {

		contentPane = this;
		this.mainChoice = frame;
		setBounds(0, 0, 800, 600);	
		this.setLayout(null);
		
		JLabel explain = new JLabel();
		explain.setIcon(new ImageIcon(explain_3.class.getResource("right3.png")));
		explain.setBounds(-16, -23, 800, 600);
		this.add(explain);

		explain.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
					changePanel.changePanel(mainChoice, contentPane, new covid_Quiz4(mainChoice));

			}
		});		

		frame.add(this);
		frame.add(contentPane);


	}	

}

