package GameEngine;

import java.awt.image.BufferedImage;

public abstract class Sprite extends GameObject {
	
	private final String imageID;
	
	public Sprite(int xPos, int yPos, String imageID) {
		super(xPos, yPos);
		this.imageID = imageID;
	}

	public String getImageID() {
		return imageID;
	}
	
	public BufferedImage getImage(){
		return Loader.getImage(imageID);
	}
}
