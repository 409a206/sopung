package com.kh.maskRush.model.dao.states;

import java.awt.Graphics;

import com.kh.maskRush.model.dao.gfx.Assets;
import com.kh.maskRush.model.dao.handler.Handler;
import com.kh.maskRush.model.dao.ui.ClickListener;
import com.kh.maskRush.model.dao.ui.UIImageButton;
import com.kh.maskRush.model.dao.ui.UIManager;

public class MainMenuState extends State {

	private UIManager uiManager;
	
	public MainMenuState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);
		
		uiManager.addObject(new UIImageButton(200, 200, 128, 64, Assets.boyPlayer_left, new ClickListener() {

			@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null); //no longer gets uiInput
				State.setState(handler.getGame().gameState);
				
			}}));
	}

	@Override
	public void tick() {
		uiManager.tick();
	}

	@Override
	public void render(Graphics g) {
		uiManager.render(g);
	}

}
