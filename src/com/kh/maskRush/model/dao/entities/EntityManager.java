package com.kh.maskRush.model.dao.entities;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Comparator;

import com.kh.maskRush.model.dao.entities.Creature.BoyPlayer;
import com.kh.maskRush.model.dao.entities.Creature.BoyPlayerMask;
import com.kh.maskRush.model.dao.handler.Handler;

public class EntityManager {
	
	private Handler handler;
	private BoyPlayer boyPlayer;
	private BoyPlayerMask boyPlayerMask;
	private ArrayList<Entity> entities;
	//for entity render order
	private Comparator<Entity> renderSorter = new Comparator<Entity>() {

		@Override
		public int compare(Entity a, Entity b) {
			if(a.getY() + a.getHeight() < b.getY() + b.getHeight())
				return -1; // a should be rendered before b
			return 1;
		}
		
	};
	
	
	public EntityManager(Handler handler, BoyPlayer boyPlayer) {
		this.handler = handler;
		this.boyPlayer = boyPlayer;
		entities = new ArrayList<Entity>();
		addEntity(boyPlayer);
	}
	
	public EntityManager(Handler handler, BoyPlayerMask boyPlayerMask) {
		this.handler = handler;
		this.boyPlayerMask = boyPlayerMask;
		entities = new ArrayList<Entity>();
		addEntity(boyPlayerMask);
	}
	
	public void tick() {
		for(int i = 0; i < entities.size(); i++) {
			Entity e = entities.get(i);
			e.tick();
		}
		entities.sort(renderSorter); // temporary remove
	}
	
	public void render(Graphics g) {
		for(Entity e : entities) {
			e.render(g);
		}
	}
	
	public void addEntity(Entity e) {
		entities.add(e);
	}
	
	
	
	//GETTERS SETTERS

	public Handler getHandler() {
		return handler;
	}

	public BoyPlayer getBoyPlayer() {
		return boyPlayer;
	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public void setBoyPlayer(BoyPlayer boyPlayer) {
		this.boyPlayer = boyPlayer;
	}

	public void setEntities(ArrayList<Entity> entities) {
		this.entities = entities;
	}

	public BoyPlayerMask getBoyPlayerMask() {
		return boyPlayerMask;
	}

	public void setBoyPlayerMask(BoyPlayerMask boyPlayerMask) {
		this.boyPlayerMask = boyPlayerMask;
	}
	
	
}
