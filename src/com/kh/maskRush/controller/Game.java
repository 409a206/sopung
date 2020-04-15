package com.kh.maskRush.controller;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import com.kh.maskRush.model.dao.gfx.Assets;
import com.kh.maskRush.model.dao.gfx.GameCamera;
import com.kh.maskRush.model.dao.gfx.GameCamera2;
import com.kh.maskRush.model.dao.handler.Handler;
import com.kh.maskRush.model.dao.input.KeyManager;
import com.kh.maskRush.model.dao.input.MouseManager;
import com.kh.maskRush.model.dao.states.BedroomMonologue;
import com.kh.maskRush.model.dao.states.EMartMinigameState;
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
	public State gameState;
	public State mainMenuState;
	public State bedroomMonologue;
	public State miniGameSpacebar;
	public State eMartMinigameState;
	
	//Input
	private KeyManager keyManager;
	private MouseManager mouseManager;
	
	//Camera
	private GameCamera gameCamera;
	private GameCamera2 gameCamera2;
	
	//Handler
	private Handler handler;
	
	
	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
		mouseManager = new MouseManager();

	}

	//테스트
	private void init() {
		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		display.getFrame().addMouseListener(mouseManager);
		display.getFrame().addMouseMotionListener(mouseManager);
		display.getCanvas().addMouseListener(mouseManager);
		display.getCanvas().addMouseMotionListener(mouseManager);
		Assets.init();
		
		handler = new Handler(this);
		gameCamera = new GameCamera(handler, 0, 0); 
		gameCamera2 = new GameCamera2(this, 0, 0);
		
		
		
		gameState = new GameState(handler);
		mainMenuState = new MainMenuState(handler);
		miniGameSpacebar = new MiniGameSpacebar(handler);
		eMartMinigameState = new EMartMinigameState(handler); 
		
		State.setState(eMartMinigameState);
//		if(State.getState() instanceof MiniGameSpacebar) {
//			File file = new File("res/audio/mappy.wav");
//	           System.out.println(file.exists()); //true
//	           
//	           try {
//	               
//	               AudioInputStream stream = AudioSystem.getAudioInputStream(file);
//	               Clip clip = AudioSystem.getClip();
//	               clip.open(stream);
//	               clip.start();
//	               
//	           } catch(Exception e) {
//	               
//	               e.printStackTrace();
//	           }
//		}
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
	
	public MouseManager getMouseManager() {
		return mouseManager;
	}
	
	public GameCamera getGameCamera() {
		return gameCamera;
	}
	public GameCamera2 getGameCamera2() {
		return gameCamera2;
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
