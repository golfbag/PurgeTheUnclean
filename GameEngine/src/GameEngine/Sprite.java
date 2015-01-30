package GameEngine;

import java.awt.image.BufferedImage;

public abstract class Sprite extends GameObject {
	
	private String fileName;
	
	public Sprite(int xPos, int yPos, String fileName) {
		super(xPos, yPos);
		setFileName(fileName);
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public BufferedImage getImage(String fileName){
		return Loader.getImage(fileName);
	}
}
