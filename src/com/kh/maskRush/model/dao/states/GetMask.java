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

		contentPane = this;	//�ѱ涧 ����ϴϱ� �гκ��� �ϳ� ���� this ����
		this.mainChoice = mainChoice;	//FirstMenuChoice�� �ִ� �������� ��ߵǴϱ� this �����ӵ� ���������̴�.
		setBounds(0, 0, 800, 600);
		this.setLayout(null);
		maskget();
		soundgetmask();

	}

	//����ũ ȹ���߽��ϴ�.
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
	
	//ȹ�� ����
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
