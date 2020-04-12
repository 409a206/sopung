package com.kh.maskRush.model.dao.entities;

import java.awt.Graphics;
import java.util.ArrayList;

import com.kh.maskRush.model.dao.entities.Creature.BoyPlayer;
import com.kh.maskRush.model.dao.handler.Handler;

public class EntityManager {
	
	private Handler handler;
	private BoyPlayer boyPlayer;
	private ArrayList<Entity> entities;
	
	
	public EntityManager(Handler handler, BoyPlayer boyPlayer) {
		this.handler = handler;
		this.boyPlayer = boyPlayer;
		entities = new ArrayList<Entity>();
		addEntity(boyPlayer);
	}
	
	public void tick() {
		for(int i = 0; i < entities.size(); i++) {
			Entity e = entities.get(i);
			e.tick();
		}
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
	
	
}
