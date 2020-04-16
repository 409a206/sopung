package com.kh.maskRush.minigame.gameobject;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.util.TimerTask;

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
	public void run() {//타이머 설정
//		JTextField label = new JTextField("남은시간 : ");
//		label.setBounds(850, 0, 150, 50);
//		label.setFont(new Font("Sanscerif", Font.BOLD, 20));
//		panel.add(label);
		for(int i = 10; i >= 0; i--){
			try {
				System.out.println(i);
				Thread.sleep(1000);
//				label.setText("남은시간 : " + i);
			} catch (InterruptedException e) {
				return;
			}
			
		}
		
		
		userId = JOptionPane.showInputDialog(""); //다음 장면 연결
				
				
		
	}
	
//	public void tempTask() {
//		TimerTask task = new TimerTask() {
//			@Override
//			public void run() {
//		
//			//todo
//			}
//		};	
//	    tmr = new Timer();
//		tmr.schedule(task, 0, 1000);
//	}

	//멈출때
	//tmr.cancel();

	//다시 재시작 할때
	//tempTask();

}
