package com.kh.maskRush.model.dao.entities.Creature;

import java.awt.Color;
import java.awt.Graphics;

import com.kh.maskRush.model.dao.gfx.Assets;
import com.kh.maskRush.model.dao.handler.Handler;

public class BoyPlayer extends Creature {

	public BoyPlayer(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		//customize bounds for collision
		bounds.x = 32;
		bounds.y = 32;
		bounds.width = 24;
		bounds.height = 24;
		
	}

	@Override
	public void tick() {
		getInput();
		move();
		handler.getGameCamera().centerOnEntity(this);
	}
	
	//input�� ���ö� ĳ���Ͱ� ��� �ൿ���� ����
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
		g.drawImage(Assets.boyPlayer, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		
		//collision box visualization
//		g.setColor(Color.CYAN);
//		g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
//				(int) (y + bounds.y - handler.getGameCamera().getyOffset()),
//				bounds.width, bounds.height);
	}
	
}
