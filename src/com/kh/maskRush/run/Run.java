package com.kh.maskRush.run;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.maskRush.controller.Game;



public class Run {
	public static void main(String[] args) {
		Game game = new Game("Mask Rush", 800, 600);
		game.start();
		
		
	}
}

