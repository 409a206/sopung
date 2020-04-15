package com.kh.maskRush.model.dao.tile;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	
	
	//STATIC STUFF HERE
	
	public static Tile[] tiles = new Tile[256];
	public static Tile sandStoneTile = new SandStoneTile(0);
	public static Tile rockTile = new RockTile(1);
	public static Tile sandTile = new SandTile(2);
	public static Tile bedroomTile = new BedroomTile(3);
	public static Tile windowTile = new WindowTile(11);
	public static Tile calendarTile = new CalendarTile(10);
	public static Tile livingRoomTile = new LivingRoomTile(6);
	public static Tile countrysideTile = new CountrysideTile(7);
	public static Tile cityTile1 = new CityTile1(8);
	public static Tile cityTile2 = new CityTile2(9);
	public static Tile cityTile3 = new CityTile3(4);
	public static Tile cityTile4 = new CityTile4(5);
	public static Tile eMartTile = new EMartTile(12);
	
	//CLASS
	
	
	public static final int TILEWIDTH = 800, TILEHEIGHT = 600;
	
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
