package com.kh.maskRush.model.dao.tile;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	
	
	//STATIC STUFF HERE
	
	public static Tile[] tiles = new Tile[256];
	public static Tile sandStoneTile = new SandStoneTile(0);
	public static Tile rockTile = new RockTile(1);
	public static Tile sandTile = new SandTile(2);
	
	
	//CLASS
	
	
	public static final int TILEWIDTH = 64, TILEHEIGHT = 64;
	
	protected BufferedImage texture;
	protected final int id;
	
	public Tile(BufferedImage texture, int id) {
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g, int x, int y) {
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
	}
	
	//is a tile walkable? yes -> false, no -> true
	public boolean isSolid() {
		return false;
	}
	
	public int getId() {
		return id;
	}
}
