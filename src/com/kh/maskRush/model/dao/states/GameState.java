package com.kh.maskRush.model.dao.states;

import java.awt.Graphics;

import com.kh.maskRush.model.dao.entities.EntityManager;
import com.kh.maskRush.model.dao.handler.Handler;
import com.kh.maskRush.model.dao.worlds.World;


public class GameState extends State {
	
	private World world;
	private EntityManager entityManager;
	
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
		
		if(world.getEntityManager().getBoyPlayer().getX() < 0
				&& world.getPath().equals("res/worlds/world1.txt")) {
			world = new World(handler, "res/worlds/world2.txt");
			handler.setWorld(world);
			handler.getGameCamera().move(0, 0);
		
		}
		if(world.getEntityManager().getBoyPlayer().getY() > 600  
				&& world.getPath().equals("res/worlds/world2.txt")) {
			world = new World(handler, "res/worlds/world3.txt");
			handler.setWorld(world);
			handler.getGameCamera().move(0, 0);
		
		}
		if(world.getEntityManager().getBoyPlayer().getX() > 750  
				&& world.getPath().equals("res/worlds/world3.txt")) {
			world = new World(handler, "res/worlds/world4.txt");
			handler.setWorld(world);
			handler.getGameCamera().move(0, 0);
		
		}
		
		
		
	}
	
}
