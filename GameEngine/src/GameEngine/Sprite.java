package GameEngine;

public abstract class Sprite extends GameObject {
	
	private String fileName;
	
	public Sprite(int xPos, int yPos, String fileName) {
		super(xPos, yPos);
		this.setFileName(fileName);
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
