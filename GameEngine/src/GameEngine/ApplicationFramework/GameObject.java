package GameEngine.ApplicationFramework;

import GameEngine.Loader;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;

public abstract class GameObject{
	private static final long serialVersionUID = -8830938133041862167L;
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
	
	public void draw(Graphics g){
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
	
	public void setXPos(int xPos) {
		this.xPos = xPos;	
	}
	
	public void setYPos(int yPos) {
		this.yPos = yPos;
	}	
}
