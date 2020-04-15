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
		this.frame = frame;	//FirstMenuChoice�� �ִ� �������� ��ߵǴϱ� this �����ӵ� ���������̴�.
		setBounds(0, 0, 800, 600);
		this.setLayout(null);


		String pharChat2[] = {"��! ����ũ 5���� �ǽ÷� �ƹ����Գ� �Ǹ��� �� ���ٿ�!"};
		
		//5���� �˾�
		JLabel fiveBu = new JLabel();
		fiveBu.setIcon(new ImageIcon(talk4.class.getResource("5bu_explain_final.png")));
		fiveBu.setBounds(-16, -23, 800, 600);
		this.add(fiveBu);		
		fiveBu.setVisible(false);
		
		//5���� ��ȭ
		JLabel fiveExplain = new JLabel();
		fiveExplain.setFont(new Font("������������� Bold", Font.PLAIN,24));
		fiveExplain.setText("��! ����ũ 5���� �ǽ÷� �ƹ����Գ� �Ǹ��� �� ���ٿ�!");	
		fiveExplain.setBounds(88,380,600,127);
		this.add(fiveExplain);	
		
		
		//5���� ���� ��
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
				
		

		// ��ȭâ ��ü ����
		JTextPane textPane = new JTextPane();
		textPane.requestFocus(true);
		textPane.setBounds(88, 400, 510, 127);
		this.add(textPane);
		textPane.setFont(new Font("������������� Bold", Font.PLAIN, 24));

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


		//��ȭâ��
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(talk_5bu.class.getResource("��ȭâ.png")));
		talk.setBounds(70, 150, 800, 600);
		this.add(talk);

		//����
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon(talk_5bu.class.getResource("�౹��������.png")));
		background.setBounds(-16, -23, 800, 600);
		this.add(background);


		frame.add(this);
		frame.add(contentPane);


	}	
}
