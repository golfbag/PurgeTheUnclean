package GameEngine;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public abstract class GameObject {
	
	private int xPos;
	private int yPos;
	private final String imageID;
	
	public GameObject(int xPos, int yPos, String imageID){
		this.xPos = xPos;
		this.yPos = yPos;
		this.imageID = imageID;
	}

	public String getImageID() {
		return imageID;
	}
	
	public BufferedImage getImage(){
		return Loader.getImage(imageID);
	}

	public void draw(Graphics2D g){
		g.drawImage(getImage(), getXPos(), getYPos(), getImage()
				.getWidth(), getImage().getHeight(), null);
	}
	
	public int getXPos() {
		return xPos;
	}
	
	public int getYPos() {
		return yPos;
	}
	
	public void setX(int xPos) {
		this.xPos = xPos;	
	}
	
	public void setY(int yPos) {
		this.yPos = yPos;
	}	
}
