package com.kh.maskRush.model.dao.gfx;

import java.awt.image.BufferedImage;

//loads in resources
public class Assets {
	
	private static final int width = 62, height = 62; //width and height of grid spaces
	
	public static BufferedImage boyPlayer, girlPlayer, stone, dirt, grass, sand, sandStone, evilhand;
	
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/tiles.png"));
		
		stone = sheet.crop(0, 0, width, height);
		dirt = sheet.crop(0, height * 3 , width, height);
		grass = sheet.crop( 0, height * 2, width, height);
		sand = sheet.crop( 0, height, width, height);
		sandStone = sheet.crop(0, height * 4, width, height);
		
		
		SpriteSheet sheet2 = new SpriteSheet(ImageLoader.loadImage("/textures/boyWithoutMask.png"));
		boyPlayer = sheet2.crop(0, 0, 510, 510);
		
		SpriteSheet sheet3 = new SpriteSheet(ImageLoader.loadImage("/textures/evilhand.png"));
		evilhand = sheet3.crop(0,  0,  500, 280);
	}

}

