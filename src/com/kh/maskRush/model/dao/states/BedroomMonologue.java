package com.kh.maskRush.model.dao.states;

import java.awt.EventQueue; 
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicEditorPaneUI;



public class BedroomMonologue extends JFrame {

	private JPanel contentPane;
	private boolean exit = false;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BedroomMonologue frame = new BedroomMonologue();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public BedroomMonologue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 600);
		contentPane = new JPanel();	
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		String[] busChat = {"상쾌한 아침이다!","개학도 연기됐는데 오늘은 뭐하지","일단 거실로 나가보자!"};
		
		textPane.addKeyListener(new KeyAdapter() {
			
			int i = 0;
			@Override
			public void keyPressed(KeyEvent e) {

				if(i < busChat.length) {
				if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					textPane.setText(busChat[i]);
					
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
		contentPane.add(backGround);	

	}


	public boolean isExit() {
		return exit;
	}


	public void setExit(boolean exit) {
		this.exit = exit;
	}
	
	

}



