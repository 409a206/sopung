package com.kh.maskRush.model.dao.states;

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

public class testFrame extends JFrame {
	
	Clip clip;  
	String path = testFrame.class.getResource("/textures/music").getPath();
	
	public testFrame() {

		this.setBounds(100, 100, 800, 600);

		//ù �޴� ����
		this.add(new states_Window(this));

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
