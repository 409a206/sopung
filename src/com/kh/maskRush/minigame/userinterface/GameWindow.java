package com.kh.maskRush.minigame.userinterface;

import javax.swing.JFrame;

public class GameWindow extends JFrame{
	
	private GameScreen gameScreen;
	
	public GameWindow() {
		super("mask rush");
		setSize(600, 175);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameScreen = new GameScreen();
		add(gameScreen);
		addKeyListener(gameScreen);
	}
	
	public void startGame() {
		gameScreen.startGame();
	}
	
	public static void main(String[] args) {
		GameWindow gw = new GameWindow();
		gw.setVisible(true);
		gw.startGame();
	}
	
	
}
