package com.kh.maskRush.model.dao.gfx;

import java.awt.image.BufferedImage;

//loads in resources
public class Assets {
	
	private static final int width = 62, height = 62; //width and height of grid spaces
	
	public static BufferedImage girlPlayer, stone, dirt, grass, sand, sandStone, bedroom, windowTile, 
	calendarTile, block, monologue1, livingRoom, mom, countryside, city1, city2, city3, city4, evilhand,
	boygame, eMart, miniboy, boyMask;
	public static BufferedImage[] boyPlayer_right, boyPlayer_left;
	public static BufferedImage[] boyMask_left;
	
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/tiles.png"));
		
		stone = sheet.crop(0, 0, width, height);
		dirt = sheet.crop(0, height * 3 , width, height);
		grass = sheet.crop( 0, height * 2, width, height);
		sand = sheet.crop( 0, height, width, height);
		sandStone = sheet.crop(0, height * 4, width, height);
		
		SpriteSheet sheet2 = new SpriteSheet(ImageLoader.loadImage("/textures/boyWithoutMask.png"));
		boyPlayer_left = new BufferedImage[2];
		boyPlayer_left[0] = sheet2.crop(0, 0, 510, 480);
		boyPlayer_left[1] = sheet2.crop(0, 0, 510, 480);
		
//		SpriteSheet sheet3 = new SpriteSheet(ImageLoader.loadImage("/textures/boyWithoutMask2.png"));
//		boyPlayer_right = new BufferedImage[2];
//		boyPlayer_right[0] = sheet3.crop(width * 4, 0, 510, 480);
//		boyPlayer_right[1] = sheet3.crop(width * 4, 0, 510, 480);
		
		SpriteSheet sheet4 = new SpriteSheet(ImageLoader.loadImage("/textures/girlWithoutMask.png"));
		girlPlayer = sheet4.crop(0, 0, 510, 510);
		
		SpriteSheet sheet5 = new SpriteSheet(ImageLoader.loadImage("/textures/bedroom.png"));
		bedroom = sheet5.crop(0, 0, 1440, 1024);
		windowTile = sheet5.crop(0, 0, 168, 252);
		calendarTile = sheet5.crop(175, 73, 148, 206);
		
		SpriteSheet sheet6 = new SpriteSheet(ImageLoader.loadImage("/textures/girlWithoutMask.png"));
		block = sheet6.crop(0,0, 1, 1);
		
		SpriteSheet sheet7 = new SpriteSheet(ImageLoader.loadImage("/textures/LivingRoom/living.png"));
		livingRoom = sheet7.crop(0, 0, 1380, 1020);
		
		SpriteSheet sheet8 = new SpriteSheet(ImageLoader.loadImage("/textures/countryside/countryside.png"));
		countryside = sheet8.crop(0, 0, 1380, 1020);
		
		SpriteSheet sheet9 = new SpriteSheet(ImageLoader.loadImage("/textures/city/city.png"));
		city1 = sheet9.crop(0, 0, 1191, 945);
		city2 = sheet9.crop(1191, 0, 1191, 945);
		city3 = sheet9.crop(0, 945, 1191, 945);
		city4 = sheet9.crop(1191, 945, 1191, 945);
		
		SpriteSheet sheet10 = new SpriteSheet(ImageLoader.loadImage("/textures/evilhand.png"));
	    evilhand = sheet10.crop(0,  0,  500, 280);
	      
	    SpriteSheet sheet11 = new SpriteSheet(ImageLoader.loadImage("/textures/boygame.png"));
	    boygame = sheet11.crop(0, 0, 800, 600);
	      
	    SpriteSheet sheet12 = new SpriteSheet(ImageLoader.loadImage("/textures/emart.png"));
	    eMart = sheet12.crop(0, 0, 600, 593);
		
	    SpriteSheet sheet13 = new SpriteSheet(ImageLoader.loadImage("/textures/boyWithMask.png"));
	    boyMask_left = new BufferedImage[1];
	    boyMask_left[0] = sheet13.crop(0, 0, 169, 169);
	}
}
