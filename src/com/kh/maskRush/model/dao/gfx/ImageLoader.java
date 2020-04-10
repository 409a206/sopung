package com.kh.maskRush.model.dao.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {
	
	public static BufferedImage loadImage(String path) {
		try {
			return ImageIO.read(ImageLoader.class.getResource(path)); // returns bufferedimage
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1); // this code is written because if we don't load image we're not going to run our game.
		}
		return null;
	}
	
}
