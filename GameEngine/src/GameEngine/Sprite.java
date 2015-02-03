package GameEngine;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public abstract class Sprite extends GameObject {
	
	private final String imageID;
	private boolean hasPhysics;
	
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
	
	@Override
	public void draw(Graphics2D g){
		g.drawImage(getImage(), getXPos(), getYPos(), getImage()
				.getWidth(), getImage().getHeight(), null);
	}
	
	public boolean getHasPhysics(){
		return hasPhysics;
	}
		
	public void setHasPhysics(boolean bool){
		hasPhysics = bool;
	}
}
