package com.kh.maskRush.model.dao.states;

import java.awt.Color;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.maskRush.model.dao.states.InMarket.MyKeyListener;

public class GetMask extends JPanel{
	private JPanel contentPane;
	private FirstMenuChoice mainChoice;
	private Clip mask;
	private File fileclear = new File("C:\\Users\\soi02\\git\\sopung\\res\\textures\\music\\clear.wav");

	public GetMask (FirstMenuChoice mainChoice) {

		contentPane = this;	//넘길때 써야하니까 패널변수 하나 만들어서 this 저장
		this.mainChoice = mainChoice;	//FirstMenuChoice에 있는 프레임을 써야되니까 this 프레임도 그프레임이다.
		setBounds(0, 0, 800, 600);
		this.setLayout(null);
		maskget();
		soundgetmask();

	}

	//마스크 획득했습니다.
	public void maskget () {

		JLabel mask = new JLabel();
		mask.setIcon(new ImageIcon(GetMask.class.getResource("/textures/InMarket/mask.gif")));
		mask.setBounds(200, -60, 800, 600);
		mask.setBackground(new Color(0, 0, 0, 0));
		this.add(mask);
		
		JLabel maskget = new JLabel();
		maskget.setIcon(new ImageIcon(GetMask.class.getResource("/textures/InMarket/maskget.png")));
		maskget.setBounds(120, -25, 800, 600);
		maskget.setBackground(new Color(100, 0, 0, 0));
		this.add(maskget);
		
		
	}
	
	//획득 사운드
	public void soundgetmask() {
	
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(fileclear);
			mask = AudioSystem.getClip();
			mask.open(stream);
			mask.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
