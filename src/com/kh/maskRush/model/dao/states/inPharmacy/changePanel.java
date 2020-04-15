package com.kh.maskRush.model.dao.states.inPharmacy;

import javax.swing.JPanel;

public class changePanel {
	public static void changePanel(Menu mf, JPanel op, JPanel np) {
		mf.remove(op);
		mf.add(np);
		mf.repaint();
		
	}
}
