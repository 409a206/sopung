package com.kh.maskRush.model.dao.states;

import java.awt.Cursor;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FirstMenuChoice extends JFrame {

	public FirstMenuChoice() {

		this.setBounds(100, 100, 1200, 900);
		this.add(new FirstMenu(this));
		//���� �׽�Ʈ
		//this.add(new InPharmacy_soyi(this));
		
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
