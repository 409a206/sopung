package com.kh.maskRush.model.dao.entities.Creature;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.kh.maskRush.model.dao.gfx.Animation;
import com.kh.maskRush.model.dao.gfx.Assets;
import com.kh.maskRush.model.dao.handler.Handler;

public class BoyPlayer extends Creature {
	
	//Animations
	private Animation animLeft;

	public BoyPlayer(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		//customize bounds for collision
		bounds.x = 36;
		bounds.y = 36;
		bounds.width = 64;
		bounds.height = 64;
		
		//Animations
		animLeft = new Animation(500, Assets.boyPlayer_left);
		
	}

	@Override
	public void tick() {
		//Animations
		animLeft.tick();
		//Movement
		getInput();
		move();
		handler.getGameCamera().centerOnEntity(this);
	}
	
	//input이 들어올때 캐릭터가 어떻게 행동할지 정의
	private void getInput() {
		xMove = 0;
		yMove = 0;
		
		if(handler.getKeyManager().up) {
			yMove = - speed;
		}
		if(handler.getKeyManager().down) {
			yMove =  speed;
		}
		if(handler.getKeyManager().left) {
			xMove = - speed;
		}
		if(handler.getKeyManager().right) {
			xMove =  speed;
		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		
		
		//collision box visualization
//		g.setColor(Color.CYAN);
//		g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
//				(int) (y + bounds.y - handler.getGameCamera().getyOffset()),
//				bounds.width, bounds.height);
	}
	
	private BufferedImage getCurrentAnimationFrame() {

		return animLeft.getCurrentFrame(); // delete this when using else if statement below

//		if(xMove < 0) {
//			return animLeft.getCurrentFrame();
//		} else if(xMove > 0) {
//			return animRight.getCurrentFrame();
//		} else if(yMove < 0) {
//			return animUp.getCurrentFrame();
//		} else {
//			return animDown.getCurrentFrame();
//		}
	}
	
}
