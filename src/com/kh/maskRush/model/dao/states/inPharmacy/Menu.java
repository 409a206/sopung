package com.kh.maskRush.model.dao.states.inPharmacy;

import java.awt.Cursor; 
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.JFrame;

public class Menu extends JFrame {
	
	//Clip clip;  
	//String path = Menu.class.getResource("/textures/music").getPath();
	
	public Menu() {

		this.setBounds(100, 100, 800, 600);

		//ù �޴� ����
		this.add(new Inphar_dayoon(this));
	
		//bgm
//		File bgm;
//		AudioInputStream stream;
//		AudioFormat format;
//		DataLine.Info info;
//		bgm = new File(path+"/music.wav");

//		try {
//
//			stream = AudioSystem.getAudioInputStream(bgm);
//			format = stream.getFormat();
//			info = new DataLine.Info(Clip.class, format);
//			clip = (Clip) AudioSystem.getLine(info);
//			clip.open(stream);
//			clip.start();
//
//		} catch (Exception e) {
//
//		}

		//��Ƽ����
		//this.add(new InCity(this));

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Ŀ������
		Toolkit tk = Toolkit.getDefaultToolkit(); 
		Image cursorimage = tk.createImage(getClass().getResource("/textures/cursor_w.png"));//Ŀ���� ����� �̹��� 
		Point point = new Point(0,0); 
		Cursor mycursor = tk.createCustomCursor(cursorimage, point, "haha"); 
		setCursor(mycursor);
	}

}
