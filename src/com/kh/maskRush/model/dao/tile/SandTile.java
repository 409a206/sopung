package com.kh.maskRush.model.dao.tile;

import java.awt.image.BufferedImage;

import com.kh.maskRush.model.dao.gfx.Assets;

public class SandTile extends Tile {

	public SandTile(int id) {
		super(Assets.sand, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}
	
}
