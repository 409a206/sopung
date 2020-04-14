package com.kh.maskRush.view;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display extends JFrame {
	
	private JFrame frame;
	private Canvas canvas; //draw graphical elements on canvas and add to frame 
	
	private String title;
	private int width, height;
	
	public Display(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		
		createDisplay();
	}
	
	public Display(String title, int width, int height, int temp) {
		this.title = title;
		this.width = width;
		this.height = height;
		
		createOnlyJFrame();
	}
	
	private void createDisplay() {
		frame = new JFrame(title);
		frame.setSize(width, height);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height)); // canvas takes Dimension obj as parameter.
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		canvas.setFocusable(false); //JFrame should be the only thing that should be focused on
		
		
		frame.add(canvas);
		frame.pack(); // packs frame so that we can see the canvas fully
		
		
	}
	private void createOnlyJFrame() {
		frame = new JFrame(title);
		frame.setSize(width, height);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public Canvas getCanvas() {
		return canvas;
	}

	public String getTitle() {
		return title;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public void setCanvas(Canvas canvas) {
		this.canvas = canvas;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
