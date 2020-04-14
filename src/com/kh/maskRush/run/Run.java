package com.kh.maskRush.run;

import com.kh.maskRush.controller.Game;
import com.kh.maskRush.model.dao.states.FirstMenuChoice;

public class Run {
	public static void main(String[] args) {
		
		
		Game game = new Game("Mask Rush", 800, 600);
		game.start();
	}
}
