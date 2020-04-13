package com.kh.maskRush.model.dao.states;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class InPharmacy extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InPharmacy frame = new InPharmacy();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public InPharmacy() {

		int cnt = 0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane textPane = new JTextPane();
		String pharChat [][] = {
				{"....??","어서오라냥! 집사는 이몸의 브런치를 \r\n"+"준비하러 갔다냥! 무슨일이냥!","(약사님 대신 고양이가 앉아있다...\r\n" + "어떻게 하지?)",""},{
					"> 고양이를 무시하고 마스크를 가져간다.","\n"+">마스크를 구매하러 왔어 야옹아!"}};

		JButton maskAsk1 = new JButton("> 고양이를 무시하고 마스크를 가져간다.");
		maskAsk1.setBounds(108, 394, 97, 23);
		JButton maskAsk2 = new JButton(">마스크를 구매하러 왔어 야옹아!");
		maskAsk2.setBounds(108, 469, 97, 23);

		contentPane.add(maskAsk1);
		contentPane.add(maskAsk2);

		textPane.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {

				int i = 0;
				int j = 0;				

				if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					if(i <= 3) { 
						textPane.setText(pharChat[0][i]);
						keyReleased(e);
						i++;
					}

					if(i == 3) {
						maskAsk1.addActionListener(event -> {
						});
						maskAsk2.addActionListener(event -> {
						});
					}
				}
			}

		});

		textPane.setBounds(88, 400, 446, 127);
		contentPane.add(textPane); 
		textPane.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 24));

		//이미지 오류 
		JLabel 대화창 = new JLabel("New label");
		대화창.setIcon(new ImageIcon(new ImageIcon("textures/대화창.png").getImage()));
		대화창.setBounds(-10, -20, 800, 600);
		contentPane.add(대화창);

		JLabel 약국배경 = new JLabel("New label");
		약국배경.setIcon(new ImageIcon(new ImageIcon("textures/map/약국최최최.png").getImage()));
		약국배경.setBounds(-16, -23, 800, 600);
		contentPane.add(약국배경);
	}	
}




