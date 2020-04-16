package com.kh.maskRush.minigame.userinterface;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kh.maskRush.minigame.userinterface.GameScreen;
import com.kh.maskRush.minigame.userinterface.GameWindow;
import com.kh.maskRush.model.dao.states.FirstMenuChoice;

public class GameWindow extends JPanel{
	
	public static final int SCREEN_WIDTH = 800;
	private GameScreen gameScreen;
	
	public GameWindow(FirstMenuChoice mainChoice) {
//		super("run game");
//		setSize(SCREEN_WIDTH, 600);
//		setLocation(400, 200);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setResizable(false);
		
		gameScreen = new GameScreen();
		addKeyListener(gameScreen);
		add(gameScreen);
	}
	
	public void startGame() {
		setVisible(true);
		gameScreen.startGame();
	}
	
//	public static void main(String args[]) {
//		(new GameWindow()).startGame();
//	}
	
}
