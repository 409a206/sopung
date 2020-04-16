package com.kh.maskRush.model.dao.states.inPharmacy;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.maskRush.model.dao.states.ChangePanel;
import com.kh.maskRush.model.dao.states.FirstMenuChoice;

public class talk2 extends JPanel {
	private FirstMenuChoice frame;
	private JPanel contentPane;
	int i = 0;
	int j = 0;

	public talk2(FirstMenuChoice frame) {

		contentPane = this;
		this.frame = frame;	//FirstMenuChoice에 있는 프레임을 써야되니까 this 프레임도 그프레임이다.
		setBounds(0, 0, 800, 600);
		this.setLayout(null);




		JLabel lb1 = new JLabel("> 고양이를 무시하고 마스크를 가져간다.");
		lb1.setBounds(108, 410, 800, 23);
		lb1.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 24));
		this.add(lb1);
		JLabel lb2 = new JLabel("> 마스크를 구매하러 왔어 야옹아!");
		lb2.setBounds(108, 469, 800, 23);
		lb2.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 24));
		this.add(lb2);

		lb1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanel.changePanel(frame, contentPane, new talk3(frame));
			}
		});		

		lb2.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanel.changePanel(frame, contentPane, new talk4(frame));
			}
		});		
				
			
		//대화창라벨
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(talk2.class.getResource("대화창.png")));
		talk.setBounds(70, 150, 800, 600);
		this.add(talk);

		//배경라벨
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(talk2.class.getResource("inPharFinalbg.png")));
		background.setBounds(-16, -23, 800, 600);
		this.add(background);


		frame.add(this);
		frame.add(contentPane);


	}	
}
