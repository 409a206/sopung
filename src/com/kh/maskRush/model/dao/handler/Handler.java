package com.kh.maskRush.model.dao.handler;

import com.kh.maskRush.controller.Game;
import com.kh.maskRush.model.dao.gfx.GameCamera;
import com.kh.maskRush.model.dao.input.KeyManager;
import com.kh.maskRush.model.dao.input.MouseManager;
import com.kh.maskRush.model.dao.worlds.World;


public class Handler {
	
	private Game game;
	private World world;
	
	
	public Handler(Game game) {
		this.game = game;
	}
	
	public int getWidth() {
		return game.getWidth();
	}
	
	public int getHeight() {
		return game.getHeight();
	}
	
	public GameCamera getGameCamera() {
		return game.getGameCamera();
	}
	
	public KeyManager getKeyManager() {
		return game.getKeyManager();
	}
	
	public MouseManager getMouseManager() {
		return game.getMouseManager();
	}
	
	public Game getGame() {
		return game;
	}
	

	public World getWorld() {
		return world;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public void setWorld(World world) {
		this.world = world;
	}
	
	
	
	
}
