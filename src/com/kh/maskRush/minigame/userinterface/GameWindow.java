package com.kh.maskRush.minigame.userinterface;

import javax.swing.JFrame;

import com.kh.maskRush.minigame.userinterface.GameScreen;
import com.kh.maskRush.minigame.userinterface.GameWindow;

public class GameWindow extends JFrame{
	
	public static final int SCREEN_WIDTH = 600;
	private GameScreen gameScreen;
	
	public GameWindow() {
		super("run game");
		setSize(SCREEN_WIDTH, 200);
		setLocation(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		gameScreen = new GameScreen();
		addKeyListener(gameScreen);
		add(gameScreen);
	}
	
	public void startGame() {
		setVisible(true);
		gameScreen.startGame();
	}
	
	public static void main(String args[]) {
		(new GameWindow()).startGame();
	}
	
}
