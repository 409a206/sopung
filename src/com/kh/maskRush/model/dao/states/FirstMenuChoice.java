package com.kh.maskRush.model.dao.states;

import java.applet.AudioClip;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstMenuChoice extends JFrame {

	private Clip bgm; 
	private Clip click;
	private Clip credit;
	private File fileclick = new File("C:\\Users\\soi02\\git\\sopung\\res\\textures\\music\\click.wav");
	private File filecredit = new File("C:\\Users\\soi02\\git\\sopung\\res\\textures\\music\\amor2.wav");
	private File filebgm = new File("C:\\Users\\soi02\\git\\sopung\\res\\textures\\music\\mainbgm.wav");
	
	
	//����
	public FirstMenuChoice() {

		this.setBounds(100, 100, 800, 600);
		
		//this.add(new FirstMenu(this));
		//this.add(new InMarket(this));
		this.add(new GetMask(this));
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cursor();
		
		
	}
	
	//Ŭ����
	public void soundclick() {
	
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(fileclick);
			click = AudioSystem.getClip();
			click.open(stream);
			click.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	//ũ����bgm
	public void soundamor() {
		
		try {
			AudioInputStream stream2 = AudioSystem.getAudioInputStream(filecredit);
			credit = AudioSystem.getClip();
			credit.open(stream2);
			credit.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//����bgm icy
	public void soundmain() {
		
		try {
			AudioInputStream stream3 = AudioSystem.getAudioInputStream(filebgm);
			bgm = AudioSystem.getClip();
			bgm.open(stream3);
			bgm.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//bgm����
	public void soundstop(int a) {
		switch(a) {
		case 1 : bgm.stop(); break;
		case 2 : credit.stop(); bgm.start(); break;		
		}
	}

	//��������
	public void backToMain(FirstMenuChoice a, JPanel b) {
		ChangePanel.changePanel(this, b, new FirstMenu(a));
		this.soundstop(1);
	}	
	
	//Ŀ���̹��� ����
	public void cursor() {

		Toolkit tk = Toolkit.getDefaultToolkit(); 
		Image cursorimage = tk.createImage(getClass().getResource("/textures/cursor_w.png"));//Ŀ���� ����� �̹��� 
		Point point = new Point(0,0); 
		Cursor mycursor = tk.createCustomCursor(cursorimage, point, "haha"); 
		setCursor(mycursor);

	}

}
