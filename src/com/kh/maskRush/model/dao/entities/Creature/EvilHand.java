package com.kh.maskRush.model.dao.entities.Creature;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.net.MalformedURLException;
import java.net.URL;

import com.kh.maskRush.model.dao.gfx.Assets;
import com.kh.maskRush.model.dao.handler.Handler;

public class EvilHand extends Creature {


   public EvilHand (Handler handler, float x, float y) {
      super(handler, 550, y+650, 300, 300);
   }
   @Override
   public void tick() {
      getInput();
      move();
      pushup();
      if(y >= 1050) {
         System.out.println("Clear");
         System.exit(0);//���� ������� �̵�.
      } else if(y <= 650) {
         System.out.println("GAME OVER");
         System.exit(0);//����� �ؾ���.            
      } else {
         System.out.println(y);
      }           
      
      
          
   //   handler.getGameCamera().centerOnEntity(this);
   }
   
   //input�� ���ö� ĳ���Ͱ� ��� �ൿ���� ����
   private void getInput() {
      xMove = 0;
      yMove = 0;
      
//      if(handler.getKeyManager().up) {
//         yMove = - speed;
//      }
//      if(handler.getKeyManager().down) {
//         yMove =  speed;
//      }
//      if(handler.getKeyManager().left) {
//         xMove = - speed;
//      }
//      if(handler.getKeyManager().right) {
//         xMove =  speed;
//      }
      if(handler.getKeyManager().spaceBar) {
         yMove =  (float) (speed - 1.2);   // �����̽��� ������ �� �̵� �ӵ� ����
         
      }
   }

   @Override
   public void render(Graphics g) {
      g.drawImage(Assets.evilhand, (int) (x - handler.getGameCamera2().getxOffset()), (int) (y - handler.getGameCamera2().getyOffset()), width, height, null);
      
   }
   
   

}
