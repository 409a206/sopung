package com.kh.maskRush.model.dao.states;

import java.awt.Color;
import java.awt.Graphics;

import com.kh.maskRush.model.dao.handler.Handler;

public class MainMenuState extends State {

	public MainMenuState(Handler handler) {
		super(handler);
	}

	@Override
	public void tick() {
		if(handler.getMouseManager().isLeftPressed() && handler.getMouseManager().isRightPressed()) {
			State.setState(handler.getGame().gameState);
		}
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(handler.getMouseManager().getMouseX(), handler.getMouseManager().getMouseY(), 10, 10);
		
	}

}
