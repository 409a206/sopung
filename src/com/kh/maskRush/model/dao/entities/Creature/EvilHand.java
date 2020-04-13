package com.kh.maskRush.model.dao.entities.Creature;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;

import com.kh.maskRush.model.dao.gfx.Assets;
import com.kh.maskRush.model.dao.handler.Handler;

public class EvilHand extends Creature {

	public EvilHand (Handler handler, float x, float y) {
		super(handler, 200, y, 300, 300);
	}

	@Override
	public void tick() {
		getInput();
		move();
		pushup();
		if(y >= 600) {
			System.out.println("Clear");
			System.exit(0);
		} else if(y <= 200) {
			System.out.println("GAME OVER");
			System.exit(0);                
		} else {
			System.out.println(y);
		}           
		 	
	//	handler.getGameCamera().centerOnEntity(this);
	}
	
	//input이 들어올때 캐릭터가 어떻게 행동할지 정의
	private void getInput() {
		xMove = 0;
		yMove = 0;
		
//		if(handler.getKeyManager().up) {
//			yMove = - speed;
//		}
//		if(handler.getKeyManager().down) {
//			yMove =  speed;
//		}
//		if(handler.getKeyManager().left) {
//			xMove = - speed;
//		}
//		if(handler.getKeyManager().right) {
//			xMove =  speed;
//		}
		if(handler.getKeyManager().spaceBar) {
			yMove =  (float) (speed + 0.1);	
		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.evilhand, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		
	}

}

