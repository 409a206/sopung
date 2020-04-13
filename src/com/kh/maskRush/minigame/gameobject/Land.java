package com.kh.maskRush.minigame.gameobject;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import com.kh.maskRush.minigame.util.Resource;
import static com.kh.maskRush.minigame.userinterface.GameScreen.GROUNDY;

public class Land {
	
	private List<ImageLand> listImage;
	private BufferedImage land1, land2, land3;
	
	public Land() {
		
		land1 = Resource.getResourceImage("res/textures/miniland.png");
		land2 = Resource.getResourceImage("res/textures/miniland.png");
		land3 = Resource.getResourceImage("res/textures/miniland.png");
		listImage = new ArrayList<ImageLand>();
		for(int i = 0; i < 5; i++) {
			ImageLand imageLand = new ImageLand();
			imageLand.posX = (int) (i * land1.getWidth());
			imageLand.image = land1;
		}
	}
	
	public void draw(Graphics g) {
		for(ImageLand imageLand:listImage) {
			g.drawImage(imageLand.image, imageLand.posX, (int) GROUNDY, null);
		}
		
		
	}
	
	private class ImageLand {
		int posX;
		BufferedImage image;
	}
	

}


