package GameEngine;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public abstract class GameObject {
	
	private int xPos;
	private int yPos;
	private int height;
	private int width;
	private String imageID;
	
	public GameObject(int xPos, int yPos, String imageID){
		this.xPos = xPos;
		this.yPos = yPos;
		this.imageID = imageID;
		this.width = getImage().getWidth();
		this.height = getImage().getHeight();
	}

	public String getImageID() {
		return imageID;
	}
	public void setImageID(String imageID){
		this.imageID = imageID;
	}
	
	public BufferedImage getImage(){
		return Loader.getImage(imageID);
	}

	public void draw(Graphics2D g){
		g.drawImage(getImage(), xPos, yPos, width, height, null);
	}
	
	public int getXPos() {
		return xPos;
	}
	
	public int getYPos() {
		return yPos;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setHeight(int height) {
		this.height =  height;
	}
	
	public void setWidth(int width) {
		this.width =  width;
	}
	
	public void setX(int xPos) {
		this.xPos = xPos;	
	}
	
	public void setY(int yPos) {
		this.yPos = yPos;
	}	
}
