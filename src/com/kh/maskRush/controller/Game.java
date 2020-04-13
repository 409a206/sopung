package com.kh.maskRush.controller;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import com.kh.maskRush.model.dao.gfx.Assets;
import com.kh.maskRush.model.dao.gfx.GameCamera;
import com.kh.maskRush.model.dao.handler.Handler;
import com.kh.maskRush.model.dao.input.KeyManager;
import com.kh.maskRush.model.dao.states.GameState;
import com.kh.maskRush.model.dao.states.MainMenuState;
import com.kh.maskRush.model.dao.states.MiniGameSpacebar;
import com.kh.maskRush.model.dao.states.State;
import com.kh.maskRush.view.Display;
//basically the 'main' class
public class Game implements Runnable {
	
	
	private Display display;
	
	private int width, height;
	public String title;
	
	private boolean running = false;
	
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	//States
	private State gameState;
	private State mainMenuState;
	private State miniGameSpacebar;
	
	//Input
	public KeyManager keyManager;
	
	//Camera
	private GameCamera gameCamera;
	
	//Handler
	private Handler handler;
	
	
	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();

	}

	//테스트
	private void init() {
		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		Assets.init();
		
		gameCamera = new GameCamera(this, 0, 0); 
		handler = new Handler(this);
		
		gameState = new GameState(handler);
		mainMenuState = new MainMenuState(handler);
		miniGameSpacebar = new MiniGameSpacebar(handler);
		State.setState(miniGameSpacebar);
	}
	
	
	//updates everthing
	private void tick() {
			
			keyManager.tick();
		
			if(State.getState() != null) {
				State.getState().tick();
			}
	}
	
	//drawing stuff to the screen
	private void render() {
		//bufferstrategy tells the computer to draw things to the screen.
		//A buffer Screen is a screen behind an actual screen that shows up.
		//using buffer to prevent filckering
		if(bs == null) {
			display.getCanvas().createBufferStrategy(3); //3 is the maximum
		}
		bs = display.getCanvas().getBufferStrategy(); 
		g = bs.getDrawGraphics(); //using Graphics obj to draw
		//Clear Screen
		g.clearRect(0, 0, width, height);
		
		//Draw Here!
		
		if(State.getState() != null) {
			State.getState().render(g);
		}
		
		
		
		//End Drawing!
		bs.show(); //shows on screen
		g.dispose();  //makes sure Graphics obj gets done with properly
		
	}
	
	@Override
	public void run() {
		//where majority of game methods are written;
		
		init();
		
		//게임 속도를 cpu 일정하게 하기 위해 설정
		int fps = 60; //frame per second
		double timePerTick = 1000000000 / fps; //1billion nano secs = 1 sec
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer  = 0;
		long ticks = 0;
		
		while(running) {
			
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1) {
			tick();
			render();
			ticks++;
			delta--;
			}
			
			if(timer >= 1000000000) {
//				System.out.println("Ticks and Frames : " + ticks);
				ticks = 0;
				timer = 0;
			}
		}
		
		stop(); //just in case it didn't stop in the first time
		
	}
	
	public KeyManager getKeyManager() {
		return keyManager;
	}
	
	public GameCamera getGameCamera() {
		return gameCamera;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public synchronized void start() {
		if(running) {
			return; //just for safety
		}
		running = true;
		thread = new Thread(this);
		thread.start(); // calls run() method
	}
	
	public synchronized void stop() {
		if(!running) {
			return; //just for safety
		}
		running = false;
		 try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
