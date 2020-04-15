package com.kh.maskRush.model.dao.states;

import java.awt.EventQueue; 
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;



public class MoveToMart extends JFrame {

   private JPanel contentPane;

   public static void doRun() {

     
               MoveToMart frame = new MoveToMart();
               frame.setVisible(true);
           
   }



   public MoveToMart() {
//      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(0, 0, 800, 600);
      contentPane = new JPanel();   
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);

      JTextPane textPane = new JTextPane();
      textPane.setEditable(false); // 편집불가.
      String[] busChat = {"마트로 들어가시겠습니까?","(Y/N)\r\n"};
      

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
      this.add(talk);

      JLabel backGround = new JLabel();
      backGround.setIcon(new ImageIcon(InPharmacy.class.getResource("/textures/cityToMart.png")));
      backGround.setBounds(-16, -15, 800, 600);
      this.add(backGround);
      
   }

}
