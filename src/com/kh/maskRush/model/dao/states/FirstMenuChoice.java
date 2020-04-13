package com.kh.maskRush.model.dao.states;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FirstMenuChoice extends JFrame {

	public FirstMenuChoice() {

		this.setBounds(100, 100, 800, 600);
		this.add(new FirstMenu(this));
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//커서변경
		Toolkit tk = Toolkit.getDefaultToolkit(); 
		Image cursorimage = tk.createImage(getClass().getResource("/textures/cursor_w.png"));//커서로 사용할 이미지 
		Point point = new Point(0,0); 
		Cursor mycursor = tk.createCustomCursor(cursorimage, point, "haha"); 
		setCursor(mycursor);
	}

}
