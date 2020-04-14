package com.kh.maskRush.model.dao.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.kh.maskRush.model.dao.entities.Creature.Player;

public class Ranking extends JPanel {
	private JPanel contentPane;
	private JTextPane textPane;
	private String randomName = null;
	private JTextPane textField;
	private JTextPane rankShowName;
	private JTextPane rankShowNum;
	private JTextPane rankShowTime;
	private FirstMenuChoice mainChoice;
	private Player a;


	public Ranking(FirstMenuChoice mainChoice) {

		this.mainChoice = mainChoice;
		contentPane = this;
		setLayout(null);

		//이름입력
		textField = new JTextPane();
		textField.setFont(new Font("배달의민족 한나는 열한살", Font.PLAIN, 22));
		textField.setBorder(null);		//테두리
		textField.setOpaque(false); 	//투명하게
		textField.setText("이곳을 클릭하여 입력하세요!");
		textField.setBounds(150, 448, 284, 50);
		this.add(textField);

		//순위 표시 창 - 시간
		rankShowTime = new JTextPane();
		rankShowTime.setFont(new Font("배달의민족 한나는 열한살", Font.PLAIN, 22));
		rankShowTime.setBorder(null);		//테두리
		rankShowTime.setOpaque(false); 	//투명하게
		rankShowTime.setBounds(560, 200, 284, 50);
		rankShowTime.setText("08:49:23");
		this.add(rankShowTime);
		rankShowTime.setVisible(false);

		//순위 표시 창 - 순위
		rankShowNum = new JTextPane();
		rankShowNum.setFont(new Font("배달의민족 한나는 열한살", Font.PLAIN, 22));
		rankShowNum.setBorder(null);		//테두리
		rankShowNum.setOpaque(false); 	//투명하게
		rankShowNum.setBounds(200, 200, 284, 50);
		rankShowNum.setText("1");
		this.add(rankShowNum);
		rankShowNum.setVisible(false);

		//순위 표시 창 - 이름
		rankShowName = new JTextPane();
		rankShowName.setFont(new Font("배달의민족 한나는 열한살", Font.PLAIN, 22));
		rankShowName.setBorder(null);		//테두리
		rankShowName.setOpaque(false); 	//투명하게
		rankShowName.setBounds(350, 200, 284, 50);
		this.add(rankShowName);
		rankShowName.setVisible(false);


		//입력하기버튼
		JButton startButton = new JButton();
		startButton.setContentAreaFilled(false);
		startButton.setFont(new Font("배달의민족 한나는 열한살", Font.PLAIN, 15));
		startButton.setBounds(492, 428, 90, 54);
		this.add(startButton);

		//입력버튼 클릭액션
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainChoice.soundclick();
				randomName = textField.getText();
				rankShowName.setText(randomName);
				rankShowName.setEditable(false);
				rankShowName.setVisible(true);
				rankShowNum.setEditable(false);
				rankShowNum.setVisible(true);
				rankShowTime.setEditable(false);
				rankShowTime.setVisible(true);
				System.out.println(randomName);
			}
		});


		//돌아가기버튼
		JButton returnButton = new JButton("돌아가기");
		returnButton.setContentAreaFilled(true);
		returnButton.setFont(new Font("배달의민족 한나는 열한살", Font.PLAIN, 15));
		returnButton.setBounds(700, 428, 90, 54);
		this.add(returnButton);

		
		//돌아가기버튼 클릭액션
		returnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainChoice.backToMain(mainChoice, contentPane);
				mainChoice.soundclick();
			}
		});

		
		//배경라벨
		JLabel lblHome = new JLabel("배경");
		lblHome.setIcon(new ImageIcon(PlayerSetting.class.getResource("/textures/rankingImage.png")));
		lblHome.setBounds(0, -25, 800, 600);
		this.add(lblHome);




	}

}
