package com.kh.maskRush.model.dao.entities.Creature;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.kh.maskRush.model.dao.gfx.Assets;
import com.kh.maskRush.model.dao.handler.Handler;
import com.kh.maskRush.model.dao.states.InPharmacy;
import com.kh.maskRush.model.dao.states.State;
import com.kh.maskRush.model.dao.worlds.World;

public class EvilHand extends Creature {
	World world;

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
         
         
         State.setState(handler.getGame().gameState);
         world = new World(handler, "res/worlds/afterMaskMinigame.txt");
			handler.setWorld(world);
			handler.getGameCamera().move(0, 0);
      } else if(y <= 650) {
         System.out.println("GAME OVER");
//         System.exit(0);//����� ȭ�� �������.
         JLabel backGround = new JLabel();
 		backGround.setIcon(new ImageIcon(InPharmacy.class.getResource("/textures/gameover.png")));
 		backGround.setBounds(-16, -15, 800, 600);
 		this.add(backGround);                
      } else {
         System.out.println(y);
      }           
      
          
   //   handler.getGameCamera().centerOnEntity(this);
   }
   
   private void add(JLabel backGround) {
	// TODO Auto-generated method stub
	
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
