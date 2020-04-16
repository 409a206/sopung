package com.kh.maskRush.minigame2.view;

import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	private JFrame mf;
	private JPanel panel;
	
	private BufferedImage replayButtonImage;
	private BufferedImage gameOverButtonImage;
	
	private JLabel[] arrows;
	private ArrayList<JLabel> inputs;
	private JLabel label;
	private int[] arrNo;
	private int x = 50;
	private int x2 = 50;
	private int index = 0;
	private int ctn = 0;
	
	
	
	public GamePanel(JFrame mf) {
		this.mf = mf;
		panel = this;
		
		
		arrows = new JLabel[10];
		inputs = new ArrayList<JLabel>();
		arrNo = new int[10];
		
		this.setBounds(0, 0, 1000, 800);
		
		buttonInit();
		
		JPanel back = null;
		
		try {
			back = new JPanelWithBackground("res/textures/back.png");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		mf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int num = 0;


				if(e.getKeyCode() == KeyEvent.VK_UP) {
					num = 4;
				}
				if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					num = 2;
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					num = 1;
				}
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					num = 3;
				}


				addButton(num);
				ctn++;
				

			}
		});
			
	}
	
	public void buttonInit() {
		x = 50;
		
		arrows[0] = new JLabel(new ImageIcon(new ImageIcon("com/kh/maskRush/images/1-black1.png").getImage().getScaledInstance(80, 80, 0)));
		arrows[1] = new JLabel(new ImageIcon(new ImageIcon("com/kh/maskRush/images/4-black1.png").getImage().getScaledInstance(80, 80, 0)));
		arrows[2] = new JLabel(new ImageIcon(new ImageIcon("com/kh/maskRush/images/2-black1.png").getImage().getScaledInstance(80, 80, 0)));
		arrows[3] = new JLabel(new ImageIcon(new ImageIcon("com/kh/maskRush/images/2-black1.png").getImage().getScaledInstance(80, 80, 0)));
		arrows[4] = new JLabel(new ImageIcon(new ImageIcon("com/kh/maskRush/images/1-black1.png").getImage().getScaledInstance(80, 80, 0)));
		arrows[5] = new JLabel(new ImageIcon(new ImageIcon("com/kh/maskRush/images/2-black1.png").getImage().getScaledInstance(80, 80, 0)));
		arrows[6] = new JLabel(new ImageIcon(new ImageIcon("com/kh/maskRush/images/3-black1.png").getImage().getScaledInstance(80, 80, 0)));
		arrows[7] = new JLabel(new ImageIcon(new ImageIcon("com/kh/maskRush/images/3-black1.png").getImage().getScaledInstance(80, 80, 0)));
		arrows[8] = new JLabel(new ImageIcon(new ImageIcon("com/kh/maskRush/images/3-black1.png").getImage().getScaledInstance(80, 80, 0)));
		arrows[9] = new JLabel(new ImageIcon(new ImageIcon("com/kh/maskRush/images/1-black1.png").getImage().getScaledInstance(80, 80, 0)));
		
		arrows[0].setBounds(x, 500, 80, 80);
		x += 90;
		arrows[1].setBounds(x, 500, 80, 80);
		x += 90;
		arrows[2].setBounds(x, 500, 80, 80);
		x += 90;
		arrows[3].setBounds(x, 500, 80, 80);
		x += 90;
		arrows[4].setBounds(x, 500, 80, 80);
		x += 90;
		arrows[5].setBounds(x, 500, 80, 80);
		x += 90;
		arrows[6].setBounds(x, 500, 80, 80);
		x += 90;
		arrows[7].setBounds(x, 500, 80, 80);
		x += 90;
		arrows[8].setBounds(x, 500, 80, 80);
		x += 90;
		arrows[9].setBounds(x, 500, 80, 80);
		x += 90;
		
		for(int i = 0; i < arrows.length; i++) {
			this.add(arrows[i]);
			this.repaint();
		}
		
		
//		for(int i = 0; i < arrows.length; i++) {
//			int num = new Random().nextInt(4) + 1;
//			arrNo[i] = num;
//			URL url = getClass().getClassLoader().getResource(num+"-blue.png");
//			arrows[i] = new JLabel(new ImageIcon(new ImageIcon(url).getImage().getScaledInstance(80, 80, 0)));
//			arrows[i].setBounds(x, 500, 80, 80);
//			x += 90;
//			this.add(arrows[i]);
//			this.repaint();
//		}
	}
	
	public void addButton(int num) {
		
		if(index >= 10) {
			reset();
			index = 0;
		} else {
			System.out.println("index : " + index);
			
			String color = "";
			if(arrNo[index] == num) {
				color = "blue";
				
				URL url = getClass().getClassLoader().getResource("filename");
				
			} else {
				
				color = "red";
				
			}
			
			URL url = getClass().getClassLoader().getResource(num + "-" + color + ".png");
			JLabel input = new JLabel(new ImageIcon(new ImageIcon(url).getImage().getScaledInstance(80, 80, 0)));
			input.setBounds(x2, 600, 80, 80);
			inputs.add(input);
			x2 += 90;
			this.add(inputs.get(index));
			this.repaint();
			index++;
		}
	}
	
	public void reset() {
		
		for(int i = 0; i < arrows.length; i++) {
			this.remove(arrows[i]);
			this.repaint();
		}
		buttonInit();
		
		for(int i = 0; i < arrNo.length; i++) {
			this.remove(this.inputs.get(i));
			this.repaint();
		}
		
		inputs.clear();
		
		mf.repaint();
		index = 0;
		x = 50;
		x2 = 50;
		
	}

}
