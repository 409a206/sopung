package com.kh.maskRush.minigame.gameobject;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.kh.maskRush.minigame.util.Resource;

import gameobject.MainCharacter;
import gameobject.Land.ImageLand;

import static com.kh.maskRush.minigame.userinterface.GameScreen.GROUNDY;

public class Land {
	
public static final int LAND_POSY = 103;
	
	private List<ImageLand> listLand;
	private BufferedImage land1;
	private BufferedImage land2;
	private BufferedImage land3;
	
	private MainCharacter mainCharacter;
	
	public Land(int width, MainCharacter mainCharacter) {
		this.mainCharacter = mainCharacter;
		land1 = Resource.getResourceImage("res/textures/miniland.png");
		land2 = Resource.getResourceImage("res/textures/miniland.png");
		land3 = Resource.getResourceImage("res/textures/miniland.png");
		int numberOfImageLand = width / land1.getWidth() + 2;//다음 맵 불러오기 숫자 낮으면 부자연스럽게 맵 생성
		listLand = new ArrayList<ImageLand>();
		for(int i = 0; i < numberOfImageLand; i++) {
			ImageLand imageLand = new ImageLand();
			imageLand.posX = i * land1.getWidth();
			setImageLand(imageLand);
			listLand.add(imageLand);
		}
	}
	
	public void update(){
		Iterator<ImageLand> itr = listLand.iterator();
		ImageLand firstElement = itr.next();
		firstElement.posX -= mainCharacter.getSpeedX();
		float previousPosX = firstElement.posX;
		while(itr.hasNext()) {
			ImageLand element = itr.next();
			element.posX = previousPosX + land1.getWidth();
			previousPosX = element.posX;
		}
		if(firstElement.posX < -land1.getWidth()) {
			listLand.remove(firstElement);
			firstElement.posX = previousPosX + land1.getWidth();
			setImageLand(firstElement);
			listLand.add(firstElement);
		}
	}
	
	private void setImageLand(ImageLand imgLand) {
		int typeLand = getTypeOfLand();
		if(typeLand == 1) {
			imgLand.image = land1;
		} else if(typeLand == 3) {
			imgLand.image = land3;
		} else {
			imgLand.image = land2;
		}
	}
	
	public void draw(Graphics g) {
		for(ImageLand imgLand : listLand) {
			g.drawImage(imgLand.image, (int) imgLand.posX, LAND_POSY, null);
		}
	}
	
	private int getTypeOfLand() {
		Random rand = new Random();
		int type = rand.nextInt(10);
		if(type == 1) {
			return 1;
		} else if(type == 9) {
			return 3;
		} else {
			return 2;
		}
	}
	
	private class ImageLand {
		float posX;
		BufferedImage image;
	}
	

}


