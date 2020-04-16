package com.kh.maskRush.model.dao.states;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import com.kh.maskRush.controller.Game;

public class ToHometownBus extends JFrame{

   private JPanel contentPane;

   public static void main(String[] args) {

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               ToHometownBus frame = new ToHometownBus();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }



   public ToHometownBus() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(0, 0, 800, 600);
      setLocationRelativeTo(null);
      contentPane = new JPanel();   
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);

      JTextPane textPane = new JTextPane();
      textPane.setEditable(false); // �����Ұ�.
      String[] busChat = {"�� ���ó��� ��ȣ����! \r\n ����ũ�� �� ���ߴ�?", "��! �� ���߾��! ����!"
    		  ,"���� ���ó��� ��ȣ! \r\n �� �س� �� �˾Ҿ�!"  };
      
    //Ŭ����
    		JLabel click = new JLabel("(click)");
    		click.setFont(new Font("DungGeunMo", Font.PLAIN, 24));
    		click.setBounds(600, 300, 800,300);
    		contentPane.add(click);
    		click.setVisible(false);
      

      textPane.addKeyListener(new KeyAdapter() {

         int i = 0;
         @Override
         public void keyPressed(KeyEvent e) {

        	 if (i == busChat.length) {
					click.setVisible(true);
				}

            if(i < busChat.length) {
            if(e.getKeyCode() == KeyEvent.VK_SPACE) {
               textPane.setText(busChat[i]);
               
               click.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						System.out.println("cccccc");
						dispose();
//						Game game = new Game("Mask Rush", 800, 600, player);
//						game.start();
						
					}			
				});
               
            }
     
         }
         }

         @Override
         public void keyReleased(KeyEvent e) {
            i++;
         }

      });




      contentPane.add(textPane);
      textPane.setFont(new Font("�ձٸ��", Font.PLAIN, 24));
      textPane.setBounds(88, 400, 446, 127);
      
      JLabel talk = new JLabel();
      talk.setIcon(new ImageIcon(InPharmacy.class.getResource("/textures/��ȭâ2.png")));
      talk.setBounds(-10, -25, 800, 600);
      this.add(talk);

      JLabel backGround = new JLabel();
      backGround.setIcon(new ImageIcon(InPharmacy.class.getResource("/textures/homeGoBus.png")));
      backGround.setBounds(-16, -15, 800, 600);
      this.add(backGround);
      
   }

}