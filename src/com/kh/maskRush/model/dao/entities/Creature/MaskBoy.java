package com.kh.maskRush.model.dao.entities.Creature;

import java.awt.Graphics;

import com.kh.maskRush.model.dao.gfx.Assets;
import com.kh.maskRush.model.dao.handler.Handler;

public class MaskBoy extends Creature {

   public MaskBoy(Handler handler, float x, float y) {
      super(handler, x, y, 800, 600);
   }

   @Override
   public void tick() {
      getInput();
      move();
      handler.getGameCamera2().centerOnEntity(this);
   }
   //input이 들어올때 캐릭터가 어떻게 행동할지 정의
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
      
   }

   @Override
   public void render(Graphics g) {
      g.drawImage(Assets.boygame, (int) (x - handler.getGameCamera2().getxOffset()), (int) (y - handler.getGameCamera2().getyOffset()), width, height, null);
      
   }
   
}