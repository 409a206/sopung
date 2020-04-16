package com.kh.maskRush.model.dao.states;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.kh.maskRush.model.dao.entities.Creature.Player;

public class House extends JPanel {

	private Player a;
	private JPanel panel;
	private FirstMenuChoice mainChoice;
	int i = 0;

	String[] housetalk = { "아휴..", "바이러스가 난리인데 마스크가 없어서 걱정이네..", "엄마가 동생도 봐야하고 집안일로 바빠서 마스크좀 사오겠니?",
			"네, 엄마 마스크는 어디서 구하죠?", "우선 도시로 나가 마트에 들러보거라", "마트에 마스크가 없다면 편의점에도\r\n" + "마스크를 판단다!",
			"편의점에도 마스크가 없다면 약국에도 한번\r\n" + "들러보렴.", "네 엄마 다녀올게요!", "다른 사람들과 접촉을 최대한 피하고\r\n" + "마스크는 절대로 벗지 마렴!",
			"네 명심할게요 엄마. 다녀오겠습니다!" };

	public House(FirstMenuChoice mainChoice, Player a) {

		this.mainChoice = mainChoice;
		panel = this;
		setLayout(null);
		setBounds(0, 0, 800, 600);

		// 대화
		JTextPane textPane = new JTextPane();
		textPane.requestFocus();
		textPane.requestFocus(true);
		textPane.setEditable(false);
		textPane.setBounds(88, 400, 446, 127);
		this.add(textPane);
		textPane.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 24));

		// 클릭용
		JLabel click = new JLabel("(click)");
		click.setFont(new Font("DungGeunMo", Font.PLAIN, 24));
		click.setBounds(600, 300, 800, 300);
		panel.add(click);
		click.setVisible(false);

		textPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				if (i == housetalk.length) {
					click.setVisible(true);
				}

				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					if (i < housetalk.length) {
						textPane.setText(housetalk[i]);
						keyReleased(e);
						i++;
					}
					click.addMouseListener(new MouseAdapter() {
//						public void mouseClicked(MouseEvent e) {
//							changePanel.changePanel(mainChoice, panel, new InConvenienceStore_talk_2(mainChoice));
//						}
					});
				}
			}
		});
		// 대화창라벨
		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(House.class.getResource("/InConvenience/대화창.png")));
		talk.setBounds(70, 150, 800, 600);
		this.add(talk);

		// 배경라벨
		JLabel back = new JLabel();
		// boy.setLabelFor(back);
		back.setIcon(new ImageIcon(House.class.getResource("/InConvenience/living3.png")));
		back.setBounds(0, -16, 858, 629);
		this.add(back);
	}
}