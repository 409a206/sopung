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

import com.kh.maskRush.model.dao.states.inPharmacy.Inphar_dayoon;

public class FirstMenuChoice extends JFrame {

	private Clip bgm; 
	private Clip click;
	private Clip credit;
	private Clip city;
	private Clip emart;
	private Clip pharmacy;
	private Clip conv;
	private File fileClick = new File("C:\\Users\\soi02\\git\\sopung\\res\\textures\\music\\click.wav");
	private File fileCredit = new File("C:\\Users\\soi02\\git\\sopung\\res\\textures\\music\\amor2.wav");
	private File fileBgm = new File("C:\\Users\\soi02\\git\\sopung\\res\\textures\\music\\mainbgm.wav");
	private File fileCity = new File("C:\\Users\\soi02\\git\\sopung\\res\\textures\\music\\city.wav");
	private File fileEmart = new File("C:\\Users\\soi02\\git\\sopung\\res\\textures\\music\\emart.wav");
	private File filePharmacy = new File("C:\\Users\\soi02\\git\\sopung\\res\\textures\\music\\pharmacy.wav");
	private File fileConv = new File("C:\\Users\\soi02\\git\\sopung\\res\\textures\\music\\killthisgame.wav");

	//실행
	public FirstMenuChoice(int a) {

		this.setBounds(100, 100, 800, 600);
		switch(a) {
		case 1: this.add(new FirstMenu(this)); break;
		case 2 : this.add(new InConvenienceStore(this)); break;
		case 3 : this.add(new Inphar_dayoon(this)); break;
		case 4 : this.add(new InMarket(this)); break;
		case 5 : this.add(new GetMask(this)); break;
		case 6 : this.add(new InVillage(this)); break;
		}
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cursor();

	}

	//////////////////////////////////////////////////////////bgm////////////////////////////////////////////////


	//클릭음
	public void soundclick() {

		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(fileClick);
			click = AudioSystem.getClip();
			click.open(stream);
			click.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	//메인bgm icy
	public void soundmain() {

		try {
			AudioInputStream stream3 = AudioSystem.getAudioInputStream(fileBgm);
			bgm = AudioSystem.getClip();
			bgm.open(stream3);
			bgm.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	//크래딧bgm
	public void soundamor() {

		try {
			AudioInputStream stream2 = AudioSystem.getAudioInputStream(fileCredit);
			credit = AudioSystem.getClip();
			credit.open(stream2);
			credit.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}



	//citybgm
	public void soundcity() {

		try {
			AudioInputStream stream4 = AudioSystem.getAudioInputStream(fileCity);
			city = AudioSystem.getClip();
			city.open(stream4);
			city.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	//마트
	public void soundemart() {

		try {
			AudioInputStream stream4 = AudioSystem.getAudioInputStream(fileEmart);
			emart = AudioSystem.getClip();
			emart.open(stream4);
			emart.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//약국
	public void soundepharmacy() {
		
		try {
			AudioInputStream stream5 = AudioSystem.getAudioInputStream(filePharmacy);
			pharmacy = AudioSystem.getClip();
			pharmacy.open(stream5);
			pharmacy.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//편의점
	public void soundconv() {
		
		try {
			AudioInputStream stream6 = AudioSystem.getAudioInputStream(fileConv);
			conv = AudioSystem.getClip();
			conv.open(stream6);
			conv.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	//bgm정지
	public void soundstop(int a) {
		switch(a) {
		case 1 : bgm.stop(); break;
		case 2 : credit.stop(); bgm.start(); break;		
		case 3 : city.stop();  break;		
		case 4 : emart.stop();  break;		
		case 5 : pharmacy.stop();  break;		
		case 6 : conv.stop();  break;		
		}
	}

	//메인으로
	public void backToMain(FirstMenuChoice a, JPanel b) {
		ChangePanel.changePanel(this, b, new FirstMenu(a));
		this.soundstop(1);
	}	

	//커서이미지 변경
	public void cursor() {

		Toolkit tk = Toolkit.getDefaultToolkit(); 
		Image cursorimage = tk.createImage(getClass().getResource("/textures/cursor_w.png"));//커서로 사용할 이미지 
		Point point = new Point(0,0); 
		Cursor mycursor = tk.createCustomCursor(cursorimage, point, "haha"); 
		setCursor(mycursor);

	}

}
