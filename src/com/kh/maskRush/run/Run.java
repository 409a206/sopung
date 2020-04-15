package com.kh.maskRush.run;

import com.kh.maskRush.controller.Game;
import com.kh.maskRush.model.dao.entities.Creature.Player;

public class Run {
	public static void main(String[] args) {
	Player p = new Player();;
			Game game = new Game("Mask Rush", 800, 600, p);
			game.start();
		
		
		
	}
}
