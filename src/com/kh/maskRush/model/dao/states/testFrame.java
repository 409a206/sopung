package com.kh.maskRush.model.dao.states;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class testFrame extends JFrame {
	
	public testFrame () {
		this.setBounds(0, 0, 800, 600);
		//this.add(new FirstMenu(this));
		//���� �׽�Ʈ
		this.add(new InConvenienceStore(this));
		
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
