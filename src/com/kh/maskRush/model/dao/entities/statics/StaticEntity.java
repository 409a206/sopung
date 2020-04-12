package com.kh.maskRush.model.dao.entities.statics;

import com.kh.maskRush.model.dao.entities.Entity;
import com.kh.maskRush.model.dao.handler.Handler;

//entities that don't move around
public abstract class StaticEntity extends Entity {
	
	public StaticEntity(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
	}
}
