package com.kh.maskRush.run;

import java.awt.EventQueue;import javax.swing.plaf.basic.BasicEditorPaneUI;

import com.kh.maskRush.controller.Game;
import com.kh.maskRush.model.dao.states.BedroomMonologue;
import com.kh.maskRush.model.dao.states.FirstMenu;
import com.kh.maskRush.model.dao.states.FirstMenuChoice;
import com.kh.maskRush.model.dao.states.InBus;

public class Run {
	public static void main(String[] args) {
			
		
			
			Game game = new Game("Mask Rush", 800, 600);
			game.start();
			
		
	}
}
