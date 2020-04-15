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

import com.kh.maskRush.model.dao.states.FirstMenuChoice;

public class talk4 extends JPanel {
	private FirstMenuChoice frame;
	private JPanel contentPane;
	int i = 0;

	public talk4(FirstMenuChoice frame) {

		contentPane = this;
		this.frame = frame;	//FirstMenuChoice에 있는 프레임을 써야되니까 this 프레임도 그프레임이다.
		setBounds(0, 0, 800, 600);
		this.setLayout(null);


		String pharChat2[] = {"흥! 마스크 5부제 실시로 아무에게나 판매할 수 없다옹!"};
		
		//5부제 팝업
		JLabel fiveBu = new JLabel();
		fiveBu.setIcon(new ImageIcon(talk4.class.getResource("5bu_explain_final.png")));
		fiveBu.setBounds(-16, -23, 800, 600);
		this.add(fiveBu);		
		fiveBu.setVisible(false);
		
		//5부제 대화
		JLabel fiveExplain = new JLabel();
		fiveExplain.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN,24));
		fiveExplain.setText("흥! 마스크 5부제 실시로 아무에게나 판매할 수 없다옹!");	
		fiveExplain.setBounds(88,380,600,127);
		this.add(fiveExplain);	
		
		
		//5부제 설명 라벨
		JLabel fiveExplainMark = new JLabel();
		fiveExplainMark.setIcon(new ImageIcon(talk4.class.getResource("mark2.png")));
		fiveExplainMark.setBounds(250, 100, 800, 600);
		this.add(fiveExplainMark);
		 

		fiveExplainMark.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				fiveBu.setVisible(true);	
				if(e.getClickCount() == 2) {
					changePanel.changePanel(frame, contentPane, new talk_5bu(frame));

				}
			}			
		});		
				
		

		// 대화창 객체 생성
		JTextPane textPane = new JTextPane();
		textPane.requestFocus(true);
		textPane.setBounds(88, 400, 510, 127);
		this.add(textPane);
		textPane.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 24));

		textPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					changePanel.changePanel(mainChoice, contentPane, new talk_5bu(mainChoice));

				}
			}
		});
//
//		lb1.addMouseListener(new MouseAdapter() {
//
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				changePanel.changePanel(mainChoice, contentPane, new Inphar_dayoon(mainChoice));
//			}
//		});		


		//대화창라벨
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(talk_5bu.class.getResource("대화창.png")));
		talk.setBounds(70, 150, 800, 600);
		this.add(talk);

		//배경라벨
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(talk_5bu.class.getResource("약국최최최종.png")));
		background.setBounds(-16, -23, 800, 600);
		this.add(background);


		frame.add(this);
		frame.add(contentPane);


	}	
}
