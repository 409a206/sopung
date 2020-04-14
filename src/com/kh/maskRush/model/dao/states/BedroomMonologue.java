package com.kh.maskRush.model.dao.states;

import java.awt.Graphics;

import com.kh.maskRush.model.dao.gfx.Assets;
import com.kh.maskRush.model.dao.handler.Handler;

public class BedroomMonologue extends State {

	public BedroomMonologue(Handler handler) {
		super(handler);
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.bedroom, 0, 0, null);
		if(handler.getMouseManager().isLeftClicked()) {
			g.drawImage(Assets.dirt, 0, 0, null);}
			if(handler.getMouseManager().isLeftClicked()) {
				g.drawImage(Assets.sandStone, 0, 0, null);
			
		}
	}
		
}


