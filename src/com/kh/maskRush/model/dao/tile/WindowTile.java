package com.kh.maskRush.model.dao.tile;

import java.awt.image.BufferedImage;

import com.kh.maskRush.model.dao.gfx.Assets;

public class WindowTile extends Tile {

	public WindowTile(int id) {
		super(Assets.windowTile, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}
	
}
