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



public class MaskMiniExplain1 extends JFrame {

   private JPanel contentPane;

   public static void main(String[] args) {

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               MaskMiniExplain1 frame = new MaskMiniExplain1();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }



   public MaskMiniExplain1() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(0, 0, 800, 600);
      contentPane = new JPanel();   
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);

//      JTextPane textPane = new JTextPane();
//      textPane.setEditable(false); // �����Ұ�.
//      String[] busChat = {"���������� ���ðڽ��ϱ�?","(Y/N)\r\n"};
//      
//
//      textPane.addKeyListener(new KeyAdapter() {
//
//         int i = 0;
//         @Override
//         public void keyPressed(KeyEvent e) {
//
//            if(i < busChat.length) {
//            if(e.getKeyCode() == KeyEvent.VK_SPACE) {
//               textPane.setText(busChat[i]);
//            }
//         }
//         }
//
//         @Override
//         public void keyReleased(KeyEvent e) {
//            i++;
//         }
//
//      });




//      contentPane.add(textPane);
//      textPane.setFont(new Font("�ձٸ��", Font.PLAIN, 24));
//      textPane.setBounds(88, 400, 446, 127);
//      
//      JLabel talk = new JLabel();
//      talk.setIcon(new ImageIcon(InPharmacy.class.getResource("/textures/��ȭâ2.png")));
//      talk.setBounds(-10, -25, 800, 600);
//      this.add(talk);

      JLabel backGround = new JLabel();
      backGround.setIcon(new ImageIcon(InPharmacy.class.getResource("/textures/maskMiniRestart.png")));
      backGround.setBounds(-16, -15, 800, 600);
      this.add(backGround);
      
   }

}