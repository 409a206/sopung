package com.kh.maskRush.model.dao.states;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

import com.kh.maskRush.model.dao.entities.Creature.BoyPlayer;
import com.kh.maskRush.model.dao.entities.Creature.EvilHand;
import com.kh.maskRush.model.dao.handler.Handler;
import com.kh.maskRush.model.dao.worlds.World;

public class MiniGameSpacebar extends State {

	private World world;
	private EvilHand evilhand;
	private BoyPlayer boyPlayer;
	private BufferedImage image;
	
	public MiniGameSpacebar(Handler handler) {
		super(handler);
	    
//		world = new World(handler,"res/worlds/spacebarstate.txt");
//		handler.setWorld(world);
		
		
		
		evilhand = new EvilHand (handler, 350, 400);
		//boyPlayer = new BoyPlayer (handler, 350, 400);
			
		//handler.getGameCamera().move(1, 1);
		
	}


	@Override
	public void tick() {
		evilhand.tick();
	//	boyPlayer.tick();
	//	world.tick();
		//game.getGameCamera().move(0, 1);
		
	}

	@Override
	public void render(Graphics g) {
	//	world.render(g);
		evilhand.render(g);
	//	boyPlayer.render(g);
	}

}
