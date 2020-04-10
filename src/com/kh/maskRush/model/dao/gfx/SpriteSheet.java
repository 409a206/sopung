package com.kh.maskRush.model.dao.gfx;

import java.awt.image.BufferedImage;

//class to crop images
public class SpriteSheet {
	private BufferedImage sheet;
	
	public SpriteSheet(BufferedImage sheet) {
		this.sheet = sheet;
	}
	
	//method to crop image
	public BufferedImage crop(int x, int y, int width, int height) {
		return sheet.getSubimage(x, y, width, height);
	}
}
