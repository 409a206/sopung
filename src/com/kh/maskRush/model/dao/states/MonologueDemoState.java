package com.kh.maskRush.model.dao.states;

import java.awt.EventQueue; 
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import com.kh.maskRush.model.dao.handler.Handler;
import com.kh.maskRush.view.Display;



public class MonologueDemoState extends State {

private JPanel contentPane;
private Display display;
private JFrame frame;

   public MonologueDemoState(Handler handler) {
		super(handler);
		
	    
	}

 
  

@Override
public void tick() {
	// TODO Auto-generated method stub
	
}

@Override
public void render(Graphics g) {
//	g.dispose();
	frame.remove(handler.getGame().getDisplay().getCanvas());
	contentPane = handler.getGame().getDisplay().getPanel();
	frame = handler.getGame().getDisplay().getFrame();
	
//	frame.remove(handler.getGame().getDisplay().getCanvas());
	
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    frame.setContentPane(contentPane);
    contentPane.setLayout(null);
   
    JTextPane textPane = new JTextPane();
    textPane.setEditable(false); // 편집불가.
    String[] busChat = {"편의점으로 들어가시겠습니까?","(Y/N)\r\n", "Awef", "awef", "awefao;ijf"};
    

    textPane.addKeyListener(new KeyAdapter() {

       int i = 0;
       @Override
       public void keyPressed(KeyEvent e) {

          if(i < busChat.length) {
          if(e.getKeyCode() == KeyEvent.VK_SPACE) {
             textPane.setText(busChat[i]);
          }
       }
       }

       @Override
       public void keyReleased(KeyEvent e) {
          i++;
       }

    });




    contentPane.add(textPane);
    textPane.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
    textPane.setBounds(88, 400, 446, 127);
    
    JLabel talk = new JLabel();
    talk.setIcon(new ImageIcon(InPharmacy.class.getResource("/textures/대화창2.png")));
    talk.setBounds(-10, -25, 800, 600);
    frame.add(talk);

    JLabel backGround = new JLabel();
    backGround.setIcon(new ImageIcon(InPharmacy.class.getResource("/textures/cityToConvenienceStore.png")));
    backGround.setBounds(-16, -15, 800, 600);
    frame.add(backGround);
}

}
