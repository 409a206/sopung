package com.kh.maskRush.model.dao.tile;

import java.awt.image.BufferedImage;

import com.kh.maskRush.model.dao.gfx.Assets;

public class CalendarTile extends Tile {

	public CalendarTile(int id) {
		super(Assets.calendarTile, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}
	
}
