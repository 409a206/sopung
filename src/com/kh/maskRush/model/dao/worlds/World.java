package com.kh.maskRush.model.dao.worlds;

import java.awt.Graphics;

import com.kh.maskRush.model.dao.entities.EntityManager;
import com.kh.maskRush.model.dao.entities.Creature.BoyPlayer;
import com.kh.maskRush.model.dao.entities.Creature.BoyPlayerMask;
import com.kh.maskRush.model.dao.entities.statics.Tree;
import com.kh.maskRush.model.dao.entities.statics.Tree2;
import com.kh.maskRush.model.dao.entities.statics.Tree3;
import com.kh.maskRush.model.dao.handler.Handler;
import com.kh.maskRush.model.dao.states.State;
import com.kh.maskRush.model.dao.tile.Tile;
import com.kh.maskRush.model.dao.utils.Utils;

public class World {
	
	private Handler handler;
	private int width, height;
	private int spawnX, spawnY;
	private int[][] tiles;
	private String path;
	
	//Entities
	private EntityManager entityManager;
	
	public World(Handler handler, String path) {
		this.handler = handler;
		this.path = path;
		
		if(path.equals("res/worlds/world1.txt")) {
		entityManager = new EntityManager(handler, new BoyPlayer(handler, 200, 200));
//		entityManager.addEntity(new Tree(handler, 0, 180));
//		entityManager.addEntity(new Tree(handler, 100, 180));
//		entityManager.addEntity(new Tree(handler, 200, 180));
//		entityManager.addEntity(new Tree(handler, 300, 180));
//		entityManager.addEntity(new Tree(handler, 400, 180));
//		entityManager.addEntity(new Tree(handler, 500, 180));
//		entityManager.addEntity(new Tree(handler, 600, 180));
//		entityManager.addEntity(new Tree(handler, 700, 180));
//		entityManager.addEntity(new Tree(handler, 800, 180));
//		entityManager.addEntity(new Tree(handler, 900, 180));
//		entityManager.addEntity(new Tree(handler, 270, 250));
//		entityManager.addEntity(new Tree(handler, 270, 300));
//		entityManager.addEntity(new Tree(handler, 270, 400));
//		entityManager.addEntity(new Tree(handler, 350, 400));
//		entityManager.addEntity(new Tree(handler, 470, 400));
//		entityManager.addEntity(new Tree(handler, 470, 300));
//		entityManager.addEntity(new Tree(handler, 630, 300));
//		entityManager.addEntity(new Tree(handler, 750, 300));
//		entityManager.addEntity(new Tree2(handler, 0, 570));
//		entityManager.addEntity(new Tree3(handler, 0, 570));
//		entityManager.getBoyPlayer().setX(150); //type in spawnX
//		entityManager.getBoyPlayer().setY(300); // '' '' spawnY
		
		} else if(path.equals("res/worlds/world2.txt")) {
			entityManager = new EntityManager(handler, new BoyPlayer(handler, 700, 300));
//			entityManager.addEntity(new Tree(handler, 90, 250));
//			entityManager.addEntity(new Tree(handler, 200, 250));
//			entityManager.addEntity(new Tree(handler, 280, 250));

			
			
		} else if(path.equals("res/worlds/world3.txt")) {
			entityManager = new EntityManager(handler, new BoyPlayer(handler, 400, 300));
		}
		else if(path.equals("res/worlds/world4.txt")) {
			entityManager = new EntityManager(handler, new BoyPlayer(handler, 300, 150));
		} else if(path.equals("res/worlds/eMart.txt")) {
			entityManager = new EntityManager(handler, new BoyPlayer(handler, 300, 150));
		} else if(path.equals("res/worlds/afterMart.txt")){
			entityManager = new EntityManager(handler, new BoyPlayer(handler, 300, 150));
		}else if(path.equals("res/worlds/afterConvenience.txt")){
			entityManager = new EntityManager(handler, new BoyPlayer(handler, 300, 150));
		}else if(path.equals("res/worlds/afterMaskMinigame.txt")){
			entityManager = new EntityManager(handler, new BoyPlayer(handler, 300, 150));
		}else if(path.equals("res/worlds/afterPharmacy.txt")){
			entityManager = new EntityManager(handler, new BoyPlayer(handler, 300, 150));
		}else if(path.equals("res/worlds/afterCity.txt")){
			entityManager = new EntityManager(handler, new BoyPlayer(handler, 750, 300));
		}
		
		loadWorld(path);
		
		
		
		
		
	}
	
	public void tick() {
		entityManager.tick();
//		if(entityManager.getBoyPlayer().getX() < 0) {
//			State.setState(handler.getGame().mainMenuState);
//		}
		System.out.println(entityManager.getBoyPlayer().getX() + ", " + entityManager.getBoyPlayer().getY());
	}
	
	public void render(Graphics g) {
	
		int xStart = (int) Math.max(0, handler.getGameCamera().getxOffset() / Tile.TILEWIDTH);
		int xEnd = (int) Math.min(width, (handler.getGameCamera().getxOffset() + handler.getWidth()) / Tile.TILEWIDTH + 1);
		int yStart = (int) Math.max(0, handler.getGameCamera().getyOffset() / Tile.TILEWIDTH);
		int yEnd = (int) Math.min(height, (handler.getGameCamera().getyOffset() + handler.getHeight()) / Tile.TILEHEIGHT + 1);
		
		for(int y = yStart; y < yEnd; y++) {
			for(int x = xStart; x < xEnd; x++) {
				getTile(x, y).render(g, (int) (x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()),
						(int) (y * Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));
			}
		}
		//Entities
		entityManager.render(g);
	}
	
	public Tile getTile(int x, int y) {
		if(x < 0 || y < 0 || x >= width || y >= height) {
			return Tile.sandStoneTile;
		}
		
		
		Tile t = Tile.tiles[tiles[x][y]];
		if(t == null) {
			return Tile.sandTile;
		}
		return t;
		
	}
	
	private void loadWorld(String path) {
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+"); // splits up every number(?) in a file
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);
		
		tiles = new int[width][height];
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
			}
		}
	}
	
	
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
