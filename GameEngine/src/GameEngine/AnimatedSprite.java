package GameEngine;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class AnimatedSprite extends Sprite {
	private int currentFrame;
	private int currentRow;

	public AnimatedSprite(int xPos, int yPos, String fileName, int frame, int row) {
		super(xPos, yPos, fileName);
		setFrame(frame);
		setRow(row);
	}
	
	public void draw(Graphics g){
		BufferedImage currentSprite = Loader.getImage(getImageID()).getSubimage(getXPos()*currentFrame, getYPos()*(currentRow-1), getWidth(), getHeight());
		g.drawImage(currentSprite, getXPos(), getYPos(), getWidth(), getHeight(), null);
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
