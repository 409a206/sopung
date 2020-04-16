package com.kh.maskRush.model.dao.states;

import javax.swing.JPanel;

public class ChangePanel {
	public static void changePanel(FirstMenuChoice mf, JPanel op, JPanel np) {
		
		mf.getContentPane().removeAll();
		mf.getContentPane().add(np);
//		mf.remove(op);
//		mf.add(np);
		mf.repaint();
	}
}
