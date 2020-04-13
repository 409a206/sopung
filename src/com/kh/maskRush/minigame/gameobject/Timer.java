package com.kh.maskRush.minigame.gameobject;

import java.awt.Font;
import java.awt.image.BufferedImage;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.maskRush.minigame.userinterface.GameScreen;

public class Timer extends Thread{
	
	private GameScreen gc;
	private JPanel panel;
	private BufferedImage image;
	private String userId;
	
	public Timer(GameScreen gc, JPanel panel){
		this.gc = gc;
		this.panel = panel;
	}

	@Override
	public void run() {
		JTextField label = new JTextField("남은시간 : ");
		label.setBounds(850, 0, 150, 50);
		label.setFont(new Font("Sanscerif", Font.BOLD, 20));
		panel.add(label);
		for(int i = 5; i >= 0; i--){
			try {
				System.out.println(i);
				Thread.sleep(1000);
				label.setText("남은시간 : " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		userId = JOptionPane.showInputDialog("뭘봐");
				
				
		
	}

}
