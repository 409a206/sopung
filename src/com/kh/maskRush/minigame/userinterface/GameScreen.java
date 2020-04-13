package com.kh.maskRush.minigame.userinterface;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import com.kh.maskRush.minigame.gameobject.Land;
import com.kh.maskRush.minigame.gameobject.MainCharacter;

public class GameScreen extends JPanel implements Runnable, KeyListener{
	
	public static final float GRAVITY = 0.1f;
	public static final float GROUNDY = 100; // by pixel
	private float x = 0;
	private float y = 0;
	private float speedY = 0;
	
	
	private Land land;
	private Thread thread;
	private MainCharacter mainCharacter;
	
	public GameScreen() {
		
		thread = new Thread(this);
		mainCharacter = new MainCharacter();
		land = new Land();
		
	}
	
	public void startGame() {
		thread.start();
	}

	@Override
	public void run() {
		
		while(true) {
			
			try {
				mainCharacter.update();
				repaint();
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.black);
		g.drawLine(0, (int)GROUNDY, getWidth(), (int)GROUNDY);
		land.draw(g);
		mainCharacter.draw(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		mainCharacter.jump();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
