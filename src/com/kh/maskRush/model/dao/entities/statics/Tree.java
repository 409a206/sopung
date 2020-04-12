package com.kh.maskRush.model.dao.entities.statics;

import java.awt.Graphics;

import com.kh.maskRush.model.dao.gfx.Assets;
import com.kh.maskRush.model.dao.handler.Handler;
import com.kh.maskRush.model.dao.tile.Tile;

public class Tree extends StaticEntity {

	public Tree(Handler handler, float x, float y) {
		super(handler, x, y, 64, 64); // last two parameters for width and height
		
		//bounding box for collision
		bounds.x = 0;
		bounds.y = 0;
		bounds.width = 64;
		bounds.height = 64;
	}

	@Override
	public void tick() {
		
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.sand, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		
	}
	
}
