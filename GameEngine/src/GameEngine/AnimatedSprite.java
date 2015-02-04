package GameEngine;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class AnimatedSprite extends Sprite {
	private int currentFrame;
	private int currentRow;
	private int frameWidth;
	private int frameHeight;

	public AnimatedSprite(int xPos, int yPos, int frameWidth, int frameHeight, String fileName, int frame, int row) {
		super(xPos, yPos, fileName);
		setFrame(frame);
		setRow(row);
		this.frameWidth = frameWidth;
		this.frameHeight = frameHeight;
	}
	
	public void draw(Graphics g){
		BufferedImage currentSprite = Loader.getImage(getImageID()).getSubimage(frameWidth*currentFrame, frameHeight*(currentRow-1), frameWidth, frameHeight);
		g.drawImage(currentSprite, getXPos(), getYPos(), frameWidth, frameHeight, null);
	}
	
	public int getFrame(){
		return currentFrame;
	}
	
	public int getRow(){
		return currentRow;
	}
	
	public void setFrame(int frame){
		this.currentFrame = frame;
	}
	
	public void setRow(int row){
		this.currentRow = row;
	}

}
