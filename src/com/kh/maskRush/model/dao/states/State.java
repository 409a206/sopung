package com.kh.maskRush.model.dao.states;

import java.awt.Graphics;

import com.kh.maskRush.controller.Game;
import com.kh.maskRush.model.dao.handler.Handler;

//create State so that classes share things in common
public abstract class State {
	
	private static State currentState = null; //what state to tick and render
	
	public static void setState(State state) {
		currentState = state;
	}
	
	public static State getState() {
		return currentState;
	}
	
	//CLASS
	
	protected Handler handler;
	
	protected Game game;
	
	public State(Handler handler) {
		this.handler = handler;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
	
	
}
