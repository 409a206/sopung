package com.kh.maskRush.model.dao.states;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.kh.maskRush.model.dao.audio.Audio;
import com.kh.maskRush.model.dao.entities.Creature.BoyPlayer;
import com.kh.maskRush.model.dao.entities.Creature.EvilHand;
import com.kh.maskRush.model.dao.entities.Creature.MaskBoy;
import com.kh.maskRush.model.dao.handler.Handler;
import com.kh.maskRush.model.dao.worlds.World;

public class MiniGameSpacebar extends State {

   private World world;
   private EvilHand evilhand;
   private BufferedImage image;
   private MaskBoy boygame;
   
   
   
   
   public void playbgm() {

	 
   }
   

   
   public MiniGameSpacebar(Handler handler) {
      super(handler);
    //배경음악 추가( 수정사항 ) 
      
//      world = new World(handler,"res/worlds/spacebarstate.txt");
//      handler.setWorld(world);
      
      
      boygame = new MaskBoy (handler, 350, 400);
      evilhand = new EvilHand (handler, 350, 400);
      
      
      //handler.getGameCamera().move(1, 1);
      
   }


   @Override
   public void tick() {
      boygame.tick();
      evilhand.tick();
       
      
     
      
      
   //   world.tick();
      //game.getGameCamera().move(0, 1);
      
   }

   @Override
   public void render(Graphics g) {
   //   world.render(g);
      boygame.render(g);
      evilhand.render(g);
      
   }

}