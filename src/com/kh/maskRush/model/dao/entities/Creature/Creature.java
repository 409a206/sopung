package com.kh.maskRush.model.dao.entities.Creature;

import com.kh.maskRush.model.dao.entities.Entity;
import com.kh.maskRush.model.dao.handler.Handler;

public abstract class Creature extends Entity {
	
	public static final int DEFAULT_HEALTH = 10;
	public static final float DEFAULT_SPEED = 3.0f;
	public static final int DEFAULT_CREATURE_WIDTH = 64,
							DEFAULT_CREATURE_HEIGHT = 64;
	protected int health;
	protected float speed;
	protected float xMove, yMove;
	
	public Creature(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		health = DEFAULT_HEALTH;
		speed = DEFAULT_SPEED;
		xMove = 0;
		yMove = 0;
	}
	
	public void move() {
		x += xMove;
		y += yMove;
		if(yMove == 600) {
			System.out.println("CELAR");
		}
	}
	
	public void pushup() {
		x += 0;
		y += -1;
		
	}
	

		
	//GETTERS SETTERS

	public int getHealth() {
		return health;
	}

	public float getSpeed() {
		return speed;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getxMove() {
		return xMove;
	}

	public float getyMove() {
		return yMove;
	}

	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	public void setyMove(float yMove) {
		this.yMove = yMove;
	}
	
	
	
}
