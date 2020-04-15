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
//		Audio.Main_Sound("res/audio/farland.mp3");
		
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
			
//			new LivingroomDialogue().doRun();
		
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
			
//			new MoveToCity().doRun();
		
		}
		
//		if(world.getEntityManager().getBoyPlayer().getX() > 460 && world.getEntityManager().getBoyPlayer().getX() < 480 &&
//				world.getEntityManager().getBoyPlayer().getY() > 140 && world.getEntityManager().getBoyPlayer().getY() < 160
//				&& world.getPath().equals("res/worlds/world4.txt")) {
//			
//			new MoveToMart().doRun();
//			world = new World(handler, "res/worlds/eMart.txt");
//			handler.setWorld(world);
//			handler.getGameCamera().move(0, 0);
//		}
		
		if(world.getEntityManager().getBoyPlayer().getY() < 9  
				&& world.getPath().equals("res/worlds/eMart.txt")) {
			world = new World(handler, "res/worlds/world4.txt");
			handler.setWorld(world);
			handler.getGameCamera().move(0, 0);
		}
		
//		if(world.getEntityManager().getBoyPlayer().getX() > 507 && world.getEntityManager().getBoyPlayer().getX() < 525 &&
//				world.getEntityManager().getBoyPlayer().getY() > 891 && world.getEntityManager().getBoyPlayer().getY() < 924
//				&& world.getPath().equals("res/worlds/world4.txt")) {
//			new InConvenienceStore(new FirstMenuChoice(2));
//		}
//		
		if(world.getEntityManager().getBoyPlayer().getX() > 936 && world.getEntityManager().getBoyPlayer().getX() < 969 &&
		world.getEntityManager().getBoyPlayer().getY() > 66 && world.getEntityManager().getBoyPlayer().getY() < 111
		&& world.getPath().equals("res/worlds/world4.txt")) {
			State.setState(handler.getGame().miniGameSpacebar);
			world.getEntityManager().getBoyPlayer().setX(940);
			world.getEntityManager().getBoyPlayer().setY(116);
			
}

		
	}
	
}
