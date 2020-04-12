package com.kh.maskRush.minigame.gameobject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.kh.maskRush.minigame.util.Resource;


public class MainCharacter {
	
	public static final float GRAVITY = 0.1f;
	public static final float GROUNDY = 300; // by pixel
	
	private float x = 0;
	private float y = 0;
	private float speedY = 0;
	private BufferedImage characterImage;
	
	public MainCharacter() {
		characterImage = Resource.getResourceImage("res/texture/miniboy2");
	}
	
	public void update() {
		
		if(y >= GROUNDY - 100) {
			speedY = 0;
			y = GROUNDY - 100;
		} else {
			speedY += GRAVITY;
			y+=speedY;
		}
		
	}
	
	public void draw(Graphics g) {
		
		g.setColor(Color.black);
		g.drawRect((int)x,(int) y, 100, 100);
		
	}
	
	public void jump() {
		speedY = -4;
		y += speedY;
	}
	
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getSpeedY() {
		return speedY;
	}
	public void setSpeedY(float speedY) {
		this.speedY = speedY;
	}
	

}
