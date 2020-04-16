package com.kh.maskRush.model.dao.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.kh.maskRush.controller.Game;
import com.kh.maskRush.model.dao.entities.Creature.Player;
import com.kh.maskRush.model.dao.handler.Handler;

public class PlayerSetting extends JPanel {
	private JPanel contentPane;
	private JTextPane textPane;
	private String realName = "";
	private String randomName = null;
	private JTextField textField;
	private FirstMenuChoice mainChoice;

	public PlayerSetting(FirstMenuChoice mainChoice, Player a) {

		this.mainChoice = mainChoice;
		contentPane = this;
		setLayout(null);
		setBounds(100, 100, 800, 600);

		//형용사랜덤 배열
		String[] nameArr = { "막강한", "숨겨진", "무시무시한", "번듯한", "운좋은", "반짝이는", "고약한", "엄청난", "행복한", "짜증나는", "괴롭히는", "빛나는",
				"광택나는", "무서운", "귀여운", "솔직한", "근사한", "광포한", "어지러운", "기운찬", "까다로운", "별난", "거대한", "졸린", "퉁명한", "재빠른",
				"엉뚱한", "화끈한", "퉁명한", "심술쟁이", "재채기하는", "소심한", "작은" };

		int random = (int) (Math.random() * 33);
		JLabel lblName = new JLabel();
		lblName.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/name.png")));
		lblName.setFont(new Font("배달의민족 한나는 열한살", Font.PLAIN, 27));
		lblName.setBounds(230, 357, 400, 53);
		this.add(lblName);

		//다시하기버튼
		JButton retryButton = new JButton();
		retryButton.setContentAreaFilled(false);
		retryButton.setBorderPainted(false);
		retryButton.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/retry.png")));
		retryButton.setBounds(271, 486, 114, 44);
		retryButton.setBackground(new Color(255, 255, 255));
		retryButton.setForeground(Color.BLACK);

		//형용사 랜덤 다시
		retryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mainChoice.soundclick();
				int random = (int) (Math.random() * 33);
				textField.setText(" " + nameArr[random]);
				textField.setFont(new Font("08서울남산체 EB", Font.PLAIN, 22));
				randomName = textField.getText();
				System.out.println(randomName);
			}
		});
		this.add(retryButton);
		
		//이름입력
		textField = new JTextField();
		textField.setFont(new Font("08서울남산체 EB", Font.PLAIN, 22));
		textField.setBounds(270, 422, 244, 44);
		textField.setColumns(10);
		textField.setText(nameArr[random]);
		this.add(textField);
		
		//시작하기버튼
		JButton startButton = new JButton("시작하기");
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/start.png")));
		startButton.setFont(new Font("배달의민족 한나는 열한살", Font.PLAIN, 15));
		startButton.setBounds(400, 486, 114, 44);
		this.add(startButton);
		
		//시작시간 객체생성
		Date time = new Date();
		
		//시작버튼 클릭액션
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainChoice.soundclick();
				realName = textField.getText();
				System.out.println(realName);
				a.setStart(time);//시작시간 플레이어전달
				a.setName(realName);
				System.out.println(a.toString());
				/////////////////
				ChangePanel.changePanel(mainChoice, contentPane, new InRoomConv(mainChoice,a));
				mainChoice.soundstop(1);
				mainChoice.soundcity();
				/////////////////////////////////////////////////
				//Game game = new Game("Mask Rush", 800, 600, a);
				//game.start();
				
			}
		});

	
		//배경라벨
		JLabel lblHome = new JLabel("배경");
		lblHome.setForeground(new Color(0, 0, 0));
		lblHome.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/background.png")));
		lblHome.setBounds(0, 0, 800, 600);
		this.add(lblHome);

		
	}
}
