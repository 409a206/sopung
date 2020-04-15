package com.kh.maskRush.run;

import com.kh.maskRush.controller.Game;
import com.kh.maskRush.model.dao.entities.Creature.Player;

public class Run {
	static Player p = new Player();
	public static void main(String[] args) {
			Game game = new Game("Mask Rush", 800, 600, p);
			game.start();
	}
}
