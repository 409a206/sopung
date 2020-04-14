package com.kh.maskRush.minigame.gameobject;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.kh.maskRush.minigame.gameobject.Obstacle;
import com.kh.maskRush.minigame.gameobject.Enemy;
import com.kh.maskRush.minigame.gameobject.MainCharacter;
import com.kh.maskRush.minigame.gameobject.Timer;
import com.kh.maskRush.minigame.util.Resource;

public class EnemiesManager {
	
	private Timer timer;
	
	private BufferedImage obstacle1;
	private BufferedImage obstacle2;
	private Random rand;
	
	private List<Enemy> enemies;
	private MainCharacter mainCharacter;
	
	public EnemiesManager(MainCharacter mainCharacter) {
		rand = new Random();
		obstacle1 = Resource.getResourceImage("res/textures/minihuddle.png");
		obstacle2 = Resource.getResourceImage("res/textures/minihole.png");
		enemies = new ArrayList<Enemy>();
		this.mainCharacter = mainCharacter;
		enemies.add(createEnemy());
	}
	
	public void update() {
		for(Enemy e : enemies) {
			e.update();
		}
		Enemy enemy = enemies.get(0);
		if(enemy.isOutOfScreen()) {
			enemies.clear();
			enemies.add(createEnemy());
		}
	}
	
	public void draw(Graphics g) {
		for(Enemy e : enemies) {
			e.draw(g);
		}
	}
	
	
	private Enemy createEnemy() {
		int type = rand.nextInt(2);
		
		if(type == 0) {
			return new Obstacle(mainCharacter, 800, obstacle1.getWidth() - 10, obstacle1.getHeight() - 10, obstacle1);
		} else {
			return new Obstacle(mainCharacter, 800, obstacle2.getWidth() - 10, obstacle2.getHeight() - 10, obstacle2);
		}  
	}
	
	public boolean isCollision() {
		for(Enemy e : enemies) {
			if (mainCharacter.getBound().intersects(e.getBound())) {
				return true;
			}
		}
		return false;
	}
	
	public void reset() {
		enemies.clear();
		enemies.add(createEnemy());
	}

}
