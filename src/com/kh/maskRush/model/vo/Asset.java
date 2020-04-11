package com.kh.maskRush.model.vo;


import java.awt.image.BufferedImage;

import com.kh.maskRush.model.dao.gfx.ImageLoader;
import com.kh.maskRush.model.dao.gfx.SpriteSheet;

//loads in resources
public class Asset {
	
	private static final int width = 62, height = 62; //width and height of grid spaces
	
	public static BufferedImage boyPlayer, girlPlayer, stone, dirt, grass, sand, sandStone;
	
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/tiles.png"));
		
		stone = sheet.crop(0, 0, width, height);
		dirt = sheet.crop(0, height * 3 , width, height);
		grass = sheet.crop( 0, height * 2, width, height);
		sand = sheet.crop( 0, height, width, height);
		sandStone = sheet.crop(0, height * 4, width, height);
		
		
		SpriteSheet sheet2 = new SpriteSheet(ImageLoader.loadImage("/textures/boyWithoutMask.png"));
		boyPlayer = sheet2.crop(0, 0, 510, 510);
		
		
	}
}
