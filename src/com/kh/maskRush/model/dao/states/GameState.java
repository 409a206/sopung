package com.kh.maskRush.model.dao.states;

import java.awt.Graphics;

import com.kh.maskRush.model.dao.entities.Creature.BoyPlayer;
import com.kh.maskRush.model.dao.entities.statics.Tree;
import com.kh.maskRush.model.dao.handler.Handler;
import com.kh.maskRush.model.dao.worlds.World;

public class GameState extends State {
	
	
	private World world;
	
	
	public GameState(Handler handler) {
		super(handler);
		world = new World(handler,"res/worlds/world1.txt");
		handler.setWorld(world);
		
		
		
		handler.getGameCamera().move(0, 0);
	}
	
	@Override
	public void tick() {
		world.tick();
		
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		
		
		
	}
	
}
